/**
 * 
 */
package American;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import American.RandomNumberGenerator;
/**
 * @author vamsiravi
 *
 */
public class AmericanSimulator {

	
	public void run3038Simulator(){
		
		RandomNumberGenerator rouletteNumberGenerator = new RandomNumberGenerator();
		Integer win3038Count = 0;
		Integer lose3038Count = 0;
		Integer currentRun = 0;
		for (Integer iteration = 0; iteration < 1500 ; iteration++){
			Integer rouletteNumberGenerated = rouletteNumberGenerator.americanRouletteRandomNumberGenerator();
			if((rouletteNumberGenerated.intValue()>=1 && rouletteNumberGenerated.intValue()<=12) || (rouletteNumberGenerated.intValue()>=19 && rouletteNumberGenerated.intValue()<=36)){
				win3038Count++;
				currentRun = 0;
				System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|	Bet Count: "+currentRun);	
			}else{
				currentRun++;
				lose3038Count++;
				System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|	Bet Count: "+currentRun);
			}
		}
		
		System.out.println("|	Win: "+win3038Count+"	|	Lose: "+lose3038Count);
		
	}
	
public void run3338Simulator() throws FileNotFoundException{
		
		RandomNumberGenerator rouletteNumberGenerator = new RandomNumberGenerator();
		Integer win3338Count = 0;
		Integer lose3338Count = 0;
		Integer currentRun = 0;
		for (Integer iteration = 0; iteration < 1500 ; iteration++){
			Integer rouletteNumberGenerated = rouletteNumberGenerator.americanRouletteRandomNumberGenerator();
			if((rouletteNumberGenerated.intValue()>=1 && rouletteNumberGenerated.intValue()<=15) || (rouletteNumberGenerated.intValue()>=19 && rouletteNumberGenerated.intValue()<=36)){
				win3338Count++;
				currentRun = 0;
				System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|	Bet Count: "+currentRun);	
			}else{
				currentRun++;
				lose3338Count++;
				System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|	Bet Count: "+currentRun);
			}
		}
		System.out.println("|	Win: "+win3338Count+"	|	Lose: "+lose3338Count);
//		PrintStream output = new PrintStream(new FileOutputStream(System.getProperty("user.dir")+File.separator+"simulation"+File.separator+"3038output.txt"));
//		System.setOut(output);
	}
	
public void run2438Simulator(){
	RandomNumberGenerator rouletteNumberGenerator = new RandomNumberGenerator();
	Integer win2438Count = 0;
	Integer lose2438Count = 0;
	Integer currentRun = 0;
	for (Integer iteration = 0; iteration < 1500 ; iteration++){
		Integer rouletteNumberGenerated = rouletteNumberGenerator.americanRouletteRandomNumberGenerator();
		if(rouletteNumberGenerated.intValue()>=12 && rouletteNumberGenerated.intValue()<=36){
			win2438Count++;
			currentRun = 0;
			System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|	Bet Count: "+currentRun);	
		}else{
			currentRun++;
			lose2438Count++;
			System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|	Bet Count: "+currentRun);
		}
	}
	System.out.println("|	Win: "+win2438Count+"	|	Lose: "+lose2438Count);
}

public void run19to361838Simulator(){
		RandomNumberGenerator rouletteNumberGenerator = new RandomNumberGenerator();
		Integer win1838Count = 0;
		Integer lose1838Count = 0;
		Integer currentRun = 0;
		for (Integer iteration = 0; iteration < 1500 ; iteration++){
			Integer rouletteNumberGenerated = rouletteNumberGenerator.americanRouletteRandomNumberGenerator();
			if((rouletteNumberGenerated.intValue()>=19 && rouletteNumberGenerated.intValue()<=36)){
				win1838Count++;
				currentRun = 0;
				System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|	Bet Count: "+currentRun);		
			}else{
				lose1838Count++;
				currentRun++;
				System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|	Bet Count: "+currentRun);
			}
		}
		System.out.println("|	Win: "+win1838Count+"	|	Lose: "+lose1838Count);
		
	}

public void run1to181838Simulator(){
	RandomNumberGenerator rouletteNumberGenerator = new RandomNumberGenerator();
	Integer win1838Count = 0;
	Integer lose1838Count = 0;
	for (Integer iteration = 0; iteration < 2000 ; iteration++){
		Integer rouletteNumberGenerated = rouletteNumberGenerator.americanRouletteRandomNumberGenerator();
		if((rouletteNumberGenerated.intValue()>=1 && rouletteNumberGenerated.intValue()<=18)){
			win1838Count++;
			System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|");	
		}else{
			lose1838Count++;
			System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|");
		}
	}
	System.out.println("|	Win: "+win1838Count+"	|	Lose: "+lose1838Count);
	
}

}
