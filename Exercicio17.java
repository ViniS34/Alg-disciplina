import javax.swing.JOptionPane;

public class Exercicio17 {

    public static void main(String[] args) {
         String controle;
         controle = JOptionPane.showInputDialog("Informe a profissão de Tiburcio: \n "
          + "e - engenheiro \n"
          + "p - programador \n"
          + "m - medico \n"
          + "a - advogado \n"
          + "d - designer");
         
         char controleCHAR = controle.charAt(0);
           switch(controleCHAR){
              case 'e':
                JOptionPane.showMessageDialog(null,"Tiburcio é engenheiro");
              break;
   
              case 'p':
                JOptionPane.showMessageDialog(null,"Tiburcio é programador");
              break;
              
              case 'm':
                JOptionPane.showMessageDialog(null,"Tiburcio é medico");
              break;
              
              case 'a':
                JOptionPane.showMessageDialog(null,"Tiburcio é advogado");
              break;
              
              case 'd':
                JOptionPane.showMessageDialog(null,"Tiburcio é designer");
              break;
   
              default:
                JOptionPane.showMessageDialog(null,"Tiburcio esta DESEMPREGADO! ");
              break;
         }
     } 
 
} 
