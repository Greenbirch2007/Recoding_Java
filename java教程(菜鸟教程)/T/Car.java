

//public class Test{
//    public static void main(String[] args){
//        boolean a = true;
//        boolean b = false;
//        System.out.println(a&&b);
//        System.out.println(a||b);
//        System.out.println(!a&&b);
//    }
//}


//public class Test{
//    public static void main(String[] args){
//        int a ,b ;
//        a = 10;
//        b = (a==1) ? 20 :30;
//        System.out.println(b);
//        System.out.println(80*'~');
//
//        b = (a==10) ? 20 :30;
//        System.out.println(b);
//
//
//
//    }
//}


class Vericle {}
public class Car extends Vericle{
    public static void main(String[] args){
        Vericle a = new Car();
        boolean result = a instanceof Car;
        System.out.println(result);
    }
}