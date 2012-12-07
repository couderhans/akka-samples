package com;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import be.anova.samples.akka.*;

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

    private PaymentConsumerActor paymentConsumerActor;

    @Before
    public void setUp() {
        paymentConsumerActor = (PaymentConsumerActor) applicationContext.getBean("paymentConsumerActor");

    }

    @DirtiesContext
    @Test
    public void testPaymentConsumerActor() {
        Assert.assertNotNull(paymentConsumerActor);
        //paymentConsumerActor.preStart();
    }
}
