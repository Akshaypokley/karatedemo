package utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by akshay.pokley on 6/5/2018.
 */
public class Hooks {
/*
    Test Order Hooks*/

    @Before(order=1)
    public void beforeScenario(){
        System.out.println("This will run before the every Scenario");
    }
    @Before(order=0)
    public void beforeScenarioStart(){
        System.out.println("-----------------Start of Scenario-----------------");
    }


    @After(order=0)
    public void afterScenarioFinish(){
        System.out.println("-----------------End of Scenario-----------------");
    }
    @After(order=1)
    public void afterScenario(){
        System.out.println("This will run after the every Scenario");
    }










   /* @Before
    public void beforeScenario(){
        System.out.println("This will run before the every Scenario");
    }

    @After
    public void afterScenario(){
        System.out.println("This will run after the every Scenario");
    }

    @Before("@First,@Third")
    public void beforeFirst(){
        System.out.println("This will run only before the First Scenario");
    }

    @Before("@Second")
    public void beforeSecond(){
        System.out.println("This will run only before the Second Scenario");
    }

    @Before("@Third")
    public void beforeThird(){
        System.out.println("This will run only before the Third Scenario");
    }

    @After("@First")
    public void afterFirst(){
        System.out.println("This will run only after the First Scenario");
    }

    @After("@Second")
    public void afterSecond(){
        System.out.println("This will run only after the Second Scenario");
    }

    @After("@Third")
    public void afterThird(){
        System.out.println("This will run only after the Third Scenario");
    }*/
}
