package com.kezarszy.hormigalangton;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Hormiga {

    public static final int ARRIBA = 0, DERECHA = 1, ABAJO = 2, IZQUIERDA = 3;
    public int direccion;

    private int x;
    private int y;

    private Texture hormiga;

    public Hormiga(int x, int y){
        this.x = x;
        this.y = y;
        this.direccion = ARRIBA;
        this.hormiga = new Texture("hormiga.png");
    }

    public int getX() {return this.x;}
    public int getY() {return this.y;}

    public void moverDerecha(){
        direccion = (direccion+1)%4;
        mover();
    }

    public void moverIzquierda(){
        direccion = direccion-1;
        if(direccion == -1) direccion = IZQUIERDA;
        mover();
    }

    public void mover(){
        switch(direccion){
            case ARRIBA:
                this.y--;
                break;
            case ABAJO:
                this.y++;
                break;
            case DERECHA:
                this.x++;
                break;
            case IZQUIERDA:
                this.x--;
                break;
        }
    }

    public void draw(SpriteBatch sb){
        sb.draw(hormiga,this.x*10, this.y*10);
    }
}
