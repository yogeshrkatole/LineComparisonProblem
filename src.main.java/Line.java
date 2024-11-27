
public class Line {
	private final Point firstPoint;
	   private final Point lastPoint;
	   public Line(Point firstPoint, Point lastPoint) {
			this.firstPoint = firstPoint;
			this.lastPoint = lastPoint;
		}
	   public double calculateLength() {
	        return Math.sqrt(Math.pow(lastPoint.getX() - firstPoint.getX(), 2) 
	                + Math.pow(lastPoint.getY() - firstPoint.getY(), 2)); 
	    }
	   public boolean equals(Object obj) {
	       if (this == obj) return true;
	       if (obj == null || getClass() != obj.getClass()) return false;
	       
	       Line otherLine = (Line) obj;
	       return Double.compare(this.calculateLength(), otherLine.calculateLength()) == 0;
	   }
	  
	   public int compareTo(Line otherLine) {
		   return Double.compare(this.calculateLength(), otherLine.calculateLength());
	   }
	@Override
	public String toString() {
		return "Line from firstPoint " + firstPoint + " to lastPoint " + lastPoint + " with calculateLength() is "
				+ calculateLength() + "]";
	}
}
