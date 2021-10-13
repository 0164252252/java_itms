package day2;

public class loc {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Pear", "Strawberry", "apple", "ApplE" };
//        System.out.println(fruits[1]);

        for (String fruit : fruits) {
            System.out.println("In het ra: " + fruit);

            if (fruit.equalsIgnoreCase("apple")) {
                System.out.println(fruit);
            }
    }

    }

}
