package com.cc.java.birds;

import com.cc.java.interfaces.Flyable;
import com.cc.java.interfaces.IFeathers;

public class Bird implements Flyable,IFeathers{

    @Override
    public String fly() {
      

        return  "I' can fly at 20mph!";
    }

    @Override
    public String hasFeathers() {
      
        return "I'm a Bird , Ihave feathers!";
    }


    
}
