package File_39.PrintFlow;

import java.io.IOException;
import java.io.PrintWriter;

/*
    字符打印流的构造方法：
        PrintWriter (String fileName)：使用指定的文件名创建一个新的PrintWriter,而不需要自动执行行刷新

        PrintWriter (Writer out,boolean autoFlush)：创建一个新的PrintWriter
            out：字符输出流
            autoFlush：一个布尔值，如果为真，则println，printf，或format方法将刷新输出缓冲区
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        //PrintWriter (String fileName)：使用指定的文件名创建一个新的PrintWriter,而不需要自动执行行刷新
        PrintWriter pw = new PrintWriter(new PrintWriter("Java_demo\\File\\pw.txt"),true);

        pw.println("hello");
        pw.println("world");
    }
}
