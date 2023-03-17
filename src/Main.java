import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numero, contador;
        Scanner scan = new Scanner( System.in);
        try {
         for( contador = 1 ; contador <= 5 ; contador ++ ){
             System.out.println("Ingrese un número mayor o igual a 74 y menor o igual a 189: ");
             numero = scan.nextInt();
             if( numero >= 74 && numero <= 189){
                 if( numero % 2 == 0){
                     if( numero % 5 == 0){
                         System.out.println(" El número ingresado es valido");
                     }
                 }
             }
         }
        }catch (Exception e){
            System.out.println("Error: " + e);

        }

    }
}