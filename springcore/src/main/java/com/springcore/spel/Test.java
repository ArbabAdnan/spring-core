package com.springcore.spel;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
	
	Demo demo	=(Demo)con.getBean("demo");
	
	System.out.println(demo);
	
	SpelExpressionParser temp =	new SpelExpressionParser();
	
	org.springframework.expression.Expression expression	=  temp.parseExpression("22+44");
	
	System.out.println(expression.getValue());
	
	}

}
