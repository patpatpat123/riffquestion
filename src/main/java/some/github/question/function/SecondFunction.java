package some.github.question.function;

//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.messaging.handler.annotation.SendTo;
import reactor.core.publisher.Flux;
//import some.github.question.configuration.MultipleProcessor;
import some.github.question.model.Bar;
import some.github.question.model.Foo;

import java.util.function.Function;

//@EnableBinding(MultipleProcessor.class)
public class SecondFunction implements Function<Flux<Foo>, Flux<Bar>> {

    /**
     * Applies this function to the given argument.
     *
     * @param fooFlux the function argument
     * @return the function result
     */
    @Override
//    @StreamListener(MultipleProcessor.NUMBERTWO)
//    @SendTo(MultipleProcessor.NUMBERFOUR)
    public Flux<Bar> apply(Flux<Foo> fooFlux) {
        return fooFlux.map(oneFoo -> new Bar(oneFoo.getSomeFoo().replace("hello", "world")));
    }

}