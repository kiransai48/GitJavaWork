package Arith;

public class AddressBookdemo {
public static void main(String args[])
{
AddressBook ab=new AddressBook();
// creating address-innerclass Object
AddressBook.Address address=new AddressBook().new Address();
//set values to attribute of inner class
address.setHousename("PearlResidency");
address.setStreet("Prasadampaddu");
address.setCity("Vijayawada");
address.setState("AndhraPradesh");

//set values to attribute of outer class
ab.setTempAdd(address);


// creating address-innerclass Object
AddressBook.Address paddress=new AddressBook().new Address();

//set values to attribute of inner class
paddress.setHousename("PearlResidency");
paddress.setStreet("Prasadampaddu");
paddress.setCity("Vijayawada");
paddress.setState("AndhraPradesh");

//set values to attribute of outer class
ab.setPermAdd(paddress);




System.out.println("Temporaray Address:\n"+ab.getTempAdd());
System.out.println("Permanent Address:\n"+ab.getPermAdd());
}

}

