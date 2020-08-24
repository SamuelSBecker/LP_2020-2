import java.util.Scanner;
/* */
public class Exercicio_1 {
    
    public static void main(String[] args){
        double valor;
        double desconto;
        double resDesconto;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do produto");
        valor=input.nextDouble();
        System.out.println("Digite o valor do desconto");
        desconto=input.nextDouble();

        resDesconto =valor * (desconto/100);
        System.out.println("O valor do desconto é:" +resDesconto);
        valor = valor - resDesconto;
        System.out.println("O valor final do produto é: R$" + valor);
    }
}