/**
 * 
 */
package European;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author vamsiravi
 *
 */
public class RestCallController {

	RandomNumberGenerator europeanRouletteNumberGenerator = new RandomNumberGenerator();
	
	@RequestMapping(value="roulette/european",method=RequestMethod.GET)
	public Integer getRandomRouletteNumber(){
		return europeanRouletteNumberGenerator.europeanRouletteRandomNumberGenerator();
	}
	
	@RequestMapping(value="roulette/european/{iterations}",method=RequestMethod.GET)
	public List<Integer> getRandomRouletteNumbers(@PathVariable("iterations") Integer iterations){
		List<Integer> integerList = new ArrayList<Integer>();
		for(Integer iteration=0; iteration < iterations; iteration++){
			integerList.add(europeanRouletteNumberGenerator.europeanRouletteRandomNumberGenerator());
		}
		return integerList;
	}
	
}
