package ndm.miniwms.dao;

import ndm.miniwms.pojo.RoleHasMenu;

public interface RoleHasMenuMapper {
	int delByRoleId(Integer id);
	
	int add(RoleHasMenu roleHasMenu);
}
