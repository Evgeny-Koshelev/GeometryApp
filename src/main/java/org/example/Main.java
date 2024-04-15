package org.example;

import org.example.figures.Circle;
import org.example.figures.Rectangle;
import org.example.figures.Ttriangle;
import org.example.shapes.figures.Cube;
import org.example.shapes.figures.Sphere;
import org.example.shapes.figures.Tetrahedron;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Ttriangle ttriangle = new Ttriangle();

        System.out.println(circle.area(5));
        System.out.println(circle.perimeter(5));
        System.out.println();

        System.out.println(rectangle.area(5,7));
        System.out.println(rectangle.perimeter(5, 7));
        System.out.println();

        System.out.println(ttriangle.area(5, 3));
        System.out.println(ttriangle.perimeter(5, 5, 2));
        System.out.println();

        Сomparison comp = new Сomparison();
        System.out.println(comp.comparisonTriangleCircle(5, 5, 3));
        System.out.println();

        Cube cube = new Cube();
        System.out.println(cube.volume(5));
        System.out.println();

        Sphere sp = new Sphere();
        System.out.println(sp.volume(5));
        System.out.println();

        Tetrahedron td = new Tetrahedron();
        System.out.println(td.volume(15, 5));
        System.out.println();
    }
}