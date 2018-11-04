package com.ola.breakthrough.Board;

import com.ola.breakthrough.Player.IPlayer;
import javafx.scene.paint.Stop;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private IPlayer whitePlayer;
    private IPlayer blackPlayer;
    private int height;
    private int width;
    private BoardCell[][] cells;

    public Board(IPlayer whitePlayer, IPlayer blackPlayer, int width, int height) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
        this.height = height;
        this.width = width;

        cells = new BoardCell[width][height];

        initializeBoard();

    }
    void initializeBoard()
    {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                cells[x][y] = new BoardCell(x, y, null); //Wypelniaa cala tablice null'ami (oznaczine w konsoli - ' ');
            }
        }

        for (int x = 0; x < width; x++) {
            cells[x][0].setTeam(TeamName.Black); //Wypalenia pierwszy i drugi rzad pionkami czarnymi (oznaczone w koncosli - 1)
            cells[x][1].setTeam(TeamName.Black);
            cells[x][height-1].setTeam(TeamName.White); //Wypalenia ostatni i przedostatni rzad pionkami bialymi (oznaczone w koncosli - 0)
            cells[x][height-2].setTeam(TeamName.White);
        }
    }

    public void update() {
        System.out.println(this); //Wyswietla plansze (Board)
        updatePlayer(whitePlayer);
        System.out.println(this);
        updatePlayer(blackPlayer);

        for (int x = 0; x < width; x++) {
            if (cells[x][height - 1].getTeam() == TeamName.Black)
            {
                System.out.println(this);
                System.out.println("Black player won!");
                System.exit(1);
            }else if(cells[x][0].getTeam() == TeamName.White)
            {
                System.out.println("White player won!");
                System.exit(1);
            }
        }
    }

    void updatePlayer(IPlayer player) {
        List<BoardMove> possibleMoves = getPossibleMovesForPlayer(player); //Tworzy liste dostepnych ruchow dla wybranego gracza
        if(!possibleMoves.isEmpty()) { //Jezeli lista mozliwych ruchow nie jest pusta, robi ruch
            BoardMove pickedMove = player.pickMove(possibleMoves);
            doMove(pickedMove);
        }else { //Jesli brak mozliwych ruchow dla danego gracza, koniec gry. Przeciwnik wygrywa
            System.out.println("No moves for " + player.getTeam() + "player.");
            System.out.println(player.getTeam() + " player won!");
            System.exit(1);
        }
    }

    void doMove(BoardMove move) {
        move.getTo().setTeam(move.getFrom().getTeam()); //Przesuwa pionek na inne miejsce
        move.getFrom().setTeam(null); //Ustala null dla miejsca z ktorego pionek sie ruszyl
    }

    List<BoardMove> getPossibleMovesForPlayer(IPlayer player) {
        List<BoardMove> moves = new ArrayList<>();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                BoardCell cell = cells[x][y];
                if(cell == null) continue;
                if (cell.getTeam() == player.getTeam()) {
                    moves.addAll(getPossibleMovesForCell(cell));
                }
            }
        }

        return moves;

    }

    List<BoardMove> getPossibleMovesForCell(BoardCell cell)
    {
        List<BoardMove> moves = new ArrayList<>();

        int x = cell.getX();
        int y = cell.getY();

        int yOffset = 0;

        if(cell.getTeam() == TeamName.White){ //Przesuniecie "w osi Y" dla pionkow bialych
            yOffset = -1;
        }
        else if(cell.getTeam() == TeamName.Black){ //Przesuniecie "w osi Y"  dla pionkow czarnych
            yOffset = 1;
        }

        if(y+yOffset >= 0 && y+yOffset <= height - 1) { //Ograniczenie poruszania pionkow z gory i dolu planszy
            if (cells[x][y + yOffset].getTeam() == null) { //Jesli miejsce przed pionkiem jest "puste", ruch jest mozliwy
                moves.add(new BoardMove(cell, cells[x][y+yOffset]));
            }
            if(x+1 <= width - 1) //Ograniczenie poruszania pionkow z prawej
            {
                if(cells[x+1][y+yOffset].getTeam() == null || cells[x+1][y+yOffset].getTeam() != cell.getTeam()) //Jesli miejsce na ukos z prawej jest "puste" lub stoi na tym miejscu pionek przeciwnego team'u (zbicie), ruch jest mozliwy
                {
                    moves.add(new BoardMove(cell, cells[x+1][y+yOffset]));
                }
            }
            if(x-1 >= 0) //Ograniczenie poruszania pionkow z lewej
            {
                if(cells[x-1][y+yOffset].getTeam() == null || cells[x-1][y+yOffset].getTeam() != cell.getTeam()) //Jesli miejsce na ukos z lewej jest "puste" lub stoi na tym miejscu pionek przeciwnego team'u (zbicie), ruch jest mozliwy
                {
                    moves.add(new BoardMove(cell, cells[x-1][y+yOffset]));
                }
            }
        }
            return moves;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if(cells[x][y].getTeam() == null)
                    sb.append(' ');
                else
                    sb.append(cells[x][y].getTeam().ordinal());

            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
