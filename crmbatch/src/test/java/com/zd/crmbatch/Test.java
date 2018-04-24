package com.zd.crmbatch;

import java.io.IOException;
import java.io.RandomAccessFile;

import com.zd.crmbatch.business.utils.StringUtils;
import com.zd.crmbatch.business.utils.TimeUtil;

public class Test {

	 /**
	  * 
	  * @param fileName 文件路径
	  * @param n		处理的字符个数
	  * @param type		转化为大写或小写（upper/lower）
	  * @return
	  */
	 private static boolean modifyFileContent(String fileName,int n,String type) {
	        RandomAccessFile raf = null;
	        try {
	            raf = new RandomAccessFile(fileName, "rw");
	            String line = null;
	            long lastPoint = 0; //记住上一次的偏移量
	            while ((line = raf.readLine()) != null) {
	                final long ponit = raf.getFilePointer();
	                if(line.length()>n){
	                	
	                	
	                	line=line.trim();
	                	System.out.println(line);
	                	StringBuffer sb=new StringBuffer(line.substring(0,line.lastIndexOf(" ")+1));
	                	String destStr=line.substring(line.lastIndexOf(" ")+1,line.length());
	                	if(StringUtils.isNotBlank(type) && type.equals("lower")){
                			//小写
	                		for(int i=0;i<n;i++){
		                		sb.append(String.valueOf(destStr.charAt(i)).toLowerCase());
		                	}
                		}else{
                			//大写
                			for(int i=0;i<n;i++){
    	                		sb.append(String.valueOf(destStr.charAt(i)).toUpperCase());
    	                	}
                		}
	                	sb.append(destStr.substring(n,destStr.length()-1));
		                raf.seek(lastPoint);
		                raf.writeBytes(sb.toString());
		                lastPoint = ponit; 
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                raf.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        return true;
	    }
	 
	public static void main(String[] args) {
		modifyFileContent("E:\\test.txt",2,"");
	}
}
