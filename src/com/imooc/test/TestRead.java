package com.imooc.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestRead {
	public static void main(String[] args){  
		//��main�����������׳�IO�쳣��  
		//����д��·�����ַ�����  
		        String fileName ="D:/io/io2";  
		        String line;  
		        try  
		        {  
		// ����BufferedReader����FileReader�����������ڽڵ����ϡ�  
		            BufferedReader in = new BufferedReader(new FileReader(fileName));  
		//���ȶ�ȡһ�е����ݡ�  
		            line = in.readLine();  
		//�ж϶�д�������Ƿ�Ϊ�ա�  
		            while(line!=null)  
		            {  
		//���һ�С�  
		                System.out.println(line);  
		//����������һ�е����ݡ�  
		                line = in.readLine();  
		            }  
		//�ر�������ܵ�����  
		            in.close();  
		        }   
		        catch(IOException iox)  
		        {  
		            System.out.println("Problemreading" + fileName);  
		        }  
		    }  
}
