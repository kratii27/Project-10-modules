package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.QueueListenerDTO;
import com.rays.form.QueueListenerForm;
import com.rays.service.QueueListenerServiceInt;

@RestController
@RequestMapping(value = "QueueListener")
public class QueueListenerCtl extends BaseCtl<QueueListenerDTO, QueueListenerServiceInt, QueueListenerForm> {
	
}