/**
 * @Description: TODO
 */
package com.exercise.Arguments;

/**
 *  Reference data type parameters, such as objects,
 *  are also passed into methods by value
 */
public class PassReferenceDataTypeArguments {

    public static void main(String[] args) {

        PassReferenceDataTypeArguments p = new PassReferenceDataTypeArguments();
        Circle circle = new Circle(2, 3);
        p.moveCircle(circle, 2, 5);

        System.out.println(circle);

    }


    public void moveCircle(Circle circle, int deltaX, int deltaY) {
        // code to move origin of circle to x+deltaX, y+deltaY
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);

        // code to assign a new reference to circle
        circle = new Circle(0, 0);
    }


    static class Circle {

        int x, y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public Circle(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

}

}
