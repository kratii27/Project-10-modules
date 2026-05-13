package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_QUEUE_LISTENER")
public class QueueListenerDTO extends BaseDTO {

	@Column(name = "LISTENER_CODE", length = 50)
	private String listenerCode;
	
	@Column(name = "QUEUE_NAME", length = 50)
	private String queueName;
	
	@Column(name = "CONSUMER_GROUP", length = 50)
	private String consumerGroup;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getListenerCode() {
		return listenerCode;
	}
	public void setListenerCode(String listenerCode) {
		this.listenerCode = listenerCode;
	}
	public String getQueueName() {
		return queueName;
	}
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}
	public String getConsumerGroup() {
		return consumerGroup;
	}
	public void setConsumerGroup(String consumerGroup) {
		this.consumerGroup = consumerGroup;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return listenerCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "listenerCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return listenerCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Listener Code";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "QueueListener";
	}
}