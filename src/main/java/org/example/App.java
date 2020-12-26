package org.example;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class App {
    public static final int ITERATION = 100_000;

    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager factory = new ScriptEngineManager();

        System.out.println("Starting...");

        // groovy
        ScriptEngine engine = factory.getEngineByName("groovy");

        // nashorn
        ScriptEngine nashornjs = new ScriptEngineManager().getEngineByName("nashorn");

        // graal.js
        ScriptEngine graaljs = new ScriptEngineManager().getEngineByName("graal.js");

        for (int i = 0; i < 5; i++) {
            System.out.println((1 + i) + ". -----");
            perfTest("groovy", engine);
            perfTest("nashornjs", nashornjs);
            perfTest("graaljs", graaljs);
        }
    }

    private static void perfTest(String name, ScriptEngine engine) throws ScriptException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATION; i++) {
            Integer sum = (Integer) engine.eval("sum=0; for(i=1;i<100;i++) sum+=i; sum");
            assertEquals(4950, sum);
        }
        long elapsed = System.currentTimeMillis() - start;
        System.out.println(String.format("%-50.50s - %d ms", engine.getClass().getName(), elapsed ));
    }
}
