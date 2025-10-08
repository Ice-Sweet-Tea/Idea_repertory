package Enumeration_42.EnumerationDemo02;

public enum Light2 {
    RED("红"),GREEN("绿"),YELLOW("黄");

    private String name;

    private Light2(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Light2{" +
                "name='" + name + '\'' +
                '}';
    }
}
