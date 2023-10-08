public class Point {

    // instance variables
    private int x;
    private int y;

   // constructor that accepts and sets both instance variables
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    // a constructor that accepts one value and sets both x and y to the same value
    public Point(int num) {
        x = num;
        y = num;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    public String quadrant() {
        String quadrant;
        if (x > 0 && y > 0) {
            quadrant = "I";
        } else if (x < 0 && y > 0) {
            quadrant = "II";
        } else if (x < 0 && y < 0) {
            quadrant = "III";
        } else if (x > 0 && y < 0) {
            quadrant = "IV";
        } else if (x == 0 && y == 0){
           quadrant = "origin";
        } else {
            quadrant = "on the axis";
        }
        return quadrant;


}

