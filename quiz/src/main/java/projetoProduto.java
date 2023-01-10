
public class projetoProduto {
   public static void main (String [] args){
       peoo1312 c1 = new peoo1312(1, "Informática");
       
       produto p1 = new produto();
       p1.setNome("Teclado");
       p1.setValor(50.00);
       p1.setpe001312(c1);
       
       System.out.println("O id da categoria do produto: "+p1.getNome()+"é: "+p1.getCategoria().getId());
       System.out.println("O nome da categoria do produto: "+p1.getNome()+"é: "+p1.getCategoria().getId());
       
       peoo1312 c2 = new peoo1312(2, "Eletrônica");
       p1.setCategoria(c2);
       System.out.println("ATUALIZANDO");
       System.out.println("O id da categoria do produto: "+p1.getNome()+"é: "+p1.getCategoria().getId());
       System.out.println("O nome da categoria do produto: "+p1.getNome()+"é: "+p1.getCategoria().getId());
   } 
}
