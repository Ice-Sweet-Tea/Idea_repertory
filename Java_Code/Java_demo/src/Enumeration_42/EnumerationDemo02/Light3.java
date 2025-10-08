package Enumeration_42.EnumerationDemo02;

public enum Light3 {
    RED("红"){
        @Override
        public void show() {
            System.out.println("红");
        }
    },
    GREEN("绿"){
        @Override
        public void show() {
            System.out.println("绿");
        }
    },
    YELLOW("黄"){
        @Override
        public void show() {
            System.out.println("黄");
        }
    };

    private String name;

    private Light3(String name){
        this.name = name;
    }

    public String getName() {
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
