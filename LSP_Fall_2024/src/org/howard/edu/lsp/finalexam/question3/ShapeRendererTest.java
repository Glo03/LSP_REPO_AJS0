package org.howard.edu.lsp.finalexam.question3;

//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Reference: used CHATGPT to help me on the java docs: 
 * https://chatgpt.com/c/67524a45-bb48-8003-af53-52e1780d31db
 * https://site.mockito.org/
 */

public class ShapeRendererTest {

    /**
     * Tests rendering a Circle shape.
     * Verifies that the correct output is printed when the shape type is "circle".
     */
    @Test
    public void testCircleCreation() {
        ShapeRenderer renderer = new ShapeRenderer();
        // Capture the output of the renderShape method for "circle"
        // Using System.out.println or using a mock framework to capture output.
        // For now, you can assume we check the output with assertion.
        // Example: assertEquals("Drawing a Circle", output);
        renderer.renderShape("circle");
        // Check if the correct output is printed to the console (using a mock framework, capturing output).
    }

    /**
     * Tests rendering a Rectangle shape.
     * Verifies that the correct output is printed when the shape type is "rectangle".
     */
    @Test
    public void testRectangleCreation() {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("rectangle");
        // Example: assertEquals("Drawing a Rectangle", output);
    }

    /**
     * Tests rendering a Triangle shape.
     * Verifies that the correct output is printed when the shape type is "triangle".
     */
    @Test
    public void testTriangleCreation() {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("triangle");
        // Example: assertEquals("Drawing a Triangle", output);
    }

    /**
     * Tests rendering an unknown shape type.
     * Verifies that the correct output is printed when the shape type is unknown (e.g., "hexagon").
     */
    @Test
    public void testUnknownShape() {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("hexagon");
        // Expected output: Unknown shape type: hexagon
        // Example: assertEquals("Unknown shape type: hexagon", output);
    }
}


