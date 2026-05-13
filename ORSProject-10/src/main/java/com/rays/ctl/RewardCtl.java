package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.RewardDTO;
import com.rays.form.RewardForm;
import com.rays.service.RewardServiceInt;

@RestController
@RequestMapping(value = "Reward")
public class RewardCtl extends BaseCtl<RewardDTO, RewardServiceInt, RewardForm> {
	
}