package aula011;

public class Aula011 {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        a1.setNome("Rafael");
        a1.setSexo("M");
        a1.setIdade(27);
        a1.fazerAniversario();
        System.out.println("Pessoa: " + a1.toString());
        
        
        Visitante v1 = new Visitante();
        v1.setNome("Rafael");
        v1.setIdade(23);
        v1.setSexo("M");
        System.out.println("Visitante: " + v1.toString());
    }
    
}
