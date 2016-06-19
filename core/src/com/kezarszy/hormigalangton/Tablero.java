package com.kezarszy.hormigalangton;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Tablero {

    private static final int TABLERO_WIDTH = HormigaLangton.WIDTH/10;
    private static final int TABLERO_HEIGHT = HormigaLangton.HEIGHT/10;

    private Celda[][] tablero;
    private Hormiga hormiga;

    public Tablero(){
        tablero = new Celda[TABLERO_WIDTH][TABLERO_HEIGHT];
        for(int i=0; i<TABLERO_WIDTH; i++)
            for(int j=0; j<TABLERO_HEIGHT; j++)
                tablero[i][j] = new Celda(i,j);
        hormiga = new Hormiga(TABLERO_WIDTH/2, TABLERO_HEIGHT/2);
    }

    public void update(){
        if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE))
            iteracion();
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            iteracion();
    }

    public void iteracion(){
        int antX = hormiga.getX(), antY = hormiga.getY();
        if(tablero[antX][antY].getEstado())
            hormiga.moverDerecha();
        else
            hormiga.moverIzquierda();
        tablero[antX][antY].cambiarEstado();
    }

    public void draw(SpriteBatch sb){
        for(int i=0; i<TABLERO_WIDTH; i++)
            for(int j=0; j<TABLERO_HEIGHT; j++)
                tablero[i][j].draw(sb);
        hormiga.draw(sb);
    }
}
