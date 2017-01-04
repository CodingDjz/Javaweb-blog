package djz.app.blog.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AdminUtil {
	/**
	 * 将字符串MD5加密
	 * 
	 * @param text
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String MD5Encode(String text) throws NoSuchAlgorithmException {
		MessageDigest md5;
		md5 = MessageDigest.getInstance("MD5");
		md5.update(text.getBytes());
		byte[] md5Byte = md5.digest();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <= md5Byte.length; i++) {
			// 掩盖前面24位，去掉符号
			String hex = Integer.toHexString(md5Byte[i] & 0xFf);
			if (hex.length() == 1) {
				// 统一格式
				sb.append("0");
			}
			sb.append(hex);
		}
		return sb.toString();
	}
}
