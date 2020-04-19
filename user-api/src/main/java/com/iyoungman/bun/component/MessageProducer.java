package com.iyoungman.bun.component;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Created by iyoungman on 2020-04-19.
 */

@EnableBinding(MessageProducer.WriteReviewSource.class)
public class MessageProducer {

    public interface WriteReviewSource {
        String writeReview = "write-review";

        @Output(writeReview)
        MessageChannel writeReview();
    }
}
