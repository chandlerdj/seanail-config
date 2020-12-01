package com.dingwang.seanail.dal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.PageRowBounds;
import com.dingwang.seanail.dal.entity.Member;

/**
 * 类功能描述
 * @version 1.0
 * @author 钱丁君-chandler 2020-10-24 15:21
 * @since 1.8
 */
public interface MemberMapper {

	int insert(Member member);

	int deleteByPrimaryKey(@Param("uid") Long uid);

	Member selectByPrimaryKey(@Param("uid") Long uid);

	int updateByPrimaryKey(Member member);

	List<Member> selectAll(PageRowBounds pageRowBounds);

	Integer selectTotalCount();

	List<Member> exactQueryList(Member identifyInfo);

}