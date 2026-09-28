package Exercice7;

public class STDev {
    public static double std(int[] a){
        if (a.length == 0){
            return 0;
        }
        if (a.length == 1){
            return -1; // invalid length
        }
        // let's compute the average first:
        int avg = 0;
        for (int e : a){
            avg += e/a.length;
        }

        // let's initialize and compute the stdev:
        double stdev = 0;
        for (int e : a){
            stdev += Math.pow(e-avg,2)/(a.length-1);
        }
        return Math.sqrt(stdev);
    }
    // testing in the main:
    public static void main(String[] args){
        int[] a = new int[]{1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.print(std(a));
    }
}
