package eve;

public class ExceptionHandling {
public static void main(String[] args) {
	Dog dog=new Dog();
	try {
	dog.play("stick");
	}catch(DogBarkException de) {
		System.out.println(de);
	}catch (DogBiteException dee) {
		System.out.println(dee);
	}
	}
}
class Dog{
	public void play(String item)throws DogBarkException,DogBiteException  {
		if(item.equals("stick")) {
			throw new DogBarkException("if you beat i bite...");
			
		}
		else if(item.equals("stone")) {
			throw new DogBiteException("if you throw i bow bow");
		}
	}
	
}
class DogBarkException extends Exception{
	String msg;
	public DogBarkException(String message) {
		this.msg=message;
	}
	@Override
	public String toString() {
		return "exception is :"+msg;
	}
}
class DogBiteException extends Exception{
	String msg;
	public DogBiteException(String message) {
		this.msg=message;
	}
	@Override
	public String toString() {
		return "exception is :"+msg;
	}
}