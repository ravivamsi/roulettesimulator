/**
 * 
 */
package European;

import European.RandomNumberGenerator;

/**
 * @author vamsiravi
 *
 */
public class EuropeanSimulator {

	
	public void runSimulator(){
		
		RandomNumberGenerator rouletteNumberGenerator = new RandomNumberGenerator();
		
		
		for (Integer iteration = 0; iteration < 1000 ; iteration++){
			Integer rouletteNumberGenerated = rouletteNumberGenerator.europeanRouletteRandomNumberGenerator();
			if((rouletteNumberGenerated.intValue()>=1 && rouletteNumberGenerated.intValue()<=12) || (rouletteNumberGenerated.intValue()>=19 && rouletteNumberGenerated.intValue()<=36)){
				System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Win	|");	
			}else{
				System.out.println("|	Iteration: "+iteration+"	|"+"	Number: "+rouletteNumberGenerated+"	|"+"	Lose	|");
			}
			
			
		}
		
		
	}
	
	
	
	
}
