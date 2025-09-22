package Api_21.ApiTest_demo;

/*
    Object 是类层次结构的根，每个类都可以将 Object 作为超类。所有类都直接或间接的继承自该类
    看方法的源码，选中方法，按下Ctrl+B

    建议所有子类重写此方法
    如何重写呢？自动生成即可
 */
public class ObjectDemo extends Object {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("吴彦祖");
        s.setAge(28);
        System.out.println(s);  //Api_21.ApiTest_demo.Student@14ae5a5
        System.out.println(s.toString());

/*
        public void println (Object x){
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
*/

/*
        public static String valueOf (Object obj){
            return (obj == null) ? "null" : obj.toString();
        }
*/

/*
        public String toString () {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
 */
    }
}
