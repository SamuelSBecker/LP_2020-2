import java.util.Scanner;

public class Exercício_4 {
    public static void main(String[] args){
        String frase;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        frase = input.nextLine();

        for(int i=frase.length()-1; i>=0; i--){
            if (frase.charAt(i)== ' '){
                
            }else{
                System.out.print(frase.charAt(i));
            }
        }
    }
}
