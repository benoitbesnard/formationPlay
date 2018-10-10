package services;

import javax.inject.Singleton;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

@Singleton
public class ConfigurationService {
	
	private final Config config;
	
	public ConfigurationService() {
		this.config = ConfigFactory.load();
	}
	
	public Config getConfig() {
		return config;
	}

}
