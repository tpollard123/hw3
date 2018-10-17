import java.util.Objects;

public class Coordinate{
    public int x;
    public int y;

    Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static Coordinate getCoordinateFromPosition(int pos){
        switch (pos) {
            case 1:
                return new Coordinate(0,0);
            case 2:
                return new Coordinate(0,1);
            case 3:
                return new Coordinate(0,2);
            case 4:
                return new Coordinate(1,0);
            case 5:
                return new Coordinate(1,1);
            case 6:
                return new Coordinate(1,2);
            case 7:
                return new Coordinate(2,0);
            case 8:
                return new Coordinate(2,1);
            case 9:
                return new Coordinate(2,2);

        }



        // Should not reach here. Error
        return new Coordinate(-1,-1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}