package Banco;


public class ContaPoupança extends Conta {
   @Override
   int getTaxa() {
       return this.total * 3;
   }
}
