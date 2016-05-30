/**
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *
 * All rights reserved.
 */
package ${package}.facade.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

/**
 * @author tuwenjie 2016年5月20日 上午10:53:18
 *
 */
@Component("warmUpResource")
@Path("")
public class WarmUpResourceImpl implements WarmUpResource {

    /*
     * (non-Javadoc)
     * 
     * @see com.ymatou.tradeservice.facade.rest.WarmUpResource#warmUp()
     */
    @Override
    @GET
    @Path("/{warmup:(?i:warmup)}")
    @Produces({MediaType.TEXT_PLAIN})
    public String warmUp() {
        return "ok";
    }

}
