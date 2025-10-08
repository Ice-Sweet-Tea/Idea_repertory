package Enumeration_42.SingletonPattern;

/*
    单例设计模式：
        饿汉式：类一加载就创建对象
        懒汉式：用的时候，才去创建对象

    在开发中，我们会使用饿汉式，因为这种方式不会出现线程安全问题

    产生线程安全问题的三个要素：
        A:是否有多线程环境
        B:是否有共享数据
        C:是否有多条语句操作共享数据
 */
public class Teacher {
    private Teacher() {
    }

    private static Teacher t = null;

    public synchronized static Teacher getTeacher() {
        if (t == null) {
            t = new Teacher();
        }
        return t;
    }

}
