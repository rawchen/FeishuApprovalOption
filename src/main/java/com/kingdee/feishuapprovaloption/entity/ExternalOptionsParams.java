package com.kingdee.feishuapprovaloption.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 飞书审批外部数据请求参数
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class ExternalOptionsParams implements Serializable {

	private static final long serialVersionUID = -5750955826885475213L;

	@JsonProperty(value = "user_id")
	private String userId;

	@JsonProperty(value = "employee_id")
	private String employeeId;

	@JsonProperty(value = "token")
	private String token;

	@JsonProperty(value = "linkage_params")
	private JsonNode linkageParams;
}
