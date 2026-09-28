package exercice2;

public class ReverseArray {

    public static void reverse(int[] a){
        // let's print out the array:
        System.out.println("Before reversing: ");
        for (int e : a){
            System.out.println(e + " | ");
        }

        // the reversing algorithm:
        int i = 0;
        int j = a.length-1;

        while (i<=j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        // let's display:
        System.out.println("After reversing: ");
        for (int e : a){
            System.out.println(e + " | ");
        }
    }

    // the main:
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        reverse(a);
    }

}
