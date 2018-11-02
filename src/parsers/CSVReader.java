package parsers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;



public class CSVReader {
	Reader in;
	public Iterable<CSVRecord> read(String inputFile, String[] header) throws IOException {
		in = new InputStreamReader(new FileInputStream(inputFile), "UTF-8");
		Iterable<CSVRecord> records = CSVFormat.DEFAULT
				.withHeader(header)
				.parse(in);
		return records;
	}

	public void close() throws IOException {
		in.close();
	}
}
