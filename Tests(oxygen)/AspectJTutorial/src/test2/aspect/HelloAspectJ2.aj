package test2.aspect;

public aspect HelloAspectJ2 {
    pointcut callSayHello(): call(* test.HelloAspectJDemo.sayHello());
    
    after() : callSayHello()  {
        System.out.println("AFTER TEST 2");
    }
}
