package day3.arr;

public class chanle {
    public static void main(String[] args) {
        int [] mang= {5, 3, 5, 2, 4};
        System.out.println("So le:");
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 != 0) {
                System.out.println(mang[i]);
            }
        }
        System.out.println("So chan:");
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                System.out.println(mang[i]);
            }
        }



    }
}