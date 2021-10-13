package day2;
import java.util.Scanner;
public class bt3 {
    public static void main(String[] args) {
//        int num = 9, i = 1;
//        while (i <= 10)
//        {
//            System.out.printf("%d * %d = %d \n", num, i, num * i);
//            ++i;
//        }


//        int num = 9;
//        for(int i = 1; i <= 10; ++i)
//        {
//            System.out.printf("%d * %d = %d \n", num, i, num * i);
//        }

        int num, i = 1;
        Scanner a = new Scanner(System.in);
        System.out.print("Nhập số muốn nhan:");
        num = a.nextInt();

        while (i <= 10)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            ++i;
        }
    }
}
