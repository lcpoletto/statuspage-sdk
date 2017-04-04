package com.lcpoletto.spio.sdk.filters;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * <p>
 * Client response filter which will read error messages from response entity bodies. Statuspage.io is sending error
 * messages on response bodies and passing weird statuses codes back, for instance, when you send more data than it's
 * expecting it will send back a 403 forbidden with an error message saying you sent more fields.
 * </p>
 *
 * @author Luis Carlos Poletto
 */
@Provider
public class SpioClientResponseFilter implements ClientResponseFilter {

    @Override
    public void filter(final ClientRequestContext requestContext, final ClientResponseContext responseContext) throws IOException {
        if (responseContext.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            // if it's not on the OK family there might be some error
            if (responseContext.hasEntity()) {
                final String errorMessage = readErrorMessage(responseContext.getEntityStream());
                throw new WebApplicationException(errorMessage, responseContext.getStatus());
            }
        }
    }

    private String readErrorMessage(final InputStream entityStream) {
        return new Scanner(entityStream, "UTF-8").useDelimiter("\\A").next();
    }
}
