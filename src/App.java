import java.util.Scanner;

public class App {
     public static void main(String[] args) throws Exception {  
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Podaj swoje imię:");
     Scanner scanner = new Scanner(System.in);
     String firstName = scanner.nextLine();
     System.out.println("Twoje imię to "+ firstName);
     scanner.close();
     //Wpisywanie imienia i wyświetlanie go
 */
        /*System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        System.out.println(a+" + " + b+" = "+(a+b));
        */ 
        /* // IF ELSE

        int nr = 10;
        if(nr == 2){
         System.out.println("Liczba to 2");
        }else if(nr == 3){
         System.out.println("Liczba to 3");
      }else{
         System.out.println("Jakaś inna liczba niż 3 i 2");
      } 
      // */

      System.out.println("Wpisz pierwszą liczbę");
      int a = scanner.nextInt();
      System.out.println("Podaj operator + lub -");
      int b = scanner.nextInt();
      System.out.println("Wpisz drugą liczbę");
      int c = scanner.nextInt()
      System.out.println(a+" + " + b+" = "+(a+b));
      System.out.println(a+" - " + b+" = "-(a-b));
      System.out.println("Podaj wynik");
        scanner.close();
   }
