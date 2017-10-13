package io.pivotal.microservices.pact.provider;

import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import com.reagroup.pact.provider.PactFile;
import org.junit.runner.RunWith;

/**
 * Created by arecicalov on 10/13/2017.
 */
@RunWith(PactRunner.class) // Say JUnit to run tests with custom Runner
@Provider("Foo_Provider") // Set up name of tested provider
@PactFile("file:target/test-classes/pacts-dependents/Foo_Consumer-Foo_Provider.json")
//@PactFolder("/target/test-classes/pacts-dependents/") // Point where to find pacts (See also section Pacts source in documentation)
public class ContractTest {

}
