import java.util.Scanner;

public class Exercício_6 {
    public static void main(String[] args){

        double resist[] = new double[4];
        double resistEquivalente=0, maior=0, menor=0;
        int x;
        

        Scanner input = new Scanner(System.in);

        for(x=0;x<=3;x++){
            System.out.println("Digite o valor da resistência "+(x+1));
            resist[x]=input.nextDouble();

            if(menor==0){
                menor=resist[x];
            }
            if(resist[x]<menor){
                menor=resist[x];
            }
            if(resist[x]>maior){
                maior=resist[x];
            }
            resistEquivalente+=resist[x];
        }

        System.out.println("O valor da resistência equivalente é: "+resistEquivalente);
        System.out.println("A maior resistência é: "+maior);
        System.out.println("A menor resistência é: "+menor);
    }
}