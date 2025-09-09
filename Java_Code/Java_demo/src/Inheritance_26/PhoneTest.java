package Inheritance_26;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p =new Phone();
        p.call("易丽莉");
        System.out.println("------");
        NewPhone np = new NewPhone();
        np.call("爱人");
    }
}
