package Collection_38.Collections.CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();

        //添加元素
        array.add("兄弟情灬全总");
        array.add("兄弟情灬小痴");
        array.add("兄弟情灬奶龙");
        array.add("队长兄弟情灬雨泽");
        array.add("兄弟情灬挽歌");
        array.add("兄弟情灬小鹤");
        array.add("兄弟情灬逆战");
        array.add("兄弟情灬兔兔");
        array.add("兄弟情灬星云");
        array.add("兄弟情灬枪水");

        //将其随机打混
        Collections.shuffle(array);

        //分为两队
        List<String> teamA = array.subList(0, 5);
        List<String> teamB = array.subList(5, 10);

        //输出结果
        System.out.println("===随机分队结果===");
        System.out.println("A队" + teamA);
        System.out.println("A队" + teamB);
    }
}
