import javax.swing.JOptionPane;

public class Exercício_3 {
    public static void main(String[] args){
        double Ap1, Ap2, As, Final;
        Ap1= Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da ap1:"));
        Ap2= Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da ap2:"));
        As= Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da as:"));

        Final= Ap1+Ap2+As;

        if(Final>=7){
            JOptionPane.showMessageDialog(null, "O aluno foi Aprovado");
        }else{
            JOptionPane.showMessageDialog(null, "O aluno foi reprovado");
        }
    }
    
}