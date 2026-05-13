package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.DecryptionDTO;
import com.rays.form.DecryptionForm;
import com.rays.service.DecryptionServiceInt;

@RestController
@RequestMapping(value = "Decryption")
public class DecryptionCtl extends BaseCtl<DecryptionDTO, DecryptionServiceInt, DecryptionForm> {
	
}