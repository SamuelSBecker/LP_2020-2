import java.util.Scanner;

public class Exercício_4 {
    public static void main(String[] args){
        int idade, contribuição, resultado;
        char sexo;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a sexo \n m para masculino | f para feminino");
        sexo = input.next().charAt(0);
        while(sexo!='f' && sexo!='F' && sexo!='m' && sexo!='M'){
            System.out.println("Sexo invalido! Digite novamente \n m para masculino | f para feminino");
            sexo = input.next().charAt(0);
        }
        System.out.println("Digite sua idade:");
        idade=input.nextInt();
        System.out.println("Digite o seu tempo de contribuição:");
        contribuição=input.nextInt();

        if(sexo=='f' || sexo=='F'){
            if(idade>=60){
                if(contribuição>=30){
                    System.out.println("Você já tem o direito a aposentadoria!");
                }else{
                    resultado=30-contribuição;
                    System.out.println("Falta"+resultado +"anos de contribuição para sua aposentadoria");
                }
            }else{
                System.out.println("Voce não tem idade para se aposentar!");
            }
        }else{
            if(idade>=65){
                if(contribuição>=35){
                    System.out.println("Você já tem o direito a aposentadoria!");
                }else{
                    resultado=35-contribuição;
                    System.out.println("Falta"+resultado +"anos de contribuição para sua aposentadoria");
                }
            }else{
                System.out.println("Voce não tem idade para se aposentar!");
            }
        }

    }
}