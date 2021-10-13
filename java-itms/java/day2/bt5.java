package day2;
import java.util.Scanner;
public class bt5 {
    public static void main(String[] args) {
//        int x = 0,  num;
//        Scanner a = new Scanner(System.in);
//        System.out.println("Nhap so muon dao: ");
//        num = a.nextInt();
//        while(num != 0) {
//            int b = num % 10;
//            x = x * 10 + b;
//            num /= 10;
//        }
//        System.out.println("dao so: " + x);

        int reversed = 0,  num;
        Scanner a = new Scanner(System.in);
        System.out.println("Nhap so muon dao: ");
        num = a.nextInt();
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("dao so: " + reversed);
    }

}

