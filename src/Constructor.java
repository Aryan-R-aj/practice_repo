class Tv{
    public int volume;
    public int ch_name;
    public Tv(){
        System.out.println("Non parameterized Constructor of Tv Class ");
    }
    public Tv(int x){
        System.out.println("The Current Volume is" + x);
    }
}

public class Constructor {
    public static void main(String[] args){
        Tv t=new Tv();

    }
}
