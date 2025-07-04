package cn.bugstack.infrastructure.persistent.dao;

import cn.bugstack.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description: 抽奖策略DAO
 * @author: ruofengcy
 * @date: 2025/7/3 07:19
 * @version: 1.0
 */
@Mapper
public interface IStrategyDao {
    List<Strategy> queryStrategyList();
}
