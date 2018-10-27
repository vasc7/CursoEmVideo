package ProjetoLivro;


public class ProjetoLivro {
    
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Learning Java", "José de Silva", 300, p[0]);
        l[1] = new Livro("Java Avançado", "Pedro Paulo", 500, p[0]);
        l[2] = new Livro("POO Java", "Maria Candido", 800, p[0]);
        
        l[0].abrir();
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        
        
    }
    
}
