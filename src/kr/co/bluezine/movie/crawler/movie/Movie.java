package kr.co.bluezine.movie.crawler.movie;

import java.util.List;

import org.json.JSONObject;

/**
 * Movie bean
 * 
 * @author Kisig Ian Seo
 *
 */
public class Movie {
	/**
	 * Index
	 */
	private String index;

	/**
	 * Title
	 */
	private String title;

	/**
	 * Publish year
	 */
	private int year;

	/**
	 * Opening date
	 */
	private String openDate;

	/**
	 * Nation
	 */
	private String nation;

	/**
	 * Type
	 */
	private String type;

	/**
	 * Directors
	 */
	private List<String> director;

	/**
	 * Actors
	 */
	private List<String> actors;

	/**
	 * Description
	 */
	private String desc;

	public Movie(String index) {
		this.index = index;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getDirector() {
		return director;
	}

	public void setDirector(List<String> director) {
		this.director = director;
	}

	public List<String> getActors() {
		return actors;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return new JSONObject(this).toString(2);
	}
}
