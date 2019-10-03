package com.example.demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

 //Error de paquetes y entorno sin resolver. No se utiliza Cucumber
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources"
        ,glue={"src/main/stepDefinition"}
        )

public class TestRunner {

	
}
