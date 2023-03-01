package congdz98.classroom_be.controller;

import congdz98.classroom_be.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping()
    public ResponseEntity<Person> getAll(){
        return ResponseEntity.ok(new Person().setName("Anh công đẹp trai đi BMWhihi11121!!324223234").setAge(11));
    }
}
