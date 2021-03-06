package com.victor.dan.service.impl;

import com.victor.dan.dao.RoleMenuMapper;
import com.victor.dan.domain.entity.RoleMenu;
import com.victor.dan.service.RoleMenuServie;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * @author victor
 */
@Service("roleMenuService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements RoleMenuServie {

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteRoleMenusByRoleId(String[] roleIds) {
		List<String> list = Arrays.asList(roleIds);
		baseMapper.delete(new LambdaQueryWrapper<RoleMenu>().in(RoleMenu::getRoleId, list));
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteRoleMenusByMenuId(String[] menuIds) {
		List<String> list = Arrays.asList(menuIds);
		baseMapper.delete(new LambdaQueryWrapper<RoleMenu>().in(RoleMenu::getMenuId, list));
	}

	@Override
	public List<RoleMenu> getRoleMenusByRoleId(String roleId) {
		return baseMapper.selectList(new LambdaQueryWrapper<RoleMenu>().eq(RoleMenu::getRoleId, roleId));
	}

}
