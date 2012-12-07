package be.anova.samples.akka;

import akka.camel.CamelMessage;
import akka.camel.javaapi.UntypedConsumerActor;



/**
 * Created with IntelliJ IDEA.
 * User: Hans Couder
 * Date: 12/5/12
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class PaymentConsumerActor extends UntypedConsumerActor {

    @Override
    public String getEndpointUri() {
        return "file:data/input/actor";
    }

    @Override
    public void onReceive(Object message) throws Exception {
        CamelMessage msg = (CamelMessage)message;
        String body = msg.getBodyAs(String.class, this.camelContext());
        System.out.println(String.format("received %s", body));
    }

}
