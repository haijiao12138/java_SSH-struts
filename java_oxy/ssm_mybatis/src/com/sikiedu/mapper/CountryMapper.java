package com.sikiedu.mapper;

import java.util.List;

import com.sikiedu.bean.Country;
import com.sikiedu.bean.CountryVo;

public interface CountryMapper {
	//查询所有 
//	List<Country> selectAll();
	List<Country> selectAll();
	
	//查询所有的CountryVo
	List<CountryVo> selectAllCountryVo();

}
