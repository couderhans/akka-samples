package be.anova.samples.akka.blueprint;

import akka.actor.Actor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.osgi.ActorSystemActivator;
import org.osgi.framework.BundleContext;

/**
 * Created with IntelliJ IDEA.
 * User: ergoproxy
 * Date: 12/7/12
 * Time: 2:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Activator extends ActorSystemActivator {

    @Override
    public void configure(BundleContext bundleContext, ActorSystem actorSystem) {
        this.registerService(bundleContext,actorSystem);
        ActorRef myActor = null;
        myActor = actorSystem.actorOf(new Props(),"myActor");

    }
}
