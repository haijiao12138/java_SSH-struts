package com.sikiedu.mapper;

import java.util.List;

import com.sikiedu.bean.Country;
import com.sikiedu.bean.CountryVo;

public interface CountryMapper {
	//��ѯ���� 
//	List<Country> selectAll();
	List<Country> selectAll();
	
	//��ѯ���е�CountryVo
	List<CountryVo> selectAllCountryVo();

}
