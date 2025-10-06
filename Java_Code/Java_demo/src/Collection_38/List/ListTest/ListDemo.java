//package Collection_38.List.ListTest;
//
//import Final_27.Studeny;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
///*
//    1:定义学生类
//    2:创建List集合对象
//    3:创建学生对象
//    4:把学生添加到集合
//    5:遍历集合(迭代器方式,for循环方式)
// */
//public class ListDemo {
//    public static void main(String[] args) {
//        //2:创建List集合对象
//        List<Student> list = new ArrayList<Student>();
//
//        //3:创建学生对象
//        Student s1 = new Student("老六",26);
//        Student s2 = new Student("李七",27);
//        Student s3 = new Student("黄八",28);
//
//        //4:把学生添加到集合
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//
//        //5:遍历集合(迭代器方式,for循环方式)
//        for (int i = 0;i<list.size();i++){
//            Student s = list.get(i);
//            System.out.println(s.getName()+","+s.getAge());
//        }
//
//        System.out.println("-------------");
//
//
//        Iterator<Student> iterator = list.iterator();
//        while(iterator.hasNext()){
//            Student ss = iterator.next();
//            System.out.println(ss.getName()+","+ss.getAge());
//        }
//    }
//}
