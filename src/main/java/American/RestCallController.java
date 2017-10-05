/**
 * 
 */
package American;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import American.RandomNumberGenerator;

/**
 * @author vamsiravi
 *
 */


@RestController
public class RestCallController {

	RandomNumberGenerator americanRouletteNumberGenerator = new RandomNumberGenerator();
	
	@RequestMapping(value="roulette/american",method=RequestMethod.GET)
	public Integer getRandomRouletteNumberAndDetailsOfTheNumber(){
		return americanRouletteNumberGenerator.americanRouletteRandomNumberGenerator();
	}
	
	@RequestMapping(value="roulette/american/{iterations}",method=RequestMethod.GET)
	public List<Integer> getRandomRouletteNumbersAndTheirDetails(@PathVariable("iterations") Integer iterations){
		List<Integer> integerList = new ArrayList<Integer>();
		for(Integer iteration=0; iteration < iterations; iteration++){
			integerList.add(americanRouletteNumberGenerator.americanRouletteRandomNumberGenerator());
		}
		return integerList;
	}
	
}
