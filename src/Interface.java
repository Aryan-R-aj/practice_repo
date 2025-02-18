class Phone{
    public float batter_percentage;
    public String phone_brand;
    public Phone(){
        System.out.println("Phone");
    }
    public void call(){
        System.out.println("Dail the number");
    }
    public void sms(){
        System.out.println("Write the mssg");
    }
}
interface iCamera{
    void Click_pic();
    void Click_record();
}
interface i_MusicPlayer{
     void PlayMusic();
     void PauseMusic();
     void StopMusic();

}
interface iGame{
    void chooseGame();
    void gameMode();
}
class SmartPhone extends Phone implements iCamera,i_MusicPlayer{
   public void Click_pic(){
        System.out.println("Clicked picture");
    }
   public void Click_record(){
        System.out.println("start recording");
    }
   public void PlayMusic(){
            System.out.println("play music");
   }
   public void PauseMusic(){
            System.out.println("pause Song");
   }
   public void StopMusic(){
            System.out.println("Stop music");
        }

    }


public class Interface {
    public static void main(String[] args) {
//        System.out.println();
    }
}
