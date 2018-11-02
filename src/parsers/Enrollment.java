package parsers;

import java.io.IOException;

import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class Enrollment implements Const{
	
	public static void parse() throws IOException {
		CSVReader reader = new CSVReader();
		Iterable<CSVRecord> records = reader.read(ROSTERS, Header.get(ROSTERS));
		
		CSVWriter writer = new CSVWriter();
		CSVPrinter printer = writer.getPrinter(ENROLLMENTS, CLEVER_ENROLLMENT_HEADER);
		
		int i = 0;
		for (CSVRecord record: records) {
			i++; if (i == 1) continue;
			printer.print(record.get("SCHOOL_ID"));					// School_id
			printer.print(record.get("SECTION_ID"));				// Section_id
			printer.print(record.get("STUDENT_ID"));				// Student_id
			printer.println();
		}
		reader.close();
		printer.close();
	}
}
