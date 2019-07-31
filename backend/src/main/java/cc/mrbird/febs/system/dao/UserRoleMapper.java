package cc.mrbird.febs.system.dao;

import cc.mrbird.febs.system.domain.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author victor
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {

    /**
     * 根据用户Id删除该用户的角色关系
     *
     * @param userId 用户ID
     * @return boolean
     */
    Boolean deleteByUserId(@Param("userId") Long userId);

    /**
     * 根据角色Id删除该角色的用户关系
     * @param roleId 角色ID
     * @return boolean
     */
    Boolean deleteByRoleId(@Param("roleId") Long roleId);
}