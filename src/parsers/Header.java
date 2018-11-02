package parsers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Header {
	
	public static String[] get(String inputFile) throws IOException {
		Reader in = new InputStreamReader(new FileInputStream(inputFile), "UTF-8"); 
		Iterable<CSVRecord> records = CSVFormat.DEFAULT
				.parse(in);
		
		CSVRecord header = records.iterator().next();
		String[] headerStudent = new String[header.size()];
		for (int i = 0; i < header.size(); i++) {
			headerStudent[i] = header.get(i);
		}
		in.close();
		return headerStudent;
	}

}
