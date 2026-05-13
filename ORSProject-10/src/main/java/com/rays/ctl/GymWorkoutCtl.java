package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.GymWorkoutDTO;
import com.rays.form.GymWorkoutForm;
import com.rays.service.GymWorkoutServiceInt;

@RestController
@RequestMapping(value = "GymWorkout")
public class GymWorkoutCtl extends BaseCtl<GymWorkoutDTO, GymWorkoutServiceInt, GymWorkoutForm> {
	
}