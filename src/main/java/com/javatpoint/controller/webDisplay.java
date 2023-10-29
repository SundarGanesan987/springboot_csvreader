package com.javatpoint.controller;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.controller.employee_map;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
@RestController
public class webDisplay 
{
	@RequestMapping("/")
	public String hello() {
		return "Hello javaTpoint";
	}
	
	@RequestMapping("/csvContent")
	public String csvContent() throws IOException, CsvException {
		
		FileReader fileobj = null;
		fileobj = new FileReader("C:\\Users\\User\\Desktop\\desk\\employees.csv");

		//CSVReader reader = new CSVReader(fileobj);
		//List<String[]> rows = reader.readAll();
		//String all_rows = null;
		//for (String[] row : rows) {
		//    all_rows += row[0] + "," + row[1] + "," + row[2] + "," + row[3];
		//}

		List<employee_map> employees = new CsvToBeanBuilder(fileobj)
				.withType(employee_map.class)
				.build()
				.parse();
		//System.out.println(employees);

		return "Reading from CSV File" + employees;
		
	}
}
