package main;

import java.io.IOException;

import parsers.Enrollment;
import parsers.School;
import parsers.Section;
import parsers.Student;
import parsers.Teacher;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("running....");
		School.parse();
		Section.parse();
		Student.parse();
		Teacher.parse();
		Enrollment.parse();
		System.out.println("Parsing completed.");
	}

}
