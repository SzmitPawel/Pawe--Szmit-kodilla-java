package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: Shape Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("This is the end of tests");
    }

    @BeforeEach
    public void beforeEach() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for Shapes")
    public class ShapesTestSuite {

        @DisplayName("when create Shape Circle " +
                     "then getField should return true")
        @Test
        public void testCaseGetFieldCircle() {
            // give
            Shape shape = new Circle();
            double expectedResult = 113.097312;

            // when
            double result = shape.getField();

            // then
            assertEquals(expectedResult, result);
        }

        @DisplayName("when create Shape Circle " +
                     "then getShapeName should name")
        @Test
        public void testCaseGetShapeNameCircle() {
            // give
            Shape shape = new Circle();
            String expectedResult = "Circle";

            // when
            String result = shape.getShapeName();

            // then
            assertEquals(expectedResult, result);
        }

        @DisplayName("when create Shape Square " +
                "then getField should return true")
        @Test
        public void testCaseGetFieldSquare() {
            // give
            Shape shape = new Square();
            double expectedResult = 16;

            // when
            double result = shape.getField();

            // then
            assertEquals(expectedResult, result);
        }

        @DisplayName("when create Shape Square " +
                "then getShapeName should return name")
        @Test
        public void testCaseGetShapeNameSquare() {
            // give
            Shape shape = new Square();
            String expectedResult = "Square";

            // when
            String result = shape.getShapeName();

            // then
            assertEquals(expectedResult, result);
        }

        @DisplayName("when create Shape Triangle " +
                "then getField should return true")
        @Test
        public void testCaseGetFieldTriangle() {
            // give
            Shape shape = new Triangle();
            double expectedResult = 420;

            // when
            double result = shape.getField();

            // then
            assertEquals(expectedResult, result);
        }

        @DisplayName("when create Shape Triangle " +
                "then getShapeName should return name")
        @Test
        public void testCaseGetShapeNameTriangle() {
            // give
            Shape shape = new Triangle();
            String expectedResult = "Triangle";

            // when
            String result = shape.getShapeName();

            // then
            assertEquals(expectedResult, result);
        }

    }

    @Nested
    @DisplayName("Tests for ShapeCollector")
    public class CollectorTestSuite {


        @DisplayName("when create ShapeCollector with Shape " +
                "then addFigure should return size 1")
        @Test
        public void testCaseAddFigure() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle();

            // when
            shapeCollector.addFigure(shape);

            // then
            assertEquals(1, shapeCollector.getShapes().size());

        }

        @DisplayName("when created ShapeCollector with Shape " +
                "then removeFigure should return size 0")
        @Test
        public void testCaseRemoveFigure() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle();
            shapeCollector.setShapes(shape);

            // when
            shapeCollector.removeFigure(shape);

            // then
            assertEquals(0, shapeCollector.getShapes().size());

        }

        @DisplayName("when created ShapeCollector with Shape " +
                "then getShape should return created Shape ")
        @Test
        public void testCaseGetFigure() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle();
            shapeCollector.setShapes(shape);

            // when
            Shape result = shapeCollector.getFigure(0);

            // then
            assertEquals(shape, result);
        }

        @DisplayName("when created ShapeCollector with a few Shapes" +
                "then showFigures should return String with Figures names")
        @Test
        public void testCaseShowFigures(){
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle();
            Shape square = new Square();
            Shape triangle = new Triangle();

            shapeCollector.setShapes(circle);
            shapeCollector.setShapes(square);
            shapeCollector.setShapes(triangle);

            String expectedResult = "Circle Square Triangle";

            // when
            String result = shapeCollector.showFigures();

            // then
            assertEquals(expectedResult, result);
        }
    }
}