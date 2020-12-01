package com.dingwang.seanail.commons;

/**
 * 返回信息一览表
 *
 * @version 1.0
 * @author 钱丁君-chandler 2020-10-24 15:18
 * @since 1.8
 */
public enum ResponseCodeEnum {

	SUCCESS("000", "成功"),
	SYS_ERROR("999", "系统异常"),
	USER_FORBIDDEN("001", "用户未授权"),
	SYS_TIME_OUT("002", "系统超时"),
	QUERY_NULL("003", "未查询到有效数据"),
	VALID_FAIL("004", "校验失败");

	String code;

	String message;

	ResponseCodeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 根据枚举code获得对应value
	 * 
	 * @param code
	 * @return
	 * @Description:
	 * @create date 2017年8月23日上午10:30:17
	 */
	public static ResponseCodeEnum getResultInfoEnumByCode(String code) {
		for (ResponseCodeEnum resEnum : ResponseCodeEnum.values()) {
			if (code.equals(resEnum.getCode())) {
				return resEnum;
			}
		}
		return null;
	}
}
