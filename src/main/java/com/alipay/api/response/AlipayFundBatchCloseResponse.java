package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.batch.close response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-31 16:27:44
 */
public class AlipayFundBatchCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6174798388398616664L;

	/** 
	 * 支付宝内部的批次ID
	 */
	@ApiField("batch_trans_id")
	private String batchTransId;

	/** 
	 * DISUSE：批次废弃
	 */
	@ApiField("status")
	private String status;

	public void setBatchTransId(String batchTransId) {
		this.batchTransId = batchTransId;
	}
	public String getBatchTransId( ) {
		return this.batchTransId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
