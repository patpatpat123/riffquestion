//package some.github.question.configuration;
//
//import org.springframework.integration.channel.DirectChannel;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.SubscribableChannel;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MultipleProcessorImpl implements MultipleProcessor {
//
//    public SubscribableChannel binding1() {
//        return new DirectChannel();
//    }
//
//    public SubscribableChannel binding2() {
//        return new DirectChannel();
//    }
//
//    public MessageChannel singleOutput() {
//        return new DirectChannel();
//    }
//
//    public MessageChannel anotherOutput() {
//        return new DirectChannel();
//    }
//
//}
