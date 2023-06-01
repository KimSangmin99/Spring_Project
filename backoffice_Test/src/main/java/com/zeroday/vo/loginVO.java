package com.zeroday.vo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class loginVO implements UserDetails {
	String se_Id;
	String se_Password;
	String se_Name;
	String se_Email;
	String seuser_authority="ROLE_USER";
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		 	ArrayList<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		 	authorities.add(new SimpleGrantedAuthority(seuser_authority));
	        return authorities;
	}

	@Override
	public String getPassword() {
		
		return se_Password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return se_Id;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	//계정 잠금
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	//
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	//계정 활성 / 비활성 여부
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public String getSe_Id() {
		return se_Id;
	}
	public void setSe_Id(String se_Id) {
		this.se_Id = se_Id;
	}
	public String getSe_Password() {
		return se_Password;
	}
	public void setSe_Password(String se_Password) {
		this.se_Password = se_Password;
	}
	public String getSe_Name() {
		return se_Name;
	}
	public void setSe_Name(String se_Name) {
		this.se_Name = se_Name;
	}
	public String getSe_Email() {
		return se_Email;
	}
	public void setSe_Email(String se_Email) {
		this.se_Email = se_Email;
	}
	public String getSeuser_authority() {
		return seuser_authority;
	}
	public void setSeuser_authority(String seuser_authority) {
		this.seuser_authority = seuser_authority;
	}
	@Override
	public String toString() {
		return "loginVO [se_Id=" + se_Id + ", se_Password=" + se_Password + ", se_Name=" + se_Name + ", se_Email="
				+ se_Email + ", seuser_authority=" + seuser_authority + "]";
	}
	
}
