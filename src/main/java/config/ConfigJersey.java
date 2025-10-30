package config;

import org.glassfish.jersey.server.ResourceConfig;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/api")//url web service
public class ConfigJersey extends ResourceConfig{
	
	public ConfigJersey() {
		packages("api");
	}

}
