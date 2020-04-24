package org.fy.gmall.user.mapper;

import org.fy.gmall.user.bean.UmsMember;

import java.util.List;

/**
 * @author fy
 * @create 2020/04/24 18:50
 */
public interface UserMapper {
    List<UmsMember> selectAllUser();
}
