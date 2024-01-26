package Interface06;

public class Driver {
	public static void main(String[] args) {
	    A a = new G();
	    a.test();
	    G g = (G) a;
	    g.start();
	    C c = (C) a;
	     c.takeScreenshot();
	     
	}

}
