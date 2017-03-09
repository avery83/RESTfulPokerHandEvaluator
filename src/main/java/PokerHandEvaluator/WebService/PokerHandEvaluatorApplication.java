package PokerHandEvaluator.WebService;

import PokerHandEvaluator.WebService.PokerHandEvaluator;
import PokerHandEvaluator.evaluator.Evaluator;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jason Avery on 10/26/16.
 */
@ApplicationPath("/api")
public class PokerHandEvaluatorApplication extends Application {
    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(PokerHandEvaluator.class );
        return h;
    }
}
