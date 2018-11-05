package com.edureka.wallet.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class PaymentTransactionDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1181258624771780531L;

	private Long orderId;

	private String pgTransactionId;

	private Integer nwookStatusId;

	private Integer pgId;

	private Integer channelId;

	private Long userId;

	private String userClientId;

	private String spaceClientId;

	private String emailId;

	private Timestamp createdOn;

	private Timestamp modifiedOn;

	private String method;

	private String type;

	private Float amount;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getPgTransactionId() {
		return pgTransactionId;
	}

	public void setPgTransactionId(String pgTransactionId) {
		this.pgTransactionId = pgTransactionId;
	}

	public Integer getNwookStatusId() {
		return nwookStatusId;
	}

	public void setNwookStatusId(Integer nwookStatusId) {
		this.nwookStatusId = nwookStatusId;
	}

	public Integer getPgId() {
		return pgId;
	}

	public void setPgId(Integer pgId) {
		this.pgId = pgId;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserClientId() {
		return userClientId;
	}

	public void setUserClientId(String userClientId) {
		this.userClientId = userClientId;
	}

	public String getSpaceClientId() {
		return spaceClientId;
	}

	public void setSpaceClientId(String spaceClientId) {
		this.spaceClientId = spaceClientId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}
}
