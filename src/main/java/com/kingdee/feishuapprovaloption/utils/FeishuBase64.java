package com.kingdee.feishuapprovaloption.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Base64;

public class FeishuBase64 {

	public static String CBCEncrypter(String key, String source) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			messageDigest.reset();
			messageDigest.update(key.getBytes());
			SecretKeySpec skeySpec = new SecretKeySpec(messageDigest.digest(), "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");//"算法/模式/补码方式"
			byte[] sSrcBytes = source.getBytes();
			byte[] newSrc = new byte[sSrcBytes.length + 16];
			byte[] cSrc = new byte[16];
			System.arraycopy(cSrc, 0, newSrc, 0, cSrc.length);
			System.arraycopy(sSrcBytes, 0, newSrc, 16, sSrcBytes.length);
			IvParameterSpec iv = new IvParameterSpec(cSrc);//使用CBC模式，需要一个向量iv，可增加加密算法的强度
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
			byte[] encrypted = cipher.doFinal(newSrc);
			return Base64.getEncoder().encodeToString(encrypted);//此处使用BASE64做转码功能，同时能起到2次加密的作用。
		} catch (Exception e) {
			//handle Exception
		}
		return null;
	}
}
