package com.lvr.kdshop.pojo;

public class Orders {

    private Integer id;


    private String orderId;


    private String userId;

    private Integer goodId;


    private Integer addressId;


    private String payId;


    private String createAt;


    private Byte status;



    public Orders(Integer id, String orderId, String userId, Integer goodId, Integer addressId, String payId, String createAt, Byte status) {
        this.id = id;
        this.orderId = orderId;
        this.userId = userId;
        this.goodId = goodId;
        this.addressId = addressId;
        this.payId = payId;
        this.createAt = createAt;
        this.status = status;
    }

    public Orders() {
        super();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getOrderId() {
        return orderId;
    }


    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }


    public void setUserId(String userId) {
        this.userId = userId;
    }


    public Integer getGoodId() {
        return goodId;
    }


    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }


    public Integer getAddressId() {
        return addressId;
    }


    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }


    public String getPayId() {
        return payId;
    }


    public void setPayId(String payId) {
        this.payId = payId;
    }


    public String getCreateAt() {
        return createAt;
    }


    public void setCreateAt(String createAt) {
        this.createAt = createAt == null ? null : createAt.trim();
    }


    public Byte getStatus() {
        return status;
    }


    public void setStatus(Byte status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", userId=" + userId +
                ", goodId=" + goodId +
                ", addressId=" + addressId +
                ", payId='" + payId + '\'' +
                ", createAt='" + createAt + '\'' +
                ", status=" + status +
                '}';
    }
}