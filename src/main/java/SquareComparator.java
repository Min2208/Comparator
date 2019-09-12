import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {

    public int compare(Square square1, Square square2){
        if (square1.getSize()>square2.getSize()){
            return 1;
        }else if (square1.getSize()==square2.getSize()){
            return 0;
        }else {
            return -1;
        }
    }
}
