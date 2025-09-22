package MyGrgs_32.MyGrgsTest_demo02;
/*
    测试类
 */
public class JumpingOperator {
    //方法的形参是接口名，其实需要的是该接口的实现类对象
    public void useJumping(Jumping j){  //Jumping j = new Cat();
        j.jump();
    }

    //方法的返回值是接口名，其实返回的是该接口的实现类对象
    public Jumping get_Jumping(){
        Jumping j = new Cat();
        return j;
    }
}
