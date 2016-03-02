public class LandTract {
	 @SuppressWarnings("unused")
   private double tractLength;
	 @SuppressWarnings("unused")
   private double tractWidth;
   private double area;



   public LandTract(double length, double width) {
       tractLength = length;
       tractWidth = width;
   }

   public double getLength(double length) {
       return length;
   }

   public double getWidth(double width) {
       return width;
   }

   public double getArea(double length, double width) {
       area = length * width;
       return area;
   }

   public boolean equals(LandTract tract2) {
       return this.area == tract2.area;
   }

   public String toString(int area) {
       return "Area: " + area;
   }

public double setArea(double length, double width) {
	area = length * width;
	return area;
}
}

