package LabAssessment;
public class Volume {
		     public void volume(int side){
	     int a=side*side*side;
	     System.out.println("Area of the cube="+a);
	     }
	     public void volume(int l,int b,int h)  {
	     int area=l*b*h;
	     System.out.println("Area of the cuboid ="+area);
	     }
	     public void volume(double r)
	     {
	     double sp=4.0/3*3.14*r*r*r;
	     System.out.println("Area of the sphere="+sp);
     }
	     public static void main(String[] args)
	     {
	     Volume v = new Volume();
	     v.volume(5);
	     v.volume(4,3,6);
	     v.volume(5.2);
	     }
	     }

