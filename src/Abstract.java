abstract class phone{
    abstract public void call();
    abstract public void sms();
}
class smartPhone extends phone{
    public void call(){
        System.out.println("Enter the number for call: ");

    }
    public void sms(){
        System.out.println("Enter the number for sms");
    }
}
public class Abstract {
    public static void main(String[] args) {
        smartPhone sm=new smartPhone();
        sm.call();
        sm.sms();
    }
}
