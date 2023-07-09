package day02.solved;

//Method overloading in Java
class ShapeCalculator {
		// Calculating Area for Circle
 public static double calculateArea(double radius) {
     return Math.PI * radius * radius;
 }
		
		// Calculating Area for Rectangle
 public static  double calculateArea(double length, double width) {
     return length * width;
 }
}

public class ShapeCalci {
 public static void main(String[] args) {
     ShapeCalci calculator = new ShapeCalci();
     double circleArea = ShapeCalculator.calculateArea(3.5);                     // Output: 38.48451000647496
     double rectangleArea = ShapeCalculator.calculateArea(4.2, 6.8);            // Output: 28.559999999999995
 }
}