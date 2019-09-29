package com.pgrela.sda.tdd.gui.tictactoe.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.*;

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
        assertThat(tile).isEqualTo(Tile.BLANK);
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
        TicTacBoardAssertions.assertThat(ticTacToeBoard)
                .hasCircleAt(row,column);
    }

    @Test
    void shouldNotAllowDoubleMove() {
        // given
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        int row = 0;
        int column = 0;
        ticTacToeBoard.makeMove(Tile.CIRCLE, row, column);

        // when + then
        assertThatThrownBy(
                () -> ticTacToeBoard.makeMove(Tile.CIRCLE, row, column))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void shouldBeEntirelyBlank() {
        // given

        // when
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

        // then
        Tile[][] entireBoard = ticTacToeBoard.getEntireBoard();
        assertThat(entireBoard)
                .hasSize(3)
                .containsOnly(new Tile[]{Tile.BLANK, Tile.BLANK, Tile.BLANK});
    }
}