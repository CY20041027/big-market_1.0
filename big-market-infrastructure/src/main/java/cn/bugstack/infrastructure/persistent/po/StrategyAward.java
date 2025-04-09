package cn.bugstack.infrastructure.persistent.po;

import java.util.Date;

/**
 * @description: TODO
 * @author: ruofengcy
 * @date: 2025/7/2 22:57
 * @version: 1.0
 */
public class StrategyAward {
    /**
     * 自增ID
     */
    private Long id;
    /**
     * 抽奖策略ID'
     */
    private Long strategy_id;
    /**
     * 抽奖奖品ID - 内部流转使用'
     */
    private Long award_id;
    /**
     * 抽奖奖品标题
     */
    private String award_title;
    /**
     * 抽奖奖品副标题
     */
    private String award_subtitle;
    /**
     * 奖品库存总量
     */
    private Long award_count;
    /**
     * 奖品库存剩余
     */
    private Long award_count_surplus;
    /**
     * 奖品中奖概率
     */
    private Long award_rate;
    /**
     * 规则模型，rule配置的模型同步到此表，便于使用
     */
    private Long rule_models;
    /**
     * 排序
     */
    private Long sort;
    /**
     * 创建时间
     */
    private Date create_time;
    /**
     * 修改时间
     */
    private Date update_time;
}
