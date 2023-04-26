package com.kingdee.feishuapprovaloption.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class ApprovalSelectOutOptions {

	private List<ApprovalSelectOutField> options;

}
