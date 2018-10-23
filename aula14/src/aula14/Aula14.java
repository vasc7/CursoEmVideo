package aula14;

public class Aula14 {

    public static void main(String[] args) {
        Video v[] = new Video[5];
        
        v[0] = new Video("Friday the 13th");
        v[1] = new Video("A Nightmare on Elm Street");
        v[2] = new Video("Hellraiser");
        v[3] = new Video("Halloween");
        v[4] = new Video("Evil Dead");
        
        Gafanhoto g[] = new Gafanhoto[2];
        
        
        g[0] = new Gafanhoto("Rafael", 28, "Masculino", "Rafa");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[4]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
    }
    
}
