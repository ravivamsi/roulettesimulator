/**
 * 
 */
package American;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
/**
 * @author vamsiravi
 *
 */
public class AmericanSimulator {

	
	public void run3038Simulator() throws FileNotFoundException{
		
		
		File logFile3038 = new File(System.getProperty("user.dir")+File.separator+"log"+File.separator+"3038Log.txt");
		if(!logFile3038.exists()){
			try{
				logFile3038.createNewFile();
			}catch (Exception exception){
				exception.printStackTrace();
			}
		}
		FileOutputStream fileOutputStream = new FileOutputStream(logFile3038);
	    PrintStream printStream = new PrintStream(fileOutputStream);
		RandomNumberGenerator rouletteNumberGenerator = new RandomNumberGenerator();
		Integer win3038Count = 0;
		Integer lose3038Count = 0;
		Integer currentRun = 0;
		for (Integer iteration = 0; iteration < 200000 ; iteration++){
			Integer rouletteNumberGenerated = rouletteNumberGenerator.americanRouletteRandomNumberGenerator();
			if((rouletteNumberGenerated.intValue()>=1 && rouletteNumberGenerated.intValue()<=12) || (rouletteNumberGenerated.intValue()>=19 && rouletteNumberGenerated.intValue()<=36)){
				win3038Count++;
				currentRun = 0;
//				System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|	Bet Count: "+currentRun);	
				printStream.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|	Bet Count: "+currentRun);
			}else{
				currentRun++;
				lose3038Count++;
//				System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|	Bet Count: "+currentRun);
				printStream.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|	Bet Count: "+currentRun);
			}
		}
		
//		System.out.println("|	Win: "+win3038Count+"	|	Lose: "+lose3038Count);
		printStream.println("|	Win: "+win3038Count+"	|	Lose: "+lose3038Count);

	}
	
public void run3338Simulator() throws FileNotFoundException{
		
	File logFile3338 = new File(System.getProperty("user.dir")+File.separator+"log"+File.separator+"3338Log.txt");
	if(!logFile3338.exists()){
		try{
			logFile3338.createNewFile();
		}catch (Exception exception){
			exception.printStackTrace();
		}
	}
	FileOutputStream fileOutputStream = new FileOutputStream(logFile3338);
    PrintStream printStream = new PrintStream(fileOutputStream);
		RandomNumberGenerator rouletteNumberGenerator = new RandomNumberGenerator();
		Integer win3338Count = 0;
		Integer lose3338Count = 0;
		Integer currentRun = 0;
		for (Integer iteration = 0; iteration < 200000 ; iteration++){
			Integer rouletteNumberGenerated = rouletteNumberGenerator.americanRouletteRandomNumberGenerator();
			if((rouletteNumberGenerated.intValue()>=1 && rouletteNumberGenerated.intValue()<=15) || (rouletteNumberGenerated.intValue()>=19 && rouletteNumberGenerated.intValue()<=36)){
				win3338Count++;
				currentRun = 0;
//				System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|	Bet Count: "+currentRun);
			   printStream.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|	Bet Count: "+currentRun);
			}else{
				currentRun++;
				lose3338Count++;
//				System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|	Bet Count: "+currentRun);
			   printStream.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|	Bet Count: "+currentRun);
			}
		}
//		System.out.println("|	Win: "+win3338Count+"	|	Lose: "+lose3338Count);
	   printStream.println("|	Win: "+win3338Count+"	|	Lose: "+lose3338Count);
		//		PrintStream output = new PrintStream(new FileOutputStream(System.getProperty("user.dir")+File.separator+"simulation"+File.separator+"3038output.txt"));
//		System.setOut(output);
	}
	
public void run2438Simulator() throws FileNotFoundException{
	
	File logFile2438 = new File(System.getProperty("user.dir")+File.separator+"log"+File.separator+"2438Log.txt");
	if(!logFile2438.exists()){
		try{
			logFile2438.createNewFile();
		}catch (Exception exception){
			exception.printStackTrace();
		}
	}
	FileOutputStream fileOutputStream = new FileOutputStream(logFile2438);
    PrintStream printStream = new PrintStream(fileOutputStream);
	RandomNumberGenerator rouletteNumberGenerator = new RandomNumberGenerator();
	Integer win2438Count = 0;
	Integer lose2438Count = 0;
	Integer currentRun = 0;
	for (Integer iteration = 0; iteration < 200000 ; iteration++){
		Integer rouletteNumberGenerated = rouletteNumberGenerator.americanRouletteRandomNumberGenerator();
		if(rouletteNumberGenerated.intValue()>=13 && rouletteNumberGenerated.intValue()<=36){
			win2438Count++;
			currentRun = 0;
//			System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|	Bet Count: "+currentRun);
		   printStream.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|	Bet Count: "+currentRun);
		}else{
			currentRun++;
			lose2438Count++;
//			System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|	Bet Count: "+currentRun);
		   printStream.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|	Bet Count: "+currentRun);
		}
	}
//	System.out.println("|	Win: "+win2438Count+"	|	Lose: "+lose2438Count);
   printStream.println("|	Win: "+win2438Count+"	|	Lose: "+lose2438Count);
}

public void run19to361838Simulator() throws FileNotFoundException{
	File logFile19to361838 = new File(System.getProperty("user.dir")+File.separator+"log"+File.separator+"19to361838Log.txt");
	if(!logFile19to361838.exists()){
		try{
			logFile19to361838.createNewFile();
		}catch (Exception exception){
			exception.printStackTrace();
		}
	}
	FileOutputStream fileOutputStream = new FileOutputStream(logFile19to361838);
    PrintStream printStream = new PrintStream(fileOutputStream);
		RandomNumberGenerator rouletteNumberGenerator = new RandomNumberGenerator();
		Integer win1838Count = 0;
		Integer lose1838Count = 0;
		Integer currentRun = 0;
		for (Integer iteration = 0; iteration < 200000 ; iteration++){
			Integer rouletteNumberGenerated = rouletteNumberGenerator.americanRouletteRandomNumberGenerator();
			if((rouletteNumberGenerated.intValue()>=19 && rouletteNumberGenerated.intValue()<=36)){
				win1838Count++;
				currentRun = 0;
//				System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|	Bet Count: "+currentRun);
			   printStream.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|	Bet Count: "+currentRun);
			}else{
				lose1838Count++;
				currentRun++;
//				System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|	Bet Count: "+currentRun);
			   printStream.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|	Bet Count: "+currentRun);
			}
		}
//		System.out.println("|	Win: "+win1838Count+"	|	Lose: "+lose1838Count);
	   printStream.println("|	Win: "+win1838Count+"	|	Lose: "+lose1838Count);
	}

public void run1to181838Simulator() throws FileNotFoundException{
	File logFile1to181838 = new File(System.getProperty("user.dir")+File.separator+"log"+File.separator+"1to181838Log.txt");
	if(!logFile1to181838.exists()){
		try{
			logFile1to181838.createNewFile();
		}catch (Exception exception){
			exception.printStackTrace();
		}
	}
	FileOutputStream fileOutputStream = new FileOutputStream(logFile1to181838);
    PrintStream printStream = new PrintStream(fileOutputStream);
	RandomNumberGenerator rouletteNumberGenerator = new RandomNumberGenerator();
	Integer win1838Count = 0;
	Integer lose1838Count = 0;
	for (Integer iteration = 0; iteration < 200000 ; iteration++){
		Integer rouletteNumberGenerated = rouletteNumberGenerator.americanRouletteRandomNumberGenerator();
		if((rouletteNumberGenerated.intValue()>=1 && rouletteNumberGenerated.intValue()<=18)){
			win1838Count++;
//			System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|");	
		   printStream.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|");
		}else{
			lose1838Count++;
//			System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|");
	       printStream.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|");
		}
	}
//	System.out.println("|	Win: "+win1838Count+"	|	Lose: "+lose1838Count);
   printStream.println("|	Win: "+win1838Count+"	|	Lose: "+lose1838Count);
}

}
