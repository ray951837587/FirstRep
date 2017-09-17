package com.imooc.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestRead {
	public static void main(String[] args){  
		//在main方法中声明抛出IO异常。  
		//定义写入路径的字符串。  
		        String fileName ="D:/io/io2";  
		        String line;  
		        try  
		        {  
		// 利用BufferedReader套在FileReader，处理流套在节点流上。  
		            BufferedReader in = new BufferedReader(new FileReader(fileName));  
		//首先读取一行的内容。  
		            line = in.readLine();  
		//判断读写的内容是否为空。  
		            while(line!=null)  
		            {  
		//输出一行。  
		                System.out.println(line);  
		//继续读出下一行的内容。  
		                line = in.readLine();  
		            }  
		//关闭这个“管道”。  
		            in.close();  
		        }   
		        catch(IOException iox)  
		        {  
		            System.out.println("Problemreading" + fileName);  
		        }  
		    }  
}
