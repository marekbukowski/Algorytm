package pl.soft.developer.domain.Initializers;

import pl.soft.developer.domain.*;
import pl.soft.developer.domain.enums.MazeCellType;

import java.io.*;

public class FileMazeInitializer implements MazeInitializer {

    private String path;

    public FileMazeInitializer(String path) {
        this.path = path;
    }

    @Override
    public Maze initialize() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            String [] splittedLine = line.split(" ");
            int rows = Integer.valueOf(splittedLine[0]);
            int cols = Integer.valueOf(splittedLine[1]);
            System.out.println("rows = "+rows+" cols =" +cols);

            Maze maze = new Maze(rows, cols);
            MazeCell[][] board = maze.getBoard();

            int row = 0;
            while ((line = reader.readLine())!=null){
                char[] lineArray = line.toCharArray();

                int col = 0;
                processColumns(board, row, lineArray, col);
                row++;
            }
            return maze;



        } catch (FileNotFoundException ex) {
            System.out.println("There is no file at this path:" + path);
        } catch (IOException e){
            System.out.println(e.toString());
        }
        catch (NumberFormatException e){
            System.out.println("Rows and Cols should be numbers: " +e);
        }
        return null;
    }

    private void processColumns(MazeCell[][] board, int row, char[] lineArray, int col) {
        for (int i = 0; i<lineArray.length; i++) {
            char sign = lineArray[i];
            MazeCellType mazeCellType = MazeCellType.getMazeCellTypeByValue(sign);


            if (mazeCellType != null) {
                switch (mazeCellType) {
                    case EMPTY:
                        board[row][col++] = new EmptyCell();
                        break;
                    case GOLD:
                        board[row][col++] = new GoldCell();
                        break;
                    case VISITED:
                        board[row][col++] = new VisitedCell();
                        break;
                    case WALL:
                        board[row][col++] = new WallCell();
                        break;
                    case PLAYER:
                        board[row][col++] = new PlayerCell();
                        break;
                    default:
                        continue;
                }
            }
        }
    }

    public static void main (String[] args){
        MazeInitializer mazeInitializer = new FileMazeInitializer("/home/marek/Pobrane/maze.txt");
        Maze maze = mazeInitializer.initialize();
        maze.print();
    }
}