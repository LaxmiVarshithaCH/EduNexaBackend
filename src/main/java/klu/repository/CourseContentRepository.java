package klu.repository;

import klu.model.CourseContent;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CourseContentRepository extends JpaRepository<CourseContent, Long> {
    List<CourseContent> findByCourseId(Long courseId);
}
