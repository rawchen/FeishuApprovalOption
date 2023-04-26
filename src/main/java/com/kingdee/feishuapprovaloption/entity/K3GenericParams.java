package com.kingdee.feishuapprovaloption.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class K3GenericParams {

	@JsonProperty(value = "FormId")
	private String formId;

	@JsonProperty(value = "FieldKeys")
	private String fieldKeys;

	@JsonProperty(value = "FilterString")
	private String filterString;

	@JsonProperty(value = "OrderString")
	private String orderString;

	@JsonProperty(value = "TopRowCount")
	private Integer topRowCount;

	@JsonProperty(value = "StartRow")
	private Integer startRow;

	@JsonProperty(value = "Limit")
	private Integer limit;

	public K3GenericParams() {
		this.filterString = "";
		this.orderString = "";
		this.topRowCount = 0;
		this.startRow = 0;
		this.limit = 0;
	}

}
