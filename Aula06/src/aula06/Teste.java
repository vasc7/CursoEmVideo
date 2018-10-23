/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author vasco
 */
public class Teste implements Controlador {
    
    private int a;
    private int b;
    private int c;

    public Teste() {
        this.setA(1);
        this.setB(2);
        this.setC(3);
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    private void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public void ligar() {
    }

    @Override
    public void desligar() {
    }

    @Override
    public void abrirMenu() {
    }

    @Override
    public void fecharMenu() {
    }

    @Override
    public void maisVolume() {
    }

    @Override
    public void menosVolume() {
    }

    @Override
    public void ligarMudo() {
    }

    @Override
    public void desligarMudo() {
    }

    @Override
    public void play() {
    }

    @Override
    public void pause() {
    }
    
    public void status(){
        System.out.println(this.getA() +" " + this.getB()+" " + this.getC());
    }

    @Override
    public void changeB() {
        this.setB(124);
    }
    public void changeB2(){
        this.setB(30);
    }
    
    
}
