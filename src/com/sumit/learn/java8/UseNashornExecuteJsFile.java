package com.sumit.learn.java8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class UseNashornExecuteJsFile {

	public static void main(String[] args) {
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("nashorn");
		try {
			File scriptFile = new File("script/script.js");
			Reader reader = new FileReader(scriptFile);
			engine.eval(reader);
		} catch(IOException | ScriptException e) {
			e.printStackTrace();
		} 
		
		
	}

}
