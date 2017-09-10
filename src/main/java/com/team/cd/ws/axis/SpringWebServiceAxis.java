package com.team.cd.ws.axis;

import java.util.Random;

import org.springframework.stereotype.Service;

//@Service("springWebService")
public class SpringWebServiceAxis {
	
	public String springHello(){  
        return "hello spring-axis2";   
    }  
      
    public int getAge(){  
        return new Random().nextInt(80);  
    }  
      
    public void update(){  
        System.out.println("update something..");  
    }  
}
