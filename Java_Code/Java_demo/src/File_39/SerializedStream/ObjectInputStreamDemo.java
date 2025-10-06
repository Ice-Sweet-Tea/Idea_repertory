package File_39.SerializedStream;

import java.io.*;

/*
    构造方法：
        ObjectInputStream (InputStream in)：创建从指定的InputStream读取的ObjectInputStream

    反序列化对象的方法：
        Object readObject ()：从ObjectInputStream读取一个对象
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //ObjectInputStream (InputStream in)：创建从指定的InputStream读取的ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Java_demo\\File\\oos.txt"));

        //Object readObject ()：从ObjectInputStream读取一个对象
        Object obj = ois.readObject();

        //向下转型
        Student s = (Student) obj;
        System.out.println(s.getName()+","+s.getAge());

        //释放资源
        ois.close();
    }
}
