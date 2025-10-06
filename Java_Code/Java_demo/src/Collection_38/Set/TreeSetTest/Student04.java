package Collection_38.Set.TreeSetTest;

public class Student04 {
    private String name;
    private int chinese;
    private int math;

    public Student04(){}
    public Student04(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getChinese() {
        return chinese;
    }

    public int getMath() {
        return math;
    }

    public int getSum(){
        return this.chinese+this.math;
    }
}
