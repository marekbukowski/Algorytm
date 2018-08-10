package pl.soft.developer.domain;

import pl.soft.developer.domain.enums.MazeCellType;

public class EmptyCell extends MazeCell {

    @Override
    public boolean isOccupied() {
        return false;
    }

    public EmptyCell(){
        super(MazeCellType.EMPTY);


    }
}
