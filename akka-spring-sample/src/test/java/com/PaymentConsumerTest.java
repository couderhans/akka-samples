package com;


import akka.osgi.ActorSystemActivator;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: Hans Couder
 * Date: 12/6/12
 * Time: 3:24 PM
 * To change this template use File | Settings | File Templates.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =
        {
                "classpath:META-INF/spring/bundle-context.xml"
        })
public class PaymentConsumerTest extends AbstractJUnit4SpringContextTests {

    private ActorSystemActivator actorSystemActivator;

    @Before
    public void setUp() {
        actorSystemActivator = (ActorSystemActivator) applicationContext.getBean("activator");

    }

    @DirtiesContext
    @Test
    public void testPaymentConsumerActor() {
        Assert.assertNotNull(actorSystemActivator);

    }
}
