/*
 * You have got a range of numbers between 1 to N, 
 * where one of the number is repeated. You need to write a 
 * program to find out the duplicate number.
 */

package com.java2novice.alan_algos;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unused")
public class DuplicateNumber {

	public static void main(String argv[]){
		int[] lst = {1, 4, 6, 4, 9};
		for (int i=0; i < lst.length; i++) {
			for (int j=i+1; j < lst.length; j++){
				if (lst[i] == lst[j]){
					System.out.println("found the dup num: "+lst[i]+" i= " +i+ " j= "+j);
					break;
				}
			}
			System.out.println("continue i = "+i);
		}
	}
}
