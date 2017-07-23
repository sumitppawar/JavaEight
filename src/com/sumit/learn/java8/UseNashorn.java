package com.sumit.learn.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author sumit
 * Nashorn javascript engine newly added in java 8 , before it there was Rhino engine
 * 
 * How to open Nashorn console
 * Ans. jjs (command)
 * 
 */
public class UseNashorn {

	public static void main(String[] args) {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");
		
		String script = "var welcome = 'Welcome javascript world';" 
				+ "welcome;";
		try {
			String result = (String) scriptEngine.eval(script);
			System.out.println(result);
		} catch (ScriptException e) {
			System.out.println("There was an error while executing javascript.");
			e.printStackTrace();
		}
	}
}
