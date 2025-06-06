package com.dao;

import com.entity.ZaixianshenbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixianshenbaoView;

/**
 * 我的预约 Dao 接口
 *
 * @author 
 */
public interface ZaixianshenbaoDao extends BaseMapper<ZaixianshenbaoEntity> {

   List<ZaixianshenbaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
