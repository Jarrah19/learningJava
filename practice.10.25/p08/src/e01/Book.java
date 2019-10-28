package e01;

public class Book {

    private String title;
    private int pageNum = 200;

    public Book(String title, int pageNum) {

        if (pageNum >= 200) {

            this.title = title;
            this.pageNum = pageNum;
        }
        else System.out.println("错误");
    }

        public void detail () {

            System.out.println("教材名称：" + this.title + "  页数：" + this.pageNum);
        }
    }
