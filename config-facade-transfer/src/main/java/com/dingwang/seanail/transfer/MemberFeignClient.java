/*
 * SimpleMemberListFacade.java
 * 2017年8月25日 上午11:32:06
 * Copyright 2017 zhenyi Financial. All  Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * Please contact chandler Corporation or visit
 * https://www.jianshu.com/u/117796446366
 * if you need additional information or have any questions.
 * @author kyle
 * @version 1.0
 */

package com.dingwang.seanail.transfer;

import com.dingwang.seanail.transfer.request.MemberPageRequest;
import com.dingwang.seanail.transfer.response.MemberListPageResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 类功能描述 ：feign方式对外提供接口调用（默认方式）
 *
 * @version
 * @author kyle 2017年8月25日上午11:32:06
 * @since 1.8
 */
@FeignClient(value = "horus-zuul-server")
public interface MemberFeignClient {

	/**
	 * 获取用户信息
	 *
	 * @param request
	 * @return MemberResult
	 * @Description:
	 * @create date 2017年7月26日下午1:48:41
	 */
	@RequestMapping(value = "/aurora-service-provider/getMember", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	MemberListPageResponse getMemberList(MemberPageRequest request);

}
