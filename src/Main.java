import java.util.Scanner;

/**Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
 жана circumference деген статик методдору болсун.
 areaны табуу учун: PI * (radius * radius)
 circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат*/

public class Main {
    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle(3, Math.PI);

      //  System.out.println("Radius: ");
     //   circle.setRadius(scanner.nextFloat());
        System.out.println("PI: "+Math.PI);

        System.out.println("Area--> "+Math.PI+"*"+"("+ circle.getRadius()+"*"+ circle.getRadius()+")="+Circle.getArea(3, Math.PI));

        System.out.println("Circumference--> "+Math.PI+"*"+2+"*"+circle.getRadius()+"="+Circle.getCircumference(4, Math.PI));


    }
}
