package day2;
import java.util.Scanner;
public class bt4 {
    public static void main(String[] args) {
    int i = 0, num;
        Scanner a = new Scanner(System.in);
        System.out.print("Nhập số muốn dem:");
        num = a.nextInt();
    while (num != 0) {
        // chia + gán
        num /= 10;
        ++i;
    }

    System.out.println("dem so: " + i);
}
}
