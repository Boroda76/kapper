package ru.kappers.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kappers.model.Roles;

public interface RolesRepository extends CrudRepository<Roles, Integer> {
    Roles getByRoleName(Roles.RoleType roleName);
    Roles getByRoleId(int id);
}
