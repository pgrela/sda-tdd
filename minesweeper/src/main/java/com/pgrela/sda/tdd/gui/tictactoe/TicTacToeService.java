package com.pgrela.sda.tdd.gui.tictactoe;

import com.pgrela.sda.tdd.gui.games.model.Board;
import com.pgrela.sda.tdd.gui.tictactoe.domain.TicTacToeBoard;
import com.pgrela.sda.tdd.gui.tictactoe.domain.Tile;
import com.pgrela.sda.tdd.gui.tictactoe.repository.TicTacToeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TicTacToeService {
    private final Logger logger = LoggerFactory.getLogger(TicTacToeService.class);

    private TicTacToeRepository ticTacToeRepository;

    public TicTacToeService(TicTacToeRepository ticTacToeRepository) {
        this.ticTacToeRepository = ticTacToeRepository;
    }

    public void processCommand(String key, String value) {
        logger.info("Executing command '{}' with value '{}'.", key, value);
        //                "0123456789"
        //                "board[1][2]"
        if (key.startsWith("board")) {
            int x = Integer.parseInt(key.substring(6, 7));
            int y = Integer.parseInt(key.substring(9, 10));
            logger.info("Go click at {} {}", x, y);
            Tile[][] board = getOrCreateNew();
            board[x][y] = Tile.CIRCLE;
            ticTacToeRepository.save(board);
        }
    }

    public Board getBoardView() {
        Tile[][] board = getOrCreateNew();
        Board boardView = new Board();
        boardView.setBoard(transform(board));
        return boardView;
    }

    private Tile[][] getOrCreateNew() {
        Tile[][] board = ticTacToeRepository.read();
        return board == null? new TicTacToeBoard().getEntireBoard():board;
    }

    private String[][] transform(Tile[][] board) {
        String[][] strings =
                new String[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                strings[i][j] =
                        board[i][j].getPresentation();
            }
        }
        return strings;
    }
}
