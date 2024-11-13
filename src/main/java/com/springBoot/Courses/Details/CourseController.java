package com.springBoot.Courses.Details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }

    @GetMapping("/courses")
    public List<CourseEntity> getCourses(){
        return courseService.getCourses();
    }


    @GetMapping("/courses/{id}")
    public ResponseEntity<CourseEntity> getCourse(@PathVariable long id) {
        Optional<CourseEntity> course = courseService.getCourse(id);
        return course.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    @PostMapping("/courses")
    public CourseEntity addCourse(@RequestBody CourseEntity courseEntity) {
        return courseService.addCourse(courseEntity);
    }

    @PostMapping("/courses/added")
    public List<CourseEntity> addCourses(@RequestBody List<CourseEntity> courseEntities) {
        return courseService.addCourses(courseEntities);
    }
    
    @PutMapping("/courses")
    public CourseEntity updateCourse(@RequestBody CourseEntity courseEntity) {
        return courseService.updateCourse(courseEntity);
    }
    
    @DeleteMapping("/courses/{id}")
    public ResponseEntity<Object> deleteCourse(@PathVariable long id) {
        try {
            courseService.deleteCourse(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
