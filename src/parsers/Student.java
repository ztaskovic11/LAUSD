package parsers;

import java.io.IOException;

import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class Student implements Const {
	
	public static void parse() throws IOException {
		CSVReader reader = new CSVReader();
		Iterable<CSVRecord> records = reader.read(INPUT_STUDENT, Header.get(INPUT_STUDENT));
		
		CSVWriter writer = new CSVWriter();
		CSVPrinter printer = writer.getPrinter(OUTPUT_STUDENT, CLEVER_STUDENT_HEADER);
		
		int i = 0;
		for (CSVRecord record: records) {
			i++; if (i == 1) continue;
			printer.print(record.get("SCHOOL_ID"));							// School_id
			printer.print(record.get("STUDENT_ID"));						// Student_id
			printer.print("");												// Student_number
			printer.print(record.get("STATE_ID"));							// State_id
			printer.print(record.get("LAST_NAME"));							// Last_name
			printer.print(record.get("MIDDLE_NAME"));						// Middle_name
			printer.print(record.get("FIRST_NAME"));						// First_name
			printer.print(record.get("GRADE"));								// Grade
			printer.print(record.get("GENDER"));							// Gender
			printer.print("");												// Graduation_year 
			printer.print(record.get("DOB"));								// DOB
			printer.print(record.get("RACE"));								// Race
			printer.print(record.get("HISPANIC_LATINO"));					// Hispanic_Latino
			printer.print(record.get("CORRESPONDENCE_LANGUAGE"));			// Home_language
			printer.print(record.get("EL_LEVEL"));							// Ell_status
			printer.print(record.get("FRL_STATUS"));						// Frl_status
			printer.print(record.get("IEP_STATUS"));						// IEP_status
			printer.print("");												// Student_street
			printer.print("");												// Student_city
			printer.print("");												// Student_state
			printer.print(record.get("STUDENT_ZIP"));						// Student_zip
			printer.print(record.get("STUDENT_EMAIL"));						// Student_email
			printer.print("");												// Contact_relationship
			if (!record.get("GUARDIAN_HOME_PHONE").isEmpty()) {				// Contact_type
				printer.print("guardian");
			} else {
				if (!record.get("GUARDIAN_WORK_PHONE").isEmpty()) {
					printer.print("guardian");
				} else {
					if (!record.get("EMERGENCY_CONTACT_PHONE").isEmpty()) {
						printer.print("emergency");
					} else {
						printer.print("");
					}
				}
			}											
			printer.print(record.get("GUARDIAN_FIRST_NAME") 				// Contact_name
					+ " " + record.get("GUARDIAN_LAST_NAME"));		
			
			if (!record.get("GUARDIAN_HOME_PHONE").isEmpty()) {				// Contact_phone
				printer.print(record.get("GUARDIAN_HOME_PHONE"));
			} else {
				if (!record.get("GUARDIAN_WORK_PHONE").isEmpty()) {
					printer.print(record.get("GUARDIAN_WORK_PHONE"));
				} else {
					if (!record.get("EMERGENCY_CONTACT_PHONE").isEmpty()) {
						printer.print(record.get("EMERGENCY_CONTACT_PHONE"));
					} else {
						printer.print("");
					}
				}
			}										
			if (!record.get("GUARDIAN_HOME_PHONE").isEmpty()) {				// Contact_phone_type	
				printer.print("Home");
			} else {
				if (!record.get("GUARDIAN_WORK_PHONE").isEmpty()) {
					printer.print("Work");
				} else {
					printer.print("");
				}
			}
			String contact_email = record.get("GUARDIAN_EMAIL_ADDRESS");   // Contact_email
			contact_email = contact_email.replaceAll(" ", "");
			contact_email = contact_email.endsWith("@") ? contact_email.substring(0, contact_email.lastIndexOf("@")) : contact_email;
			printer.print(contact_email);			
			printer.print("");												// Username
			printer.print("");												// Password
			printer.println();
		}
		reader.close();
		printer.close();
	}
}
