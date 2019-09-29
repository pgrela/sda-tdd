package com.pgrela.sda.tdd.gui.tictactoe.domain;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class TicTacBoardAssertions extends AbstractAssert<TicTacBoardAssertions, TicTacToeBoard> {
    public TicTacBoardAssertions(TicTacToeBoard ticTacToeBoard) {
        super(ticTacToeBoard, TicTacBoardAssertions.class);
    }

    public static TicTacBoardAssertions assertThat(TicTacToeBoard ticTacToeBoard) {
        return new TicTacBoardAssertions(ticTacToeBoard);
    }

    public void hasCircleAt(int row, int column) {
        Assertions.assertThat(this.actual.getEntireBoard()[row][column])
                .isEqualTo(Tile.CIRCLE);
    }
}
