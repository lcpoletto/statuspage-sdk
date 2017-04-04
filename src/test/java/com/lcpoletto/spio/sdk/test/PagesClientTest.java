package com.lcpoletto.spio.sdk.test;

import com.lcpoletto.spio.sdk.PagesClient;
import com.lcpoletto.spio.sdk.model.Page;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by poletto on 4/1/2017.
 */
public class PagesClientTest {

    private static final PagesClient CLIENT = PagesClient.getInstance();
    private static final String PAGE_ID = "451tshvbfblx";

    @Test
    public void testGetPage() {
        final Page page = CLIENT.get(PAGE_ID);
        Assert.assertNotNull(page);
        Assert.assertEquals(page.getId(), PAGE_ID);
    }

    @Test
    public void testPatchPage() {
        final Page page = CLIENT.get(PAGE_ID);
        Assert.assertNotNull(page);
        Assert.assertEquals(page.getId(), PAGE_ID);

        page.setCity("New Hyde Park");
        final Page patched = CLIENT.patch(page);
        Assert.assertEquals(patched.getCity(), "New Hyde Park");
    }
}
