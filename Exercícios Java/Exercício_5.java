import java.util.Scanner;

public class Exercício_5 {
    public static void main(String[] args){
        String produto;
        double valor, valorFinal;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        produto = input.next();
        System.out.println("Digite o valor do produto");
        valor= input.nextDouble();
        while(valor<=0){
            System.out.println("Valor inválido! Digite um valor valido:");
            valor = input.nextDouble();
        }
        if(valor<50){
            System.out.println("o produto "+produto +" de custo "+valor+" sem nenhum desconto");
        }else{
            if(valor>=50 && valor<200){
                valorFinal=valor-(valor*0.05);
            System.out.println("o produto "+produto +" de custo "+valor+" tem como preço final com desconto: "+valorFinal);
            }else{
                if(valor>=200 && valor<500){
                    valorFinal=valor-(valor*0.06);
                    System.out.println("o produto "+produto +" de custo "+valor+" tem como preço final com desconto: "+valorFinal);
                }else{
                    if(valor>=500 && valor<1000){
                        valorFinal=valor-(valor*0.07);
                        System.out.println("o produto "+produto +" de custo "+valor+" tem como preço final com desconto: "+valorFinal); 
                    }else{
                    valorFinal=valor-(valor*0.08);
                    System.out.println("o produto "+produto +" de custo "+valor+" tem como preço final com desconto: "+valorFinal);
                    }
                }
            }
        }
    }
}