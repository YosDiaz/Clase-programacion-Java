
package logic;

import java.util.Scanner;

public class Color {
    public final static String PRIMARY_COLOR[]={"Amarillo","Azul","Rojo"};
    public static void readColor(){
    Scanner sc= new Scanner(System.in);
    String color=sc.nextLine();
    boolean isPrimary= Color.checkoutPrimaryColor(color);
    System.out.println("Es primario = " + isPrimary);
    }
    public static boolean checkoutPrimaryColor(String color){
        for(String data: Color.PRIMARY_COLOR){
            if (data.equalsIgnoreCase(color)){
                return true;
            } 
        }
        return false;
       
    }
    
}
