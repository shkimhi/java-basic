package class1.ex1;

public class MovieReviewMain1 {

    public static void main(String[] args) {

        MovieReview coco = new MovieReview();
        coco.title = "coco";
        coco.review = "재밌음";

        MovieReview shutterIsland = new MovieReview();

        shutterIsland.title = "shutterIsland";
        shutterIsland.review = "반전좋음";

        System.out.println("영화 이름 : "+coco.title+" 영화 리뷰 : "+coco.review);
        System.out.println("영화 이름 : "+shutterIsland.title+" 영화 리뷰 : "+shutterIsland.review);



    }
}
