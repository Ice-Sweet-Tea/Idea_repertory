package File_39.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    需求：
        把文件fos.txt中的内容读取出来再控制台输出

    FileInputStream:从文件系统中的文件获取输入字节
        FileInputStream(String name)：通过打开与实际文件的连接来创建一个FileInputStream,该文件由文件系统中的路径名name

    使用字节输入流读数据的步骤：
        1.创建字节输入流对象
        2.调用字节输入流对象的读数据方法
        3.释放资源
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //1.FileInputStream:从文件系统中的文件获取输入字节
        FileInputStream fis = new FileInputStream("Java_demo\\File\\fos.txt");

        //2.调用字节输入流对象的读数据方法
        //int read ()：从该输入流读取一个字节的数据
        //如果达到文件的末尾 -1
//        int by = fis.read();
//        while(by != -1){
//            System.out.print((char)by);
//            by = fis.read();
//        }

        //优化上面程序
        int by;
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }
        //3.释放资源
        fis.close();
    }
}
