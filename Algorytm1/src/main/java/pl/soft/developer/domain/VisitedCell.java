package pl.soft.developer.domain;

import pl.soft.developer.domain.enums.MazeCellType;

public class VisitedCell extends MazeCell {

    @Override
    public boolean isOccupied() {
        return false;
    }

    public VisitedCell(){
        super(MazeCellType.VISITED);


    }
}
