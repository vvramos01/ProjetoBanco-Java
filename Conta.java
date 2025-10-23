package Banco;


public abstract class Conta {
   protected int total = 100;


   public void mostrarDados(){
       System.out.println(total);
   }
   abstract int getTaxa();
}
