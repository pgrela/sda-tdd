package com.pgrela.sda.tdd.gui.games.model;

import java.util.Random;

public class Board {
    private String message = "Hello Player One!";
    private String[][] board = new String[][]{{"", "", "X"}, {"", "", ""}, {"O", "", ""}};

    public static final Board MINESWEEPER_DEMO;

    static {
        MINESWEEPER_DEMO = new Board();
        MINESWEEPER_DEMO.board = new String[10][10];
        Random random = new Random();
        for (int i = 0; i < MINESWEEPER_DEMO.board.length; i++) {
            for (int j = 0; j < MINESWEEPER_DEMO.board[i].length; j++) {
                MINESWEEPER_DEMO.board[i][j] = String.valueOf(random.nextInt(10));
                if (MINESWEEPER_DEMO.board[i][j].equals("9")) {
                    MINESWEEPER_DEMO.board[i][j] = "X";
                }
                if (MINESWEEPER_DEMO.board[i][j].equals("0")) {
                    MINESWEEPER_DEMO.board[i][j] = " ";
                }
            }
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }
}
