package com.mitrais.core.test;

import com.mitrais.core.dao.RoleDao;
import com.mitrais.core.daoimpl.RoleDaoImpl;
import com.mitrais.core.persistence.entity.RoleEntity;
import org.junit.Test;

import java.util.List;

/**
 * Created by duongtuan1211 on 3/31/2018.
 */
public class RoleTest {
    @Test
    public void checkFindAll(){
        RoleDao roleDao = new RoleDaoImpl();
        List<RoleEntity> list = roleDao.findAll();
    }

    @Test
    public void checkUpdateRole(){
        RoleDao roleDao=new RoleDaoImpl();
        RoleEntity entity=new RoleEntity();
        entity.setRoleId(3);
        entity.setName("USER_1");
        roleDao.update(entity);
    }

    @Test
    public void checkSaveRole(){
        RoleDao roleDao=new RoleDaoImpl();
        RoleEntity entity=new RoleEntity();
        entity.setRoleId(4);
        entity.setName("USER_2");
        roleDao.save(entity);
    }

    @Test
    public void checkFindById(){
        RoleDao roleDao=new RoleDaoImpl();
        RoleEntity entity=roleDao.findById(1);
        System.out.println(entity.getName());
    }


}
