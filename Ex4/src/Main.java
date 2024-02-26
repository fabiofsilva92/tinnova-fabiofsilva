import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Insira um número para listar o valor da soma dos multiplos de 3 e 5 abaixo dele: ");
        int num = scn.nextInt();
        System.out.println("Soma dos multiplos de 3 e 5 abaixo de "+num+" é: "+getSomaMultiplos(num));
    }

    public static int getSomaMultiplos(int numero){
        int soma = 0;
        for (int i = numero-1; i >= 3 ; i--) {
            if(i % 3 == 0 || i % 5 == 0){
                soma += i;
            }
        }
        return soma;
    }
}