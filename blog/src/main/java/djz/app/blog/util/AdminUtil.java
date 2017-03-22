package djz.app.blog.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.commons.io.output.ThresholdingOutputStream;

import djz.app.blog.model.Admin;

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
		for (int i = 0; i <= md5Byte.length - 1; i++) {
			// 掩盖前面24位，去掉符号
			String hex = Integer.toHexString(md5Byte[i] & 0xFF);
			if (hex.length() == 1) {
				// 统一格式
				sb.append("0");
			}
			sb.append(hex);
		}
		return sb.toString();
	}

	/**
	 * 将Admin密码通过MD5加密
	 * 
	 * @param admin
	 */
	public static Admin updateMD5Password(Admin admin) {
		try {
			String MD5Password = AdminUtil.MD5Encode(admin.getPassword());
			admin.setPassword(MD5Password);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return admin;
	}

	/**
	 * 获得根管理员Properties文件
	 * 
	 * @return
	 */
	public static Properties getRootAdminProp() {
		FileInputStream in = null;
		Properties prop = new Properties();
		try {
			in = new FileInputStream(getClassPath()+File.separator+"admin.properties");
			prop.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return prop;
	}
	
	private static String getClassPath(){
		return AdminUtil.class.getClassLoader().getResource("/").getPath();
	}
}
