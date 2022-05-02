import java.util.*;

public class Consola {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Scanner cc = new Scanner(System.in);
 Scanner pp = new Scanner(System.in);
 String problema;
 String datos;
 int opcion= Integer.MIN_VALUE;
 System.out.println("Introduce el modelo de tu consola: \n"
 
  + "1.PlayStation®4  \n"
  + "2.PlayStation®4 PRO  \n"
  + "3.PlayStation®5 \n"
  + "4.Nintendo Switch \n"
  + "5.XboxOne \n"
  + "6.Xbox Series X \n");
opcion = sc.nextInt();
switch (opcion) {
case 1:  break;
case 2:  break;
case 3:  break;
case 4:  break;
case 5:  break;
case 6:  break;
default: System.out.println("Solo damos servicio a estas consolas por el momento.");
break;
}

System.out.println("Entendido. \n"
+ "Describenos el problema de la consola:");
problema = cc.nextLine();

System.out.println("Mientras uno de nuestros técnicos revisa el problema \n"
+ "facilitanos tus datos y direccion para recoger la consola: \n"
+ "-Direccion... \n ");
    datos = pp.nextLine();
     //rellenar mas cosas sobre datos personales
   System.out.println("Perfecto.La recogida de tu consola será .X. día.");
}
}