import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] v = new int[]{5, 3, 2, 4, 7, 1, 0, 6};
        System.out.println("Antes do Bubble Sort : "+ Arrays.toString(v));

        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
        System.out.println("Após o Bubble Sort : "+ Arrays.toString(v));
    }
}