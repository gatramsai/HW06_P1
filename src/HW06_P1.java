public class HW06_P1 {

    public static void main(String[] args) {


        Rectangle rect1 = new Rectangle(5,10);
        Rectangle rect2 = new Rectangle(55,61);

        System.out.println("If the rectangles are the same I will return a 1. If they are not equal: "+ rect1.compareTo(rect2));
    }
}

/*
Analysis: The problem asks us to Rewrite the provided Rectangle class to extend GeometricObject and implement the Comparable interface.
    This requires us to Override the equals method in the Object class. In order to check for equality we have to check if their areas are the same.
    This means chekc if their length and width are the same.

Design:
    The first step would be to make sure the rectangle class is a subclass of the geometric object. Since Geometric is abstract
    we need to implement the getArea and getPerimeter. Then create the comparable interface. Then create a .equals -to then use in the compare to method.
    In the .equals method make sure to chekc for null because we do not want to compare with a null. Then impolement the compareto by using the .equals method.

Testing: Test the program by making a test main. This will be used to check the rectangles. In order to test it,create rectangles of multiple sizes and check.
    I checked using multiple int cvalues ofr both the width and height for both rectangles. Under normal input the program returned 1 if equal 0 if not.

 */
