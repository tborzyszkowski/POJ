package com.ola.breakthrough.Board;

public class BoardCell {
    private int x;
    private int y;
    private TeamName team;

    BoardCell(int x, int y, TeamName team)
    {
        this.x = x;
        this.y = y;
        this.team = team;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public TeamName getTeam() {
        return team;
    }

    public void setTeam(TeamName team)
    {
            this.team = team;
    }
}

