package com.aug25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class SerializedSingleton implements Serializable{
	private static final long serialVersionUID=1L;
	private static class SingletonHelper{
		private static final SerializedSingleton instance= new SerializedSingleton();
	}
	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}
	protected Object readResolve() {
		return getInstance();
	}
}
public class SerializableAndDeserializeUsingSingleton {
	public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException{
		SerializedSingleton instance1= SerializedSingleton.getInstance();
		ObjectOutput out= new ObjectOutputStream(new FileOutputStream("C:\\Users\\CD917NJ\\Desktop\\Hi.txt"));
		out.writeObject(instance1);
		out.close();
		
		ObjectInput in= new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\CD917NJ\\\\Desktop\\\\Hi.txt"));
		SerializedSingleton instance2=(SerializedSingleton) in.readObject();
		in.close();
		
		System.out.println("instance1-HashCode value"+instance1.hasCode());
		System.out.println("instance2-HashCode value"+instance2.hasCode());
		
				
	}
		
	

}
