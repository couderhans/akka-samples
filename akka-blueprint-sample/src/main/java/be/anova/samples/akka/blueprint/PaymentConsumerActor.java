package be.anova.samples.akka.blueprint;

import akka.camel.CamelMessage;
import akka.camel.javaapi.UntypedConsumerActor;


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

