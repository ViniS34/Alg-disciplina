import javax.swing.JOptionPane;

public class Exercicio16 {

    public static void main(String[] args) {
        int controle;
        double resultado,resultadodiv;
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
        controle = Integer.parseInt(JOptionPane.showInputDialog("Qual operaçao voce quer executar ?"
                                                             + " \n 1 - adiçao \n 2 - subtraçao \n 3 - multiplicaçao \n 4 - divisao"));
          switch(controle){
             case 1:
               resultado = numero1 + numero2;
               JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
             break;
   
             case 2:
               resultado = numero1 - numero2;
               JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
             break;
             
             case 3:
               resultado = numero1 * numero2;
               JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
             break;
             
             case 4:
               resultadodiv = numero1 / numero2;
               JOptionPane.showMessageDialog(null,"O resultado é: " + resultadodiv);
             break;
   
             default:
               JOptionPane.showMessageDialog(null,"Opçao invalida! ");
             break;
           }
       }

}
