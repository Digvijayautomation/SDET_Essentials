package ZeroCell_Library;

import java.time.LocalDate;

import com.creditdatamw.zerocell.annotation.Column;

import lombok.Getter;

// All the data is read in string format
// So for the some variable we have converted it to int, boolean and date as per the requirement by creating separate classes for conversion

@Getter
public class testdatareader {
	
	
	@Column(index = 0, name = "testcase") // we can add index and name of column
	private String testcase;
	
	@Column(index = 1, name = "username")
	private String username;
	
	@Column(index = 2, name = "password")
	private String password;
	
	@Column(index = 3, name = "browser")
	private String browser;
	
	@Column(index = 4, name = "is_valid", converterClass=StringToBooleanConvertor.class) // if we want to convertor string to any other type we have to create seprate class for it and add it here
	private boolean is_valid;
	
	@Column(index = 5, name = "type", converterClass=StringToIntegerConvertor.class)// String to int conversion done in separate class
	private Integer type;
	
	@Column(index = 6, name = "mobile", converterClass = MobileNumberProcessor.class)
	private String mobile;
	
	@Column(index = 7, name = "date", converterClass=StringToDateConvertor.class)// String to date converter
	private LocalDate date;
	
	
	
	@Override // by right-clicking and under source and click generate to-string
	public String toString() {
		return "testdatareader [testcase=" + testcase + ", username=" + username + ", password=" + password
				+ ", browser=" + browser + ", is_valid=" + is_valid + ", type=" + type + ", mobile=" + mobile
				+ ", date=" + date + "]";
		
		
		
		
		
	}


}
