import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para calculo do fatorial: ");
        int numero = scanner.nextInt();
        System.out.println("O fatorial de " + numero + " é: " + getFatorial(numero));
    }

    //Metodo poderia estar em alguma classe ou regra de negócio.
    public static Integer getFatorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * getFatorial(n-1);
    }
}