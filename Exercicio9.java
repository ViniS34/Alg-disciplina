import javax.swing.JOptionPane;

public class Exercicio9 {

    public static void main(String[] args) {

        int massa;
        double altura,imc;
        massa = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua massa em Kg:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em metros:"));
		imc = massa / (altura * altura ); 
		JOptionPane.showMessageDialog(null,"Seu IMC é: " + imc);
    

    }

}    

