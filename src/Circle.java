/**
 * @Class name: Circle
 * @Author: Ashley Seerattan
 * @Version: 1.0
 * @Date 01 February 2023

 * Description: circle
 */
public class Circle {
    public static void main(String[] args) {
        double area;
        double perimeter;
        double radius = 9.5;
        area = radius * radius * Math.PI;
        perimeter = 2 * radius * Math.PI;

        System.out.println("The perimeter of the circle is:"+ perimeter );
                System.out.println("The area of the circle is:" + area );

    }

}
