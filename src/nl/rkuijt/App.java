package nl.rkuijt;

import com.fasterxml.jackson.databind.ObjectMapper;
import nl.rkuijt.domain.Goose;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class App {
	private File dataFile;
	private ObjectMapper objectMapper = new ObjectMapper();
	private Random r = new Random();

	public App() {
		dataFile = new File("data.json");
	}

	public void run() throws IOException {
		// Read goose from file
		Goose goose = objectMapper.readValue(dataFile, Goose.class);

		// Generate random size
		int size = r.ints(0, 100).findFirst().getAsInt();
		goose.setSize(size);

		// Write goose to file
		objectMapper.writeValue(dataFile, goose);
	}

}
