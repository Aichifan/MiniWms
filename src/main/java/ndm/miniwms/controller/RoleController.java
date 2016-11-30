package ndm.miniwms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ndm.miniwms.pojo.CompanyRole;
import ndm.miniwms.pojo.RoleHasMenu;
import ndm.miniwms.service.IRoleService;
import ndm.miniwms.vo.Message;

@Controller
@RequestMapping(value="/role")
public class RoleController {
	
	@Resource
	IRoleService roleService;
	
	@RequestMapping(value="/all",method = RequestMethod.GET)
    @ResponseBody
    public List<CompanyRole> all(){
		return roleService.all();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CompanyRole selectById(@PathVariable("id") Integer id){
		return roleService.selectById(id);
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Message> add(@RequestBody CompanyRole companyRole){
		int s=roleService.add(companyRole);
		if(s==1){
			return new ResponseEntity<Message>(new Message(),HttpStatus.OK);
		}else{
			return new ResponseEntity<Message>(HttpStatus.UNAUTHORIZED);
		}
	}
	
	@RequestMapping(value="/upt",method = RequestMethod.PUT)
    @ResponseBody
    public void upt(@RequestBody CompanyRole companyRole){
		//修改角色的信息
		roleService.update(companyRole);
		//删除rolehasmenu表中所有RoleId=？的数据。
		roleService.delByRoleId(companyRole.getId());
		//在rolehasmenu表中添加关系
		roleService.addRoleMenu(companyRole);
	}
	
	@RequestMapping(value="/del",method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<Message> del(Integer id){
		int s=roleService.delById(id);
		if(s==1){
			return new ResponseEntity<Message>(new Message(),HttpStatus.OK);
		}else{
			return new ResponseEntity<Message>(HttpStatus.UNAUTHORIZED);
		}
	}
}
