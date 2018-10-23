package aula12;

public class Peixe extends Animal {

    private String corEscama;
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Peixe comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Peixe");
    }
    
    public void soltarBolha(){
        System.out.println("soltou bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
