package RouletteApplication;

import java.io.FileNotFoundException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import American.AmericanSimulator;
import European.EuropeanSimulator;

@SpringBootApplication
public class RouletteApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(RouletteApplication.class, args);
		System.out.println("Roulette Application Started ");
		System.out.println("American Roulette Simulator Log");
		AmericanSimulator americanSimulator = new AmericanSimulator();
//		americanSimulator.run1to181838Simulator();
		americanSimulator.run19to361838Simulator();
//		americanSimulator.run3038Simulator();
//		americanSimulator.run2438Simulator();
//		americanSimulator.run3338Simulator();
//		System.out.print("European Roulette Simulator Log");
//		EuropeanSimulator europeanSimulator = new EuropeanSimulator();
//		europeanSimulator.runSimulator();
		
	}
}
