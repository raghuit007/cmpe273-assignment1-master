package edu.sjsu.cmpe.library.repository;

import edu.sjsu.cmpe.library.domain.Review;

/**
 * Review repository interface.
 * 
 * What is repository pattern?
 * 
 * @see http://martinfowler.com/eaaCatalog/repository.html
 */
public interface ReviewRepositoryInterface {
    /**
     * Save a new review in the repository
     * 
     * @param newReview
     *            a review instance to be create in the repository
     * @return a newly created review instance with auto-generated ID
     */
    Review saveReview(Review newReview);

    /**
     * Retrieve an existing review by ID
     * 
     * @param id
     *            a valid ID
     * @return a review instance
     */
    Review getReviewById(Integer id);
    
    //ArrayList<Review> getAllReviews(long isbn);
    
}
