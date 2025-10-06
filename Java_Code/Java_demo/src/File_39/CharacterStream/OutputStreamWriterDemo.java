package File_39.CharacterStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
    构造方法：
        OutputStreamWriter (OutputStream out)：创建一个使用默认字符编码的OutputStreamWriter

    写数据的5种方式：
        1.void write (int c)：写一个字符
        2.void write (char[] cbuf)：写入一个字符数组
        3.void write (char [] cbuf,int off,int len)：写入字符数组的一部分
        4.void write (String str)：写一个字符串
        5.void write (String str,int off,int len)：写一个字符串的一部分
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建字符对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Java_demo\\File\\osw.txt"));

        //1.void write (int c)：写一个字符
        //void flush()：刷新流
        //字符流不能直接写入数据，字节流才能。字符流是用flush才能写入数据
//        osw.write(97);
//        osw.flush();
//        osw.write(98);
//        osw.flush();
//        osw.write(99);

        //2.void write (char[] cbuf)：写入一个字符数组
        char chs[] = {'a','b','c','d','e'};
//        osw.write(chs);

        //3.void write (char [] cbuf,int off,int len)：写入字符数组的一部分
//        osw.write(chs,0,chs.length);
//        osw.write(chs,1,3);

        //4.void write (String str)：写一个字符串
//        osw.write("abcde");

        //5.void write (String str,int off,int len)：写一个字符串的一部分
        osw.write("abcde",1,4);
        //释放资源
        osw.close();
    }
}










