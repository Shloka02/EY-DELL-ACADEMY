package com.aug21.annotations;

import java.util.Objects;

public class ObjectToJSONConverter {
	public String convertToJSON(Object obj) {
		try {
			CheckIfSerializable(obj);
			initializeObject(obj);
			return getJsonString(obj);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void CheckIfSerializable(Object obj) throws JsonSerializableException
		if(Objects.isNull(obj)) {
			throw new JsonSerializableException("Cant serialize null object");
		}
	class<?>clazz= obj.getClass();
	if(!clazz.isAnnotationPresent(JsonSerializable.class)) {
		throw new JsonSerializableException("This class"+clazz.getSimpleName()+"is not annotated with"+"Json serializable annotation");
		
	}

}
