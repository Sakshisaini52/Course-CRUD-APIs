package com.springBoot.Courses.Details;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<CourseEntity> getCourses();

    Optional<CourseEntity> getCourse(long id);

    CourseEntity addCourse(CourseEntity courseEntity);

    List<CourseEntity> addCourses(List<CourseEntity> l);

    CourseEntity updateCourse(CourseEntity courseEntity);

    void deleteCourse(long id);

//      CourseDto addCourse(CourseDto Dto);
//      CourseDto updateCourse(CourseDto Dto);
//      CourseDto getCourse();
}
