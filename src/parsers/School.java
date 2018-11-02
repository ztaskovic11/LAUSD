package parsers;

import java.io.IOException;

import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class School implements Const{
	
	public static void parse() throws IOException {
		CSVReader reader = new CSVReader();
		Iterable<CSVRecord> records = reader.read(INPUT_SCHOOL, Header.get(INPUT_SCHOOL));
		
		CSVWriter writer = new CSVWriter();
		CSVPrinter printer = writer.getPrinter(OUTPUT_SCHOOL, CLEVER_SCHOOL_HEADER);
		int i = 0;
		for (CSVRecord record: records) {
			i++; if (i == 1) continue;
			printer.print(record.get("SCHOOL_ID"));					// School_id
			printer.print(record.get("SCHOOL_NAME"));				// School_name
			printer.print(record.get("PREFERRED_LOCATION_CODE"));	// School_number
			printer.print(record.get("STATE_ID"));					// State_id
			printer.print(record.get("LOW_GRADE"));					// Low_grade
			printer.print(record.get("HIGH_GRADE"));				// High_grade
			printer.print(""); 										// Principal
			printer.print(""); 										// Principal_email
			printer.print(record.get("SCHOOL_ADDRESS")); 			// School_address
			printer.print(record.get("SCHOOL_CITY")); 				// School_city
			printer.print(record.get("SCHOOL_STATE")); 				// School_state
			printer.print(record.get("SCHOOL_ZIP")); 				// School_zip
			printer.print(record.get("SCHOOL_PHONE")); 				// School_phone
			printer.println();
		}
		printer.close();
		reader.close();
	}

}
