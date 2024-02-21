public class Circle {
     private final double PI = 3.14159;
     private float radius;


     public Circle(float radius, double PI){
         this.radius= radius;
     }

   static double getArea(double radius, double PI) {
        return PI * (radius * radius);
    }

    static double getCircumference(double radius, double PI) {
        return PI * 2 * radius;
    }


    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
