 import java.util.*;
 public class random {
    static char[] password(int len){
        System.out.println("Generating password using random");
        System.out.println("your new password is : ");  
        String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small =  "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String symbol = "!@#$%^&*_=+-/.?<>)";
        
        String values = capital + small + number + symbol;
        Random random = new Random();
        char[] PASSWORD = new char[len];
        for(int i=0;i<len;i++){
            PASSWORD[i] = values.charAt(random.nextInt(values.length()));
        }
        return PASSWORD;
    }  
    public static void main(String[]args){
        int len = 10;
        System.out.println(password(len));
    }
}
