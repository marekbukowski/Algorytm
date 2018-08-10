package pl.soft.developer.domain;

import pl.soft.developer.domain.enums.MazeCellType;

public class WallCell extends MazeCell {

    @Override
    public boolean isOccupied() {
        return true;
    }

    public WallCell(){
        super(MazeCellType.WALL);


    }
}
