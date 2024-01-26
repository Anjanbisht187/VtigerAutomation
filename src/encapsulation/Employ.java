package encapsulation;

public class Employ {
	 private String ename;
	 private int eid;
	 private double salary;
	
	public String  getEname()
	{    //validation
		//System.out.println("ename is"+ename);
		return ename;
	}
	public int getEid()
	{
		//validattion
		return eid;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setEname(String ename)
	
	{
		this.ename = ename;
	}
	

}
