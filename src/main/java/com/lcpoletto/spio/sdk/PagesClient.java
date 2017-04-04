package com.lcpoletto.spio.sdk;

import com.lcpoletto.spio.sdk.model.Page;
import com.lcpoletto.spio.sdk.utils.SpioClient;

/**
 * Created by poletto on 3/31/2017.
 */
public class PagesClient extends SpioClient {

    private static final String PATH = "/pages/%s.json";

    private static final PagesClient instance = new PagesClient();

    private PagesClient() {
        // avoids instantiation
    }

    public static PagesClient getInstance() {
        return instance;
    }

    public Page get(final String id) {
        return get(String.format(PATH, id), Page.class);
    }

    /**
     * Updates a page, only mutable fields can be changed, details: http://doers.statuspage.io/api/v1/page_profile/.
     * @param page page to be updated
     * @return updated page
     */
    public Page patch(final Page page) {
        return patch(String.format(PATH, page.getId()), page, Page.class);
    }
}
