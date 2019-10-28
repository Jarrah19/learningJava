package banyuan;

/**
 * @author 崔英俊
 */
public class Exam  {

    public static class ExamA extends Examine{

        private int number;
        private String title;


        public ExamA(int number, String title) {

            this.number = number;
            this.title = title;
        }

        @Override
        public boolean answerA() {
            return true;
        }

        @Override
        public boolean answerB() {
            return false;
        }

        @Override
        public boolean answerC() {
            return false;
        }

        @Override
        public boolean answerD() {
            return false;
        }

        @Override
        public String getTitle() {

            return title;
        }

        @Override
        public int getNumber() {

            return number;
        }
    }



    public static class ExamB extends Examine{

        private int number;
        private String title;

        public ExamB(int number, String title) {

            this.number = number;
            this.title = title;
        }

        @Override
        public boolean answerA() {
            return false;
        }

        @Override
        public boolean answerB() {
            return true;
        }

        @Override
        public boolean answerC() {
            return false;
        }

        @Override
        public boolean answerD() {
            return false;
        }

        @Override
        public String getTitle() {

            return title;
        }
        @Override
        public int getNumber() {

            return number;
        }

    }



    public static class ExamC extends Examine{

        private int number;
        private String title;

        public ExamC(int number, String title) {

            this.number = number;
            this.title = title;
        }

        @Override
        public boolean answerA() {
            return false;
        }

        @Override
        public boolean answerB() {
            return false;
        }

        @Override
        public boolean answerC() {
            return true;
        }

        @Override
        public boolean answerD() {
            return false;
        }

        @Override
        public String getTitle() {

            return title;
        }
    }



    public static class ExamD extends Examine{

        private int number;
        private String title;

        public ExamD(int number, String title) {

            this.number = number;
            this.title = title;
        }

        @Override
        public boolean answerA() {
            return false;
        }

        @Override
        public boolean answerB() {
            return false;
        }

        @Override
        public boolean answerC() {
            return false;
        }

        @Override
        public boolean answerD() {
            return true;
        }

        @Override
        public String getTitle() {

            return title;
        }

        @Override
        public int getNumber() {

            return number;
        }

    }

}
