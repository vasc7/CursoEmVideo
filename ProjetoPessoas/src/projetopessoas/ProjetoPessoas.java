package projetopessoas;

public class ProjetoPessoas {

    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Rafael");
        p2.setNome("Joao");
        p3.setNome("Pedro");
        p4.setNome("Mary");
        
        p1.setIdade(28);
        p2.setIdade(32);
        p3.setIdade(45);
        p4.setIdade(34);
        
        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("F");
        p4.setSexo("F");
        p3.setSalario(3456.7f);
        p3.receberAumento(100.2f);
        p1.fazerAniversario();
        p2.cancelarMatr();
        
        p4.setSetor("T.I");
        System.out.println(p1.toString() + "\n" + p2.toString() + "\n" + p3.toString() + "\n" + p4.toString() + "\n");
    }
}
