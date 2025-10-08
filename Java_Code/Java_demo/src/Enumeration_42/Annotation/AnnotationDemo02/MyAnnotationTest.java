package Enumeration_42.Annotation.AnnotationDemo02;
@MyAnnotation(name="刘备",age=25)
//@MyAnnotation(age=25)
//@MyAnnotation("好好学习天天向上")
//@MyAnnotation(names = {"刘备","关羽","张飞"})
//@MyAnnotation(names = "刘备")
public class MyAnnotationTest {
    public static void main(String[] args) {
        //通过反射解析注解

        //获取字节码文件对象，获取谁的呢？谁使用了注解，就获取谁的
        Class<MyAnnotationTest> c = MyAnnotationTest.class;

        //通过字节码文件对象获取注解信息
        MyAnnotation myAnnotation = c.getAnnotation(MyAnnotation.class);

        //通过注解的属性获取对应的值
        String name = myAnnotation.name();
        int age = myAnnotation.age();

        System.out.println(name+","+age);
    }
}
