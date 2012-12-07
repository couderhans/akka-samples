package be.anova.samples.akka.spring;

import akka.actor.Actor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.osgi.ActorSystemActivator;
import org.osgi.framework.BundleContext;


public class Activator extends ActorSystemActivator {

    @Override
    public void configure(BundleContext bundleContext, ActorSystem actorSystem) {

        this.registerService(bundleContext, actorSystem);
        ActorRef actorRef =  actorSystem.actorOf(new Props(),"myActor");

    }

}
