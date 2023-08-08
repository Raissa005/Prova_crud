package provacrud;

import javax.swing.JOptionPane;
import provacrud.Produtos;

public class Main {
     
    public static void main(String[] args) {
          menu();
    }
    
    public static void menu(){
        Produtos p = new Produtos("Colar Pérola", 10.00 , 0, 0);
        String opcao;
      do{
            opcao = JOptionPane.showInputDialog(null, "Bem vindo à JôJoias! \n "
                                                                  + "Menu:  \n"
                                                                  +"1- Colsultar produtos \n"
                                                                  +"2-  Cadastrar novo produto \n"
                                                                  +"3-  Excluir sua reserva \n"
                                                                  +"4- Reservar produto \n"
                                                                 +"5- Saida de produto \n"
                                                                 + "6- Fechar \n");
              if("1".equals(opcao)){
                p.consultarP();
             }else if("2".equals(opcao)){
                 int prodEst =  JOptionPane.showConfirmDialog(null, "Você quer adicionar mais produtos ao estoque?");
                 if(prodEst == 0){
                     Integer  qtdD =  Integer.parseInt( JOptionPane.showInputDialog(null, "Digite a quantidade que será cadastrada >> "));
                     p.cadastrar(qtdD);
                  }
             }else if("3".equals(opcao)){
                 p.excluirP();
             }else if ("4".equals(opcao)){
                 int prodEst =  JOptionPane.showConfirmDialog(null, "Você deseja reservar mais produtos?");           
                 if(prodEst == 0){
                       p.adicionarRes();
                  }
             }else if("5".equals(opcao)){
                 p.atualizar();
             }    
      } while(!"6".equals(opcao));
    }
}
