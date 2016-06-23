package com.gwsc.common.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * MD5加密和MD5校验
 * 参考资料 http://lzzjava.blog.51cto.com/2554001/911086
 */
public class Md5Encrypt {
	private static final Logger logger = LoggerFactory.getLogger(Md5Encrypt.class);
	/**
	 * MD5加密
	 * @param source 需要加密的数据
	 * @return 加密后的结果，注意：如果参数不正确（参数为空或为空字符）会抛出非法参数异常
	 */
	public static String encrypt(String source){
		 MessageDigest messageDigest = null;  
	        try {  
	        	source=source.trim();
	        	if(source.isEmpty()){
	        		throw new IllegalArgumentException("source 为空字符");
	        	}
	            messageDigest = MessageDigest.getInstance("MD5");  
	            messageDigest.update(source.getBytes("UTF-8"));  
	        } catch (NoSuchAlgorithmException e) {  
	        	logger.error(e.getMessage());
	        	return null;
	        } catch (UnsupportedEncodingException e) {  
	        	logger.error(e.getMessage());
	        	return null;
	        }catch (NullPointerException e) {
				logger.error("source 参数为空！");
				System.err.println("source 参数为空！");
	        	return null;
			} catch (Exception e) {
				logger.error("source 参数为空字符！");
				System.err.println("source 参数为空字符！");
	        	return null;
			}
	        byte[] byteArray = messageDigest.digest();  
	        StringBuffer md5StrBuff = new StringBuffer();  
	        for(int i=0;i<byteArray.length;i++){    //字节数组转换成十六进制字符串，形成最终的密文  
	            int v=byteArray[i]&0xff;  
	            if(v<16){  
	            	md5StrBuff.append(0);  
	            }  
	            md5StrBuff.append(Integer.toHexString(v));  
	        }  
	        return md5StrBuff.toString(); 
	}
	/**
	 * MD5校验
	 * @param md5 MD5密文
	 * @param source 与密文相对的明文
	 * @return 两者一致返回true
	 */
	public static boolean check(String md5,String source){
		try {
			md5=md5.trim();
			source=source.trim();
			if(md5.isEmpty()||source.isEmpty()){
				throw new Exception("source,md5 参数为空字符");
			}
		} catch (NullPointerException e) {
			logger.error("source,md5 参数为空！");
			System.err.println("source,md5 参数为空！");
			return false;
		} catch (Exception e) {
			logger.error("source,md5 参数为空字符！");
			System.err.println("source,md5 参数为空字符！");
			return false;
		}
		if(md5.equals(encrypt(source))){
			return true;
		}
		return false;
	}
}
