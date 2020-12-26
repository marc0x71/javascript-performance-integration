# Performance test of JS engine in Java

Someone could explain why Nashorn must be removed from JDK?!?!?! :worried: 
````
Starting...
Warning: Nashorn engine is planned to be removed from a future JDK release
1. -----
org.codehaus.groovy.jsr223.GroovyScriptEngineImpl  - 2475 ms
jdk.nashorn.api.scripting.NashornScriptEngine      - 1108 ms
com.oracle.truffle.js.scriptengine.GraalJSScriptEn - 3368 ms
2. -----
org.codehaus.groovy.jsr223.GroovyScriptEngineImpl  - 1456 ms
jdk.nashorn.api.scripting.NashornScriptEngine      - 544 ms
com.oracle.truffle.js.scriptengine.GraalJSScriptEn - 2639 ms
3. -----
org.codehaus.groovy.jsr223.GroovyScriptEngineImpl  - 1476 ms
jdk.nashorn.api.scripting.NashornScriptEngine      - 552 ms
com.oracle.truffle.js.scriptengine.GraalJSScriptEn - 2635 ms
4. -----
org.codehaus.groovy.jsr223.GroovyScriptEngineImpl  - 1494 ms
jdk.nashorn.api.scripting.NashornScriptEngine      - 547 ms
com.oracle.truffle.js.scriptengine.GraalJSScriptEn - 2644 ms
5. -----
org.codehaus.groovy.jsr223.GroovyScriptEngineImpl  - 1509 ms
jdk.nashorn.api.scripting.NashornScriptEngine      - 544 ms
com.oracle.truffle.js.scriptengine.GraalJSScriptEn - 2629 ms
```