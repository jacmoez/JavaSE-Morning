import javax.swing.JOptionPane;


class Addiation{
   public static void main(String [] args){
        Addiation a = new Addiation();
        a.add();
        a.sub();
        a.multi();
        a.div();
       
         
   }
   //ကိန်းနှစ်ခု ပေါင်းခြင်း
   void add(){
    String title = "AMS LTD";
    JOptionPane.showMessageDialog(null, "မဂ်လာပါ ကြိုဆိုပါ၏။ ကိန်းနှစ်ခု ပေါင်းပါ၊", title, 1);
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("ပထမကိန်း ဂဏန်းကို ရိုက်ပေးပါ၊ "));
   int num2 = Integer.parseInt(JOptionPane.showInputDialog("ဒုတိယကိန်း ဂဏန်းကို ရိုက်ပေးပါ၊ "));
    int sum = num1 + num2;
    JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + sum + ".", title, 1);

   }
   //ကိန်းနှစ်ခု နုတ်ခြင်း

   void sub(){
    String title = "AMS LTD";
    JOptionPane.showMessageDialog(null, "မဂ်လာပါ ကြိုဆိုပါ၏။ ကိန်းနှစ်ခု နှတ်ပါ။", title, 1);
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("ပထမကိန်း ဂဏန်းကို ရိုက်ပေးပါ၊ "));
   int num2 = Integer.parseInt(JOptionPane.showInputDialog("ဒုတိယကိန်း ဂဏန်းကို ရိုက်ပေးပါ၊ "));
    int sum = num1 - num2;
    JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + sum + ".", title, 1);
   }

   //ကိန်းနှစ်ခု မြှေက်ခြင်း

   void multi(){
    String title = "AMS LTD";
    JOptionPane.showMessageDialog(null, "မဂ်လာပါ ကြိုဆိုပါ၏။ ကိန်းနှစ်ခု မြှေက်ပါ။", title, 1);
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("ပထမကိန်း ဂဏန်းကို ရိုက်ပေးပါ၊ "));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog("ဒုတိယကိန်း ဂဏန်းကို ရိုက်ပေးပါ၊ "));
    int sum = num1 * num2;
    JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + sum + ".", title, 1);
   }

   //ကိန်းနှစ်ခု စားခြင်း
   void div(){
    String title = "AMS LTD";
    JOptionPane.showMessageDialog(null, "မဂ်လာပါ ကြိုဆိုပါ၏။ ကိန်းနှစ်ခု စားပါ၊", title, 1);
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("ပထမကိန်း ဂဏန်းကို ရိုက်ပေးပါ၊ "));
   int num2 = Integer.parseInt(JOptionPane.showInputDialog("ဒုတိယကိန်း ဂဏန်းကို ရိုက်ပေးပါ၊ "));
    int sum = num1 / num2;
    JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + sum + ".", title, 1);
   }
}