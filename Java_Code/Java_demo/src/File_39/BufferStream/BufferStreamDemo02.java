package File_39.BufferStream;

import java.io.*;

/*
    字符缓冲流：
        BufferedWriter:将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入，
        可以指定缓冲区大小，或者可以接受默认大小，默认值足够大，可以与大多数用途

        BufferedReader:从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取，
        可以指定缓冲区大小，或者可以使用默认大小。默认值足够大，可以于大多数用途

    构造方法：
        BufferedWriter(Writer out)
        BufferedReader(Reader in)

 */
public class BufferStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //BufferedWriter(Writer out)
//        BufferedWriter bw = new BufferedWriter(new FileWriter("Java_demo\\File\\bw.txt"));
//        bw.write("hello\r\n");
//        bw.write("world\r\n");
//        bw.write("java\r\n");
//        bw.close();

        //BufferedReader(Reader in)
        BufferedReader br = new BufferedReader(new FileReader("Java_demo\\File\\bw.txt"));
        int by;
        while ((by=br.read())!=-1){
            System.out.print((char)by);
        }


        char bys[] = new char[1024];
        int len;
        while ((len=br.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
        }

        br.close();
    }
}
