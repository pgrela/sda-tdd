package com.pgrela.sda.tdd.gui.tictactoe.repository;

import com.pgrela.sda.tdd.gui.tictactoe.domain.Tile;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class TicTacToeRepository {
    private Tile[][] tileBoard;

    public void save(Tile[][] tileBoard){
        this.tileBoard = tileBoard;
    }

    public Tile[][] read(){
        return tileBoard;
    }
}
