
import java.util.Arrays;
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
    System.out.println("Hello Java Developer!");
   }
}

//if , switch 
// Loop Statement, for loop, for-each, while loop, do while loop
//Arrays

class Arrays1 {
    public static void main(String[] args) { 
        String name = "Maung Maung, Aung Aung";
        //System.out.println("My name is " + name.split(",")[1] );
        //Array
        float numbers [] = new float[3];//index 0, count 1 
        numbers[0] = 10.054f;
        numbers[1] = 20;
        
      
        System.out.println(Arrays.toString(numbers));

       for(int i = 0; i < numbers.length; i++){
        System.out.println(numbers[i]);
       }
    }
}

class Array2 {
    public static void main(String[] args) {
         int numbers [] = new int[]{10,20,30};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println("-------------------------------");
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}

class Array3 {
    public static void main(String[] args) {
        int [] numbers = {10,20,30};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println("---------------------------------");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}

class Array4 {
    public static void main(String[] args) {
        String names [] = {"Maung Maung", "Aung Aung", "Tun Tun", "Su Su", "Nu Nu", "Aye Aye"};
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("------------------------");
        System.out.println(names[2]);
        names[1] = "Kyaw Kyaw";
        System.out.println(names[2]);
        System.out.println(Arrays.toString(names));
    }
}


class Array5 {
    public static void main(String[] args) {
        int [] [] numbers = new int[3][3];
        numbers[0][0] = 10;
        numbers[0][1] = 20;
        numbers[0][2] = 30;

        numbers[1][0] = 40;
        numbers[1][1] = 50;
        numbers[1][2] = 60;

        numbers[2][0] = 70;
        numbers[2][1] = 80;
        numbers[2][2] = 90;

        System.out.println(numbers[0][0]);
        System.out.println(numbers[0][1]);
        System.out.println(numbers[0][2]);

        System.out.println(numbers[1][0]);
        System.out.println(numbers[1][1]);
        System.out.println(numbers[1][2]);

        System.out.println(numbers[2][0]);
        System.out.println(numbers[2][1]);
        System.out.println(numbers[2][2]);
        System.out.println("=======================");
        System.out.print(Arrays.toString(numbers[0]));
        System.out.print(Arrays.toString(numbers[1]));
        System.out.println(Arrays.toString(numbers[2]));
        System.out.println("====================");
        
    }
}

class Array6 {
    public static void main(String[] args) {
        int [][][] numbers = {
          {
            {10,20,30},
            {30,40},
            {50}
          }
        };
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                for(int k = 0; k < numbers[i][j].length; k++){
                    System.out.println(numbers[i][j][k]);
                }
            }
        }
    }
}


class Array7 {
     void main(){
       String names [] [] = {
        {"Mr.", "Mrs.", "Ms."},
        {"Kyaw Kyaw", "Zaw Zaw", "Kyaw Hnin", "Su Su Hling"}
       };

       System.out.println("My name is " + names[0][0] + names[1][0]);
       System.out.println("My name is " + names[0][2] + names[1][3]);
       System.out.println("My name is " + names[0][1] + names[1][2]);
     }
}

class Array8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int col = scanner.nextInt();
        scanner.close();

        int [][] arr = new int[row][col];

        //Process
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = (i+ 1) * (j + 1);
            }
        }

        //print
        for(int i = 0; i < row; i++ ){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/**
 *   1 2 3
 *   2 4 6
 *   3 6 9
 */