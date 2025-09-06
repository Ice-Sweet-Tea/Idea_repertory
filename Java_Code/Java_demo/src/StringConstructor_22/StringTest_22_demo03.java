package StringConstructor_22;
/*
    需求：
        键盘录入一个字符串，统计该字符串大写、小写、数字字符出现的次数

    思路：
        1：键盘录入一个字符串，用Scanner实现
        2：要统计三种类型的字符个数，需定义三个统计变量，初始值都为0
        3：遍历字符串，得到每一个字符
        4：判断该字符属于哪种类型，然后对应类型的统计变量+1
            假如ch是一个字符，我要判断它属于大写、小写、数字，直接判断该字符是否对应的范围即可
            大写: ch>'A' && ch<'Z'
            小写: ch>'a' && ch<'z'
            数字: ch>'0' && ch<'9'
        5: 输出三种类型的字符个数
 */

import java.util.Scanner;

public class StringTest_22_demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch > 'A' && ch < 'Z') {
                bigCount++;
            } else if (ch > 'a' && ch < 'z') {
                smallCount++;
            }else if (ch>'0'&&ch<'9'){
                numberCount++;
            }
        }

        System.out.println(bigCount);
        System.out.println(smallCount);
        System.out.println(numberCount);
    }
}
