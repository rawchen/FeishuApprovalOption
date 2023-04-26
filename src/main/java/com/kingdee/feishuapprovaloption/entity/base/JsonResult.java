package com.kingdee.feishuapprovaloption.entity.base;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


/**
 * rest api统一返回数据结构类
 *
 * @author TangGang
 */
public class JsonResult<T> implements Serializable {
	private static final long serialVersionUID = -3458066472643731732L;

	/**
	 * 结果状态码
	 */
	@JsonProperty(value = "errcode")
	private ResultCode errCode;

	/**
	 * 对状结果态码的描述内容
	 */
	@JsonProperty(value = "errmsg")
	private String errMsg;

	/**
	 * 返回到移动端的数据对象
	 */
	private T data;

	/**
	 * 标识当前返回的数据是否为模拟数据
	 */
	private Boolean mockData;

	public JsonResult() {
		super();

	}

	/**
	 * @return 返回成功的结果对象
	 */
	public static <E> JsonResult<E> getSuccessJsonResult(E data) {
		JsonResult<E> result = new JsonResult<>();

		result.setResultStatus(ResultCode.SUCCESS);

		result.setData(data);

		return result;
	}

	public static <E> JsonResult<E> getSuccessJsonResult() {
		return getSuccessJsonResult(null);
	}

	/**
	 * @return 返回权限不足的结果对象
	 */
	public static <E> JsonResult<E> getPermissionDeniedJsonResult(E data) {
		JsonResult<E> result = new JsonResult<>();

		result.setResultStatus(ResultCode.PermissionDenied);

		result.setData(data);

		return result;
	}

	/**
	 * @return 返回失败的结果对象
	 */
	public static <E> JsonResult<E> getFailJsonResult(E data) {
		JsonResult<E> result = new JsonResult<>();

		result.setResultStatus(ResultCode.Unknown);

		result.setData(data);

		return result;
	}

	public static <E> JsonResult<E> getFailJsonResult(String errmsg) {
		JsonResult<E> result = new JsonResult<>();

		result.setResultStatus(ResultCode.Unknown);
		result.setErrMsg(errmsg);

		return result;
	}

	public static <E> JsonResult<E> getFailJsonResult() {
		JsonResult<E> result = new JsonResult<>();

		result.setResultStatus(ResultCode.Unknown);

		return result;
	}

	public static <E> JsonResult<E> getErrorJsonResult(ResultCode errCode, String errMsg) {
		return getJsonResult(errCode, errMsg, null);
	}

	public static <E> JsonResult<E> getJsonResult(ResultCode errCode, String errMsg, E data) {
		JsonResult<E> result = new JsonResult<>();

		result.setErrCode(errCode);
		result.setErrMsg(errMsg);
		result.setData(data);

		return result;
	}

	public static <E> JsonResult<E> getJsonResult(ResultCode errCode, String errMsg) {
		return getJsonResult(errCode, errMsg, null);
	}

	public static <E> JsonResult<E> getJsonResult(ResultCode errCode) {
		return getJsonResult(errCode, null, null);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ResultCode getErrCode() {
		return errCode;
	}

	public void setErrCode(ResultCode errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public void setResultStatus(ResultCode resultCode) {
		if (resultCode == null) {
			throw new NullPointerException("setErrcode - parameter resultStatus is null.");
		}

		this.setErrCode(resultCode);
		this.setErrMsg(resultCode.getDefaultLabel());
	}

	public Boolean getMockData() {
		return mockData;
	}

	public void setMockData(Boolean mockData) {
		this.mockData = mockData;
	}
}
