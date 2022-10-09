package com.zc.dao;

import com.zc.model.OptionsDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OptionDao {

    /**
     * 删除网站配置
     * @param name
     * @return
     */
    int deleteOptionByName(@Param("name") String name);

    /**
     * 更新网站配置
     * @param options
     * @return
     */
    int updateOptionByName(OptionsDomain options);

    /***
     * 根据名称获取网站配置
     * @param name
     * @return
     */
    OptionsDomain getOptionByName(@Param("name") String name);

    /**
     * 获取全部网站配置
     * @return
     */
    List<OptionsDomain> getOptions();
}
