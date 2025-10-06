package File_39.FileTest;

import java.io.*;

/*
    需求：复制多级目录
 */
public class CopyFoldersDemo {
    public static void main(String[] args) {
        //1.创建数据源File对象，路径为...
        File srcFile = new File("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\File\\javaSE");
        //2.创建目的地File对象，路径是...
        File destFile = new File("F:\\");  // 修正：添加冒号
        //3.写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
        copyFolder(srcFile, destFile);
        System.out.println("文件夹复制完成！");
    }

    //复制文件夹的方法
    private static void copyFolder(File srcFile, File destFile) {
        //4.判断数据源File是否是目录
        if (srcFile.isDirectory()) {
            //在目的地下创建和数据源File名称一样的目录
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName); // F:\javaSE
            if (!newFolder.exists()) {
                newFolder.mkdirs();  // 修正：使用mkdirs()创建多级目录
            }

            //获取数据源File下所有文件或者目录的File数组
            File[] fileArray = srcFile.listFiles();

            // 检查是否为空目录
            if (fileArray != null) {
                //遍历该File数组，得到每一个File对象
                for (File file : fileArray) {
                    //把该File作为数据源File对象，递归调用复制文件夹的方法
                    copyFolder(file, newFolder);  // 修正：变量名拼写错误
                }
            }
        } else {
            // 不是目录，说明是文件，直接复制
            try {
                copyFile(srcFile, new File(destFile, srcFile.getName()));
            } catch (IOException e) {
                System.err.println("复制文件失败: " + srcFile.getAbsolutePath());
                e.printStackTrace();
            }
        }
    }

    // 复制文件的方法
    public static void copyFile(File srcFile, File destFile) throws IOException {
        // 使用try-with-resources自动关闭流
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {

            byte[] bys = new byte[1024];
            int len;
            while ((len = bis.read(bys)) != -1) {  // 修正：read(bys)而不是read()
                bos.write(bys, 0, len);
            }
        }
    }
}