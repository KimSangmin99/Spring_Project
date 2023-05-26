package com.zeroday.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.zeroday.vo.testPage;

public interface testPageMapper {
	@Select("select * from testpage")
	public List<testPage> getList();
}
