package com.pgrela.sda.tdd.gui.tictactoe.domain;

import java.util.Arrays;

public class TicTacToeBoard {
    public static final int SIZE = 3;
    private Tile[][] internalTiles;

    public TicTacToeBoard() {
        this.internalTiles = new Tile[SIZE][SIZE];
        for (int i = 0; i < 3; i++) {
            Arrays.fill(internalTiles[i], Tile.BLANK);
        }
    }

    public Tile getTile(int row, int column) {
        return internalTiles[row][column];
    }

    // TODO make package protected
    public Tile[][] getEntireBoard() {
        return internalTiles;
    }

    public void makeMove(Tile tile, int row, int column) {
        if(internalTiles[row][column]!=Tile.BLANK){
            throw new IllegalArgumentException("Tile already filled.");
        }
        internalTiles[row][column] = tile;
    }
}
