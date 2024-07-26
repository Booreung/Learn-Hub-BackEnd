package project.homelearn.controller.student;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentDashBoardController {

    @GetMapping
    public String student() {
        return "Hello, Student!";
    }
}