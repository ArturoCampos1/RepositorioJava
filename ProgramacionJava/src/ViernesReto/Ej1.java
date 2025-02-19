package ViernesReto;
import java.util.Scanner;

public class Ej1 {

   public static void main(String[] args) {
       boolean exito = false;
       Scanner scanner = new Scanner(System.in);
       int num = scanner.nextInt();
       int dig1;
       int dig2;
       int dig3=0, res;
       res = num;
       
       for(int i = 0;i<=100;i++) {
           dig1 = Math.floorDiv(res, 10);
           dig2 = res % 10;
           
           if(res>100) {
               dig1 = Math.floorDiv(res, 100);
               dig2 = Math.floorDiv(res, 10)-dig1*10;
               dig3 = (res-(dig1*100))%10;
           }else {
               dig1 = Math.floorDiv(res, 10);
               dig2 = res % 10;
           }
           res = dig1+dig2;
           if(res == 1) {
               exito = true;
           }
           
           
       }
       
       if(exito) {
           System.out.println("feliz");
       }else {
           System.out.println("Infeliz");
       }
   }

}