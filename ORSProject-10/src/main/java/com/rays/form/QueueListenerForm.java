package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.QueueListenerDTO;

public class QueueListenerForm extends BaseForm<QueueListenerDTO> {

	@NotEmpty(message = "Listener Code is Required")
	private String listenerCode;
	
	@NotEmpty(message = "Queue Name is Required")
	private String queueName;
	
	@NotEmpty(message = "Consumer Group is Required")
	private String consumerGroup;
	
	@NotEmpty(message = "Status is Required")
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
	public QueueListenerDTO getDto() {
		QueueListenerDTO dto = initDTO(new QueueListenerDTO());
		dto.setListenerCode(listenerCode);
		dto.setQueueName(queueName);
		dto.setConsumerGroup(consumerGroup);
		dto.setStatus(status);
		return dto;
	}
}