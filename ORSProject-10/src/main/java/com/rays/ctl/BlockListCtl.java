package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.BlockListDTO;
import com.rays.form.BlockListForm;
import com.rays.service.BlockListServiceInt;

@RestController
@RequestMapping(value = "BlockList")
public class BlockListCtl extends BaseCtl<BlockListDTO, BlockListServiceInt, BlockListForm> {
	
}