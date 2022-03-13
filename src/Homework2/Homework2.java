package Homework2;
import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int a, b;
        a = key.nextInt();
        b = key.nextInt();
        String line;
            line=key.nextLine();
            if(line.equals("/")&&b==0){
                System.out.println("invalid number");
            }
            switch(a){
                case '0':{
                    System.out.println("zero");
                    break;
                }
                case '1': {
                    System.out.println("one");
                    break;
                }
                case '2':{
                    System.out.println("two");
                    break;
                }
                case '3':{
                    System.out.println("three");
                    break;
                }
                case '4':{
                    System.out.println("four");
                    break;
                }
                case '5':{
                    System.out.println("five");
                    break;
                }
                case '6':{
                    System.out.println("six");
                    break;
                }
                case '7':{
                    System.out.println("seven");
                    break;
                }
                case '8':{
                    System.out.println("eight");
                    break;
                }
                case '9':{
                    System.out.println("nine");
                    break;
                }
                default:{
                    System.out.println("invalid number");
                }

            if(line.equals("+")){
                System.out.println(" plus ");
            }
            else if(line.equals("-")){
                    System.out.println(" minus ");
                }
            else if(line.equals("*")){
                    System.out.println(" multiplied ");
                }
            else if(line.equals("/")){
                System.out.println(" divided ");
            }
        }
    }
}
