package com.ruyuan2020.im.auth.dao;

import com.ruyuan2020.im.auth.domain.SmsLogQuery;
import com.ruyuan2020.im.auth.domain.SmsLogDO;
import com.ruyuan2020.im.common.persistent.dao.BaseDAO;

/**
 * @author zhonghuashishan
 */
public interface SmsLogDAO extends BaseDAO<SmsLogDO> {

    long count(SmsLogQuery query);
}
