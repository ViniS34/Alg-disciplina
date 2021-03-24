import javax.swing.JOptionPane;

public class Exercicio24 {

  public static void main(String[] args) {

       int i = 13;
       do{ 
         i++;
         if((i % 2) == 0){
            JOptionPane.showMessageDialog(null,"é par: " + i); 
         }
      }while(i<23);

       
   }
}