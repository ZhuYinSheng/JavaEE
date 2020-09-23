package club.banyuan.bill.entity;

import java.io.Serializable;

/**
 * bill
 * @author 
 */
public class Bill implements Serializable {
    /**
     * 账单编号
     */
    private Integer id;

    /**
     * 供应商名称
     */
    private String providerName;

    private Integer providerId;

    /**
     * 商品描述
     */
    private String product;

    /**
     * 交易金额
     */
    private Double money;

    /**
     * 是否付款
     */
    private Integer isPay;

    /**
     * 账单时间
     */
    private String updateTime;

    /**
     * 付款描述
     */
    private String isPayStr;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsPayStr() {
        return isPayStr;
    }

    public void setIsPayStr(String isPayStr) {
        this.isPayStr = isPayStr;
    }
}