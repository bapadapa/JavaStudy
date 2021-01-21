package generic;

// Meterial을 상속받은 객체만 사용가능.
public class GenericPrinter<T extends Meterial> {
	
	private T material;
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}	
	public String toString() {
		return material.toString();
	}
	public void Printing() {
		material.doPrintint();
	}
	
	
}
