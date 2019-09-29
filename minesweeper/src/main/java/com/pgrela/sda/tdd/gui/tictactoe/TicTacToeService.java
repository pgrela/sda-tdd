package com.pgrela.sda.tdd.gui.tictactoe;

import com.pgrela.sda.tdd.gui.games.model.Board;
import com.pgrela.sda.tdd.gui.tictactoe.repository.TicTacToeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TicTacToeService {
    private final Logger logger = LoggerFactory.getLogger(TicTacToeService.class);

    private TicTacToeRepository ticTacToeRepository;
    private Board board = new Board();

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
            board.getBoard()[x][y]="O";
        }
    }

    public Board getBoardView() {
        return board;
    }
}
