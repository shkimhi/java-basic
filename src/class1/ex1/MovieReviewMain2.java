package class1.ex1;

public class MovieReviewMain2 {

    public static void main(String[] args) {

        MovieReview coco = new MovieReview();
        coco.title = "coco";
        coco.review = "재밌음";

        MovieReview shutterIsland = new MovieReview();

        shutterIsland.title = "shutterIsland";
        shutterIsland.review = "반전좋음";

        MovieReview[] movieReviews = {coco, shutterIsland};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 이름 : "+ movieReview.title +" 영화 리뷰 : "+movieReview.review);
        }

    }
}
