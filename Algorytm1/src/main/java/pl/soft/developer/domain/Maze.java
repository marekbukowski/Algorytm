package pl.soft.developer.domain;

public class Maze {

    private int rows;
    private int cols;
    private MazeCell [][] board;

    public MazeCell[][] getBoard() {
        return board;
    }

    public Maze(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        board = new MazeCell[rows][cols];
    }

    public Position findPlayerPosition(){
        for (int x = 0; x< rows; x++){
            for (int y =0; y<cols; y++){
                if (board[x][y] instanceof PlayerCell){
                    return new Position(x,y);

                }
            }
        }
        return null;
    }

    public void print(){
        for (int x = 0; x < rows; x++){
            for (int y = 0; y < cols; y++){
                System.out.print(board[x][y].getValue()+" ");

            }
            System.out.println();
        }
    }
}
