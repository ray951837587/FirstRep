package com.imooc.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test{  
    public static void main(String[] args){  
    	String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxwz";
    	System.out.println(a);
    	System.out.println("1"+"");
    	char c = 'a';
    	System.out.println(c);
    	System.out.println(a.charAt(1));
    	System.out.println(a.isEmpty());
    	byte[] b = a.getBytes();
    	for(byte bt:b){
    		System.out.println(bt);
    	}
    	StringBuffer bf = new StringBuffer("0");
		StringBuffer bf1 = new StringBuffer("0");
		if (bf == bf1 || bf.equals(bf1)) {
			System.out.println("���");
		} else {
			System.out.println("�����");
		}
		System.out.println((char)('a'+4));
    	
    	
    	
//    	
//          //����һ��File��ʵ������  
//          File file=new File("D:/io/io1");
//          //�ж�file�Ƿ���ڣ������ھʹ�����һ���ļ�Ŀ¼  
//          if(!file.exists()){  
//           file.mkdirs();  
//           System.out.println("��Ŀ¼�����ڣ��Ѵ���");  
//          }  
//          File file1=new File(file,"lian.txt");  
//          //�ж�file1�Ƿ���ڣ������ھʹ�����һ���ļ�  
//          if(!file1.exists()){  
//           file.mkdirs();  
//           System.out.println("���ļ������ڣ��Ѵ���");  
//          }  
////��main�����������׳�IO�쳣��  
////����д��·�����ַ�����  
//        String fileName ="D:/io/io2";  
//        
//        try  
//        {  
////ʹ�������ַ�����FileWriter�ࡣ  
////ֱ�ӵ��ù��췽��������д��·����FileWriter��Ĺ��췽���������  
//            FileWriter writer1 = new FileWriter(fileName);  
////�൱����FileWriter����������һ��ܵ������Ҫд������ݸ��࣬��Ӧ���ø�Ч�Ļ������ࣺBufferedWriter.��FileWriter��ͬ�Ƕ����newLine()�������ڻ��С�  
//            BufferedWriter writer = new BufferedWriter(writer1);  
////FileWriter���Write�����������ļ���д���ַ���  
//            writer.write("a1.sources = r1\n");  
//            writer.write("a1.sinks = k1\n");  
//            writer.write("a1.channels = c1\n");  
//            writer.write("\n");  
//            writer.write("a1.sources.r1.type = exec\n");  
//            writer.write("a1.sources.r1.command = tail -F /home/hadoop/messages\n");  
//            writer.write("a1.sources.r1.port = 44444\n");  
//            writer.write("a1.sources.r1.host = 192.168.8.71\n");  
//            writer.write("a1.sources.r1.channels = c1\n");  
//            writer.newLine();  
//            writer.write("a1.sinks.k1.type = logger\n");  
//            writer.write("a1.sinks.k1.type = hbase\n");  
//            writer.write("a1.sinks.k1.table = messages\n");  
//            writer.write("a1.sinks.k1.columnFamily = cf\n");  
//            writer.write("a1.sinks.k1.serializer = com.tcloud.flume.AsyncHbaseLogEventSerializer\n");  
//            writer.write("a1.sinks.k1.channel = memoryChannel\n");  
//            writer.newLine();  
//            writer.write("a1.channels.c1.type = memory\n");  
//            writer.write("a1.channels.c1.capacity = 1000\n");  
//            writer.write("a1.channels.c1.transactionCapacity = 100\n");  
//            writer.write("\n");  
//            writer.write("a1.sources.r1.channels = c1\n");  
//            writer.write("a1.sinks.k1.channel = c1");  
////�����������ݲ��ر�������������ø÷�����û������������ݵ�д����������ͽ����ˡ�  
//            writer.close();  
//        }  
//        catch(IOException iox)  
//        {  
//            System.out.println("Problemwriting" + fileName);  
//        }  
    }  
}  