import javax.swing.JOptionPane;

public class Exercicio18 {

    public static void main(String[] args) {
        
     String nome = JOptionPane.showInputDialog( "Digite o nome do cliente: ");
     double preco = Double.parseDouble(JOptionPane.showInputDialog( "Digite o preco: "));
     char categoria = JOptionPane.showInputDialog( "Digite a categoria: ").charAt(0);


     double desconto = 0;
     switch(categoria){
     case 'A' :
        desconto = 10;
        break;

     case 'B' :
        desconto = 15;
        break;

     case 'C' :
        desconto = 20;
        break;

     case 'D' :
        desconto = 25;
        break;

     case 'E' :
        desconto = 50;
        break;
	 default:
        JOptionPane.showMessageDialog(null, "Opçao invalida. ");
	    break;	
     }


     double precoFinal = preco - (preco * desconto / 100);

     JOptionPane.showMessageDialog(null,  "O Cliente " + nome);
     JOptionPane.showMessageDialog(null,  "recebeu o preço final de: " + precoFinal);
           
   }

}
