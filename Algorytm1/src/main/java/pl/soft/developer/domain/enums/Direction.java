package pl.soft.developer.domain.enums;

public enum Direction {

    UP('w'),
    DOWN('s'),
    LEFT('a'),
    RIGHT('d');


    private char value;

    Direction(char value){
        this.value = value;
    }

    public static Direction getDirectionByValue(char value){
        for (Direction direction : Direction.values()) {
            if (direction.value == value) {
                return direction;
            }
        }
        return null;
    }
}
