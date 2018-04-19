package ultimateInHeritance;

public class Main {

	public static void main(String[] args) {
		Teacher t = new Teacher("English");
		System.out.println(t.subject);
		System.out.println(t.id);
		
		MathTeacher mt = new MathTeacher();
		System.out.println(mt.subject);
		System.out.println(mt.id);
		
		//MathTeacher mtt = t;//compile time error (Parent cannot become child of its child)
		//MathTeacher mtt = (MathTeacher)t;//run time error (Still parent cannot become a child of its child)
		//System.out.println(mtt.subject);
		
		Teacher tmt = mt;
		System.out.println(tmt.subject);
		System.out.println(tmt.id);
		System.out.println(t.id);
	}

}
