package eve;

public class GenericContainer {
public static void main(String[] args) {
	PaintBrush<Paint> brush=Paintcontainer.getbrush();
	//Water cast=(water)brush.getItem();
	Paint pt=brush.getItem();
	System.out.println(pt);
	PaintBrush<Water>brush2=waterContainer.getbrush();
	Water cast=(Water)brush2.getItem();
	System.out.println(cast);
	brush2.getItem();
	}
}
class Paintcontainer{
	public static PaintBrush<Paint> getbrush() {
		PaintBrush<Paint> brush=new PaintBrush<Paint>();
		brush.setItem(new Redpaint());
		return brush;
	}
}
class waterContainer{
	public static PaintBrush<Water> getbrush(){
		PaintBrush<Water> brush=new PaintBrush<Water>();
		brush.setItem(new Water());
		return brush;
	}
}
class PaintBrush<T>{
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
abstract class Paint{
	
}
class Redpaint extends Paint{
	
}
class Bluepaint extends Paint{
	
}
class Water{}