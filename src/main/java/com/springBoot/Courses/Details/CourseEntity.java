package com.springBoot.Courses.Details;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseEntity {

    @Id
    private long id;
    private String name;
    private String description;

}
