package pl.itacademy.lesson22;

import pl.itacademy.lesson19.Mammal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryDB implements StaffRepository {
    private Map<String, Worker> workers = new HashMap<>();

    @Override
    public Optional<Worker> findByName(String name) {
        return Optional.ofNullable(workers.get(name));
    }

    @Override
    public Collection<Worker> findAll() {
        return null;
    }

    @Override
    public Collection<Worker> findByDepartment(String departmentName) {
        return null;
    }

    @Override
    public void save(Worker worker) {
        workers.put(worker.getName(), worker);
    }

    public void deleteAll() {
        workers.clear();
        System.out.println("DB bean cleaned up!");
    }
}
