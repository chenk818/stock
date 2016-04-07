package com.art58.site.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;


import java.util.Calendar;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.OSSObjectSummary;
import com.aliyun.oss.model.ObjectListing;
import com.aliyun.oss.model.ObjectMetadata;

public class AliFile {
	private static String accessKeyId = "oYYWwHm3hP6j1IL8";
	private static String accessKeySecret = "95gEKjWOM559c9GFEHVd5Aw6RNLta5";
	private static String endpoint = "http://oss-cn-beijing.aliyuncs.com";
	private static String bucketName = "58art";


	

	/**
	 * 根据key下载文件，返回下载url
	 * 
	 * @param key
	 * @return
	 */
	public static String getDownloadUrl(String key) {
		// 初始化一个OSSClient
		try {
			OSSClient client = new OSSClient(endpoint, accessKeyId,
					accessKeySecret);
			
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.YEAR, 1);
			URL url = client.generatePresignedUrl(bucketName, key,calendar.getTime());
			return url.toString();
		} catch (ClientException e) {
			
		}
		return null;
	}

	/**
	 * 根据key返回文件流
	 * 
	 * @param objKey
	 *            文件key值
	 * @return 文件流
	 * @throws Exception
	 */
	public static InputStream getObject(String objKey) throws Exception {
		// 初始化 OSSClient
		OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		InputStream is = client.getObject(bucketName, objKey)
				.getObjectContent();// 获取对象
		return is;
	}

}
