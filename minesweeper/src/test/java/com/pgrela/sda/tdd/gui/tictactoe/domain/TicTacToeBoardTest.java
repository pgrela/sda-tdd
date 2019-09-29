package com.pgrela.sda.tdd.gui.tictactoe.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TicTacToeBoardTest {
    @Test
    void shouldReturnBlankTileFromNewBoard() {
        // given
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        int row = 0;
        int column = 0;

        // when
        Tile tile = ticTacToeBoard.getTile(row, column);

        // then
        Assertions.assertThat(tile).isEqualTo(Tile.BLANK);
    }
}