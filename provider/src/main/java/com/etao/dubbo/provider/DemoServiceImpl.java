package com.etao.dubbo.provider;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.rpc.RpcContext;
import com.etao.dubbo.api.DemoService;

/**
 * Hello world!
 *
 */
public class DemoServiceImpl implements DemoService
{
	@Override
	public String sayHello(String name) {
		System.out.println("consumer:[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "provider:Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
	}
}
