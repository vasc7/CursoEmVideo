package projetopessoas;

public class Professor extends Pessoa {
    
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    public void receberAumento(float aum){
        this.setSalario(this.getSalario() + aum);
        System.out.println("O salário de " + this.getNome() + " é " + this.getSalario() + " e o aumento foi de " + aum);
    }
}
