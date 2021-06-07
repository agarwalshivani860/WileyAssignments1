package com.exs;

import com.exe5.Circle;
import com.exe5.Line;
import com.exe5.Square;

public class Properties {
Circle circle=new Circle();
Line line=new Line();
Square square=new Square();

public void display()
{
	System.out.println("About Line: ");
	line.drawingColor();
	line.thickness();
	System.out.println("About Circle: ");
	circle.drawingColor();
	circle.thickness();
	circle.fillingColor();
	circle.size();
	System.out.println("About Square: ");
	square.drawingColor();
	square.thickness();
	square.fillingColor();
	square.size();
}
}
