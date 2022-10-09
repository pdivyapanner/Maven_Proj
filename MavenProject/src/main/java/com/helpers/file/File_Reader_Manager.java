package com.helpers.file;

import java.io.IOException;

public class File_Reader_Manager {
	private File_Reader_Manager() {
		
		
	}
	public static File_Reader_Manager get_InstanceFRM() {

		
		File_Reader_Manager manager = new File_Reader_Manager();
		return manager;
		
		
	}
	public Test_Data_Reader get_Instance_Manager() throws IOException {

		Test_Data_Reader reader = new Test_Data_Reader();
		return reader;
		
	}

}
