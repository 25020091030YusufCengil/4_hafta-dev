package odevİstiklal;



public class MyPoint {
  private int x;
  private int y;
  public MyPoint() {
	  this(0,0);
  }
  public MyPoint(int x,int y) {
	  this.x=x;
	  this.y=y;
  }
  public int getX() {
	return x;
}
  public int getY() {
	return y;
}
  public double distance(MyPoint secondPoint) {
      return distance(secondPoint.getX(), secondPoint.getY());
  }

  public double distance(double x2, double y2) {
      return Math.sqrt(Math.pow(this.x - x2, 2) + Math.pow(this.y - y2, 2));
  }

  public static double distance(MyPoint p1, MyPoint p2) {
      return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
  }

	public static void main(String[] args) {
     MyPoint m = new MyPoint();
     
	}

}
