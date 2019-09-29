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

    @Test
    void shouldRememberMove() {
        // given
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        int row = 0;
        int column = 0;

        // when
        ticTacToeBoard.makeMove(Tile.CIRCLE, row, column);

        // then
        Assertions.assertThat(ticTacToeBoard.getTile(row, column))
                .isEqualTo(Tile.CIRCLE);
    }

    @Test
    void shouldNotAllowDoubleMove() {
        // given
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        int row = 0;
        int column = 0;
        ticTacToeBoard.makeMove(Tile.CIRCLE, row, column);

        // when + then
        Assertions.assertThatThrownBy(
                () -> ticTacToeBoard.makeMove(Tile.CIRCLE, row, column))
                .isInstanceOf(IllegalArgumentException.class);
    }
}