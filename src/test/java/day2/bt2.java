package day2;
import java.util.Scanner;
public class bt2 {
    public static void main(String[] args){
        int x, y, z, max;
        Scanner a = new Scanner(System.in);
        System.out.print("Nhập số muốn kiểm tra:");
        x = a.nextInt();
        y = a.nextInt();
        z = a.nextInt();

        System.out.println("Ba số vừa được nhap vao là " + x + ", " + y +
                " và " + z);

        // tìm số lớn nhất
        max = x;
        if (max < y) {
            max = y;
        }
        if (max < z) {
            max = z;
        }
        System.out.println(" Số lớn nhất trong 3 số là " + max);
    }
}
