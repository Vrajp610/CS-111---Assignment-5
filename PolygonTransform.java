/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Vraj Patel, vpp36@scarletmail.rutgers.edu, vpp36
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
        double[] newArr = new double[array.length];{
            for (int i = 0; i < array.length; i++){
                newArr[i] = array[i];
            }
            return newArr;
        }
	// WRITE YOUR CODE HERE
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
        for (int i = 0; i < x.length; i++){
            x[i] = alpha * x[i];
            y[i] = alpha * y[i];
        }
	// WRITE YOUR CODE HERE
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i < x.length; i++){
            x[i] = x[i] + dx;
            y[i] = y[i] + dy;
        }
	// WRITE YOUR CODE HERE
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
        double radians = Math.toRadians(theta);
        for (int i = 0; i < x.length; i++){
            double rotation = x[i];
            x[i] = x[i] * Math.cos(radians) - y[i] * Math.sin(radians);
            y[i] = y[i] * Math.cos(radians) + rotation * Math.sin(radians);  
        }
	// WRITE YOUR CODE HERE
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
        StdDraw.setScale(-5.0, +5.0); 
        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 
        double dx = 2.0;
        double dy = 1.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        translate(x, y, dx, dy); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
        
	// WRITE YOUR CODE HERE
    }
}
