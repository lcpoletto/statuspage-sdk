package com.lcpoletto.spio.sdk;

import com.lcpoletto.spio.sdk.model.Incident;
import com.lcpoletto.spio.sdk.utils.SpioClient;

import javax.ws.rs.core.GenericType;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by poletto on 4/1/2017.
 */
public class IncidentsClient extends SpioClient {

    private static final String PATH = "/pages/%s/incidents%s.json";
    private static final IncidentsClient instance = new IncidentsClient();

    private IncidentsClient() {
        // avoids instantiation
    }

    public static final IncidentsClient getInstance() {
        return instance;
    }

    public List<Incident> all(final String pageId) {
        return get(pageId, "");
    }

    public List<Incident> unresolved(final String pageId) {
        return get(pageId, "/unresolved");
    }

    public List<Incident> scheduled(final String pageId) {
        return get(pageId, "/scheduled");
    }

    public List<Incident> search(final String pageId, final String query) {
        final String path = String.format(PATH, pageId, "");
        return get(path, Collections.singletonMap("q", query), new GenericType<List<Incident>>() {});
    }

    /*
     * PRIVATE METHODS
     */

    private List<Incident> get(final String pageId, final String subPath) {
        final String path = String.format(PATH, pageId, subPath);
        return get(path, new GenericType<List<Incident>>() {});
    }

}
