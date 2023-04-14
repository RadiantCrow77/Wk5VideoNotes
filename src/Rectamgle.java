
public class Rectamgle {
private double width;
private double length;
private double area;

// constructor is same name as class
public Rectamgle(double width, double length) {
	this.width = width;
	this.length = length;
	this.area = width*length;
	
}

public double getWidth() {
	return width;
}

public void setWidth(double width) {
	this.width = width;
	area = width*length; // need to update area every time we set width
}

public double getLength() {
	return length;
}

public void setLength(double length) { 
	this.length = length;
	area = width*length; // update area every time we set length
}

public double getArea() {
	return area;
}

public void setArea(double area) {
	this.area = area;
}
}
