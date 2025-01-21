package OOP.Jan21;

public class BathRoom {
   private Shower shower;

   public void takeShower() {
       shower.taskShower();
   }

    public static void main(String[] args) {
        BathRoom n = new BathRoom();
        n.takeShower();
    }
}
