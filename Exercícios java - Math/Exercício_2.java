import java.util.Scanner;

public class Exercício_2 {
    public static void main(String[] args){
        double valor=0;

        do{

            Scanner input = new Scanner(System.in);

            System.out.println("Digite o valor do produto a ser reajustado: ");
            valor = input.nextDouble();

            if(valor==0){
                break;
            }else{
                valor += (valor*0.12);
                System.out.println("O novo valor do produto é: "+ Math.round(valor));
            }
        }while(valor!=0);
    }
}
