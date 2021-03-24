import javax.swing.JOptionPane;

public class teste {

    public static void main(String[] args) {
        
        double precoFinal = Double.parseDouble(JOptionPane.showInputDialog( "Digite o preco: "));;
        for(int preco=1; preco<5;preco++){

            if((preco % 2) == 0){
                  precoFinal = preco - (preco * 10 / 100);
                 JOptionPane.showMessageDialog(null,"valor descontado: " + precoFinal); 
            }else{

                if((preco % 3) == 0){
                      precoFinal = preco - (preco * 15 / 100);
                     JOptionPane.showMessageDialog(null,"valor descontado: " + precoFinal); 
                }else{

                    if((preco % 4) == 0){
                          precoFinal = preco - (preco * 20 / 100);
                         JOptionPane.showMessageDialog(null,"valor descontado: " + precoFinal);
                    }else{

                        if((preco % 5) == 0){
                              precoFinal = preco - (preco * 25 / 100);
                             JOptionPane.showMessageDialog(null,"valor descontado: " + precoFinal); 
                        }else{
                              precoFinal = preco;
                             JOptionPane.showMessageDialog(null,"Nao sera possivel dar um desconto para o valor " + precoFinal);      
                        }


                    }

                } 

            }    


              
            
        }	

    }

}