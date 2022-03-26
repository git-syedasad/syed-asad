package eve;

public class Exception2 {
public static void main(String[] args) {
	
	Dog dog=new Dog();
	Dog dog1=new Dog();
	try {
	dog.play("stone");	
	
	}catch(DogBiteException de) {
		System.out.println(de);
	}catch(DogBarkException dde) {
		System.out.println(dde);
	}
	
}
}

class Dog{
	public void play(String item) throws DogBiteException,DogBarkException{
		if(item.equals("stick")) {
			throw new DogBiteException("if you beat me...i bite you!!");
		}
		else if(item.equals("stone")) {
			throw new DogBarkException("if you throw...i bow ");
		}
	}
}
class DogBiteException extends Exception{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is : "+msg;
	}
}
class DogBarkException extends Exception{
	String message;
	public DogBarkException(String msg) {
		message=msg;
	}
	@Override
	public String toString() {
		return message;
	}
}