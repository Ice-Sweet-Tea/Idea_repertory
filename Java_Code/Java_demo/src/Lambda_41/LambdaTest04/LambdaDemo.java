package Lambda_41.LambdaTest04;

/*
    Lambda表达式的注意事项
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //使用Lambda必须要有接口，必须要求接口中有且仅有一个抽象方法
        useInter(() -> {
            System.out.println("一日三餐,无辣不欢");
        });

        //必须有上下文环境，才能推导出Lambda对应的接口
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类");
//            }
//        }).start();

/*        Runnable r = () -> System.out.println("床前明月光");
        new Thread(r).start();*/

        new Thread(()-> System.out.println("Lambda表达式")).start();
    }

    private static void useInter(Inter i) {
        i.show();
    }
}
