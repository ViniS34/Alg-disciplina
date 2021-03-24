import javax.swing.JOptionPane;

public class Exercicio22 {

  public static void main(String[] args) {

       double media = 0.0;
       double soma = 0.0;
       int i = 0;
       while( i<=1000){
         soma = soma + i; 
         i++;
        }
         JOptionPane.showMessageDialog(null,"soma: " + soma);
         media = soma / 1000;
		  
		     JOptionPane.showMessageDialog(null,"média: " + media);
   }
}