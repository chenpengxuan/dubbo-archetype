/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package ${package}.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * 
 * @author tuwenjie
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContextDubboProviderTest.xml"})
public class WithDubboProviderBaseTest extends BaseTest {
	
	@Test
	public void testLoad() throws IOException {
		System.out.println("Spring start up!");
		System.in.read();
	}
}
