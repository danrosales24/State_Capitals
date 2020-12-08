package state_Capitals;

import java.util.HashMap;

public class States_Capitals {

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("Alabama", "Montgomery");
		capitalCities.put("Alaska", "Juneau");
		capitalCities.put("Arizona", "Phoenix");
		capitalCities.put("Arkansas", "Little Rock");
		capitalCities.put("California", "Sacramento");

		capitalCities.put("Colorado", "Denver");
		capitalCities.put("Connecticut", "Hartford");
		capitalCities.put("Delaware", "Dover");
		capitalCities.put("Florida", "Tallahassee");
		capitalCities.put("Georgia", "Atlanta");

		capitalCities.put("Hawaii", "Honolulu");
		capitalCities.put("Idaho", "Boise");
		capitalCities.put("Illinois", "Springfield");
		capitalCities.put("Indiana", "Indianapolis");
		capitalCities.put("Iowa", "Des Moines");

		capitalCities.put("Kansas", "Topeka");
		capitalCities.put("Kentucky", "Frankfurt");
		capitalCities.put("Louisiana", "Baton Rouge");
		capitalCities.put("Maine", "Augusta");
		capitalCities.put("Maryland", "Annapolis");

		capitalCities.put("Massachusetts", "Boston");
		capitalCities.put("Michigan", "Lansing");
		capitalCities.put("Minnesota", "Saint Paul");
		capitalCities.put("Mississippi", "Jackson");
		capitalCities.put("Missouri", "Jefferson City");

		capitalCities.put("Montana", "Helena");
		capitalCities.put("Nebraska", "Lincoln");
		capitalCities.put("Nevada", "Carson City");
		capitalCities.put("New Hampshire", "Concord");
		capitalCities.put("New Jersey", "Trenton");

		capitalCities.put("New Mexico", "Santa Fe");
		capitalCities.put("New York", "Albany");
		capitalCities.put("North Carolina", "Raleigh");
		capitalCities.put("North Dakota", "Bismarck");
		capitalCities.put("Ohio", "Columbus");

		capitalCities.put("Oklahoma", "Oklahoma City");
		capitalCities.put("Oregon", "Salem");
		capitalCities.put("Pennsylvania", "Harrisburg");
		capitalCities.put("Rhode Island", "Providence");
		capitalCities.put("South Carolina", "Columbia");

		capitalCities.put("South Dakota", "Pierre");
		capitalCities.put("Tennessee", "Nashville");
		capitalCities.put("Texas", "Austin");
		capitalCities.put("Utah", "Salt Lake City");
		capitalCities.put("Vermont", "Montpelier");

		capitalCities.put("Virginia", "Richmond");
		capitalCities.put("Washington", "Olympia");
		capitalCities.put("Wyoming", "Cheyenne");
		capitalCities.put("West Virginia", "Charleston");
		capitalCities.put("Wisconsin", "Madison");
		System.out.println("----------------------------------------------");
		// all at once simple
		System.out.println(capitalCities);
		System.out.println("----------------------------------------------");
		// One by One using get()method and referring to key (Key is state name in this
		// example)
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}
		System.out.println("----------------------------------------------");
		// prints all capitals name using values
		for (String i : capitalCities.values()) {
			System.out.println(i);
			
		}
		System.out.println("----------------------------------------------");
		for (String i : capitalCities.keySet()) {
			System.out.println("key(State): " + i + " value(Capital): " + capitalCities.get(i));
		}
	}

}
