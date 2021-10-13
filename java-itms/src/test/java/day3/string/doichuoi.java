package day3.string;

public class doichuoi {
    public static void main(String[] args) {
        String st1 = "tom";
        String st2 = "jerry";
        String temp = " ";

        temp = st2;
        st2 = st1;
        st1 = temp;
        System.out.println("chuoi st1: " + st1);
        System.out.println("chuoi st2: " +st2);


    }
}
