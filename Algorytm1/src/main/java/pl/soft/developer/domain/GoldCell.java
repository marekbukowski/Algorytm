package pl.soft.developer.domain;

import pl.soft.developer.domain.enums.MazeCellType;

public class GoldCell extends MazeCell {

    @Override
    public boolean isOccupied() {
        return false;
    }

    public GoldCell(){
        super(MazeCellType.GOLD);



    }
}
