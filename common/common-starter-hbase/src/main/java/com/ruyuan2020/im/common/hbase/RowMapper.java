package com.ruyuan2020.im.common.hbase;

import org.apache.hadoop.hbase.client.Result;

/**
 * @author zhonghuashishan
 */
@FunctionalInterface
public interface RowMapper<T> {

    T map(Result result);
}
