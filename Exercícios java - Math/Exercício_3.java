public class Exercício_3 {
    public static void main(String[] args){
        int sorteio = 0;
        int[] senha = new int[10];
        
        while(sorteio<5){
            sorteio = (int)(Math.random()*11);
        }

        for(int i=0; i<sorteio;i++){
            senha[i] = (int)(Math.random()*10);
        }

        System.out.println("O numero sorteado foi: "+ sorteio);
        System.out.println("A senha gerada foi: ");

        for(int i=0; i<senha.length;i++){
            if(i<sorteio){
                System.out.printf(String.valueOf(senha[i]));
            }
        }
    }
}
