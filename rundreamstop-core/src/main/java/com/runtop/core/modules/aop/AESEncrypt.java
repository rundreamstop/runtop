package com.runtop.core.modules.aop;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * rundreams.net by rundreams.top
 *
 * @Author: rundreams@yeah.net  @Time:2019\10\15 0015
 */
public class AESEncrypt {
	
	private String sKey = "";
	private String ivParameter = "";
	private static AESEncrypt instance = null;

	public static AESEncrypt getInstance() {
		if (instance == null)
			instance = new AESEncrypt();
		return instance;
	}


	public String encrypt(String sSrc) throws Exception {
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		byte[] raw = sKey.getBytes();
		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		IvParameterSpec iv = new IvParameterSpec(ivParameter.getBytes());
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
		byte[] encrypted = cipher.doFinal(sSrc.getBytes("utf-8"));
		return new String(Base64.encodeBase64(encrypted));
	}


	public String decrypt(String sSrc) throws Exception {
		try {
			byte[] raw = sKey.getBytes("ASCII");

			SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			IvParameterSpec iv = new IvParameterSpec(ivParameter.getBytes());
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			byte[] encrypted1 = Base64.decodeBase64(sSrc.getBytes());
			byte[] original = cipher.doFinal(encrypted1);
			String originalString = new String(original, "utf-8");
			return originalString;
		} catch (Exception ex) {
			return null;
		}
	}	
	public void setsKey(String sKey) {
		this.sKey = sKey;
	}

	public void setIvParameter(String ivParameter) {
		this.ivParameter = ivParameter;
	}
}
