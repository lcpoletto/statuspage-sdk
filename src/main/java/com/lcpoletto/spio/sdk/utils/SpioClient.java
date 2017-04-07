package com.lcpoletto.spio.sdk.utils;

import com.lcpoletto.spio.sdk.config.SpioObjectMapperProvider;
import com.lcpoletto.spio.sdk.filters.SpioClientRequestFilter;
import com.lcpoletto.spio.sdk.filters.SpioClientResponseFilter;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.Map;

/**
 * Created by poletto on 4/1/2017.
 */
public abstract class SpioClient implements Serializable {

    private static final String SPIO_API = "https://api.statuspage.io/v1";

    private static final Client CLIENT = createClient();

    private String pageId;
    private String path;

    // TODO: Try to use type inference for all methods below
    protected <T> T get(final String path, Class<T> responseType) {
        return target(path).request().get(responseType);
    }

    protected <T> T get(final String path, GenericType<T> responseType) {
        return target(path).request().get(responseType);
    }

    protected <T> T get(final String path, final Map<String, Object> queryParams, final GenericType<T> responseType) {
        WebTarget target = target(path);
        for (final Map.Entry<String, Object> entry : queryParams.entrySet()) {
            target = target.queryParam(entry.getKey(), entry.getValue());
        }
        return target.request().get(responseType);
    }

    protected <T> T post(final String path, T data, final Class<T> responseType) {
        final Entity<T> entity = Entity.entity(data, MediaType.APPLICATION_JSON_TYPE);
        return target(path).request().post(entity, responseType);
    }

    protected <T> T patch(final String path, T data, final Class<T> responseType) {
        final Entity<T> entity = Entity.entity(data, MediaType.APPLICATION_JSON_TYPE);
        return target(path).request().method("PATCH", entity, responseType);
    }

    protected Response delete(final String path) {
        return target(path).request().delete();
    }

    /*
     * PRIVATE METHODS
     */

    private static final Client createClient() {
        final ClientConfig config = new ClientConfig();
        config.register(SpioObjectMapperProvider.class);
        config.register(JacksonFeature.class);
        // Maybe we can use a header instead of this workaround
        config.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true);
        config.register(SpioClientRequestFilter.class);
        config.register(SpioClientResponseFilter.class);
        return ClientBuilder.newClient(config);
    }

    private static final WebTarget target(final String path) {
        return CLIENT.target(SPIO_API).path(path);
    }
}
