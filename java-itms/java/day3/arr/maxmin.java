package day3.arr;

public class maxmin {
    public static void main(String[] args){
        int max,min,i;
        int a[] = {9, 2, 3, 4, 5};
        int n = a.length;
        max = a[0];
        min = a[0];
        for(i = 0; i < n ; ++i) {
            if(a[i]>max)
                max=a[i];

            if(a[i]<min)
                min=a[i];
        }

        System.out.println("max:" + max);
        System.out.print("min:" + min );
    }
}

