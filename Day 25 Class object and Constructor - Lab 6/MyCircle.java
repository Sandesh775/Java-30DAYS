public class MyCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.1f);
        float r = c1.getRadius();
        float area = c1.findArea(r);
        float perimeter = c1.findCircumference(r);
        System.out.println("Area of circle : "+area+" Circumference of circle : "+perimeter);
    }
}
class Circle{
    private float radius;
    public void setRadius(float radius){
        this.radius = radius;
    }
    public float getRadius() {
        return radius;
    }
    public Circle(float radius) {
        this.radius = radius;
    }
    public float findArea(float r){
        return (3.14f*r*r);
    }
    public float findCircumference(float r){
        return (2f*3.14f*r);
    }
}