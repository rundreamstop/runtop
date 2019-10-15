package com.runtop.core.modules.utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */

public class QRCodeUtils {

    // 默认字符集
    private static final String DEFAULT_CHARSET = "utf-8";
    // 默认图片高
    private static final int DEFAULT_HEIGHT = 150;
    // 默认图片宽
    private static final int DEFAULT_WIDTH = 150;


    /**
     * 生成二维码
     *
     * @param body 内容
     * @return
     */
    public static BufferedImage create(String body) {
        return create(body, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }


    /**
     * 生成二维码
     *
     * @param body   内容
     * @param width  宽
     * @param height 高
     * @return
     */
    public static BufferedImage create(String body, int width, int height) {
        return create(body, DEFAULT_CHARSET, width, height);
    }

    /**
     * 生成二维码
     *
     * @param body    内容
     * @param charset 内容编码
     * @param width   宽
     * @param height  高
     * @return
     */
    public static BufferedImage create(String body, String charset, int width, int height) {
        Map hint = new HashMap();
        hint.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hint.put(EncodeHintType.MARGIN, 1);
        hint.put(EncodeHintType.CHARACTER_SET, charset);

        return create(body, charset, hint, width, height);
    }

    /**
     * 生成不带logo的二维码
     *
     * @param body    内容
     * @param charset 内容编码
     * @param hint    生成参数
     * @param width   宽
     * @param height  高
     * @return
     */
    public static BufferedImage create(String body, String charset, Map<EncodeHintType, ?> hint, int width, int height) {

        BitMatrix matrix = null;
        try {
            matrix = new MultiFormatWriter().encode(new String(body.getBytes(charset), charset), BarcodeFormat.QR_CODE,
                    width, height, hint);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return MatrixToImageWriter.toBufferedImage(matrix);
    }

    /**
     * 给生成的二维码添加logo
     *
     * @param qrBim        二维码流
     * @param logoPathName logo地址
     * @param logoWidth    logo在二维码图片上的
     * @param logoHeight
     */
    public static BufferedImage addLogo(BufferedImage qrBim, String logoPathName, int logoWidth, int logoHeight) {

        // 对象流传输
        BufferedImage image = qrBim;
        Graphics2D g = image.createGraphics();

        try {
            BufferedImage logo = scale(logoPathName, logoWidth, logoHeight, true);

            // 设置logo的大小,本人设置为二维码图片的20%,因为过大会盖掉二维码
            int widthLogo = logo.getWidth(null) > image.getWidth() * 2 / 10 ? (image.getWidth() * 2 / 10) : logo.getWidth(null), heightLogo = logo
                    .getHeight(null) > image.getHeight() * 2 / 10 ? (image.getHeight() * 2 / 10) : logo.getWidth(null);

            // 计算图片放置位置
            // logo放在中心
            int x = (image.getWidth() - widthLogo) / 2;
            int y = (image.getHeight() - heightLogo) / 2;
            // 开始绘制图片
            g.drawImage(logo, x, y, widthLogo, heightLogo, null);
            g.drawRoundRect(x, y, widthLogo, heightLogo, 15, 15);
            /*g.setStroke(new BasicStroke(logoConfig.getBorder()));
            g.setColor(logoConfig.getBorderColor());*/
            g.drawRect(x, y, widthLogo, heightLogo);

            g.dispose();
            logo.flush();
            image.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }

    /**
     * 保存二维码到文件
     *
     * @param qrBim    二维码流
     * @param savePath 保存的路径
     * @param name     保存的名称
     * @param format   图片格式
     */
    public void saveToFile(BufferedImage qrBim, String savePath, String name, String format) throws IOException {

        File savePathFile = new File(savePath);
        if (!savePathFile.exists()) {
            // 创建不纯在的路径
            savePathFile.mkdirs();
        }

        File saveFile = new File(savePath + File.pathSeparator + name);

        ImageIO.write(qrBim, format, saveFile);

    }

    /**
     * 按大小压缩logo图片
     *
     * @param logoPathName logo地址含名称
     * @param width        图片想要展示的宽度
     * @param height       想要展示的高度
     * @param hasFiller    是否补白
     * @return
     * @throws IOException
     */
    private static BufferedImage scale(String logoPathName, int width, int height, boolean hasFiller) throws IOException {

        double ratio = 0.0; // 缩放比例

        File file = new File(logoPathName);
        BufferedImage srcImage = ImageIO.read(file);
        Image destImage = srcImage.getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH);

        // 计算比例
        if ((srcImage.getHeight() > height) || (srcImage.getWidth() > width)) {
            if (srcImage.getHeight() > srcImage.getWidth()) {
                ratio = (new Integer(height)).doubleValue() / srcImage.getHeight();
            } else {
                ratio = (new Integer(width)).doubleValue() / srcImage.getWidth();
            }
            AffineTransformOp op = new AffineTransformOp(AffineTransform.getScaleInstance(ratio, ratio), null);
            destImage = op.filter(srcImage, null);
        }

        if (hasFiller) {// 补白

            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics2D graphic = image.createGraphics();
            graphic.setColor(Color.white);
            graphic.fillRect(0, 0, width, height);

            if (width == destImage.getWidth(null))
                graphic.drawImage(destImage, 0, (height - destImage.getHeight(null)) / 2,
                        destImage.getWidth(null), destImage.getHeight(null),
                        Color.white, null);
            else {
                graphic.drawImage(destImage,
                        (width - destImage.getWidth(null)) / 2, 0,
                        destImage.getWidth(null), destImage.getHeight(null),
                        Color.white, null);
            }

            graphic.dispose();
            destImage = image;
        }

        return (BufferedImage) destImage;
    }
}
