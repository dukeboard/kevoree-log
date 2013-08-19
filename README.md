kevoree-log
===========

Minimal and efficient logger library for the JVM

####This project aims at offering a very low overhead log library for intensive usage inside a JVM.

###Why performance of logging is so important ? 

By definition a logging library aims at offering a way to track execution step of a software, for debuggin, or simply to track execution history.
Logging library is intensively used in Java program without regarding the performance impact.
Logging activity can take up to 20 or 30% percent of the total execution time of a Java program.
This, because the IF statement to decide or not to print the message, cost by itself a method call or create a message String object which will be garbaged immeditely.

Martin Fowler in it's blog [Fowler Blog](http://martinfowler.com/articles/dipInTheWild.html) already speaks about this problem.
For example using an common SLF4J API can perform 70 method calls befor printing a simple message on the output stream.
Using a Logback backend make this stack call even deeper.

We believe that standard is important, and API like SLF4J is very important for production usage of code. 
However in many case, we aren't ready paid so this price (for example in Android application) because log performance has direct impact on user experience. 

This very death (to ?) simple library aims at offering a generic way to perfom log with a few overhead and ability to remove debug log at compile like any C++ application.

## Last version : 1

## How to use it : 

Simply include the dependency from Maven repository as

        <dependency>
            <groupId>org.kevoree.log</groupId>
            <artifactId>org.kevoree.log</artifactId>
            <version>REPLACE_LOG_VERSION</version>
        </dependency>
        
Then you can directly use it in your Java code :

    org.kevoree.Log.info("My important message");
    
or

    static import org.kevoree.Log;
    info("My important Message");
    
In addition you can use SLF4J lazy string formatting strategy (up to 5 arguments only) :

    info("Hello {} from {}",obj1,obj2);

##If you already use SLF4J API?

Can to seamless migrate from SLF4J , just include our compatibility layer without depend on SLF4J API (which is included).

        <dependency>
            <groupId>org.kevoree.log</groupId>
            <artifactId>org.kevoree.log.compat.slf4j</artifactId>
            <version>REPLACE_LOG_VERSION</version>
        </dependency>
        
Don't hesite to give us any feedback, or new idea to improve this API.

