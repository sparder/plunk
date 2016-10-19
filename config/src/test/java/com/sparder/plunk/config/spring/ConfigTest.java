package com.sparder.plunk.config.spring; /**
 * 
 */

import com.sparder.plunk.config.ServiceConfig;
import com.sparder.plunk.config.ReferenceConfig;
import com.sparder.plunk.config.demo.DemoAction;
import com.sparder.plunk.config.demo.MyService;
import com.sparder.plunk.config.demo.MyServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author weimin.sun
 *
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class ConfigTest
{
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo-provider.xml","demo-consumer.xml");


	public static void main(String[] args)
	{
		ServiceConfig d = (ServiceConfig) context.getBean("myService");
		System.out.println(d);
		System.out.println(d.getVersion());
		System.out.println(d.getGroup());
		System.out.println(d.getDelay());
		System.out.println(d.getExecutes());
		System.out.println(d.getDeprecated());
		System.out.println(d.getRef());
		System.out.println(d.getInterfaceClass());
		System.out.println(d.getInterface());

		MyService e = (MyServiceImpl) context.getBean("demoService");
		System.out.println(e);
	}

	@Test
	public void tesServicetConfigClass() {
		ServiceConfig serviceConfig = (ServiceConfig) context.getBean("myService");
		try {

			assertNotNull(serviceConfig);
			assertEquals("0.1", serviceConfig.getVersion());
			assertEquals("domain", serviceConfig.getGroup());
			assertEquals(10, serviceConfig.getDelay().intValue());
			assertEquals(20, serviceConfig.getExecutes().intValue());
			assertFalse(serviceConfig.getDeprecated());
			assertNotNull(serviceConfig.getRef());
			assertNotNull(serviceConfig.getInterfaceClass());
			assertEquals("com.sparder.plunk.config.demo.MyService", serviceConfig.getInterface());
		} finally {

		}
	}
	@Test
	public void testServiceClass() {
		MyService service = (MyServiceImpl) context.getBean("demoService");
		try {

			assertNotNull(service);

		} finally {

		}
	}

	@Test
	public void testReferenceConfigClass() {
		ReferenceConfig referenceConfig = (ReferenceConfig) context.getBean("myConsumer");
		try {

			assertNotNull(referenceConfig);
			assertEquals("0.1", referenceConfig.getVersion());
			assertEquals("domain", referenceConfig.getGroup());
			assertEquals("10", referenceConfig.getReconnect());
			assertEquals("client", referenceConfig.getClient());
			assertEquals("http://www.sparder.com/plunk/demo", referenceConfig.getUrl());
			//assertNotNull(referenceConfig.getRef());
			assertNotNull(referenceConfig.getInterfaceClass());
			assertEquals("com.sparder.plunk.config.demo.MyService", referenceConfig.getInterface());
		} finally {

		}
	}

	@Test
	public void testActionClass() {
		DemoAction service = (DemoAction) context.getBean("demoAction");
		try {

			assertNotNull(service);

		} finally {

		}
	}
}

