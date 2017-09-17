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
			System.out.println("相等");
		} else {
			System.out.println("不相等");
		}
		System.out.println((char)('a'+4));
    	
    	
    	
//    	
//          //创建一个File的实例对象  
//          File file=new File("D:/io/io1");
//          //判断file是否存在，不存在就创建出一个文件目录  
//          if(!file.exists()){  
//           file.mkdirs();  
//           System.out.println("该目录不存在，已创建");  
//          }  
//          File file1=new File(file,"lian.txt");  
//          //判断file1是否存在，不存在就创建出一个文件  
//          if(!file1.exists()){  
//           file.mkdirs();  
//           System.out.println("该文件不存在，已创建");  
//          }  
////在main方法中声明抛出IO异常。  
////定义写入路径的字符串。  
//        String fileName ="D:/io/io2";  
//        
//        try  
//        {  
////使用面向字符流的FileWriter类。  
////直接调用构造方法，传递写入路径。FileWriter类的构造方法有五个。  
//            FileWriter writer1 = new FileWriter(fileName);  
////相当于在FileWriter类上再套上一层管道。如果要写入的内容更多，就应该用高效的缓冲流类：BufferedWriter.与FileWriter不同是多个了newLine()方法用于换行。  
//            BufferedWriter writer = new BufferedWriter(writer1);  
////FileWriter类的Write（）方法向文件中写入字符。  
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
////清空流里的内容并关闭它，如果不调用该方法还没有完成所有数据的写操作，程序就结束了。  
//            writer.close();  
//        }  
//        catch(IOException iox)  
//        {  
//            System.out.println("Problemwriting" + fileName);  
//        }  
    }  
}  