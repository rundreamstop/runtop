import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2018/5/16
 */
public class Main {

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        // TODO 本地路径 是需要自己改变的
//        sb.append("D:\\deao\\gitcode\\basics\\deao-mybatisGenerator\\");
        sb.append("F:\\deao\\deaoGit\\basics\\deao-mybatisGenerator\\");
//        sb.append("C:\\Users\\86187\\Desktop\\code\\deao\\gogs_code\\basics\\deao-mybatisGenerator\\");

        sb.append("src\\main\\resources\\generatorConfig.xml");

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File(sb.toString());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("generator success ...");

    }

}