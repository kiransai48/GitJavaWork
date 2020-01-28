package com.hibernate.example;

public interface Figure {
StringBuilder figureName=new StringBuilder("Shape");

//static method implementation
public static float calcArea()
{
return 0.0f;
}

//default method implementation
public default void showFigure()
{
System.out.println("Figure is unknown");
}

}