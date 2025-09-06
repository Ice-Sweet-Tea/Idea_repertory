package Control_12;

/*
    continue:用在循坏中，基于条件控制，跳过某次循坏体内容的执行，继续下一次的执行
    break:用在循坏中，基于条件控制，终止循坏体内容的执行，也就是说结束当前的整个循坏
 */
public class Control_12_demo {
    public static void main(String[] args) {
        for (int i = 1;i<=5;i++){
            if(i%2==0){
                //continue
                break;
            }
            System.out.println(i);
        }

    }
}
