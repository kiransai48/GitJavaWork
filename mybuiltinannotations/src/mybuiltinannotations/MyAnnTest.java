package mybuiltinannotations;

import java.util.ArrayList;
import java.util.List;


public class MyAnnTest{

@MySampleAnn(name="sai",desc="checking Annotations...")

public void myTestMethod(){
List<String> interests=new <String>ArrayList();

System.out.println(""+this.getClass().toString());
interests.add("Reading books");
interests.add("Listening music");
interests.forEach(System.out::println);

}
}