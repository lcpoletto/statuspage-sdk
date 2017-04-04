package com.lcpoletto.spio.sdk.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lcpoletto.spio.sdk.config.SpioObjectMapperProvider;
import com.lcpoletto.spio.sdk.model.Component;
import com.lcpoletto.spio.sdk.model.Page;
import com.lcpoletto.spio.sdk.model.enums.ComponentStatus;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;

/**
 * Created by poletto on 3/31/2017.
 */
public class SerializerTest {

    private static final ObjectMapper MAPPER = new SpioObjectMapperProvider().getContext(SerializerTest.class);

    @Test
    public void testSerialize() throws IOException {
        final Page page = new Page();
        page.setCreated(new Date());
        final String result = MAPPER.writeValueAsString(page);
        System.out.println(result);
    }

    @Test
    public void testIgnoreSerializationProperties() throws IOException {
        final Component component = new Component();
        component.setPageId("pageidvalue");
        component.setName("namevalue");
        component.setDescription("descriptionvalue");
        component.setCreated(new Date());
        component.setGroupId("groupidvalue");
        component.setId("idvalue");
        component.setPosition(12);
        component.setShowcase(true);
        component.setStatus(ComponentStatus.MAJOR_OUTAGE);
        component.setUpdated(new Date());
        final String result = MAPPER.writeValueAsString(component);
        System.out.println(result);
    }
}
