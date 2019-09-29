package com.pgrela.sda.tdd.gui.tictactoe.domain;

public enum Tile {
    CROSS("X"),
    CIRCLE("O"),
    BLANK("");
    private String presentation;

    Tile(String presentation) {
        this.presentation = presentation;
    }

    public String getPresentation() {
        return presentation;
    }
}
