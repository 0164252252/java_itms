package day2;
import java.util.Scanner;
public class bt1 {
        public static void main(String[] args)
        {
            int n;
            Scanner a = new Scanner(System.in);
            System.out.print("Nhập số muốn kiểm tra:");
            n = a.nextInt();
            if(n > 0)
            {
                System.out.println("Số đã cho "+n+" là dương");
            }
            else if(n < 0)
            {
                System.out.println("Số đã cho "+n+" là âm");
            }
            else
            {
                System.out.println("Số đã cho "+n+" Không thỏa mãn điều kiện ");
            }
        }
    }

