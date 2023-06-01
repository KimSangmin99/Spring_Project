package com.zeroday.mapper.mapper_interface;

import org.apache.ibatis.annotations.Insert;

import com.zeroday.vo.loginVO;

public interface pageMapper {
	@Insert("insert into se_member (se_Id, se_Password, se_Name, se_Email) values(#{se_Id}, #{se_Password}, #{se_Name}, #{se_Email})")
	public boolean insert_data(loginVO mainpage);
}
