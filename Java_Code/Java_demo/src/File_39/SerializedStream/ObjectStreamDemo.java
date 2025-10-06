package File_39.SerializedStream;

import java.io.*;

/*
    用对象序列化流序列化了一个对象后，假如我们修改了对象所属的类文件，读取数据会不会出问题呢？
        java.io.InvalidClassException:
            当序列化运行时检测到类中的以下问题之一时抛出
                类的串行版本与从流中读取的类描述符的类型不匹配
                该类包含未知的数据类型
                该类没有可访问的无参数构造函数

        File_39.SerializedStream.Student; local class incompatible:
        stream classdesc serialVersionUID = 4231860196596971509,
        local class serialVersionUID = 4450218992086424805

    2.如果出问题了，如何解决呢？
        给对象所属的类加一个值：private static final long serialVersionUID = 42L;

    3.如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？
        private transient int age;
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writer();
        read();
    }

    //反序列化
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Java_demo\\File\\oos.txt"));

        Object obj = ois.readObject();

        Student s = (Student) obj;

        System.out.println(s.getName()+","+s.getAge());

        ois.close();
    }

    //序列化
    private static void writer() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Java_demo\\File\\oos.txt"));

        Student s = new Student("赵云", 30);

        oos.writeObject(s);

        oos.close();
    }
}
