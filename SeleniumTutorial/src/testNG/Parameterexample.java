package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterexample {
@Test
@Parameters("Name")

	public void parameter(String name) {
		System.out.println(" name is" +name);
	}

	}


