package com.codinginterviewq1;

import java.util.HashMap;

public class ExpressionSum {

	public static void main(String[] args) {
		
	Expression[] exp1 = new Expression[10];
	Expression[] exp2 = new Expression[10];
	
	for (int i = 0; i <10; i++) {
		exp1[i] = new Expression();
		exp2[i] = new Expression();
		exp1[i].exponent = (double) i;
		exp1[i].coefficient = (double)i;
		exp2[i].exponent = (double) i;
		exp2[i].coefficient = (double)i;
	}

	System.out.println((sumExp(exp1, exp2)).entrySet());
	
	}
	
	public static HashMap<Double, Double> sumExp(Expression[] a, Expression[] b){
		

		//Expression[] sumexpr = new Expression[20];
		
		HashMap<Double, Double> sumexpr = new HashMap<Double, Double>();
		for (int i = 0; i < 10; i++) {
			
			if ( a[i].coefficient != 0.0) {
				sumexpr.put(a[i].exponent, a[i].coefficient);
			} 
				
		}
		
		for (int i = 0; i < 10; i++) {
			if (sumexpr.containsKey(b[i].exponent)){
				Double tempvalue = sumexpr.get(b[i].exponent) + b[i].coefficient;
				sumexpr.put(b[i].exponent, tempvalue);
			}
			else if (b[i].coefficient != 0 ){
				sumexpr.put(b[i].exponent, b[i].coefficient);
			}
			else{
				
			}
		}
		
		//Expression[] finalexpr = new Expression[20];
		return sumexpr;
	
	}
	

}


class Expression{
	
	public double coefficient;
	public double exponent;
	
}
