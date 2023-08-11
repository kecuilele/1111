package com.ruyuan2020.im.group.domain;

import com.ruyuan2020.im.common.persistent.domain.BaseQuery;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhonghuashishan
 */
@Getter
@Setter
public class GroupMemberQuery extends BaseQuery {

    private Long groupId;
}
