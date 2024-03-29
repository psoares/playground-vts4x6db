package myfunction;

import io.micronaut.function.client.FunctionClient;
import io.micronaut.http.annotation.Body;
import io.reactivex.Single;
import javax.inject.Named;

@FunctionClient
public interface MyfunctionClient {

    @Named("myfunction")
    Single<Myfunction> apply(@Body Myfunction body);

}
