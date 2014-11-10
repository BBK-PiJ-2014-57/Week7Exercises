package singlylistedlists;

public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, String illness)
	{
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
	
	public void addPatient(Patient newPatient)
	{
		if(this.nextPatient == null)
		{
			this.nextPatient = newPatient;
		}
		else
		{
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public boolean removePatient(Patient tbdeleted)
	{
		if(this.nextPatient == null)
		{
			return false;
		}
		else if(this.nextPatient.name.equals(tbdeleted.name))
		{
			this.nextPatient = tbdeleted.nextPatient;
			
		}
		else
		{
			this.nextPatient.removePatient(tbdeleted);
		}
		return true;
	}
	
	public void printPatients()
	{
		if(this.nextPatient !=null)
			{
			System.out.println("Patient name = " + this.nextPatient.name);
			System.out.println("Patient age : " + this.nextPatient.age);
			System.out.println("Patient illness: " + this.nextPatient.illness);
			this.nextPatient.printPatients();
			}
		
	}
	
	public int length()
	{
		int length = 0;
		if(this.nextPatient != null)
		{
			length++;
			length += this.nextPatient.length();
		}
		return length;
	}

}
