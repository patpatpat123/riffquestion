//package some.github.question.configuration;
//
//import org.springframework.cloud.stream.annotation.Input;
//import org.springframework.cloud.stream.annotation.Output;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.SubscribableChannel;
//
//@Configuration
//public interface MultipleProcessor {
//
//    String NUMBERONE = "numberone";
//    String NUMBERTWO = "numbertwo";
//    String NUMBERTHREE = "numberthree";
//    String NUMBERFOUR = "numberfour";
//
//    @Bean
//    @Input(NUMBERONE)
//    SubscribableChannel binding1();
//
//    @Bean
//    @Input(NUMBERTWO)
//    SubscribableChannel binding2();
//
//    @Bean
//    @Output(NUMBERTHREE)
//    MessageChannel singleOutput();
//
//    @Bean
//    @Output(NUMBERFOUR)
//    MessageChannel anotherOutput();
//
//}
