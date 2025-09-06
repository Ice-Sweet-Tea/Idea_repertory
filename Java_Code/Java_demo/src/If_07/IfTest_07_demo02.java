package If_07;/*
    考试奖励

    需求：
        小明快期末考试了，小明爸爸对他说，会根据他不同的考试成绩，送他不同的礼物，假如你可以控制小
        名的得分，请用程序实现小明到底该获得什么样的礼物，并在控制台输出。

    奖励：
        95~100 山地自行车
        90~94  游乐园
        80~89  变形金刚玩具
        80以下  胖揍一顿
 */

import java.util.Scanner;

public class IfTest_07_demo02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明成绩: ");
        int score = sc.nextInt();
//        if(score>=95 && score<=100) {
//            System.out.println("山地自行车");
//        }else if(score>=90 && score<=94){
//            System.out.println("游乐园");
//        }else if(score>=80 && score<=89){
//            System.out.println("变形金刚");
//        }else{
//            System.out.println("胖揍一顿");
//        }
        //数据测试：正确数据，边界数据，错误数据
        if (score > 100 || score < 0) {
            System.out.println("你输入的分数错误！");
        } else if (score >= 95 && score <= 100) {
            System.out.println("山地自行车");
        } else if (score >= 90 && score <= 94) {
            System.out.println("游乐园");
        } else if (score >= 80 && score <= 89) {
            System.out.println("变形金刚");
        } else {
            System.out.println("胖揍一顿");
        }


    }
}
