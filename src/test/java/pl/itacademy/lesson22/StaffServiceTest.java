package pl.itacademy.lesson22;

import org.junit.jupiter.api.*;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StaffServiceTest {

    private InMemoryDB repository;
    private StaffService service;

    @BeforeEach
    public void setUp() {
        repository = new InMemoryDB();
        service = new StaffService(repository);
    }

    @AfterEach
    public void cleanUp() {
        repository.deleteAll();
    }

    @BeforeAll
    public static void runsOnceBeforeAllTheTests() {
        System.out.println("This message will appear only once before all the tests!");
    }

    @Test
    public void changeDepartment_wasIT_changeToAccounting_workerDepartmentBecomesAccounting() {
        Worker kowalski = new Worker("Jan Kowalski", 10_000, "IT");
        repository.save(kowalski);

        service.changeDepartment("Jan Kowalski", "Accounting");

        Optional<String> newDepartment = repository.findByName("Jan Kowalski")
                .map(Worker::getDepartment);

        assertThat(newDepartment).isNotEmpty().hasValue("Accounting");
    }

    @Test
    public void changeSalary_provideNewSalary_changesSalary() {
        Worker kowalski = new Worker("Jan Kowalski", 10_000, "IT");
        repository.save(kowalski);

        service.changeSalary("Jan Kowalski", 12_000);

        Optional<Integer> newSalary = repository.findByName("Jan Kowalski")
                .map(Worker::getSalary);

        assertThat(newSalary).isNotEmpty().hasValue(12_000);
    }

    @Test
    public void changeSalary_provideWrongWorkerName_throwsWorkerNotFoundException() {
        WorkerNotFoundException exception = assertThrows(WorkerNotFoundException.class,
                () -> service.changeSalary("Ela Nowak", 15_000));

        assertThat(exception).hasMessage("Ela Nowak was not found!");
    }

}