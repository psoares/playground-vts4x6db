package myfunction;

import io.micronaut.function.executor.FunctionInitializer;
import io.micronaut.function.FunctionBean;
import javax.inject.*;
import java.io.IOException;
import java.util.function.Function;

@FunctionBean("myfunction")
public class MyfunctionFunction extends FunctionInitializer implements Function<Myfunction, Myfunction> {

    @Override
    public Myfunction apply(Myfunction msg) {
         return msg;
    }

    /**
     * This main method allows running the function as a CLI application using: echo '{}' | java -jar function.jar 
     * where the argument to echo is the JSON to be parsed.
     */
    public static void main(String...args) throws IOException {
        MyfunctionFunction function = new MyfunctionFunction();
        function.run(args, (context)-> function.apply(context.get(Myfunction.class)));
    }    
}

