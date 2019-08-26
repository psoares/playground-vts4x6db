package myfunction;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class MyfunctionFunctionTest {

    @Inject
    MyfunctionClient client;

    @Test
    public void testFunction() throws Exception {
    	Myfunction body = new Myfunction();
    	body.setName("myfunction");
        assertEquals("myfunction", client.apply(body).blockingGet().getName());
    }
}
