package com.fr.gestion.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import com.fr.gestion.entities.Role;

@Repository
public interface IRoleDao extends JpaRepository<Role, Long>{

}
