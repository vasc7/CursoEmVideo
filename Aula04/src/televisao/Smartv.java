package televisao;


public class Smartv {

    private String marca;
    private int pol;
    private double valor;
    private boolean resolucao;
    
    public Smartv(String marca, int pol, double valor, boolean resolucao){
        this.marca = marca;
        this.pol = pol;
        this.resolucao = resolucao;
        this.valor = valor;       
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

        public int getPol(){
        return pol;
}
    
        public void setPol(int pol){
            this.pol = pol;
        }

            public double getValor() {
                return valor;
            }

            public void setValor(double valor) {
                this.valor = valor;
            }

                public boolean isResolucao() {
                    return resolucao;
                }

                public void setResolucao(boolean resolucao) {
                    this.resolucao = resolucao;
                }
                
 void status(){
System.out.println("Marca: " + getMarca() +" Polegadas: " + getPol() + " Valor: " + getValor());    
                }
                
 public void resol(){
     this.resolucao = true;
     System.out.println("Resolução 4K!");
 }
                
}