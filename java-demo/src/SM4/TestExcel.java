package SM4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestExcel {
	public static void main(String[] args){
//		encryption();
		decrypt();
		
	}
	
	
	public static void decrypt(){
		FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] key={0x01,0x23,0x45,0x67,(byte) 0x89,(byte) 0xab,(byte) 0xcd,(byte) 0xef,(byte) 0xfe,(byte) 0xdc,(byte) 0xba,(byte) 0x98,0x76,0x54,0x32,0x10};
		SMS4 sm4=new SMS4();
		int inLen=16,ENCRYPT=1,DECRYPT=0,inlen1=32;
        try {
            fis = new FileInputStream("C:\\Users\\linc\\Desktop\\model\\encryption\\ACE54654544843742398.xls");
            // 然后再从这个缓存中写入本地
            // 这里面也可以一般可以设置成每次加密的块的大小（或者这个大小的整数倍）
            byte data[] = new byte[16];
            byte out[] = new byte[16];
            byte in[] = new byte[16];
            // 这个就是要输出的目录
            fos = new FileOutputStream("C:\\Users\\linc\\Desktop\\model\\decrypt\\ACE54654544843742398.xls");
            // 用于标记是否是读取到文件的末尾了，
            // 在读入的字节流里面，使用某些读取函数，可以返回每次读取的字节数，
            // 如果到了文件的结尾，不能再读取到内容，就返回-1
            int len = -1;
            // 将内容进行读入到指定大小的缓存块，直到读取到文件的结束为止
            while (-1 != (len = fis.read(data))) {
            	if(len != 16){
            		in = data;
            	}else{
            		System.out.println(Arrays.toString(data)+"加密");
            		sm4.sms4(data, inLen, key, in, DECRYPT);
            		System.out.println(Arrays.toString(in)+"解密");
            	}
            	
                fos.write(in, 0, len);
                // 这个方法能够写到直接往磁盘里面写入，
                // 而不是要等到关闭流（等其他时间）时间进行写入
                fos.flush();
            }
            // 关闭文件的输出输入流
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	public static  void encryption(){
		FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] key={0x01,0x23,0x45,0x67,(byte) 0x89,(byte) 0xab,(byte) 0xcd,(byte) 0xef,(byte) 0xfe,(byte) 0xdc,(byte) 0xba,(byte) 0x98,0x76,0x54,0x32,0x10};
		SMS4 sm4=new SMS4();
		int inLen=16,ENCRYPT=1,DECRYPT=0,inlen1=32;
        try {
            fis = new FileInputStream("C:\\Users\\linc\\Desktop\\model\\origin\\ACE54654544843742398.xls");
            // 然后再从这个缓存中写入本地
            // 这里面也可以一般可以设置成每次加密的块的大小（或者这个大小的整数倍）
            byte data[] = new byte[16];
            byte out[] = new byte[16];
            byte in[] = new byte[16];
            // 这个就是要输出的目录
            fos = new FileOutputStream("C:\\Users\\linc\\Desktop\\model\\encryption\\ACE54654544843742398.xls");
            // 用于标记是否是读取到文件的末尾了，
            // 在读入的字节流里面，使用某些读取函数，可以返回每次读取的字节数，
            // 如果到了文件的结尾，不能再读取到内容，就返回-1
            int len = -1;
            // 将内容进行读入到指定大小的缓存块，直到读取到文件的结束为止
            while (-1 != (len = fis.read(data))) {
            	
            	if(len != 16){
            		out = data;
            		
            	}else{
            		System.out.println(Arrays.toString(data)+"原始");
            		sm4.sms4(data, inLen, key, out, ENCRYPT);
            		System.out.println(Arrays.toString(out)+"加密");
            	}
                fos.write(out, 0, len);
                // 这个方法能够写到直接往磁盘里面写入，
                // 而不是要等到关闭流（等其他时间）时间进行写入
                fos.flush();
            }
            // 关闭文件的输出输入流
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	
	

}
