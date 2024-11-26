
public class LineComparison {
	private double x1,y1,x2,y2;
   public LineComparison(double x1, double y1, double x2, double y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
   public double calculateLength() {
	   return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
   }
  public static void main(String[] args) {
	System.out.println("Welcome to Line Comparison Computation Program");
	double x1=3.0,y1=2.0,x2=7.0,y2=1.0;
	
	LineComparison lineComparison=new LineComparison(x1,y1,x2,y2);
	  double lengthOfLine=lineComparison.calculateLength();
	System.out.println("The Length of Line: "+lengthOfLine);
  }
}
