package File_39.FileTest;

import java.io.*;

/*
    需求：
        把模块目录下的PrintStreamDemo.java 复制到模块目录下的 Copy.java
    思路：
        1.根据数据源创建字符输入流对象
        2.根据目的地创建字符输出流对象
        3.读写数据，复制文件
        4.释放资源
 */
public class CopyJavaDemo05 {
    public static void main(String[] args) throws IOException {
        //1.根据数据源创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\src\\File_39\\CharacterStream\\ConversionStreamDemo.java"));

        //2.根据目的地创建字符输出流对象
        PrintWriter pw = new PrintWriter(new FileWriter("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\File\\ConversionStreamDemo.java"),true);

        //3.读写数据，复制文件
        String line;
        while ((line=br.readLine())!=null){
            pw.println(line);
        }
        //4.释放资源
        br.close();
        pw.close();

    }
}
