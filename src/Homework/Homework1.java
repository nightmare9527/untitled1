package Homework;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Homework1 {
    public static void main(String[] args){
        DecimalFormat pattern=new DecimalFormat("############0.0");
        Scanner keyboard = new Scanner(System.in);
        double kill,MWeight,DWeight,times,print;
        double per=0.001*30;
        kill=keyboard.nextDouble();
        MWeight=keyboard.nextDouble();
        DWeight=keyboard.nextDouble();
        times=DWeight/MWeight;
        print=times*kill/per;
        System.out.println(pattern.format(print));



    }
}
