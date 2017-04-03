package com.lcpoletto.spio.sdk;

import com.lcpoletto.spio.sdk.model.Component;
import com.lcpoletto.spio.sdk.utils.SpioClient;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import java.util.List;

/**
 * Created by poletto on 3/31/2017.
 */
public class ComponentsClient extends SpioClient {

    private static final String PATH = "/pages/%s/components%s.json";
    private static final ComponentsClient instance = new ComponentsClient();

    private ComponentsClient() {
        // avoids instantiation
    }

    public static final ComponentsClient getInstance() {
        return instance;
    }

    public List<Component> get(final String pageId) {
        return get(getListPath(pageId), new GenericType<List<Component>>() {});
    }

    public Component post(final Component component) {
        return post(getListPath(component), component, Component.class);
    }

    public Component patch(final Component component) {
        return patch(getDetailPath(component), component, Component.class);
    }

    public void delete(final Component component) {
        // TODO: Do something with response codes?
        delete(getDetailPath(component));
    }

    /*
     * PRIVATE METHODS
     */

    private final String getDetailPath(final Component component) {
        return String.format(PATH, component.getPageId(), "/" + component.getId());
    }

    private final String getListPath(final Component component) {
        return getListPath(component.getPageId());
    }

    private final String getListPath(final String pageId) {
        return String.format(PATH, pageId, "");
    }
}
