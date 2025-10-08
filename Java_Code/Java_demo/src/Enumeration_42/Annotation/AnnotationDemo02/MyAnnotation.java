package Enumeration_42.Annotation.AnnotationDemo02;
/*
    如果注解有多个属性,则可以在注解括号中用","号隔开分别给对应的属性赋值
    如果定义属性时，使用default关键字给属性默认初始值，则使用注解时，可以不进行属性的赋值
    如果只有一个属性需要赋值，并且属性的名称是value,则value可以省略,直接  定义值即可
    数组赋值时，值使用{}包裹。如果数组中只有一个值,则可以省略
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyAnnotation {
    /*
        无参无返回值的方法：void show();
        无参带返回值的方法：String show();

        注解中定义属性也是这样的格式：
            返回值类型 属性名()
     */

    String name() default "lb";
    int age();

//    String value();

//    String[] names();
}
