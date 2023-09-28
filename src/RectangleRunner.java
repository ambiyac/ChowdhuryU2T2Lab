public class RectangleRunner {
    public static void main(String[] args) {

        Rectangle plot1 = new Rectangle(150,200);
        plot1.setWidth(75);
        int area1 = plot1.calculateArea();
        Rectangle plot2 = new Rectangle(120);
        plot2.setLength(75);
        plot2.setWidth(75);
        int area2 = plot2.calculateArea();
        Rectangle plot3 = new Rectangle();
        plot3.setWidth(75);
        int area3 = plot3.calculateArea();
        int totalArea = area1 + area2 + area3;

        System.out.println("These three plots requires " + totalArea + " square feet of seed");
    }
}
