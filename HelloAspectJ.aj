package test;

public aspect HelloAspectJ {
    pointcut callSayHello(): call(* HelloAspectJDemo.sayHello());
    
    before() : callSayHello() {
        System.out.println("Before call sayHello");
    }
 
    // Advice "after returning".
    after() returning (Object retObj): callSayHello() {
        System.out.println("Returned normally with " + retObj);
    }
 
    // Advice "after throwing".
    after() throwing (Exception e): callSayHello() {
        System.out.println("Threw an exception: " + e);
    }
 
    // Advice "after returning" + "after throwing".
    after() : callSayHello()  {
        System.out.println("Returned or threw an Exception");
    }
}
