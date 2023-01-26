package entities;

public class Product {
   public String nome;
   public double preco;
   public int qtdade;
   
   
   public double valorTotal() {
	   return preco * qtdade;
   }
   
   public void adiciona(int qtdade) {
	   this.qtdade += qtdade; 
   }
   
   public void remove(int qtdade) {
	   this.qtdade -= qtdade;
   }
   
   public String toString() {
	   return nome
			  +" $ "
			  +String.format("%.2f", preco)
			  +", total no estoque "
			  +qtdade
			  +", "
			  +"valor do estoque "
			  +String.format("%.2f", valorTotal());
			  
   } 
}
