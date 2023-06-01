package com.zeroday.dao.login_DAO;

import java.sql.SQLException;

import com.zeroday.vo.loginVO;

public interface loginDAO {
	//로그인 확인
		public loginVO memberConfirm(String se_Id)throws SQLException;
		
		//회원가입 - 회원 정보 등록
		public void memberRegisterDAO(loginVO loginvo) throws SQLException;
		
		//회원가입 - id 중복 체크
		public String idCheckDAO(String se_Id) throws SQLException;
}
