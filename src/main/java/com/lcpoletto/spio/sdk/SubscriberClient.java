package com.lcpoletto.spio.sdk;

import com.lcpoletto.spio.sdk.model.Subscriber;
import com.lcpoletto.spio.sdk.utils.SpioClient;

import javax.ws.rs.core.GenericType;
import java.util.List;
import java.util.Objects;

/**
 * Created by poletto on 4/8/2017.
 */
public class SubscriberClient extends SpioClient {

    private static final String PATH = "/pages/%s/subscribers%s.json";
    private static final SubscriberClient instance = new SubscriberClient();

    private SubscriberClient() {
        // Avoids instantiation
    }

    public static final SubscriberClient getInstance() {
        return instance;
    }

    public List<Subscriber> get(final String pageId) {
        return get(getListPath(pageId), new GenericType<List<Subscriber>>() {});
    }

    public List<Subscriber> get(final String pageId, final String incidentId) {
        return get(getListPath(pageId, incidentId), new GenericType<List<Subscriber>>() {});
    }

    /*
     * PRIVATE METHODS
     */
    private String getListPath(final String pageId) {
        return getDetailPath(pageId, "");
    }

    private String getListPath(final String pageId, final String incidentId) {
        return getDetailPath(pageId, incidentId, "");
    }

    private String getDetailPath(final String pageId, final String subscriberId) {
        return getDetailPath(pageId, null, subscriberId);
    }

    private String getDetailPath(final String pageId, final String incidentId, final String subscriberId) {
        String intermediate = pageId;
        if (incidentId != null) {
            intermediate = String.format("%s/incidents/%s", pageId, incidentId);
        }
        return String.format(PATH, intermediate, subscriberId);
    }




}
