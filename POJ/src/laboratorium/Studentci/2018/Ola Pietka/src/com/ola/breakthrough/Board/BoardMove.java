package com.ola.breakthrough.Board;

public class BoardMove
{
    private BoardCell from;
    private BoardCell to;

    public BoardMove() {
    }

    public BoardMove(BoardCell from, BoardCell to)
    {
        this.from = from;
        this.to = to;
    }

    public BoardCell getFrom() {
        return from;
    }

    public BoardCell getTo() {
        return to;
    }
}
