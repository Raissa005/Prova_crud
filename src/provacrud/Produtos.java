package provacrud;

import javax.swing.JOptionPane;

public class Produtos {
    private String nome;
    private Double valorUnic;
    private int qtdDisponivel;
    private int qtdReservada;
    
    public Produtos(String nome, Double valorUnic, int qtdDisponivel, int qtdReservada){
        this.nome = nome;
        this.valorUnic = valorUnic;
        this.qtdDisponivel = qtdDisponivel;
        this.qtdReservada = qtdReservada;
    }
  
     public void consultarP(){
        JOptionPane.showMessageDialog(null, Produtos.this.nome 
                                                                       +" \n Valor : " + Produtos.this.valorUnic 
                                                                       +"\n Qtd disponiveis: "+ Produtos.this.qtdDisponivel 
                                                                       + "\n Qtd reservadas: "+ Produtos.this.qtdReservada);
    }
     
     public void cadastrar(int qtdAdic){
        int quantidade = this.qtdDisponivel;
        quantidade += qtdAdic;
        this.qtdDisponivel = quantidade;
         JOptionPane.showMessageDialog(null, "Sucesso!  Agora há "+ qtdDisponivel +" produtos disponíveis.");
         
    }
    
    public void excluirP(){
          int prodEst =  JOptionPane.showConfirmDialog(null, "Você quer excluir seu produto reservado? ");
        if(prodEst ==0){
           Produtos.this.qtdDisponivel ++;
           Produtos.this.qtdReservada--;
            JOptionPane.showMessageDialog(null, "Agora há "+ qtdReservada+" produtos reservados.");
        }
    }
   
    
     public void adicionarRes(){
         if (Produtos.this.qtdDisponivel == 0){
              JOptionPane.showMessageDialog(null, "Não há mais produtos disponíveis, você precisa cadastrar mais produtos");
         }else{
               Integer  prodRes =  Integer.parseInt( JOptionPane.showInputDialog(null, "Quantos produtos você deseja reservar? \n"         
                                                                                                                                                                            +"Há "+qtdDisponivel+" produtos disponíveis"));
           int prodDis = Produtos.this.qtdDisponivel;
          prodDis = prodDis - prodRes;
          Produtos.this.qtdDisponivel = prodDis;
         prodRes += Produtos.this.qtdReservada;
           Produtos.this.qtdReservada = prodRes;
            JOptionPane.showMessageDialog(null, "Agora há  "+ qtdReservada +" produtos reservados. \n"
                                                                                                                + qtdDisponivel + " produtos disponíveis. ");
         }
        
    }
     
    public void atualizar(){
        int prodEst =  JOptionPane.showConfirmDialog(null, "Você quer finalizar a compra do produto reservado? ");
        if(prodEst ==0){
            if(Produtos.this.qtdReservada == 0){
                 if (Produtos.this.qtdDisponivel == 0){
              JOptionPane.showMessageDialog(null, "Não há mais produtos disponíveis, você precisa cadastrar mais produtos");
             }else{
                Produtos.this.qtdDisponivel--;
                JOptionPane.showMessageDialog(null, "Não há produtos reservados mas pegamos o que tinhamos disponível. \n"
                                                                               +"Agora há apenas "+ qtdDisponivel +" produtos disponíveis");
                 }
            }else{
                   Produtos.this.qtdReservada--;
                   JOptionPane.showMessageDialog(null, "Agora há "+ qtdReservada+" produtos reservados.");
            }
        } 
    }
    
    
}

