package generic;

// Meterial�� ��ӹ��� ��ü�� ��밡��.
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
