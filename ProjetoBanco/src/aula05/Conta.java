package aula05;

public class Conta {

    
    public static void main(String[] args) {
        
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(1111);
       p1.setDono("Jubila");
       p1.abrirConta("CC");
    
       ContaBanco p2 = new ContaBanco();
       p2.setNumConta(222);
       p2.setDono("Cleia");
       p2.abrirConta("CP");
       
       p1.depositar(100);
       p2.depositar(200);
       p1.sacar(150);
       p2.sacar(200);
       
       p1.fecharConta();
       
       p1.estadoAtual();
       p2.estadoAtual();
}
}