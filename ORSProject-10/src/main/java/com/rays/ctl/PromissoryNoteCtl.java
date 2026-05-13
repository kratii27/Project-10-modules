package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.PromissoryNoteDTO;
import com.rays.form.PromissoryNoteForm;
import com.rays.service.PromissoryNoteServiceInt;

@RestController
@RequestMapping(value = "PromissoryNote")
public class PromissoryNoteCtl extends BaseCtl<PromissoryNoteDTO, PromissoryNoteServiceInt, PromissoryNoteForm> {
	
}