package Method_15;

/*
    方法：是将具有独立功能的代码块组织成为一个整体，使其具有特殊功能的代码集
    定义格式：
        public static void 方法名() {
            //方法体
        }

    调用格式：
        方法名();
 */
public class Method_15_demo {
    public static void main(String[] args) {
        isEvenNumber();
    }

    //需求：定义一个方法，在方法中定义一个变量，判断该数据是否为偶数
    public static void isEvenNumber(){
        //定义变量
        int number = 10;
        //判断该数据是否为偶数
        if (number%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
