
public class SwitchNested {
public static void main(String[] args) {
	int tech = 2;
	int course = 5;
	switch(tech){
	case 1:
	System.out.println("python");
	break;
	case 2:
	switch(course){
	case 1:
	System.out.println("J2EE");
	break;
	case 2:
	System.out.println("advance java");
	break;
	default:{
		System.out.println("no course available.....");
	}
}
}
}
}