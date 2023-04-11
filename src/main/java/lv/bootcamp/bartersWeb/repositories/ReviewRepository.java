package lv.bootcamp.bartersWeb.repository;

import lv.bootcamp.bartersWeb.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {

    List<Review> findByReviewedId(Long reviewedId);
}
