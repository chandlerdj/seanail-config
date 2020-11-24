/*
 * DateStyle.java
 * 2017年7月13日 上午10:15:45
 * Copyright 2017 zhenyi Financial. All  Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * Please contact chandler Corporation or visit
 * https://www.jianshu.com/u/117796446366
 * if you need additional information or have any questions.
 * @author Wang Zhaosheng
 * @version 1.0
 */

package com.dingwang.seanail.commons;

/**
 * 日期类型 enum
 * 
 * @version
 * @author Wang Zhaosheng 2017年7月13日上午10:15:45
 * @since 1.8
 */
public enum DateStyle {

	YYYY_MM("yyyy-MM", false),
	YYYY_MM_DD("yyyy-MM-dd", false),
	YYYY_MM_DD_HH_MM("yyyy-MM-dd HH:mm", false),
	YYYY_MM_DD_HH_MM_SS("yyyy-MM-dd HH:mm:ss", false),

	YYYY_MM_EN("yyyy/MM", false),
	YYYY_MM_DD_EN("yyyy/MM/dd", false),
	YYYY_MM_DD_HH_MM_EN("yyyy/MM/dd HH:mm", false),
	YYYY_MM_DD_HH_MM_SS_EN("yyyy/MM/dd HH:mm:ss", false),

	YYYY_MM_CN("yyyy年MM月", false),
	YYYY_MM_DD_CN("yyyy年MM月dd日", false),
	YYYY_MM_DD_HH_MM_CN("yyyy年MM月dd日 HH:mm", false),
	YYYY_MM_DD_HH_MM_SS_CN("yyyy年MM月dd日 HH:mm:ss", false),

	HH_MM("HH:mm", true),
	HH_MM_SS("HH:mm:ss", true),

	MM_DD("MM-dd", true),
	MM_DD_HH_MM("MM-dd HH:mm", true),
	MM_DD_HH_MM_SS("MM-dd HH:mm:ss", true),

	MM_DD_EN("MM/dd", true),
	MM_DD_HH_MM_EN("MM/dd HH:mm", true),
	MM_DD_HH_MM_SS_EN("MM/dd HH:mm:ss", true),

	MM_DD_CN("MM月dd日", true),
	MM_DD_HH_MM_CN("MM月dd日 HH:mm", true),
	MM_DD_HH_MM_SS_CN("MM月dd日 HH:mm:ss", true);

	private String value;

	private boolean isShowOnly;

	DateStyle(String value, boolean isShowOnly) {
		this.value = value;
		this.isShowOnly = isShowOnly;
	}

	public String getValue() {
		return value;
	}

	public boolean isShowOnly() {
		return isShowOnly;
	}

}
