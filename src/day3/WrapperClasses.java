package day3;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte grade=2;
		short marks=20;
        float price=8.3f;
        double rate=240.3D;
        boolean flag = false;
        char initial='A';
        
        //autoboxing
        Byte bObject= new Byte(grade);
        Short sObject= new Short(marks);
        System.out.println("data type grade is"+grade);
        System.out.println("object is"+bObject);
        
        byte byteValue=bObject.byteValue();
        System.out.println(byteValue);
        
        		

	}

}
