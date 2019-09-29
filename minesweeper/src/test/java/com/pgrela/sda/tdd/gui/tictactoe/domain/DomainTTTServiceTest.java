package com.pgrela.sda.tdd.gui.tictactoe.domain;

import com.pgrela.sda.tdd.gui.tictactoe.repository.TicTacToeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DomainTTTServiceTest {

    @Mock
    private TicTacToeRepository ticTacToeRepository;
    @InjectMocks
    private DomainTTTService domainTTTService;
    @BeforeEach
    void setupMocks(){
        Mockito.when(ticTacToeRepository.read())
                .thenReturn(createBlankBoard());
    }

    @Test
    void shouldDoMove() {
        // given

        // when
        domainTTTService.move(1, 2, Tile.CROSS);

        // then

        Mockito.verify(ticTacToeRepository).save(
                boardAfterOneMove(1, 2, Tile.CROSS)
        );
    }

    Tile[][] boardAfterOneMove(int row, int column, Tile tile) {
        Tile[][] expectedSavedBoard = createBlankBoard();
        expectedSavedBoard[row][column] = tile;
        return expectedSavedBoard;
    }

    private Tile[][] createBlankBoard() {
        TicTacToeRepository ticTacToeRepository = null;
        Tile[][] expectedSavedBoard = new Tile[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                expectedSavedBoard[i][j] = Tile.BLANK;
            }
        }
        return expectedSavedBoard;
    }
}