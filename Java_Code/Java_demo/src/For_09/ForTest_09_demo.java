package For_09;

/*
    输出数据

    需求：
        在控制台输出1-5和5-1
 */
public class ForTest_09_demo {
    public static void main(String[] args) {
        //需求：输出数据1-5
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

        System.out.println("----------------");

        //需求：输出数据5-1
        for(int j=5;j>=1;j--){
            System.out.println(j);
        }
    }
}
