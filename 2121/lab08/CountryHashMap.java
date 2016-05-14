import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.io.*;
import java.lang.ClassNotFoundException;

public class CountryHashMap<String, T extends Country> { // 
	
	private Map<String, Country> countryMap; // instance variable
	
	public CountryHashMap() {
		ArrayList<Country> list = this.deserializeArrayList();
		this.setUpHashMap(list); // when a CountryHashMap is created, it contains all countries
	} // end CountryHashMap constructor
	
	public ArrayList<Country> deserializeArrayList() {
		ObjectInputStream input = null;
		ArrayList<Country> list = null;
		
		try {
			input = new ObjectInputStream(new FileInputStream("countries.ser"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			list = (ArrayList<Country>)input.readObject(); // cast down
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return list;
	} // end deserializeArrayList method
	
	public void setUpHashMap(ArrayList<Country> list) {
		countryMap = new HashMap<String, Country>(); // initialize instance variables
		
		for(int i = 0; i < list.size(); i++) {
			Country country = list.get(i);
			String name = (String)country.getName();
			countryMap.put(name, country); // HashMap needs (key, value)
		}
	} // end setUpHashMap method
	
} // end CountryHashMap class
