package com.pgrela.sda.tdd.gui.tictactoe.repository;

import com.pgrela.sda.tdd.gui.tictactoe.domain.Tile;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class TicTacToeRepository {
    private Tile[][] tileBoard = new Tile[3][3];
    {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(tileBoard[i], Tile.BLANK);
        }
    }

    public void save(Tile[][] tileBoard){
        this.tileBoard = tileBoard;
    }

    public Tile[][] read(){
        return tileBoard;
    }
}
