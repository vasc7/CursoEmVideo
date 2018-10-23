/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author vasco
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Date relogio = new Date();
        System.out.println(relogio.toString());
        
        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayName());
        System.out.println(loc.getDisplayCountry());
        
        System.getProperties();
       System.out.println(System.getProperty("user.language"));
       
       Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        System.out.println("Sua tela tem resolução " + lar + " x " + alt);
       
    } 
    
}
