package CodeCamp;

abstract class Shape
{
abstract void getPerimeter();
abstract void getArea();

}

public class Shapedemo
{
public static void main(String[] args)
{
 Square sq=new Square(2);
 sq.getPerimeter();
 sq.getArea();
 Pentagon pg=new Pentagon(4);
 pg.getPerimeter();
 pg.getArea();
 Circle cr=new Circle(3);
 cr.getPerimeter();
 cr.getArea();
  }
 
}


 class Square extends Shape
{
int a;
double perimeter,area;
Square(int a)
{
this.a=a;
}
@Override
void getPerimeter()
{
perimeter=4*a;
System.out.println("perimeter of square:"+perimeter);

}
@Override
void getArea()
{
area=a*a;
System.out.println("area of square:"+area);

}


}


class Pentagon extends Shape
{
double s,perimeter,area;
Pentagon(double s)
{
this.s=s;
}

@Override
void getPerimeter()
{
perimeter=5*s;
System.out.println("perimeter of pentagon:"+perimeter);

}

@Override
void getArea()
{
area=(Math.sqrt(5*(5 + 2*(Math.sqrt(5))))* s*s)/4;
System.out.println("area of pentagon:"+area);

}


}

class Circle extends Shape
{
double r,perimeter,area;

Circle(double r)
{
this.r=r;
}
@Override
void getPerimeter()
{
perimeter=2*3.14*r;
System.out.println("perimeter of circle:"+perimeter);
}

@Override
void getArea()
{

area=3.14*r*r;
System.out.println("area of circle:"+area);
}


}