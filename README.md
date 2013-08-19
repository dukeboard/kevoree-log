kevoree-log
===========

Minimal and efficient logger library for the JVM

##The project aims at offering a very low overhead log library for intensive usage inside a JVM.

#Why performance of logging is so important ? 

By definition a logging library aims at offering a way to track execution step of a software, for debuggin, or simply to track execution history.
Logging library is intensively used in Java program without regarding the impormance impact.
As a result, logging activity can take 20 or 30% percent of execution of a Java program, simply because the IF to decide or not to print the message cost by itself a call or  create a message String object garbaged immeditely.

Martin Fowler in it's blog [Fowler Blog](http://martinfowler.com/articles/dipInTheWild.html) already speak about this issue.
For example using an common SLF4J API can perform 70 method call befor printing a simple message. 

We believe that standard is important , and API like SLF4J is very important for production usage of code. However in many case we don't can to paid so much (for example in Android application) because log performance has direct impact on user experience. 

This very death simple library aims at offering a generic way to perfom clean log without a full overhead of a standard API like SLF4J.


# Last version : 1

# How to use it : 

Simply include the dependency from Maven repository as

        <dependency>
            <groupId>org.kevoree.log</groupId>
            <artifactId>org.kevoree.log</artifactId>
            <version>${project.version}</version>
        </dependency>
        
Then you can directly use it in your Java code :

    org.kevoree.Log.info("My important message");
    
or

    static import org.kevoree.Log;
    info("My important Message");
    
In addition you can use SLF4J lazy string formatting strategy (up to 5 arguments only) :

    info("Hello {} from {}",obj1,obj2);

