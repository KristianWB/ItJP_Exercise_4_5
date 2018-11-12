import java.util.Scanner;

public class AreaOfARegularPolygon {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        // Prompting for user to enter the number of sides in the polygon
        System.out.println(
                "Please enter the number of sides in the polygon"
        );
        int sides = input.nextInt();

        // Prompting for the length of the sides
        System.out.println(
                "Please enter the length of the sides in the polygon"
        );
        // Generating the input from user
        double length = input.nextDouble();



        // Building the calculation equation to compute the area
        double area = (sides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI/sides));

        // Printing out the area to user
        System.out.println(
                "The area of the polygon with " + sides + " sides and where each side is " + length + " long is: " + area
        );
    }
}
