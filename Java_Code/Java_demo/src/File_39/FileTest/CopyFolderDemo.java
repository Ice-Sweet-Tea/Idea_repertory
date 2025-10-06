package File_39.FileTest;

import java.io.*;

/*
    需求：
        把"E:\IntelliJ_IDEA\Java_Study\Java_Code\Java_demo\File\javaSE"这个文件夹复制到模块目录下

    思路：
        1.创建数据源目录File对象，路径是E:\IntelliJ_IDEA\Java_Study\Java_Code\Java_demo\File\javaSE
        2:获取数据源目录File对象的名称(itcast)
        3:创建目的地目录File对象，路径名是模块名+itcast组成(myCharStream\litcast)
        4:判断目的地目录对应的File是否存在，如果不存在，就创建
        5:获取数据源目录下所有文件的File数组
        6:遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
            数据源文件:E:\litcast\\mn.jpg
        7:获取数据源文件File对象的名称(mn.jpg)
        8:创建目的地文件File对象，路径名是目的地目录+mn.jpg组成(myCharStream\litcast\\mn.jpg)
        9:复制文件
            由于文件不仅仅是文本文件，还有图片，视频等文件，所以采用字节流复制文件
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        //1.创建数据源目录File对象，路径是...
        File srcFolder = new File("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\File\\javaSE");

        //2:获取数据源目录File对象的名称(itcast)
        String srcFolderName = srcFolder.getName();

        //3:创建目的地目录File对象，路径名是模块名+itcast组成(myCharStream\litcast)
        File destFolder = new File("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo", srcFolderName);

        //4:判断目的地目录对应的File是否存在，如果不存在，就创建
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }

        //5:获取数据源目录下所有文件的File数组
        File[] listFiles = srcFolder.listFiles();

        //6:遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
        for (File srcFile : listFiles) {
            //数据源文件:E:\litcast\\mn.jpg
            //7:获取数据源文件File对象的名称(mn.jpg)
            String srcFileName = srcFile.getName();
            //8:创建目的地文件File对象，路径名是目的地目录+mn.jpg组成(myCharStream\litcast\\mn.jpg)
            File destFile = new File(destFolder, srcFileName);
            //复制文件
            copyFile(srcFile, destFile);
        }
    }

    public static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte bys[] = new byte[1024];
        int len;
        while ((len=bis.read())!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }
}
