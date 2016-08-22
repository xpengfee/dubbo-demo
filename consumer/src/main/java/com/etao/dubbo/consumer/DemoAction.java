package com.etao.dubbo.consumer;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.etao.dubbo.api.DemoService;

/**
 * Hello world!
 *
 */
public class DemoAction {
    
    private DemoService demoService;

    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }

	public void start() throws Exception {
        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            try {
            	String hello = demoService.sayHello("xpworld" + i);
                System.out.println("xp[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Thread.sleep(2000);
        }
	}

}
