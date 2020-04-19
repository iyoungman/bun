package com.iyoungman.bun.component;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by iyoungman on 2020-04-19.
 */

@EnableBinding(MessageConsumer.writeReviewSink.class)
public class MessageConsumer {

    @StreamListener(writeReviewSink.writeReview)
    public void writeReviewHandler(String message) {

        //add news point service logic
        System.out.println("add service : " + message);
    }


    public interface writeReviewSink {
        String writeReview = "write-review";

        @Input(writeReview)
        SubscribableChannel writeReviewListener();
    }
}
