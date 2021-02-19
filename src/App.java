import java.util.Scanner;

public class App {
     public static void main(String[] args) throws Exception {  
      Scanner scanner = new Scanner(System.in);
      /* System.out.println("Podaj nazwe wojewodztwa:");
      System.out.println(city(scanner.nextLine()));

      scanner.close();
    
      static String city ( String userWoj){
         String[][] arr = {
         {"Slonskie","Katowice"},
         {"Wielkopolskie","Poznan"},
         {"Malopolskie","Krakow"};
         {"Mazowieckie","Warszawa"};
         {"Lodzkie","Lodz"}
      };

      String output = "Nie znalezlismy takiego wojewodztwa";
      int i = 0;
      while( i < arr.length ){
         if (arr[i][0].equals(userWoj)){
            output = "Stolica wojewodztwa"+arr[1][0]+" jest "+arr[i][1];
         break;
         }
         

         i++;
      }
         return output;
      }
/*

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

      /* System.out.println("Wpisz pierwszą liczbę");
      int a = scanner.nextInt();
      System.out.println("Podaj operator + lub -");
      scanner.nextLine();
      String o = scanner.nextLine();
      System.out.println("Wpisz drugą liczbę");
      int b = scanner.nextInt();
      if(o.equals("+")){
         System.out.println(a+" + "+b+" = "+(a+b));
      }else if(o.equals("-")){
         System.out.println(a+" + "+b+" = "+(a-b));}
      else{
        System.out.println("Podałeś zły operator");
   } */
   /*  
   System.out.println("Podaj pierwszą liczbę");
   int a = scanner.nextInt();
   System.out.println("Podaj operator (+,-,*,/,%)");
   scanner.nextLine();
   String o = scanner.nextLine();
   System.out.println("Podaj drugą liczbę");
   int b = scanner.nextInt();

   switch (o) {
      
      case "+":
      System.out.println(a+" + "+b+" = "+(a+b));
      break;
      case "-":
      System.out.println(a+" - "+b+" = "+(a-b));
      break;
      case "*":
      System.out.println(a+" * "+b+" = "+(a*b));
      break;
      case "/":
      System.out.println(a+" / "+b+" = "+(a/b));
      break;
      case "%":
      System.out.println(a+" % "+b+" = "+(a%b));
      
      break;
       default:
      System.out.println("Nie ma takiego operatora");
   
      break;
   }
   */
   /*
   int wynik = 0;
      String[][] dane = {
         {"Więcej niż jedno zwierzę","stado","klucz","dwa","owca","lama"},
         {"Sporty na s","sztafeta","skok o tyczce", "skoki narciarskie", "sumo", "szachy"}
       };
   for(int i = 0; i < dane.length; i++){
      System.out.println(dane[i][0]); 
         String odp = scanner.nextLine(); 
      boolean isAnswerCorrect = false;
   for(int it = 1; it < dane[i].length; it++){
      if(dane[i][it].equals(odp)){
          isAnswerCorrect = true;
          System.out.println("BRZDĘK");
            wynik += it*10;
        }
      }
      if(!isAnswerCorrect){
         System.out.println("X");
      }
    }      
    System.out.println("Twój wynik "+wynik);

    */ 
    
   /*
    int random = (int)(Math.random() * 11) + 5;
    System.out.println(random);
*/
/*
    int nr = 5;
    if(nr ==5){
       System.out.println("Error;");
    }
    while(nr == 5){
       System.out.println("ERROR;");
*/

/*
      int random = (int)(Math.random() * 100) + 1;
      System.out.println("System wylosuje dowolną liczbę w przedziale od 1 do 100. Spróbuj odgadnąć jaka to liczba mając 5 szans.");
         System.out.println(random);
     
      
      int próba = 1;

      while(próba <=5){
         System.out.println("Próba nr: "+próba);
         int userInt = scanner.nextInt();
      if(userInt > random){
         System.out.println("Jest większa od wylosowanej");
      }else if(userInt < random){
         System.out.println("Jest mniejsza od wylosowanej");
      }
      if(userInt == random){
         System.out.println("WYGRANA");
         break;
      }
     
      próba++;
      }
        scanner.close();
    }
      */

    NewClass nc0bj = new NewClass ();
    System.out.println(nc0bj);
    NewClass ncObj = new NewClass(); 
    
    System.out.println(ncObj.name+" to "+ncObj.race+", który ma "+ncObj.age+" lat" );

  }
}
    

















     } 
   }        
