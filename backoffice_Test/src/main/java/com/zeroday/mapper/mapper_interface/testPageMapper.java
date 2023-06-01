package com.zeroday.mapper.mapper_interface;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.zeroday.vo.testPage;

public interface testPageMapper {
	@Select("select * from testpage")
	public List<testPage> getList();
	
	@Insert("insert into testpage (user_name, content) values(#{user_name}, #{content})")
	public boolean insert_data(testPage testpage);
}
