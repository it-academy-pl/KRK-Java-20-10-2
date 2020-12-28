package pl.itacademy.lesson22;

import lombok.Data;

import java.util.Optional;

@Data
public class StaffService {

    private final StaffRepository repository;

    public void changeDepartment(String workerName, String newDepartment) {
        Optional<Worker> foundWorker = repository.findByName(workerName);

        Worker worker = foundWorker.get();
        worker.setDepartment(newDepartment);
    }

    public void changeSalary(String workerName, int salary) {
        Worker worker = repository.findByName(workerName)
                .orElseThrow(() -> new WorkerNotFoundException(workerName + " was not found!"));

        worker.setSalary(salary);
    }
}
