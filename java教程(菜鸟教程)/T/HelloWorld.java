public class HelloWorld {
    /* 第一个Java程序
     * 它将打印字符串 Hello World
     */
    public static void main(String []args) {
        System.out.println("Hello World"); // 打印 Hello World
    }
}



class FreshJuice {
    enum FreshJuiceSize{ SMALL,MEDIUM, LARGE}
    FreshJuiceSize size;
}

public class FreshJuiceTest {
    public static void main(String []args){
        FreshJuice juice= new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
    }
}


public class Dog{
    String breed;
    int age;
    String color;
    void barking(){
        }
    void hungry(){}
    void sleeping(){}
}

public class Puppy {
    public Puppy(){}
    public Puppy(String name ){
        //这个构造器仅有一个参数：name
    }
}