
import javax.swing.JOptionPane;

public class Trabalho2 {
     
    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null,
        "Seja Bem-Vindo ao sistema operacional da loja de bebidas Unisul, Polo Floripa. \n Por favor, realize sua escolha depois de preencher o procedimento de uso." );


        String nome;
        int idade;
        int Cardapio;
        double money;
        double resultado;
        double preco;
        double precofinal;

        
        double aumento1 = 10;
        double aumento2 = 15;
        double aumento3 = 20;
        double aumento4 = 25;
        double aumento5 = 50;
            

        int bebidasBR;

        double acaipreco300ml;
        double aguadecocopreco;
        double aguadecoco200mlpreco;
        double aguadecococaixa1lpreco; 
        double guarana1lpreco;
        double guarana1litroemeiopreco;
        double guarana2lpreco;
        double guaranalatapreco350ml;
        double cajuinanaturalpreco500ml;
        double cajuina2lpreco;
        double caldopreco300ml;
        double caldopreco400ml;
        double caldopreco500ml;
        double caldopreco600ml;
        double caipirinha620mlpreco;
        double caipirinhasmirnoffpreco1L; 
        double catuababufalopreco1L;
        double catuabaselvagempreco1L;
        double catuabakatu900ml;
        double cachacaartesanal1Lpreco;
        double cachaca51preco965ml;
        double quentaoaliancapreco1L;
        double brahmachopppilsen355ml;
        double brahmaextralager600ml;
        double cervejabrahmalata350ml;
        double cervejabrahmalata473ml;
        double cervejaantarcticasubzero473ml;
        double cervejaantarcticapilsenlongneck355ml;
        double cervejaantarcticaoriginalgarrafa300ml;
        double cervejaitaipavasemA355ml;
        double cervejaitaipava600ml;
        double cervejaschinzero350ml;
        double cervejaschingarrafa1l;


        int bebidasEX;

        double amarula750ml;
        double licorfinocointreau700ml;
        double whiskeyjameson750ml;
        double licor43diegozamora750ml;
        double licorfrangelico700ml;
        double whiskeyjackdaniels1l;
        double skollata350ml;
        double skollata269ml;
        double skolpilsenlongneck275ml;
        double skolpuromaltelongneck257ml;
        double absintoskullverde500ml;
        double havaclubrum750ml;
        double conhaquelouisxiii700ml;
        double fantaguarana350ml;
        double fantalaranja350ml;
        double fantauva350ml;
        double cocacola350ml;
        double cocacolazero350ml;
        double pepsi350ml;
        double pepsizero350ml;
        double sprite350ml;
        double spritezero350ml;


        int bebidasVR;

        double aguacrystalSG;
        double aguacrystalCG;
        double suconatural500mlQS;


        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

        if(idade >= 18){
            JOptionPane.showMessageDialog(null,nome + " pode beber. ");
        }else{
            JOptionPane.showMessageDialog(null,nome + " nao pode beber. ");
        }
        
        int i = 0;
        do{ 
          i++;
          if(i == 1){
              JOptionPane.showMessageDialog(null,"Se"); 
          }if(i == 2){
              JOptionPane.showMessageDialog(null,"beber"); 
          }if(i == 3){
              JOptionPane.showMessageDialog(null,"nao");
          }if(i == 4){
              JOptionPane.showMessageDialog(null,"dirija");
          }
       }while(i<4);
    

       preco = Double.parseDouble(JOptionPane.showInputDialog("Insira seu valor monetario: "));
       for(int d=0; d<4;d++){ 
          if((d % 2) == 0){
              precofinal = preco + ( preco * aumento1 / 100);
              JOptionPane.showMessageDialog(null,"preco do troco aumentado para : " + precofinal); 
          }else{
              if((d % 3) == 0){
                  precofinal = preco + ( preco * aumento2 / 100);
                  JOptionPane.showMessageDialog(null,"preco do troco aumentado para : " + precofinal); 
              }else{
                  if((d % 4) == 0){
                      precofinal = preco + ( preco * aumento3 / 100);
                      JOptionPane.showMessageDialog(null,"preco do troco aumentado para : " + precofinal); 
                  }else{
                      if((d % 5) == 0){
                          precofinal = preco + ( preco * aumento4 / 100);
                          JOptionPane.showMessageDialog(null,"preco do troco aumentado para : " + precofinal); 
                      }else{
                          if((d % 25) == 0){
                              precofinal = preco + ( preco * aumento5 / 100);
                              JOptionPane.showMessageDialog(null,"preco do troco aumentado para : " + precofinal); 
                           }
                        }
  
                    }
  
                }
    
      
            }
        }

        money = Double.parseDouble(JOptionPane.showInputDialog("Insira o ultimo valor que recebeu com o aumento: "));
        Cardapio = Integer.parseInt(JOptionPane.showInputDialog("Escolha a variedade que deseja:"
        + " \n 1 - Bebidas-Brasileiras \n 2 - Bebidas do Exterior \n 3 - Bebidas-Variadas "));
        bebidasBR = Integer.parseInt(JOptionPane.showInputDialog("Escolha a devida bebida:" + 
        " \n 0- Acai  R$7.00; \n 1- Agua de Coco  R$1.99; \n 2- Agua de Coco(200ml)  R$3.75; \n 3- Agua de Coco(1L)  R$9.00;  \n 4- Guarana(1L)  R$3.50;  \n 5- Guarana(1.5L)  R$4.25;  \n 6- Guarana(2L)  R$5.50;  \n 7- Guarana lata(350ml)  R$3.00;  \n 8- Cajuina Natural(500ml)  R$7.50;  \n 10- Cajuina(2L)  R$15.20;  \n 11- Caldo de cana(300ml)  R$3.00;  \n 12- Caldo de cana(400ml)  R$4.00;  \n 13- Caldo de cana(500ml)  R$5.00;  \n 14- Caldo de cana(600ml)  R$6.00;  \n 16- Cachaca artesanal(1L)  R$31.50;  \n 17- Cachaca 51(965ml)  R$10.00;  \n 18- Caipirinha(620ml)  R$22.00;  \n 19- Caipirinha Smirnoff(1L)  R$50.00;  \n 20- Catuaba Bufalo(1L)  R$8.50;  \n 21- Catuaba Selvagem(1L)  R$9.75;  \n 22- Catuaba Katu(900ml)  R$7.35;  \n 21- Quentao Alianca(1L)  R$12.00;  \n 22- Garrafa Brahma(355ml)  R$3.50;  \n 23- Garrafa LargeBrahma(600ml)  R$6.50;  \n 24- Lata Brahma(350ml)  R$3.25;  \n 25- Lata Brahma(473ml)  R$9.25;  \n 26- Lata Antarctica(473ml)  R$3.50;  \n 27- Garrafa Antarctica(355ml)  R$5.60;  \n 28- Garrafa Antarctica(300ml)  R$3.50;  \n 29- Lata Itaipava(355ml)  R$6.00;  \n 30- Garrafa Itaipava(600ml)  R$7.00;  \n 31- Lata Schin zero Alcool(350ml)  R$2.95;  \n 32- Garrafa Schin(1L)  R$5.50;"));
        bebidasEX = Integer.parseInt(JOptionPane.showInputDialog("Escolha a devida bebida:" +
        " \n 0- Amarula(750ml)  R$110.00;  \n 1- Licor Fino Cointreau(700ml)  R$100.00;  \n 2- Whiskey Jameson(750ml)  R$80.00;  \n 3- Licor 43 Diego Zamora(750ml)  R$145.00;  \n 4- Licor Frangelico(700ml)  R$135.00  \n 5- Whiskey Jack Daniel's(1L)  R$155.30  \n 6- Lata Skol(350ml)  R$2.15;  \n 7- Lata Skol(269ml)  R$2.50;  \n 8- Garrafa de Skol(275ml)  R$8.60;  \n 9- Garrafa de Skol Pura(257ml)  R$9.00;  \n 10- Licor Frangelico(700ml)  R$135.00;  \n 11- Absinto Skull Verde(500ml)  R$140.00; \n 12- Hava Club rum(750ml)  R$95.00;  \n 13- Conhaque Louis XIII(700ml)  R$30000.00;  \n 14- Fanta guarana(350ml)  R$2.20;  \n 15- Fanta laranja(350ml)  R$2.50;  \n 16- Fanta uva(350ml)  R$2.60;  \n 17- Coca-cola(350ml)  R$3.60;  \n 18- Coca-cola zero(350ml)  R$3.60;  \n 19- Sprite(350ml)  R$2.80;  \n 20- Pepsi zero(350ml)  R$2.30; \n 21- Sprite(350ml) R$3.75;  \n 22- Sprite zero(350ml)  R$2.30; "));
        bebidasVR = Integer.parseInt(JOptionPane.showInputDialog("Escolha a devida bebida:" +
        " \n 0- Agua mineral,sem gas(CRYSTAL,500ml)  R$3.00; \n 1- Agua mineral,com gas (CRYSTAL,500ml)  R$3.10;  \n 2- Suco natural(500ml,qualquer sabor)  R$4.50;"));
        
        
    
        switch(Cardapio){
            case 1:
                switch(bebidasBR){
                     case 0:
                      acaipreco300ml = 7.00;               //açaí
                      resultado = money - acaipreco300ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 1:
                      aguadecocopreco = 1.99;              //água de coco natural
                      resultado = money - aguadecocopreco;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 2:
                      aguadecoco200mlpreco = 3.75;         //água de coco caixa de 200ml
                      resultado = money - aguadecoco200mlpreco;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 3:
                      aguadecococaixa1lpreco = 9.00;       //água de coco caixa de 1L
                      resultado = money - aguadecococaixa1lpreco;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 4:
                      guarana1lpreco = 3.50;               //garrafa de guaraná,1L
                      resultado = money - guarana1lpreco;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 5:
                      guarana1litroemeiopreco = 4.25;      //garrafa de guaraná,1.5L
                      resultado = money - guarana1litroemeiopreco;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 6:
                      guarana2lpreco = 5.50;
                      resultado = money - guarana2lpreco; //garrafa de guaraná,2L
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 7:
                      guaranalatapreco350ml = 3.00;            //guaraná lata,350ml
                      resultado = money - guaranalatapreco350ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 8:
                     cajuinanaturalpreco500ml = 7.50;          //cajuína natural,sem açúcar
                      resultado = money - cajuinanaturalpreco500ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 9:
                      cajuina2lpreco = 15.20;             //cajuína garrafa,2L
                      resultado = money - cajuina2lpreco;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 10:
                      caldopreco300ml = 3.00;             //caldo de cana,copo de 300ml
                      resultado = money - caldopreco300ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 11:
                      caldopreco400ml = 4.00;             //caldo de cana,copo de 400ml
                      resultado = money - caldopreco400ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 12:
                      caldopreco500ml = 5.00;             //caldo de cana,copo de 500ml
                      resultado = money - caldopreco500ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 13:
                      caldopreco600ml = 6.00;             //caldo de cana,copo de 600ml
                      resultado = money - caldopreco600ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 14:
                      cachacaartesanal1Lpreco = 31.50;    //cachaça, garrafa de vidro da marca Artesanal(1L)
                      resultado = money - cachacaartesanal1Lpreco;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 15:
                      cachaca51preco965ml = 10.00;        //cachaça, garrafa de vidro da marca 51(965ml)
                      resultado = money - cachaca51preco965ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 16:
                      caipirinha620mlpreco = 22.00;       //caipirinha, copo de 620ml
                      resultado = money - caipirinha620mlpreco;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 17:
                      caipirinhasmirnoffpreco1L = 50.00;    //caipirinha da marca Smirnoff(1L)
                      resultado = money - caipirinhasmirnoffpreco1L;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 18:
                      catuababufalopreco1L = 8.50;          //catuaba da marca bufalo(1L)
                      resultado = money - catuababufalopreco1L;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 19:
                      catuabaselvagempreco1L = 9.75;        //catuaba da marca selvagem(1L)
                      resultado = money - catuabaselvagempreco1L;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 20:
                      catuabakatu900ml = 7.35;             //catuaba da marca bakatu(900ml)
                      resultado = money - catuabakatu900ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 21:
                      quentaoaliancapreco1L = 12.00;          //quentão da marca Aliança(1L)
                      resultado = money - quentaoaliancapreco1L;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 22:
                      brahmachopppilsen355ml = 3.50;            //Marca brasileira (BRAHMA), garrafa com cerveja(355ml)
                      resultado = money - brahmachopppilsen355ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 23:
                      brahmaextralager600ml = 6.50;            //Marca brasileira (BRAHMA), garrafa com cerveja(600ml)
                      resultado = money - brahmaextralager600ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);   
                     break;
                     case 24:
                      cervejabrahmalata350ml = 3.25;            //Marca brasileira (BRAHMA), lata com cerveja(350ml)
                      resultado = money - cervejabrahmalata350ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 25:
                      cervejabrahmalata473ml = 9.25;            //Marca brasileira (BRAHMA), lata com cerveja(473ml)
                      resultado = money - cervejabrahmalata473ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);   
                     break;
                     case 26:
                      cervejaantarcticasubzero473ml = 3.50;            //Marca brasileira (BRAHMA), lata com cerveja(473ml)
                      resultado = money - cervejaantarcticasubzero473ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 27:
                      cervejaantarcticapilsenlongneck355ml = 5.60;            //Marca brasileira (ANTARCTICA), garrafa com cerveja(355ml)
                      resultado = money - cervejaantarcticapilsenlongneck355ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 28:
                      cervejaantarcticaoriginalgarrafa300ml = 3.90;            //Marca brasileira (ANTARCTICA), garrafa com cerveja(300ml)
                      resultado = money - cervejaantarcticaoriginalgarrafa300ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 29:
                      cervejaitaipavasemA355ml = 6.00;            //Marca brasileira (ITAIPAVA), garrafa com cerveja sem álcool(355ml)
                      resultado = money - cervejaitaipavasemA355ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 30:
                      cervejaitaipava600ml = 7.00;            //Marca brasileira (ITAIPAVA), garrafa com cerveja(600ml)
                      resultado = money - cervejaitaipava600ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 31:
                      cervejaschinzero350ml = 2.95;            //Marca brasileira (SCHIN), lata com cerveja(350ml)
                      resultado = money - cervejaschinzero350ml;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     case 32:
                      cervejaschingarrafa1l = 5.50;            //Marca brasileira (SCHIN), garrafa com cerveja(1L)
                      resultado = money - cervejaschingarrafa1l;
                      JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                     break;
                     default:
                      JOptionPane.showMessageDialog(null,"Escolha invalida!");
                     break;
                
                }

            break;

            case 2:
                switch(bebidasEX){  
                    case 0:
                     amarula750ml = 110.00;               //africano
                     resultado = money - amarula750ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 1:
                     licorfinocointreau700ml = 100.00;    //francês
                     resultado = money - licorfinocointreau700ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 2:
                     whiskeyjameson750ml = 80.00;               //irlandês
                     resultado = money - whiskeyjameson750ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 3:
                     licor43diegozamora750ml = 145.00;          //espanhol
                     resultado = money - licor43diegozamora750ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 4:
                     licorfrangelico700ml = 135.00;            //italiano
                     resultado = money - licorfrangelico700ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 5:
                     whiskeyjackdaniels1l = 155.30;            //estadunidense
                     resultado = money - whiskeyjackdaniels1l;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 6:
                     skollata350ml = 2.15;            //dinamarquês
                     resultado = money - skollata350ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 7:
                     skollata269ml = 2.50;            //dinamarquês
                     resultado = money - skollata269ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 8:
                     skolpilsenlongneck275ml = 8.60;            //dinamarquês
                     resultado = money - skolpilsenlongneck275ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 9:
                     skolpuromaltelongneck257ml = 9.00;            //dinamarquês
                     resultado = money - skolpuromaltelongneck257ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 10:
                     licorfrangelico700ml = 135.00;            //dinamarquês
                     resultado = money - licorfrangelico700ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 11:
                     absintoskullverde500ml = 140.00;            //italiano
                     resultado = money - absintoskullverde500ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 12:
                     havaclubrum750ml = 95.00;            //cubano
                     resultado = money - havaclubrum750ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);   
                    break;
                    case 13:
                     conhaquelouisxiii700ml = 30000.00;            //francês
                     resultado = money - conhaquelouisxiii700ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 14:
                     fantaguarana350ml = 2.20;            //norte-americana
                     resultado = money - fantaguarana350ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 15:
                     fantalaranja350ml = 2.50;            //norte-americana
                     resultado = money - fantalaranja350ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 16:
                     fantauva350ml = 2.60;            //norte-americana
                     resultado = money - fantauva350ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 17:
                     cocacola350ml = 3.60;            //norte-americana
                     resultado = money - cocacola350ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 18:
                     cocacolazero350ml = 3.60;            //norte-americana
                     resultado = money - cocacolazero350ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 19:
                     pepsi350ml = 2.80;            //norte-americana
                     resultado = money - pepsi350ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 20:
                     pepsizero350ml = 2.30;            //norte-americana
                     resultado = money - pepsizero350ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 21:
                     sprite350ml = 3.75;            //norte-americana
                     resultado = money - sprite350ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 22:
                     spritezero350ml = 2.30;            //norte-americana
                     resultado = money - spritezero350ml;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    default:
                     JOptionPane.showMessageDialog(null,"Escolha invalida!");
                    break;
                }

              
  
            break;
            
            case 3:
                switch(bebidasVR){
                    case 0:
                     aguacrystalSG = 3.00;            //Marca(CRYSTAL) garrafa da água sem gás(500ml)
                     resultado = money - aguacrystalSG;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 1:
                     aguacrystalCG = 3.10;            //Marca(CRYSTAL) garrafa da água com gás(500ml)
                     resultado = money - aguacrystalCG;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    case 2:
                     suconatural500mlQS = 4.50;       //Suco natural para qualquer sabor, copo(500ml)
                     resultado = money - suconatural500mlQS;
                     JOptionPane.showMessageDialog(null,"Troco final: " + resultado);
                    break;
                    default:
                     JOptionPane.showMessageDialog(null,"Escolha invalida!");
                    break;
                }    

            break;

            default:
              JOptionPane.showMessageDialog(null,"Escolha invalida!");
            break;

            

            

        }

        

        
        
      
        

          


    }


}        
                       
            

           


            


                  
                
            

        
            

        

