import javax.swing.*;

public class Exercício2 {
    public static void main(String[] args){
        float valorN;
        float valorV;
        float percentual;
        float valorImposto;

        valorN=Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da transação"));
        valorV=Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da venal"));
        percentual=Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do percentual"));

        if(valorV>=valorN){
            valorImposto= valorV*percentual/100;
        }else{
            valorImposto= valorN*percentual/100;
        }
        JOptionPane.showMessageDialog(null,"O valor a ser pago é:"+valorImposto);
    }
}