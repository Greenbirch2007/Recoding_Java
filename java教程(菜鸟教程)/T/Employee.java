import java.io.*;

public class Employee {
    //salary是静态的私有变量
    private static double salary;
    // DEPARTMENT是一个常量
    public static final String DEPARTMENT = "开发人员";
    public static void main(String[] args){
        salary = 10000;
        System.out.println(DEPARTMENT+"平均工资:"+salary);
    }
}


public class className{
    //..
}

private boolean myFlag;
static final double weeks = 9.5;
protected static final int BOXWIDTH = 42;
public static void main(String[] arguments){
    // 方法体
}

String version = '1.5.1';
boolean processOrder(){
    return true;
}


public class Longer{
    private String format;
    public String getFormat(){
        return this.format;
    }
    public void setFormat(String format){
        this.format = format;
    }
}


public static void main(String[] arguments){
    //
}


class AudioPlayer{
    protected boolean openSpeaker(Speaker sp){
        // 实现细节
    }
}

class StreamingAudioPlayer extends AudioPlayer{
    protected boolean openSpeaker(Speaker sp){
        //实现细节
    }
}