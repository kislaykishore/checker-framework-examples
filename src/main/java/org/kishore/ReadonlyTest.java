/**
 * 
 */
package org.kishore;

import org.checkerframework.checker.igj.qual.ReadOnly;


/**
 * @author kishore
 *
 */
public class ReadonlyTest {
	public static void main(String [] args){
		@ReadOnly String str = "Hello, readonly";
		str = str + str;
	}

}
