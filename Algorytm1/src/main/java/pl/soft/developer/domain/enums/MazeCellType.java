package pl.soft.developer.domain.enums;

import pl.soft.developer.domain.MazeCell;

public enum MazeCellType {

    EMPTY('.'),
    GOLD('G'),
    VISITED('V'),
    WALL('#'),
    PLAYER('P');

    public char getValue() {
        return value;
    }

    private char value;

    MazeCellType(char value) {
        this.value = value;
    }

    public static MazeCellType getMazeCellTypeByValue(char value) {
        for (MazeCellType mazeCellType : MazeCellType.values()) {
            if (mazeCellType.value == value){
                return mazeCellType;
            }
        }
return null;
    }
}

