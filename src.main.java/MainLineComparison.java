
public class MainLineComparison {
	 public static void main(String[] args) {
			System.out.println("Welcome to Line Comparison Computation Program\n");
			Point point1 = new Point(3.0, 2.0);
	        Point point2 = new Point(7.0, 1.0);
	        Point point3 = new Point(3.0, 2.0);
	        Point point4 = new Point(7.0, 11.0);
			
	        Line line1 = new Line(point1, point2);
	        Line line2 = new Line(point3, point4);
	        Line line3 = new Line(point1, point4);
			
		    System.out.println("Details of lines");
		    System.out.println("Line1: "+line1);
		    System.out.println("Line2: "+line2);
		    System.out.println("Line3: "+line3);
		    
		    LineComparison.checkEquality(line1, line2, "Line 1", "Line 2");
		    LineComparison.checkEquality(line3, line2, "Line 3", "Line 2");
		    LineComparison.checkEquality(line1, line3, "Line 1", "Line 3");
		    
		    LineComparison.compareLines(line1, line2, "Line 1", "Line 2");
		    LineComparison.compareLines(line3, line2, "Line 3", "Line 2");
		    LineComparison.compareLines(line1, line3, "Line 1", "Line 3");
		    
		  }
}
