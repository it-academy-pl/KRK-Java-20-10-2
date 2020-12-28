package pl.itacademy.lesson22;

import java.util.Collection;
import java.util.Optional;

public interface StaffRepository {
    Optional<Worker> findByName(String name);

    Collection<Worker> findAll();

    Collection<Worker> findByDepartment(String departmentName);

    void save(Worker worker);
}
