package File_39.FileTest.BufferedTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
    需求：
        把ArrayList集合中的学生数据写入到文本文件。要求每一个学生对象的数据作为文件中的一行数据
        格式：学号，姓名，年龄，居住地。举例itheima001,林青霞,30,西安

    思路：
        1.定义学生类
        2.创建ArrayList集合
        3.创建学生对象
        4.把学生对象添加到集合中
        5.创建字符缓冲输出流对象
        6.遍历集合，得到每一个学生对象
        7.把学生对象的数据拼接成指定格式的字符串
        8.调用字符缓冲输出流对象的方法写数据
        9.释放资源
 */
public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        //2.创建ArrayList集合
        ArrayList<Student> array = new ArrayList<Student>();

        //3.创建学生对象
        Student s1 = new Student("itheima001","刘备",25,"西安");
        Student s2 = new Student("itheima002","关羽",26,"荆州");
        Student s3 = new Student("itheima003","张飞",26,"洛阳");

        //4.把学生对象添加到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //5.创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("Java_demo\\File\\students.txt"));

        //6.遍历集合，得到每一个学生对象
        for (Student s:array){
            //7.把学生对象的数据拼接成指定格式的字符串
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            //8.调用字符缓冲输出流对象的方法写数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        //9.释放资源
        bw.close();
    }
}