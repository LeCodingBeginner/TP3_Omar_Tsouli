package exercice5;

public class MtxAddition {
    public static int[][] addMtx(int[][] m1, int[][] m2){
        if (m1.length!=m2.length || m1[0].length != m2[0].length){
            return null;
        }

        int r = m1.length;
        int c = m1[0].length;

        // initializing the result:
        int[][] result = new int[r][c];
        for (int i = 0 ; i<r ; i++){
            for (int j = 0 ; j<c ; j++){
                result[i] = new int[c];
                result[i][j] = 0;
            }
        }

        // adding:
        for (int i = 0 ; i<r ; i++){
            for (int j = 0 ; j<c ; j++){
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return result;

    }

}
