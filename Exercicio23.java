import javax.swing.JOptionPane;

public class Exercicio23 {

  public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inicial:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero final:"));
        int soma = 0;
        int i = n1;
        while(i<=n2){		  
          soma = soma + i; 
          i++;
        }

        JOptionPane.showMessageDialog(null,"soma: " + soma);	
       
   }
}