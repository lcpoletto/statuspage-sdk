package com.lcpoletto.spio.sdk.test;

import com.lcpoletto.spio.sdk.IncidentsClient;
import com.lcpoletto.spio.sdk.model.Incident;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by poletto on 4/1/2017.
 */
public class IncidentsClientTest {

    private static final IncidentsClient CLIENT = IncidentsClient.getInstance();
    private static final String PAGE_ID = "451tshvbfblx";

    @Test
    public void testGetAll() {
        final List<Incident> incidents = CLIENT.all(PAGE_ID);
        Assert.assertNotNull(incidents);
        Assert.assertNotEquals(0, incidents.size());
    }

    @Test
    public void testGetUnresolved() {
        final List<Incident> incidents = CLIENT.unresolved(PAGE_ID);
        Assert.assertNotNull(incidents);
        Assert.assertEquals(0, incidents.size());
    }

    @Test
    public void testGetScheduled() {
        final List<Incident> incidents = CLIENT.scheduled(PAGE_ID);
        Assert.assertNotNull(incidents);
        Assert.assertEquals(0, incidents.size());
    }

    @Test
    public void testQuery() {
        final List<Incident> incidents = CLIENT.search(PAGE_ID, "jenkins");
        Assert.assertNotNull(incidents);
        Assert.assertNotEquals(0, incidents.size());
    }
}
