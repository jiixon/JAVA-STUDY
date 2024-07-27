package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] movies = new MovieReview[2];

        MovieReview movie1 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "인생은 무한 루프";
        movies[0] = movie1;

        MovieReview movie2 = new MovieReview();
        movie2.title = "어바웃 타임";
        movie2.review = "인생 시간 영화!";
        movies[1] = movie2;

        for (MovieReview mr : movies) {
            System.out.println("영화 제목: " + mr.title + ", 리뷰: " + mr.review);
        }

    }
}
