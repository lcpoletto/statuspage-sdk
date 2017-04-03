package com.lcpoletto.spio.sdk.test;

import com.lcpoletto.spio.sdk.PagesClient;
import com.lcpoletto.spio.sdk.model.Page;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by poletto on 4/1/2017.
 */
public class PagesClientTest {

    @Test
    public void testGetPage() {
        final Page page = PagesClient.getInstance().get("451tshvbfblx");
        Assert.assertNotNull(page);
        Assert.assertEquals(page.getId(), "451tshvbfblx");
    }
}
