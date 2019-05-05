package com.fr.gestion.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;


import com.fr.gestion.entities.Role;

@RepositoryRestController
public interface IRoleDao extends JpaRepository<Role, Long>{

}
