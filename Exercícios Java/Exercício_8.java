import java.util.Scanner;

public class Exercício_8 {
    public static void main(String[] args){
        int num, i, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10 que deseja saber a tabuada");
        num= input.nextInt();
        while(num<1 || num>10){
            System.out.println("Numero inválido! Digite um númeuro de 1 a 10: ");
            num=input.nextInt();
        }
        for(i=1; i<=10; i++){
            result=num*i;
            System.out.println("\n"+num+" * "+i);
            System.out.println("*--"+result+"--*");
        }
    }
}