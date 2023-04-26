package com.kingdee.feishuapprovaloption.entity.base;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 结果状态
 * <br/>在{@link org.springframework.http.HttpStatus}的基础上进行扩展
 *
 * @author TangGang
 */
public enum ResultCode implements IEnum<Integer> {
	// 以下三位数据为Http协议标准状态码，6位数表示自定义状态码
	// 1xx, 1xxxxx:信息提示
	// 2xx,2xxxxx:操作成功
	// 3xx,3xxxxx:需要重定向资源
	// 4xx,4xxxxx:客户端错误
	// 5xx,5xxxxx:服务器内部错误

	// 1xx, 1xxxxx:信息提示

	// 2xx,2xxxxx:操作成功
	/**
	 * 成功(0)
	 */
	SUCCESS(0, "成功", "ResultCode.SUCCESS"),

	// 3xx,3xxxxx:需要重定向资源
	/**
	 * 数据重复(300)
	 */
	Duplicate(300, "数据重复", "ResultCode.Duplicate"),

	// 4xx,4xxxxx:客户端错误
	/**
	 * 未登录认证(401)
	 */
	Unauthorized(401, "未登录认证", "ResultCode.Unauthorized"),

	/**
	 * 权限不足, 禁止访问(403)
	 */
	PermissionDenied(403, "权限不足", "ResultCode.PermissionDenied"),

	/**
	 * 未找到资源(404)
	 */
	NotFound(404, "未找到资源", "ResultCode.NotFound"),

	/**
	 * 资源不存在(410), (已删除) 如果请求的资源已永久删除，服务器就会返回此响应
	 */
	NotExist(410, "资源不存在", "ResultCode.NotExist"),

	/**
	 * 请求参数错误(40000)
	 */
	RequestArgumentError(40000, "请求参数错误", "ResultCode.RequestArgumentError"),
	/**
	 * 认证失败
	 */
	AuthorizedFail(40002, "认证失败", "ResultCode.AuthorizedFail"),
	/**
	 * 禁止操作(40003)
	 */
	ForbiddenOperation(40003, "禁止操作", "ResultCode.ForbiddenOperation"),

	/**
	 * 服务过期(40004)
	 */
	ServiceExpiration(40004, "服务过期", "ResultCode.ServiceExpiration"),

	/**
	 * 模板超出限额(40005)
	 */
	TemplateOutLimit(40005, "模板超出限额", "ResultCode.TemplateOutLimit"),

	/**
	 * 打印次数超出限额(40006)
	 */
	PrintCountOutLimit(40006, "打印次数超出限额", "ResultCode.PrintCountOutLimit"),

	// 5xx,5xxxxx:服务器内部错误
	/**
	 * 服务器内部未知错误(500)
	 */
	Unknown(500, "服务器内部未知错误", "ResultCode.Unknown"),
	/**
	 * 远程服务器错误(50000)
	 */
	RemoteServerError(50000, "远程服务器错误", "ResultCode.RemoteServerError"),
	/**
	 * 远程请求错误(50001)
	 */
	RemoteRequestError(50001, "远程请求错误", "ResultCode.RemoteRequestError"),
	/**
	 * 操作失败(50002)
	 */
	OperateFailed(50002, "操作失败", "ResultCode.OperateFailed"),
	/**
	 * 用户未在系统中找到(50003)
	 */
	UserNOFound(50003, "用户未在系统中找到", "ResultCode.UserNOFound"),
	/**
	 * 未授予应用相关权限(50003)
	 */
	NoAuthority(50004, "未授予应用相关权限", "ResultCode.NoAuthority"),
	/**
	 * 未授予应用相关权限(50003)
	 */
	ValidateFail(50005, "数据校验失败！", "ResultCode.ValidateFail");

	private final Integer code;
	private final String defaultLabel;
	private final String resourceKey;


	ResultCode(Integer code, String defaultLabel, String resourceKey) {
		this.code = code;
		this.defaultLabel = defaultLabel;
		this.resourceKey = resourceKey;
	}

	@Override
	@JsonValue
	public Integer getCode() {
		return code;
	}

	@Override
	public String getDefaultLabel() {
		return defaultLabel;
	}

	@Override
	public String getResourceKey() {
		return resourceKey;
	}

	@JsonCreator
	public static ResultCode valueOf(Integer code) {
		if (code == null) {
			throw new NullPointerException(
					"RefundStatus.valueOf - parameter code is null.");
		}

		ResultCode result = null;

		for (ResultCode status : ResultCode.values()) {
			if (status == null) {
				continue;
			}

			if (status.getCode().equals(code)) {
				result = status;
				break;
			}
		}

		if (result == null) {
			throw new IllegalStateException("cannot find enum with code["
					+ code + "] in ResultCode");
		}

		return result;
	}

}
