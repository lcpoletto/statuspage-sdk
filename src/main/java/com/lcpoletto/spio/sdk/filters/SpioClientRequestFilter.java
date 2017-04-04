package com.lcpoletto.spio.sdk.filters;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * Created by poletto on 3/31/2017.
 */
@Provider
public class SpioClientRequestFilter implements ClientRequestFilter {

    @Override
    public void filter(final ClientRequestContext requestContext) throws IOException {
        // request.header("X-HTTP-Method-Override", "PATCH");
        requestContext.getHeaders().add("Authorization", "OAuth 15e39f65-8d2f-42e7-bc8a-144c79ebe0b6");
    }
}
