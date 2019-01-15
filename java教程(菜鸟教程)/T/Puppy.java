//
//public class Puppy{
//    public Puppy(String name) {
//        //这个构造器仅有一个参数:name
//        System.out.println("小狗的名字是："+ name);
//    }
//    public static void main(String []args){
//        //下面的语句将创建一个Puppy对象
//        Puppy myPuppy = new Puppy("tommy");
//    }
//}
//
///*　实例化对象 */
//ObjectReference = new Constructor();
///*　访问类中的变量 */
//ObjectReference.variableName;
///*　访问类中的方法 */
//ObjectReference.methodName();


public class Puppy{
    int puppyAge;
    public Puppy(String name){
        // 这个构造器仅有一个参数:name
        System.out.println("小狗的名字是："+name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("小狗的年龄为："+puppyAge);
        return puppyAge;
    }

    public static void main(String []args){
        /*创建对象*/
        Puppy myPuppy = new Puppy("tommy");
        /* 通过方法来设定age*/
        myPuppy.setAge(2);
        /* 调用另一个方法获取age*/
        myPuppy.getAge();
        System.out.println("变量值："+myPuppy.puppyAge);
    }
}

import java.io.*;