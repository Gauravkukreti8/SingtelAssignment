package com.singtel.model;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken {
	
	private static final Map<String, String> roosterLanguageMap;
	
	static	{
		roosterLanguageMap = new HashMap<String, String>();
		roosterLanguageMap.put("English", "Cock-a-doodle-doo");
		roosterLanguageMap.put("Danish", "kykyliky");
		roosterLanguageMap.put("Dutch", "kukeleku");
		roosterLanguageMap.put("Finnish", "kukko kiekuu");
		roosterLanguageMap.put("French", "cocorico");
		roosterLanguageMap.put("German", "kikeriki");
		roosterLanguageMap.put("Greek", "kikiriki");
		roosterLanguageMap.put("Hebrew", "coo-koo-ri-koo");
		roosterLanguageMap.put("Hungarian", "kukuriku");
		roosterLanguageMap.put("Italian", "chicchirichi");
		roosterLanguageMap.put("Japanese", "ko-ke-kok-ko-o");
		roosterLanguageMap.put("Portuguese", "cucurucu");
		roosterLanguageMap.put("Russian", "kukareku");
		roosterLanguageMap.put("Swedish", "kuckeliku");
		roosterLanguageMap.put("Turkish", "kuk-kurri-kuuu");
		roosterLanguageMap.put("Urdu", "kuklooku");

	}

	public boolean fly() {
		System.out.println("I cannot fly");
		return false;
	}

	public boolean sing(String language) {

		if (null == language || language.isEmpty()) {
			// default
			System.out.println("In " + language+" language: Cock-a-doodle-doo");
		} else {
			System.out.println("IN " + language+" language: "+roosterLanguageMap.get(language));
		}

		return true;
	}
}
