package pl.soft.developer.domain.Sovers;

import pl.soft.developer.domain.Initializers.FileMazeInitializer;
import pl.soft.developer.domain.Initializers.MazeInitializer;
import pl.soft.developer.domain.Maze;
import pl.soft.developer.domain.Player;
import pl.soft.developer.domain.enums.Direction;

import java.util.Scanner;

public class ManualGoldMazeSolver implements GoldMazeSolver {

    private Player player;

    public ManualGoldMazeSolver(Player player) {
        this.player = player;
    }

    @Override
    public void find() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            for (int i=0;i<50;i++);
            {
                System.out.println();
            }
            player.getMaze().print();

            String sign = scanner.next();
            Direction direction = Direction.getDirectionByValue(sign.charAt(0));

            if (direction!=null) {
                player.changeDirection(direction);

                if (player.foundGold()) {
                    System.out.println("Wow we have found gold");
                    break;
                } else {

                    switch (direction) {
                        case UP:
                            if (player.canGoUp()) {
                                player.visitCell();
                                player.move();
                                player.togglePlayer();
                            }
                            break;
                        case DOWN:
                            if (player.canGoDown()) {
                                player.visitCell();
                                player.move();
                                player.togglePlayer();
                            }
                            break;
                        case LEFT:
                            if (player.canGoLeft()) {
                                player.visitCell();
                                player.move();
                                player.togglePlayer();
                            }
                            break;
                        case RIGHT:
                            if (player.canGoRight()) {
                                player.visitCell();
                                player.move();
                                player.togglePlayer();

                            }
                            break;
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        MazeInitializer mazeInitializer = new FileMazeInitializer("/home/marek/Pulpit/maze.txt");
        Maze maze = mazeInitializer.initialize();
        maze.print();
        Player player = new Player(maze);
        player.initializelayerPosition();
        System.out.println("Player position x=" + player.getPositionX());
        System.out.println("Player positon y=" + player.getPositionY());
        ManualGoldMazeSolver manualGoldMazeSolver = new ManualGoldMazeSolver(player);
        manualGoldMazeSolver.find();
    }
    }

