public class Point {
   private double x;
   private double y;
   
   public Point(Point p) {
      x = p.getX();
      y = p.getY();
   }
   
   public double getX() {
      return x;
   }
   
   public double getY() {
      return y;
   }
}


class Disk {
   private Point center;
   private double radius;
   
   public Disk(Disk d) {
      center = d.getCenter();
      radius = d.getRadius();
   }
   
   public Point getCenter() {
      return center;
   }
   
   public double getRadius() {
      return radius;
   }
}