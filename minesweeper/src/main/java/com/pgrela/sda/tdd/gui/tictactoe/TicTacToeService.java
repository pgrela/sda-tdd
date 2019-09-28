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

    public TicTacToeService(TicTacToeRepository ticTacToeRepository) {
        this.ticTacToeRepository = ticTacToeRepository;
    }

    public void processCommand(String key, String value) {
        logger.info("Executing command '{}' with value '{}'.", key, value);
    }

    public Board getBoardView() {
        return new Board();
    }
}
