package com.springBoot.Courses.Details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<CourseEntity> getCourses() {
        return courseRepository.findAll();
    }


    @Override
    public Optional<CourseEntity> getCourse(long id) {
        return courseRepository.findById(id);
    }


    @Override
    public CourseEntity addCourse(CourseEntity courseEntity) {
        return courseRepository.save(courseEntity);
    }

    @Override
    public List<CourseEntity> addCourses(List<CourseEntity> l) {
        return courseRepository.saveAll(l);
    }

    @Override
    public CourseEntity updateCourse(CourseEntity courseEntity) {
        return courseRepository.save(courseEntity);
    }

    @Override
    public void deleteCourse(long id) {
        courseRepository.deleteById(id);
    }


//    List<CourseEntity> list;
//    public CourseServiceImpl() {
//        list = new ArrayList<CourseEntity>();
//        list.add(new CourseEntity(124,"Java","Core concepts and OOPS"));
//        list.add(new CourseEntity(107,"Pyhton","Frameworks and scope"));
//        list.add(new CourseEntity(124,"SQL","Queries and implementation"));
//    }
//    @Override
//    public List<CourseEntity> getCourses() {
//        return list;
//    }
//
//    @Override
//    public CourseEntity getCourse(long id) {
//        CourseEntity course = null;
//        for (CourseEntity c : list) {
//            if (c.getId() == id) {
//                course = c;
//                break;
//            }
//        }
//        return course;
//    }
//
//    @Override
//    public CourseEntity addCourse(CourseEntity course) {
//        list.add(course);
//        return course;
//    }
//
//    @Override
//    public CourseEntity updateCourse(CourseEntity courseEntity) {
//        list.forEach(e->{
//            if(e.getId() == courseEntity.getId()) {
//                e.setName(courseEntity.getName());
//                e.setDescription(courseEntity.getDescription());
//            }
//        });
//        return courseEntity;
//    }
//
//    @Override
//    public void deleteCourse(long id) {
//        list.forEach(e->{
//            if(e.getId() == id) {
//                list.remove(e);
//            }
//        });
//    }


}
