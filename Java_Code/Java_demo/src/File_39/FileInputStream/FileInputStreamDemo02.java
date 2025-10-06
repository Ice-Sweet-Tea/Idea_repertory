package File_39.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    需求：把文件fos.txt中的内容读取出来再控制台输出

    使用字节输入流读数据的步骤：
        1.创建字节输入流对象
        2.调用字节输入流对象的读数据方法
        3.释放资源
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("Java_demo\\File\\fos.txt");

        //调用字节输入流对象的读数据方法
        //int read (byte[] b): 从该输入流读取最多 b.length个字节的数据到一个字节数组
        byte[] bys = new byte[1024];

        int len;
        while ((len = fis.read(bys)) != -1) {
            // 将字节数组转换为字符串并输出
            System.out.print(new String(bys, 0, len));
        }
        //释放资源
        fis.close();
    }
}





