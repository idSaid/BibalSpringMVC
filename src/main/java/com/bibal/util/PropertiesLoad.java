package com.bibal.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public abstract class PropertiesLoad {

	private static Properties properties = new Properties();
	private static InputStream inputStream = null;

	public static int getDelai(String typeOeuvre) {
		try {
			inputStream = new FileInputStream("config.properties");
			properties.load(inputStream);

		} catch (Exception e) {
			System.err.println("Problème de lecture du fichier bibalConfig.properties");
		}

		return Integer.parseInt(properties.getProperty(typeOeuvre));

	}

}
