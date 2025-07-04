package cn.bugstack.infrastructure.persistent.dao;

import cn.bugstack.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description: 奖品表DAO
 * @author: ruofengcy
 * @date: 2025/7/3 07:19
 * @version: 1.0
 */
@Mapper
public interface IAwardDao {

    List<Award> queryAwardList();

}
