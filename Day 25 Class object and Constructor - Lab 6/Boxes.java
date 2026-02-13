public class Boxes {
    public static void main(String[] args) {
        Box b1 = new Box(4,5,10);
        Box b2 = new Box(5);
        System.out.println("Box b1 info : ");
        System.out.println("Width : "+b1.getWidth()+" Height : "+b1.getHeight()+" Depth : "+b1.getDepth());
        System.out.println("Volume : "+b1.volume(b1.getWidth(),b1.getHeight(),b1.getDepth())+" Total surface area : "+b1.surfaceArea(b1.getWidth(),b1.getHeight(),b1.getDepth()));
        System.out.println("Box b2 info : ");
        System.out.println("Length : "+b2.getWidth());
        System.out.println("Volume : "+b2.volume(b2.getWidth())+" Total surface area : "+b2.surfaceArea(b2.getWidth()));

    }
}
class Box{
    private int width;
    private int height;
    private int depth;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public Box(){
        this.width = 0;
        this.height = 0;
        this.depth = 0;
    }

    public Box(int width, int height, int depth) {// for cuboid
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(int width){// parametrized constructor in case it is cubebox
        this.width = width;// where width = height = depth
        this.height = width;
        this.depth = width;
    }
    public int volume(int w, int h, int d){
        return (w*h*d);
    }
    public int surfaceArea(int w, int h, int d){
        return  2*(w*h+h*d+w*d);
    }
    public int volume(int w){
        return (w*w*w);
    }
    public int surfaceArea(int w){
        return  (6*w*w);
    }
}
/*
* // Box class with private variables and methods
class Box {
    // Private instance variables
    private double width;
    private double height;
    private double depth;

    // Default constructor
    public Box() {
        this.width = 1.0;
        this.height = 1.0;
        this.depth = 1.0;
    }

    // Parameterized constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Copy constructor
    public Box(Box otherBox) {
        this.width = otherBox.width;
        this.height = otherBox.height;
        this.depth = otherBox.depth;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return width * height * depth;
    }

    // Method to calculate surface area
    public double calculateSurfaceArea() {
        return 2 * (width * height + height * depth + width * depth);
    }

    // Getter methods (optional but good practice)
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    // Setter methods (optional)
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    // Method to display box details
    public void displayBoxDetails() {
        System.out.println("Box Dimensions: " + width + " x " + height + " x " + depth);
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Surface Area: " + calculateSurfaceArea());
        System.out.println();
    }
}

// Main class to test the Box class
public class BoxTest {
    public static void main(String[] args) {
        // Create first box using parameterized constructor
        System.out.println("Box 1:");
        Box box1 = new Box(5.0, 3.0, 2.0);
        box1.displayBoxDetails();

        // Create second box using default constructor
        System.out.println("Box 2:");
        Box box2 = new Box();
        box2.displayBoxDetails();

        // Create third box using copy constructor (bonus)
        System.out.println("Box 3 (Copy of Box 1):");
        Box box3 = new Box(box1);
        box3.displayBoxDetails();

        // Demonstrate modifying a box
        System.out.println("Box 2 after modification:");
        box2.setWidth(4.0);
        box2.setHeight(4.0);
        box2.setDepth(4.0);
        box2.displayBoxDetails();

        // Compare volumes
        System.out.println("Comparison:");
        System.out.println("Box 1 volume: " + box1.calculateVolume());
        System.out.println("Box 2 volume: " + box2.calculateVolume());
        System.out.println("Box 3 volume: " + box3.calculateVolume());
    }
}
* */