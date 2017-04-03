package com.lcpoletto.spio.sdk.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lcpoletto.spio.sdk.config.SpioObjectMapperProvider;
import com.lcpoletto.spio.sdk.model.Page;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;

/**
 * Created by poletto on 3/31/2017.
 */
public class JacksonSerializerTest {

    @Test
    public void testSerialize() throws IOException {
        final SpioObjectMapperProvider provider = new SpioObjectMapperProvider();
        final ObjectMapper mapper = provider.getContext(getClass());
        Page page = new Page();
        page.setCreated(new Date());
        String result = mapper.writeValueAsString(page);
        System.out.println(result);
    }
}
