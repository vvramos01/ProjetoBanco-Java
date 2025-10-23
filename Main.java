package Banco;


public class Main {
   public static void main(String[] args) {
       Conta c;
       c = new ContaCorrente();
       c.mostrarDados();
       System.out.println(c.getTaxa());


       c = new ContaPoupança();
       c.mostrarDados();
       System.out.println(c.getTaxa());
   }
}
