package Enumeration_42.EnumerationDemo;

public abstract class Light3 {
    //创建三个实例
    public static final Light3 RED = new Light3("红"){
        @Override
        public void show() {
            System.out.println("红");
        }
    };

    public static final Light3 GREEN = new Light3("绿"){
        @Override
        public void show() {
            System.out.println("绿");
        }
    };

    public static final Light3 YELLOW = new Light3("黄"){
        @Override
        public void show() {
            System.out.println("黄");
        }
    };

    private String name;

    public Light3(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Light3{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void show();
}
