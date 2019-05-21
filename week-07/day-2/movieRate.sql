# Find the titles of all movies directed by Steven Spielberg.
mysql> SELECT title FROM Movie WHERE director = "Steven Spielberg”;

# Find all years that have a movie that received a rating of 4 or 5, and sort them in increasing order. 
mysql> select distinct year from movie m join rating r on r.mID = m.mID where r.stars >= 4 ORDER BY m.year ASC;

# Find the titles of all movies that have no ratings. 
mysql> select title from movie m join rating r on r.mID = m.mID where r.ratingDate IS null;

# Some reviewers didn't provide a date with their rating. Find the names of all reviewers who have ratings with a NULL value for the date. 
mysql> select name from reviewer w join rating r on r.rID = w.rID where r.ratingDate IS null;

# Write a query to return the ratings data in a more readable format: reviewer name, movie title, stars, and ratingDate. Also, sort the data, first by reviewer name, then by movie title, and lastly by number of stars. 
mysql> SELECT w.name, m.title, r.stars, r.ratingDate
    -> FROM reviewer w, movie m, rating r
    -> WHERE r.rID = w.rID AND r.mID = m.mID
    -> ORDER BY w.name ASC, m.title ASC, r.stars ASC;

# Find the names of all reviewers who rated Gone with the Wind. 
select distinct name from reviewer w join rating r on r.rID = w.rID where r.mID = 101;

# For any rating where the reviewer is the same as the director of the movie, return the reviewer name, movie title, and number of stars. 
mysql> SELECT w.name, m.title, r.stars
    -> FROM reviewer w, movie m, rating r
    -> WHERE r.rID = w.rID AND r.mID = m.mID AND w.name = m.director;

