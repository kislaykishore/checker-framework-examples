/**
 * 
 */
package org.kishore;

import javax.annotation.Nullable;

/**
 * @author kishore
 *
 */
public class RandomTime {
	
	public static void main(String []args){
		Long randomTime = getRandomTime();
		if(randomTime != null){
			Long doubleTime = randomTime * 2;
		}
	}
	
	static @Nullable Long getRandomTime(){
		long ms = System.currentTimeMillis();
		if((ms & 1) == 0){
			return ms;
		}
		else return null;
	}
}
