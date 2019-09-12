import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {

    public int compare(Rectangle rectangle1, Rectangle rectangle2){
        if (rectangle1.getArea()>rectangle2.getArea()){
            return 1;
        }else if (rectangle1.getArea()==rectangle2.getArea()){
            return 0;
        }else {
            return -1;
        }
    }
}
