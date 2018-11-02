package parsers;

public interface Const {
	
	public static final String INPUT = "in/";
	public static final String OUTPUT = "out/";
	
	public static final String ROSTERS = INPUT + "rosters.csv";
	public static final String ENROLLMENTS = OUTPUT + "enrollments.csv";
	
	public static final String INPUT_SCHOOL = INPUT + "schools.csv";
	public static final String OUTPUT_SCHOOL = OUTPUT + "schools.csv";
	
	public static final String INPUT_SECTION = INPUT + "sections.csv";
	public static final String OUTPUT_SECTION = OUTPUT + "sections.csv";
	
	public static final String INPUT_STUDENT = INPUT + "students.csv";
	public static final String OUTPUT_STUDENT = OUTPUT + "students.csv";
	
	public static final String INPUT_TEACHER = INPUT + "teachers.csv";
	public static final String OUTPUT_TEACHER = OUTPUT + "teachers.csv";
	
	
	public static final String[] CLEVER_SCHOOL_HEADER = {"School_id", "School_name","School_number","State_id",
			"Low_grade","High_grade","Principal","Principal_email","School_address","School_city","School_state",
			"School_zip","School_phone"};
	
	public static final String[] CLEVER_SECTION_HEADER = {"School_id","Section_id","Teacher_id","Name","Section_number","Grade","Course_name",
			"Course_number","Course_description","Period","Subject","Term_name","Term_start","Term_end"};
	
	public static final String[] CLEVER_STUDENT_HEADER = {"School_id","Student_id","Student_number","State_id","Last_name","Middle_name","First_name","Grade",
			"Gender","Graduation_year","DOB","Race","Hispanic_Latino","Home_language","Ell status","Frl_status","IEP_status","Student_street",
			"Student_city","Student_state","Student_zip","Student_email","Contact_relationship","Contact_type","Contact_name","Contact_phone",
			"Contact_phone_type","Contact_email","Username","Password"};
	
	public static final String[] CLEVER_TEACHER_HEADER = {"School_id","Teacher_id","Teacher_number","State_teacher_id","Teacher_email","First_name",
			"Middle_name","Last_name","Title","Username","Password"};
	
	public static final String[] CLEVER_ENROLLMENT_HEADER = {"School_id","Section_id","Student_id"};

}
