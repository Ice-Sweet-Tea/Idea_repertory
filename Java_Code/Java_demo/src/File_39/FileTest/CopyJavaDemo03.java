package File_39.FileTest;

import java.io.*;

/*
    需求：
        复制ConversionStreamDemo到copy文件里
    思路：
        1.根据数据源创建字符输入流对象
        2.根据目的地创建字符输出流对象
        3.读写数据，复制文件
        4.释放资源
 */
public class CopyJavaDemo03 {
    public static void main(String[] args) throws IOException {
        //1.根据数据源创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\src\\File_39\\CharacterStream\\ConversionStreamDemo.java"));

        //2.根据目的地创建字符输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\src\\File_39\\FileTest\\Copy.java"));

        //3.读写数据，复制文件
//        int by;
//        while ((by = br.read()) != -1) {
//            bw.write(by);
//        }

        char bys[] = new char[1024];
        int len;
        while ((len=br.read(bys))!=-1){
            bw.write(bys,0,len);
        }
        //4.释放资源
        br.close();
        bw.close();
    }
}
