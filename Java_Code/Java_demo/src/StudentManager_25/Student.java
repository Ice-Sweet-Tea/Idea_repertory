package StudentManager_25;

/*
    学生类
    Alt+Insert  根据自己的需求进行选择
 */
public class Student {
    //学号
    private String sid;
    //姓名
    private String name;
    //年龄
    private String age;
    //地址
    private String address;

    public Student() {
    }

    public Student(String sid, String name, String age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setSid(String sid){
        this.sid = sid;
    }
    public String getSid(){
        return sid;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(String age){
        this.age = age;
    }
    public String getAge(){
        return age;
    }

    public void setAddress(String address){
        this.address =address;
    }
    public String getAddress(){
        return address;
    }
}
