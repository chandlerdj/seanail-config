
package com.dingwang.seanail.dal.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 类功能描述
 * @version 1.0
 * @author 钱丁君-chandler 2020-10-24 15:20
 * @since 1.8
 */
public class Member {

	/** uid - id */
	@NotNull(message = " uid 不能为null")
	private Long uid;

	/** employee_id - 会员号 */
	@Length(max = 20, message = " employeeId 的长度不能超过 20 ")
	private String employeeId;

	/** gender - 性别 */
	private Boolean gender;

	/** nickname - */
	@NotEmpty(message = " nickname 不能为空")
	@Length(max = 40, message = " nickname 的长度不能超过 40 ")
	private String nickname;

	/** uname - */
	@NotEmpty(message = " uname 不能为空")
	@Length(max = 40, message = " uname 的长度不能超过 40 ")
	private String uname;

	/** passwd - */
	@Length(max = 40, message = " passwd 的长度不能超过 40 ")
	private String passwd;

	/** email - */
	@Length(max = 40, message = " email 的长度不能超过 40 ")
	private String email;

	/** portrait - */
	@Length(max = 160, message = " portrait 的长度不能超过 160 ")
	private String portrait;

	/** big_portrait - */
	@Length(max = 160, message = " bigPortrait 的长度不能超过 160 ")
	private String bigPortrait;

	/** phone - */
	@Length(max = 11, message = " phone 的长度不能超过 11 ")
	private String phone;

	/** reg_time - */
	@NotNull(message = " regTime 不能为null")
	private Integer regTime;

	/** login_num - */
	@NotNull(message = " loginNum 不能为null")
	private Integer loginNum;

	/** last_login - */
	@NotNull(message = " lastLogin 不能为null")
	private Integer lastLogin;

	/** last_ip - */
	@NotEmpty(message = " lastIp 不能为空")
	@Length(max = 50, message = " lastIp 的长度不能超过 50 ")
	private String lastIp;

	/** is_supper - */
	private Byte isSupper;

	/** timeline - */
	@NotNull(message = " timeline 不能为null")
	private Date timeline;

	/** union_id - */
	@Length(max = 32, message = " unionId 的长度不能超过 32 ")
	private String unionId;

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Boolean getGender() {
		return this.gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPortrait() {
		return this.portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	public String getBigPortrait() {
		return this.bigPortrait;
	}

	public void setBigPortrait(String bigPortrait) {
		this.bigPortrait = bigPortrait;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getRegTime() {
		return this.regTime;
	}

	public void setRegTime(Integer regTime) {
		this.regTime = regTime;
	}

	public Integer getLoginNum() {
		return this.loginNum;
	}

	public void setLoginNum(Integer loginNum) {
		this.loginNum = loginNum;
	}

	public Integer getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Integer lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getLastIp() {
		return this.lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	public Byte getIsSupper() {
		return this.isSupper;
	}

	public void setIsSupper(Byte isSupper) {
		this.isSupper = isSupper;
	}

	public Date getTimeline() {
		return this.timeline;
	}

	public void setTimeline(Date timeline) {
		this.timeline = timeline;
	}

	public String getUnionId() {
		return this.unionId;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}

}