package com.pgrela.sda.tdd.gui.tictactoe.domain;

import com.pgrela.sda.tdd.gui.tictactoe.repository.TicTacToeRepository;
import org.springframework.stereotype.Component;

@Component
public class DomainTTTService {

    private TicTacToeRepository ticTacToeRepository;

    public DomainTTTService(TicTacToeRepository ticTacToeRepository) {
        this.ticTacToeRepository = ticTacToeRepository;
    }

    public void move(int row, int column, Tile tile) {
        Tile[][] board = ticTacToeRepository.read();
        board[row][column] = tile;
        ticTacToeRepository.save(board);
    }

    public void newGame() {
    }

    public void undoMove() {
    }
}
