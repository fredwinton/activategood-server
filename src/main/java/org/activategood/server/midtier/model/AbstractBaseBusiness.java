package org.activategood.server.midtier.model;

/**
 * All ActivateGood business models should inherit from this base business class.
 */
public class AbstractBaseBusiness {

    private boolean available = true;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
