package BT7;

public class Arrduong {
    private int[] A;

    public Arrduong() {
    }

    public Arrduong(int[] a) {
        A = a;
    }

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }
    public static void Avergate(int[] A){

        int sum = 0;
        int count = 0;
        double avergate = 0;
        for (int i = 0; i < A.length ; i++) {
            if (A[i] < 0) {
                continue;
            }
            sum += A[i];
            count++;
        }
        if (count != 0){
            avergate = (double) sum/ (double) count;
        }
        System.out.printf("\nKet qua: %.2f",avergate);
    }
}
