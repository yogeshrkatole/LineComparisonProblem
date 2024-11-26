
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
   public boolean equals(Object obj) {
       if (this == obj) return true;
       if (obj == null || getClass() != obj.getClass()) return false;
       
       LineComparison otherLine = (LineComparison) obj;
       return Double.compare(this.calculateLength(), otherLine.calculateLength()) == 0;
   }
  public static void main(String[] args) {
	System.out.println("Welcome to Line Comparison Computation Program");
	double x1=3.0,y1=2.0,x2=7.0,y2=1.0;
	double x11=3.0,y11=2.0,x21=7.0,y21=11.0;
	LineComparison lineComparison1=new LineComparison(x11,y11,x21,y21);
	LineComparison lineComparison2=new LineComparison(x1,y1,x2,y2);
	  double lengthOfLine1=lineComparison1.calculateLength();
	System.out.println("The Length of First Line: "+lengthOfLine1);
	 double lengthOfLine2=lineComparison1.calculateLength();
     System.out.println("The Length of Second Line: "+lengthOfLine2);
     if(lineComparison1.equals(lineComparison2)) {
    	 System.out.println("Lines are equal");
     }else {
    	 System.out.println("Lines are not equal");

     }
  }
}
