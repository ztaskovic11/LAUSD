package parsers;

import java.io.IOException;

import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class Teacher implements Const {
	
	public static void parse() throws IOException {
	
		CSVReader reader = new CSVReader();
		Iterable<CSVRecord> records = reader.read(INPUT_TEACHER, Header.get(INPUT_TEACHER));
		
		CSVWriter writer = new CSVWriter();
		CSVPrinter printer = writer.getPrinter(OUTPUT_TEACHER, CLEVER_TEACHER_HEADER);
		
		int i = 0;
		for (CSVRecord record: records) {
			i++; if (i == 1) continue;
			printer.print(record.get("SCHOOL_ID"));						// School_id
			printer.print(record.get("TEACHER_ID"));					// Teacher_id
			printer.print("");											// Teacher_number
			printer.print("");											// State_teacher_id
			printer.print(record.get("TEACHER_EMAIL"));					// Teacher_email
			printer.print(record.get("FIRST_NAME"));					// First_name
			printer.print(record.get("MIDDLE_NAME"));					// Middle_name
			printer.print(record.get("LAST_NAME"));						// Last_name
			printer.print(record.get("JOB_CLASSIFICATION_TITLE"));		// Title
			printer.print(record.get("USERNAME"));						// Username
			printer.print("");											// Password
			printer.println();
		}
		reader.close();
		printer.close();
	}

}
