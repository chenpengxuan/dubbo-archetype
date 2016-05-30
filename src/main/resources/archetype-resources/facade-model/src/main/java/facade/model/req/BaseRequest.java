/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package ${package}.facade.model.req;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import ${package}.facade.model.PrintFriendliness;

/**
 * Hello world!
 *
 */
public abstract class BaseRequest extends PrintFriendliness {

    private static final long serialVersionUID = -4848830183604183658L;

    private static Validator VALIDATOR = Validation.buildDefaultValidatorFactory().getValidator();

    /**
     * 客户端应用ID
     */
    private String appId;

    /**
     * 请求ID
     */
    private String requestId;

    public String getAppId() {
        return appId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void validate() {
        StringBuilder errorMsgs = new StringBuilder();
        Set<ConstraintViolation<BaseRequest>> violations = VALIDATOR.validate(this);
        if (violations != null && violations.size() > 0) {
            for (ConstraintViolation<BaseRequest> violation : violations) {
                errorMsgs.append(violation.getPropertyPath()).append(":").append(violation.getMessage()).append("|");
            }
            throw new IllegalArgumentException(errorMsgs.substring(0, errorMsgs.length() - 1));
        }
    }


    /**
     * 一般请求，requestId不强制必填
     * @return
     */
    public boolean requireRequestId( ) {
        return false;
    }

    /**
     * 有些老的.net系统的请求可能没有appId
     * @return
     */
    public boolean requireAppId( ) {
        return true;
    }
}
