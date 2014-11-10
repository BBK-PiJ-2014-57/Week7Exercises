package singlylistedlists;

public class singlylistedlists {
	
	public static void main(String[] args)
	{
		Hospital hsp = new Hospital();
		Patient Lewis = new Patient("Lewis", 23, "Headache");
		hsp.firstPatient.addPatient(Lewis);
		Patient Sophia = new Patient("Sophia", 23, "Stomach ache");
		hsp.firstPatient.addPatient(Sophia);
		Patient Ben = new Patient("Ben", 23, "Sore leg");
		hsp.firstPatient.addPatient(Ben);
		Patient Michael = new Patient("Michael", 23, "Ebola");
		hsp.firstPatient.addPatient(Michael);
		Patient Geoffrey = new Patient("Geoffrey", 23, "Heart Attack");
		hsp.firstPatient.addPatient(Geoffrey);
		Patient June = new Patient("June", 23, "Tonsilitis");
		hsp.firstPatient.addPatient(June);
		Patient Bob = new Patient("Bob", 23, "Hives");
		hsp.firstPatient.addPatient(Bob);
		Patient David = new Patient("David", 23, "Gall stones");
		hsp.firstPatient.addPatient(David);
		Patient Brenda = new Patient("Brenda", 23, "Broken Leg");
		hsp.firstPatient.addPatient(Brenda);
		Patient Paul = new Patient("Paul", 23, "Tendonitis");
		hsp.firstPatient.addPatient(Paul);
		hsp.firstPatient.printPatients();
		hsp.firstPatient.removePatient(Lewis);
		hsp.firstPatient.removePatient(Sophia);
		System.out.println(hsp.firstPatient.length());
		System.out.println("----------------------------------");
		hsp.firstPatient.printPatients();
		System.out.println(hsp.firstPatient.length());
		
	}
}
