import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Media Aritmetica de 3 valores");
        
        int A,B,C;
        int soma;
        A = 1;
        B = 2;
        C = 3;

        soma = (A + B + C / 3);
        JOptionPane.showMessageDialog(null,"A Soma aritmetica vale" +soma);

    }
} 