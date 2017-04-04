package com.lcpoletto.spio.sdk.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import java.text.DateFormat;

/**
 * Created by poletto on 3/31/2017.
 */
@Provider
public class SpioObjectMapperProvider implements ContextResolver<ObjectMapper> {

    private static final DateFormat ISO8601_FORMAT = new ISO8601DateFormat();

    private final ObjectMapper spioObjectMapper;

    public SpioObjectMapperProvider() {
        this.spioObjectMapper = createSpioMapper();
    }

    @Override
    public ObjectMapper getContext(Class<?> type) {
        return spioObjectMapper;
    }

    /*
     * PRIVATE METHODS
     */

    private static ObjectMapper createSpioMapper() {
        final ObjectMapper result = new ObjectMapper();
        result.registerModule(new JaxbAnnotationModule());
        result.enable(SerializationFeature.INDENT_OUTPUT);
        result.enable(SerializationFeature.WRAP_ROOT_VALUE);
        result.setDateFormat(ISO8601_FORMAT);
        result.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        return result;
    }
}
