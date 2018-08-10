package pl.soft.developer.domain;

import pl.soft.developer.domain.enums.Direction;

public class Player {

    private Position position;

    private Direction direction;

    public Maze getMaze() {
        return maze;
    }

    private Maze maze;

    public Player(Maze maze) {
        this.maze = maze;
    }

    public void initializelayerPosition() {

        this.position = maze.findPlayerPosition();
    }

    public int getPositionX() {
        return position.x;
    }

    public int getPositionY() {
        return position.y;
    }

    public boolean foundGold() {
        MazeCell[][] board = maze.getBoard();
        int x = getPositionX();
        int y = getPositionY();
        if (board[x][y] instanceof GoldCell) {
            return true;
        }
        return false;
    }



    public void changeDirection(Direction direction) {
        this.direction = direction;
    }

    public boolean canGoRight() {
        MazeCell[][] board = maze.getBoard();
        int x = getPositionX();
        int y = getPositionY();
        if (!board[x][y + 1].isOccupied()) {
            return true;
        }
        return false;
    }

    public boolean canGoLeft() {
        MazeCell[][] board = maze.getBoard();
        int x = getPositionX();
        int y = getPositionY();
        if (!board[x][y - 1].isOccupied()) {
            return true;
        }
        return false;
    }

    public boolean canGoUp() {
        MazeCell[][] board = maze.getBoard();
        int x = getPositionX();
        int y = getPositionY();
        if (!board[x - 1][y].isOccupied()) {
            return true;
        }
        return false;
    }

    public boolean canGoDown() {
        MazeCell[][] board = maze.getBoard();
        int x = getPositionX();
        int y = getPositionY();
        if (!board[x + 1][y].isOccupied()) {
            return true;
        }
        return false;
    }

    public void move() {
        MazeCell[][] board = maze.getBoard();
        switch (direction) {
            case RIGHT:
                position.y = position.y + 1;
                break;
            case LEFT:
                position.y = position.y - 1;
                break;
            case DOWN:
                position.x = position.x + 1;
                break;
            case UP:
                position.x = position.x - 1;
                break;
        }
        board[position.x][position.y] = new PlayerCell();
    }

    public void visitCell() {
        MazeCell[][] board = maze.getBoard();
        board[position.x][position.y] = new VisitedCell();
    }

    public void togglePlayer() {
        MazeCell[][] board = maze.getBoard();

        if (!(board[position.x][position.y] instanceof GoldCell)) {

            board[position.x][position.y] = new PlayerCell();
        }
    }
}

