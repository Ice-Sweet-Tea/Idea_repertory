package File_39.FileTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    复制文件加入异常处理
 */
public class FileExceptionHandling {
    public static void main(String[] args) {

    }

    //JDK7的改进方案
    private static void method2(){
        try(FileReader fr = new FileReader("fr.txt");
            FileWriter fw = new FileWriter("fw.txt");){
            char[] chs = new char[1024];
            int len;
            while((len =fr.read())!=-1){
                fw.write(chs, 0, len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //try...catch.finally
    private static void method() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("fr.txt");
            fw = new FileWriter("fw.txt");

            char[] chs = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}