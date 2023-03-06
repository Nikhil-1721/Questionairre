package com.Assignment;

public class Rectangle {
    private float length;
    private float breadth;

    public float area(float length, float breadth){
        this.length = length;
        this.breadth = breadth;

        return length * breadth;
    }

    public float perimeter(float length, float breadth){
        this.length = length;
        this.breadth = breadth;

        return 2*(length + breadth);
    }

    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle();

        float area = rectangle.area(22.3f, 18.9f);
        float perimeter = rectangle.perimeter(22.3f,18.9f);
        System.out.println(area);
        System.out.println(perimeter);
    }
}
