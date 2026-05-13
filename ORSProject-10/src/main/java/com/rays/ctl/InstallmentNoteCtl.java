package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.InstallmentNoteDTO;
import com.rays.form.InstallmentNoteForm;
import com.rays.service.InstallmentNoteServiceInt;

@RestController
@RequestMapping(value = "InstallmentNote")
public class InstallmentNoteCtl extends BaseCtl<InstallmentNoteDTO, InstallmentNoteServiceInt, InstallmentNoteForm> {
	
}