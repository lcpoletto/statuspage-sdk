package com.lcpoletto.spio.sdk.test;

import com.lcpoletto.spio.sdk.SubscriberClient;
import com.lcpoletto.spio.sdk.model.Incident;
import com.lcpoletto.spio.sdk.model.Subscriber;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by poletto on 4/8/2017.
 */
public class SubscriberClientTest {

    private static final SubscriberClient CLIENT = SubscriberClient.getInstance();
    private static final String PAGE_ID = "451tshvbfblx";

    @Test
    public void testGetAll() {
        final List<Subscriber> subscribers = CLIENT.get(PAGE_ID);
        Assert.assertNotNull(subscribers);
        Assert.assertEquals(0, subscribers.size());
    }
}
