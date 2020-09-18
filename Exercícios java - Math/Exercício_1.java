import java.util.Random;

public class Exercício_1{
    public static void main(String[] args){
        int resultado = 0;

        Random random = new Random();

        for(int i=0; i<3; i++){
            int aux = random.nextInt(6)+1;
            resultado += aux;
            System.out.println(aux);
        }

        System.out.println("A soma dos dados foi: " + resultado);
    }
}