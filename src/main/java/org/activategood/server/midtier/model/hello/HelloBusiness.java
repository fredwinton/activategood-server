package org.activategood.server.midtier.model.hello;

import org.activategood.server.midtier.model.AbstractBaseBusiness;

/**
 * This business object is just to display Hello World! to a user. The main goal is to demonstrate
 * the application and rest services are working.
 */
public class HelloBusiness extends AbstractBaseBusiness {
    private final long id;
    private final String content;

    public HelloBusiness(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
