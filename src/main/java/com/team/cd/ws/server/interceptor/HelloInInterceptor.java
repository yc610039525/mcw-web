package com.team.cd.ws.server.interceptor;


import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class HelloInInterceptor extends AbstractPhaseInterceptor<Message> {  
	  
    public HelloInInterceptor(String phase) {  
        super(phase);  
    }  
      
    public HelloInInterceptor() {  
        super(Phase.PROTOCOL);  
    }  
  
    public void handleMessage(Message message) throws Fault {  
        System.out.println("*********In****Helloworld******");  
    }  
  
}  