package assignments.WS1;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184
 * @Date:2019/10/5
 * @Content:workshop
 */
public class MyException extends Exception {    //自定义异常必须继承Exception
    public MyException(String msg){
        super(msg);
    }
}

