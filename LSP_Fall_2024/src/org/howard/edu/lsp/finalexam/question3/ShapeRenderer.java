package org.howard.edu.lsp.finalexam.question3;

//ShapeRenderer using Factory Pattern and Singleton
/**
 * Asked ChatGPT to help me understand Factory Pattern:
 * https://chatgpt.com/c/67524885-9c78-8003-aa09-3807e02f2bb7
 */
public class ShapeRenderer {

 // Singleton instance
 private static ShapeFactory shapeFactory = ShapeFactory.getInstance();

 public void renderShape(String shapeType) {
     Shape shape = shapeFactory.createShape(shapeType);
     if (shape != null) {
         shape.draw();
     } else {
         System.out.println("Unknown shape type: " + shapeType);
     }
 }

 public static void main(String[] args) {
     ShapeRenderer renderer = new ShapeRenderer();
     
     // Render different shapes
     renderer.renderShape("circle");    // Output: Drawing a Circle
     renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
     renderer.renderShape("triangle");  // Output: Drawing Triangle
     renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon  
 }
}

//Shape Interface
interface Shape {
 void draw();
}

//Circle class implements Shape
class Circle implements Shape {
 public void draw() {
     System.out.println("Drawing a Circle");
 }
}

//Rectangle class implements Shape
class Rectangle implements Shape {
 public void draw() {
     System.out.println("Drawing a Rectangle");
 }
}

//Triangle class implements Shape
class Triangle implements Shape {
 public void draw() {
     System.out.println("Drawing a Triangle");
 }
}

//Factory class to create Shape instances
class ShapeFactory {
 private static ShapeFactory instance;

 private ShapeFactory() {}

 public static ShapeFactory getInstance() {
     if (instance == null) {
         instance = new ShapeFactory();
     }
     return instance;
 }

 public Shape createShape(String shapeType) {
     if (shapeType == null) {
         return null;
     }
     switch (shapeType.toLowerCase()) {
         case "circle":
             return new Circle();
         case "rectangle":
             return new Rectangle();
         case "triangle":
             return new Triangle();
         default:
             return null;
     }
 }
}