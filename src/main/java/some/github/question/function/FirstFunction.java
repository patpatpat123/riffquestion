package some.github.question.function;

import reactor.core.publisher.Flux;
import some.github.question.model.Bar;
import some.github.question.model.Foo;

import java.util.function.Function;

public class FirstFunction implements Function<Flux<Foo>, Flux<Bar>> {

    /**
     * Applies this function to the given argument.
     *
     * @param fooFlux the function argument
     * @return the function result
     */
    @Override
    public Flux<Bar> apply(Flux<Foo> fooFlux) {
        return fooFlux.map(oneFoo -> new Bar(oneFoo.getSomeFoo().toUpperCase()));
    }

}