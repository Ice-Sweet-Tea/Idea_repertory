package File_39;

import java.io.File;
import java.io.IOException;

/*
    File类删除功能：
        public boolean delete():删除由此抽象路径名表示的文件或目录
 */
public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Java_demo\\File\\java.txt");
//        System.out.println(f1.createNewFile());

        //需求1：删除当前模块目录下的java.txt文件
//        System.out.println(f1.delete());

        //需求2：在当前目录下创建itcast目录
        File f2 = new File("Java_demo\\File\\itcast");
//        System.out.println(f2.mkdir());

        //需求3：删除当前模块目录下的itcast目录
        System.out.println(f2.delete());
    }
}
