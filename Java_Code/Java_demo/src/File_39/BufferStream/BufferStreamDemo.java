package File_39.BufferStream;

import java.io.*;

/*
    字节缓冲流：
        BufferedOutputStream
        BufferedInputStream

    构造方法：
        1.字节缓冲输出流：BufferedOutputStream (OutputStream out)
        2.字节缓冲输入流：BufferedInputStream (InputStream in)

 */
public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
        //1.字节缓冲输出流：BufferedOutputStream (OutputStream out)
//        FileOutputStream fos = new FileOutputStream("Java_demo\\File\\bos.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        /*简写*/
        /*
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Java_demo\\File\\bos.txt"));
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        //释放资源
        bos.close();
         */

        //2.字节缓冲输入流：BufferedInputStream (InputStream in)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Java_demo\\File\\bos.txt"));

        //一次读取一个字节数据
        int bys;
        while((bys=bis.read())!=-1){
            System.out.print((char) bys);
        }

        bis.close();
    }
}
