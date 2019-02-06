package com.cybertek.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/feature"
//            glue = "com/cybertek/step_defs"
//            ,dryRun = false
//            ,tags = "@register"

    )
    public class CucumberRunner{

    }

