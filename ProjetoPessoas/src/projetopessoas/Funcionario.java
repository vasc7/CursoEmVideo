package projetopessoas;

public class Funcionario extends Pessoa{
    
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
             this.trabalhando =! this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
        System.out.println("O setor de " + this.getNome() + " é " + this.getSetor());
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}