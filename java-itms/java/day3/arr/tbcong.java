package day3.arr;

public class tbcong {
    public static void main(String[] args){
        double[] mang = {5, 3, 5};
        double a = 0;

        for (int i = 0; i < mang.length; i++) {
            a = a + mang[i];
        }
        double average = a / mang.length;

//        for (double i : mang){
//            a = a + i;
//        }
//        double average = a / mang.length;

        System.out.println("Kết quả là:" + average);
    }
}
