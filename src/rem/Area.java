//package rem;
//
//
//import cal.Shape;
//
//class Circle extends Shape {
//    private double radius;
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//    public double area() {
//        return 3.14 * radius * radius;
//    }
//    public double param() {
//        return 2 * 3.14 * radius;
//    }
//}
//
//class Rect extends Shape {
//    private double large;
//    private double width;
//    public double getLarge() {
//        return large;
//    }
//
//    public void setLarge(double large) {
//        this.large = large;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//
//    public Rect() {
//    }
//    public Rect(double large, double width) {
//        this.large=large;
//        this.width=width;
//    }
//
//    public double area() {
//        return large * width;
//    }
//
//    public double param() {
//        return 2 * (large + width);
//    }
//}
//
//class Square extends Shape {
//    private double square;
//    public double getSquare() {
//        return square;
//    }
//
//    public void setSquare(double square) {
//        this.square = square;
//    }
//
//
//    public Square(double square) {
//        this.square=square;
//    }
//    public double area() {
//        return square * square;
//    }
//
//    public double param() {
//        return 4 * square;
//    }
//}
