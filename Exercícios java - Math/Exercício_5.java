import java.util.Scanner;

public class Exercício_5 {
    public static void main(String[] args){
        String frase;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        frase = input.next();

        frase = frase.toLowerCase();

        if(frase.equals("sexo") || frase.equals("sexual")){
            System.out.println("conteúdo inpróprio!");
        }else{
            System.out.println("Conteúdo liberado");
        }
    }
}
