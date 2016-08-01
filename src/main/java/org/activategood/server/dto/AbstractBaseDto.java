package org.activategood.server.dto;

import org.activategood.server.exception.MidTierException;

/**
 * Created by frwill on 8/1/2016.
 */
public class AbstractBaseDto extends AbstractExternalApiBaseDto {
    private static final long serialVersionUID = 1705471834551785673L;
    private boolean available = true;

    public String toJson() throws MidTierException {
        /** FIXME Fred: add code to jsonify */
        return null;
    }
}
