package com.kingdee.feishuapprovaloption.controller;

import com.kingdee.feishuapprovaloption.config.Constant;
import com.kingdee.feishuapprovaloption.entity.ApprovalSelectOutResult;
import com.kingdee.feishuapprovaloption.entity.ExternalOptionsParams;
import com.kingdee.feishuapprovaloption.entity.base.FeishuJsonResult;
import com.kingdee.feishuapprovaloption.entity.base.ResultCode;
import com.kingdee.feishuapprovaloption.service.K3CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RawChen
 * @date 2023-04-25 11:40
 */
@RestController
public class ApprovalOptionController {

	@Autowired
	private K3CloudService k3CloudService;

	/**
	 * 员工列表
	 * @param params
	 * @return
	 */
	@PostMapping("/empinfo")
	public FeishuJsonResult<ApprovalSelectOutResult> empinfo(@RequestBody ExternalOptionsParams params) {
		if (!params.getToken().equals(Constant.TOKEN)) {
			return FeishuJsonResult.getFailJsonResult();
		}
		ApprovalSelectOutResult result = k3CloudService.empinfo(params);
		FeishuJsonResult<ApprovalSelectOutResult> data = new FeishuJsonResult<>();
		data.setResultStatus(ResultCode.SUCCESS);
		data.setData(result);
		data.setErrMsg("success!");
		return data;
	}

	/**
	 * 部门列表
	 * @param params
	 * @return
	 */
	@PostMapping("/department")
	public FeishuJsonResult<ApprovalSelectOutResult> department(@RequestBody ExternalOptionsParams params) {
		if (!params.getToken().equals(Constant.TOKEN)) {
			return FeishuJsonResult.getFailJsonResult();
		}
		ApprovalSelectOutResult result = k3CloudService.department(params);
		FeishuJsonResult<ApprovalSelectOutResult> data = new FeishuJsonResult<>();
		data.setResultStatus(ResultCode.SUCCESS);
		data.setData(result);
		data.setErrMsg("success!");
		return data;
	}

	/**
	 * 组织列表
	 * @param params
	 * @return
	 */
	@PostMapping("/organizations")
	public FeishuJsonResult<ApprovalSelectOutResult> organizations(@RequestBody ExternalOptionsParams params) {
		if (!params.getToken().equals(Constant.TOKEN)) {
			return FeishuJsonResult.getFailJsonResult();
		}
		ApprovalSelectOutResult result = k3CloudService.organizations(params);
		FeishuJsonResult<ApprovalSelectOutResult> data = new FeishuJsonResult<>();
		data.setResultStatus(ResultCode.SUCCESS);
		data.setData(result);
		data.setErrMsg("success!");
		return data;
	}

	/**
	 * 币别列表
	 * @param params
	 * @return
	 */
	@PostMapping("/currency")
	public FeishuJsonResult<ApprovalSelectOutResult> currency(@RequestBody ExternalOptionsParams params) {
		if (!params.getToken().equals(Constant.TOKEN)) {
			return FeishuJsonResult.getFailJsonResult();
		}
		ApprovalSelectOutResult result = k3CloudService.currency(params);
		FeishuJsonResult<ApprovalSelectOutResult> data = new FeishuJsonResult<>();
		data.setResultStatus(ResultCode.SUCCESS);
		data.setData(result);
		data.setErrMsg("success!");
		return data;
	}

	/**
	 * 费用项目列表
	 * @param params
	 * @return
	 */
	@PostMapping("/expense")
	public FeishuJsonResult<ApprovalSelectOutResult> expense(@RequestBody ExternalOptionsParams params) {
		if (!params.getToken().equals(Constant.TOKEN)) {
			return FeishuJsonResult.getFailJsonResult();
		}
		ApprovalSelectOutResult result = k3CloudService.expense(params);
		FeishuJsonResult<ApprovalSelectOutResult> data = new FeishuJsonResult<>();
		data.setResultStatus(ResultCode.SUCCESS);
		data.setData(result);
		data.setErrMsg("success!");
		return data;
	}

	/**
	 * 费用承担组织列表
	 * @param params
	 * @return
	 */
	@PostMapping("/expenceOrganizations")
	public FeishuJsonResult<ApprovalSelectOutResult> expenceOrganizations(@RequestBody ExternalOptionsParams params) {
		if (!params.getToken().equals(Constant.TOKEN)) {
			return FeishuJsonResult.getFailJsonResult();
		}
		ApprovalSelectOutResult result = k3CloudService.expenceOrganizations(params);
		FeishuJsonResult<ApprovalSelectOutResult> data = new FeishuJsonResult<>();
		data.setResultStatus(ResultCode.SUCCESS);
		data.setData(result);
		data.setErrMsg("success!");
		return data;
	}

	/**
	 * 费用承担部门列表
	 * @param params
	 * @return
	 */
	@PostMapping("/expenceDepartment")
	public FeishuJsonResult<ApprovalSelectOutResult> expenceDepartment(@RequestBody ExternalOptionsParams params) {
		if (!params.getToken().equals(Constant.TOKEN)) {
			return FeishuJsonResult.getFailJsonResult();
		}
		ApprovalSelectOutResult result = k3CloudService.expenceDepartment(params);
		FeishuJsonResult<ApprovalSelectOutResult> data = new FeishuJsonResult<>();
		data.setResultStatus(ResultCode.SUCCESS);
		data.setData(result);
		data.setErrMsg("success!");
		return data;
	}

	/**
	 * 发票类型（财务使用）枚举列表
	 * @param params
	 * @return
	 */
	@PostMapping("/enumBillInvoiceType")
	public FeishuJsonResult<ApprovalSelectOutResult> enumBillInvoiceType(@RequestBody ExternalOptionsParams params) {
		if (!params.getToken().equals(Constant.TOKEN)) {
			return FeishuJsonResult.getFailJsonResult();
		}
		ApprovalSelectOutResult result = k3CloudService.enumBillInvoiceType(params);
		FeishuJsonResult<ApprovalSelectOutResult> data = new FeishuJsonResult<>();
		data.setResultStatus(ResultCode.SUCCESS);
		data.setData(result);
		data.setErrMsg("success!");
		return data;
	}

	/**
	 * 结算方式列表
	 * @param params
	 * @return
	 */
	@PostMapping("/settleType")
	public FeishuJsonResult<ApprovalSelectOutResult> settleType(@RequestBody ExternalOptionsParams params) {
		if (!params.getToken().equals(Constant.TOKEN)) {
			return FeishuJsonResult.getFailJsonResult();
		}
		ApprovalSelectOutResult result = k3CloudService.settleType(params);
		FeishuJsonResult<ApprovalSelectOutResult> data = new FeishuJsonResult<>();
		data.setResultStatus(ResultCode.SUCCESS);
		data.setData(result);
		data.setErrMsg("success!");
		return data;
	}

}
