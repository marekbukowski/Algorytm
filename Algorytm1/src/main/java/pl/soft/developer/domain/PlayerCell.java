package pl.soft.developer.domain;

import pl.soft.developer.domain.enums.MazeCellType;

public class PlayerCell extends MazeCell {

    @Override
    public boolean isOccupied() {
        return true;
    }

    public PlayerCell(){
        super(MazeCellType.PLAYER);


    }
}
