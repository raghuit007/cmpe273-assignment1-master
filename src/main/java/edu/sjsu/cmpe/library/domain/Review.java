 package edu.sjsu.cmpe.library.domain;

public class Review {
	private Integer id;
	private Integer rating;
	private String comment;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * @return the rating
	 */
	public Integer getRating() {
		return rating;
	}
	
	/**
	 * @param rating the rating to set
	 */
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comment;
	}
	
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comment) {
		this.comment = comment;
	}
}