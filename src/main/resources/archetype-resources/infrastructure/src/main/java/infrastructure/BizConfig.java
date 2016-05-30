/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package ${package}.infrastructure;

import org.springframework.stereotype.Component;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;

/**
 * 由Disconf托管，变更能立即生效的业务配置
 * 
 * @author tuwenjie
 *
 */
@Component
@DisconfFile(fileName = "biz.properties")
public class BizConfig {

    // 商品补贴是否开启 true-开启 false-关闭
    private boolean subsidyEnabled;
    // 资金单据服务URL
    private String invoiceApiUrl;
    // 身份证服务URL
    private String idCardApiUrl;
    // 风控服务URL
    private String riskControlApiUrl;
    // 同步订单服务URL
    private String orderSyncUrl;


    @DisconfFileItem(name = "subsidyEnabled")
    public boolean isSubsidyEnabled() {
        return subsidyEnabled;
    }

    public void setSubsidyEnabled(boolean subsidyEnabled) {
        this.subsidyEnabled = subsidyEnabled;
    }

    @DisconfFileItem(name = "invoiceApiUrl")
    public String getInvoiceApiUrl() {
        return invoiceApiUrl;
    }

    public void setInvoiceApiUrl(String invoiceApiUrl) {
        this.invoiceApiUrl = invoiceApiUrl;
    }

    @DisconfFileItem(name = "idCardApiUrl")
    public String getIdCardApiUrl() {
        return idCardApiUrl;
    }

    public void setIdCardApiUrl(String idCardApiUrl) {
        this.idCardApiUrl = idCardApiUrl;
    }

    @DisconfFileItem(name = "riskControlApiUrl")
    public String getRiskControlApiUrl() {
        return riskControlApiUrl;
    }

    public void setRiskControlApiUrl(String riskControlApiUrl) {
        this.riskControlApiUrl = riskControlApiUrl;
    }

    @DisconfFileItem(name = "orderSyncUrl")
    public String getOrderSyncUrl() {
        return orderSyncUrl;
    }

    public void setOrderSyncUrl(String orderSyncUrl) {
        this.orderSyncUrl = orderSyncUrl;
    }
}
