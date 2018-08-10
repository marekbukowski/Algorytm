package pl.soft.developer.domain;

import pl.soft.developer.domain.enums.MazeCellType;

public abstract class MazeCell {

    protected MazeCellType mazeCellType;

    public MazeCell (MazeCellType mazeCellType){
        this.mazeCellType = mazeCellType;
    }

    public char getValue(){
        return mazeCellType.getValue();
    }

    public abstract boolean isOccupied();
}
