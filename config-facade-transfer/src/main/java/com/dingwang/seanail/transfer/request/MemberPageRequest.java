/*
 * MemberPageRequest.java
 * 2017年8月21日 上午10:58:18
 * Copyright 2017 zhenyi Financial. All  Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * Please contact chandler Corporation or visit
 * https://www.jianshu.com/u/117796446366
 * if you need additional information or have any questions.
 * @author Wang Zhaosheng
 * @version 1.0
 */

package com.dingwang.seanail.transfer.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * 分页查询请求对象
 *
 * @version
 * @author Wang Zhaosheng 2017年8月21日上午10:58:18
 * @since 1.8
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberPageRequest {

	private static final long serialVersionUID = 6834133473974898446L;

	private Long uid;

	private String employeeId;

	private Boolean gender;

	private String nickname;

	private String uname;

	private String passwd;

	private String email;

	private String portrait;

	private String bigPortrait;

	private String phone;

	private Integer regTime;

	private Integer loginNum;

	private Integer lastLogin;

	private String lastIp;

	private Byte isSupper;

	private Date timeline;

	private String unionId;

}
