package Collection_38.Set.TreeSetTest;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student s) {
        //return 0; //重复元素不添加，返回一个值
        //return 1; //升序储存，返回多个值
        //return -1;//倒序储存，返回多个值

        //按照年龄从小到大排序
        int num = this.age - s.age;
        //int num =  s.age - this.age; //年龄按照降序排列

        //年龄相同时，按照姓名的字母顺序排序
        int num2 = num == 0?this.name.compareTo(s.name):num;
        return num2;


    }
}
