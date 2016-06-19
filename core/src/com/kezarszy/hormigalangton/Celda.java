package com.kezarszy.hormigalangton;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Celda {
    private int x;
    private int y;
    private boolean viva;

    private Texture textura;

    public Celda(int x, int y){
        this.x = x;
        this.y = y;
        this.textura = new Texture("viva.png");
    }

    public boolean getEstado() {return this.viva;}

    public void cambiarEstado(){
        this.viva = !this.viva;
    }

    public void draw(SpriteBatch sb){
        if(viva)
            sb.draw(this.textura, this.x*10, this.y*10);
    }
}
