package eve;

public class SuperDemo {
public static void main(String[] args) {
	double vol;
	//shipment charges only for box 1
	BoxWeight box1=new BoxWeight(10,20,30,50);
	Shipment box=new Shipment(10,20,30,50,300);
		BoxWeight box2=new BoxWeight(box1);
		BoxWeight box3=new BoxWeight();
		BoxWeight box4=new BoxWeight(40,20);
		vol=box1.volume();
		System.out.println("volume of box1 is : "+vol);
		System.out.println("weight of box 1 is : "+box1.weight);
		System.out.println("shipment charges $ :"+box.shipmentCharges);
		System.out.println();
		vol=box2.volume();
		System.out.println("volume of box 2 is : "+vol);
		System.out.println("weight of box 2 is : "+box2.weight);
		System.out.println();
		vol=box3.volume();
		System.out.println("volume of box 3 is : "+vol);
		System.out.println("weight of box 3 is : "+box3.weight);
		System.out.println();
		vol=box4.volume();
		System.out.println("volume of box 4 is : "+vol);
		System.out.println("weight of box 4 is : "+box4.weight);
		System.out.println();
	}
}
class Box{
	private double length;
	private double width;
	private double height;
	//constructor used when arguments are passed
	public Box(double l,double w,double h) {
		length=l;
		width=w;
		height=h;
	}
	//constructor clone of an object
	public Box(Box ob) {
		length=ob.length;
		width=ob.width;
		height=ob.height;
	}
	//constructor used when no arguments are used
	public Box() {
		length=-1;
		width=-1;
		height=-1;
	}
	//constructor used when cube is created
	Box(double len){
		length=width=height=len;
		
	}
	//compute and return the volume
	double volume() {
		return length*width*height;
	}
}
class BoxWeight extends Box{
	double weight;
	BoxWeight(double l,double w,double h,double m){
		super(l,w,h);
		weight=m;
	}
	BoxWeight(BoxWeight ob){
		super(ob);
		weight=ob.weight;
	}
	BoxWeight(){
		super();
		weight=-1;
	}
	BoxWeight(double len,double m){
		super(len);
		weight=m;
	}
}
class Shipment extends BoxWeight{
	double shipmentCharges;
	Shipment(double l,double w,double h,double m,double c){
		super(l,w,h,m);
		shipmentCharges=c;
	}
}