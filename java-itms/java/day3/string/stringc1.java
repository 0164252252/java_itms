package day3.string;

public class stringc1 {
    public static void main(String[] args) {
        String st1 = "xin chao";
        String st2 = " JAVA";

        if (!st1.equals(st2)) {
            System.out.println(st1 + " khac" + st2);
        } // c1: so sanh

        System.out.println(st1.concat(st2));  // c2: cong 2 chuoi

        System.out.println(st1.length());   // c3: dem do dai chuoi

        System.out.println(st1.substring(5, 8));     // c4: lay chuoi con cua 1 chuoi

        System.out.println(st1.toUpperCase());      // c5: chuyen chuoi sang chu hoa

        System.out.println(st2.toLowerCase());      // c6: chuyen chuoi sang chu thuong

        String reverse = new StringBuffer(st1).reverse().toString();    // c7: dao nguoc chuoi
        System.out.println(reverse);
    }

    }
