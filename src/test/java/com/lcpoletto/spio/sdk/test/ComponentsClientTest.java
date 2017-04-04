package com.lcpoletto.spio.sdk.test;

import com.lcpoletto.spio.sdk.ComponentsClient;
import com.lcpoletto.spio.sdk.model.Component;
import com.lcpoletto.spio.sdk.model.enums.ComponentStatus;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by poletto on 4/1/2017.
 */
public class ComponentsClientTest {

    private static final ComponentsClient CLIENT = ComponentsClient.getInstance();
    private static final String PAGE_ID = "451tshvbfblx";

    @Test
    public void testGetAllWithPageId() {
        final List<Component> components = CLIENT.get(PAGE_ID);
        Assert.assertNotNull(components);
        Assert.assertNotEquals(components.size(), 0);
        components.forEach(component -> {
            Assert.assertNotNull(component.getPageId());
        });
    }

    @Test
    public void testCreateComponent() {
        final Component component = new Component();
        component.setPageId(PAGE_ID);
        component.setDescription("Created from Java SDK");
        component.setName("From Java");
        component.setShowcase(false);
        final Component result = CLIENT.post(component);
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getId());
        Assert.assertNotEquals(result.getId(), "");
    }

    @Test
    public void testUpdateComponent() {
        final List<Component> components = CLIENT.get(PAGE_ID);
        Assert.assertNotNull(components);
        Assert.assertNotEquals(components.size(), 0);
        final Component component = components.get(0);
        component.setStatus(ComponentStatus.DEGRADED_PERFORMANCE);
        final Component result = CLIENT.patch(component);
        Assert.assertNotNull(result);
        Assert.assertEquals(result.getStatus(), ComponentStatus.DEGRADED_PERFORMANCE);
    }

    @Test
    public void testDeleteComponent() {
        final Component component = createComponent();
        final String createdId = component.getId();
        try {
            CLIENT.delete(component);
        } catch (Throwable t) {
            t.printStackTrace();
            Assert.fail("Delete should not throw any error.");
        }
        final List<Component> components = CLIENT.get(PAGE_ID);
        Assert.assertNotNull(components);
        Assert.assertNotEquals(components.size(), 0);
        components.forEach(found -> {
            Assert.assertNotEquals(found.getId(), createdId);
        });
    }

    /*
     * PRIVATE METHODS
     */

    private Component createComponent() {
        final Component component = new Component();
        component.setPageId(PAGE_ID);
        component.setDescription("Created from Java SDK");
        component.setName("From Java");
        component.setShowcase(false);
        return CLIENT.post(component);
    }
}
