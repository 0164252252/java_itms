package day3.arr;

public class sum {
    public static void main(String[] args){
        int[] mang = {5, 3, 5};
        int sum = 0;

//        for( int num : mang) {
//            sum = sum + num;
//        }

        for (int i = 0; i < mang.length; i++){
            sum = sum + mang[i];
        }
        System.out.println("Kết quả là:"+sum);
    }
}

