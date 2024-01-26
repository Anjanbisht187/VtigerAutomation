package abstraction;

abstract  class Car extends Vehical {
	public abstract void openGate();
	public void applyBreak()
	{
		System.out.println("apply the break in car");
	}
}
