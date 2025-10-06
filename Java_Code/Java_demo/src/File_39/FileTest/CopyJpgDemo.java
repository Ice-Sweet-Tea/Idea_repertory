package File_39.FileTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求：复制图片
 */
public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {
        //创建输入对象
        FileInputStream fis = new FileInputStream("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\File\\1.jpg");

        //创建输出对象
        FileOutputStream fos = new FileOutputStream("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\1.jpg");

        byte bys[] = new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }

        //释放资源
        fis.close();
        fos.close();
    }
}
