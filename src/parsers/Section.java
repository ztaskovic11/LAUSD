package parsers;

import java.io.IOException;

import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class Section implements Const{
	
	public static void parse() throws IOException {
		CSVReader reader = new CSVReader();
		Iterable<CSVRecord> records = reader.read(INPUT_SECTION, Header.get(INPUT_SECTION));
		
		CSVWriter writer = new CSVWriter();
		CSVPrinter printer = writer.getPrinter(OUTPUT_SECTION, CLEVER_SECTION_HEADER);
		int i = 0;
		for (CSVRecord record: records) {
			i++; if (i == 1) continue;
			printer.print(record.get("SCHOOL_ID")); 					// School_id
			printer.print(record.get("SECTION_ID")); 					// Section_id
			printer.print(record.get("TEACHER_ID")); 					// Teacher_id
			printer.print(record.get("SECTION_NAME")); 					// Name
			printer.print(""); 											// Section_number
			printer.print(record.get("LOW_GRADE")); 					// Grade
			printer.print(record.get("COURSE_NAME")); 					// Course_name
			printer.print(record.get("COURSE_NUMBER")); 				// Course_number
			printer.print(""); 											// Course_description
			printer.print(record.get("PERIOD")); 						// Period
			printer.print(record.get("SUBJECT")); 						// Subject
			printer.print(record.get("TERM_NAME")); 					// Term_name
			printer.print(record.get("TERM_START")); 					// Term_start
			printer.print(record.get("TERM_END")); 						// Term_end
			printer.println();
		}
		reader.close();
		printer.close();
	}

}
