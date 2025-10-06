package File_39;

import java.io.File;
import java.io.IOException;

/*
    File类创建功能：
        public boolean createNewFile()：当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
            如果文件不存在，就创建文件，并返回true
            如果文件存在，就不创建文件，并返回false

        public boolean mkdir()：创建由此抽象路径名命名的目录
            如果文件不存在，就创建文件，并返回false
            如果文件存在，就不创建文件，并返回true

        public boolean mkdirs()：创建由此抽象路径命名的目录，包括任何必需但不存在的父目录

 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //1.我要创建java.txt
        File f1 = new File("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\File\\java.txt");
        System.out.println(f1.createNewFile());

        //2.我要创建一个目录javaSE
        File f2 = new File("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\File\\javaSE");
        System.out.println(f2.mkdir());
        //3.我要创建一个多级目录JavaWEB\\HTML
        File f3 = new File("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\File\\javaWEB\\HTML");
        System.out.println(f3.mkdirs());
    }
}
