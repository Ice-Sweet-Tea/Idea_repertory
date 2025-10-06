package Thread_40;

public class MyThread extends Thread {
    //为什么要重写run()方法？因为run()是用来封装被线程执行的代码
    public MyThread(){}
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    /*
    public Thread() {
        init(null, null, "Thread-" + nextThreadNum(), 0);
    }
     */
    }
}
