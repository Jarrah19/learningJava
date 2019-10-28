package e04;

public class Tank {

        public int x;
        public int y;
        public char dir;
        public String type;

        public Tank(int x, int y, char dir, String type) {

            this.x = x;
            this.y = y;
            if ((dir == '上') | (dir == '下') | (dir == '左') | (dir == '右')) {
                this.dir = dir;
            }
            this.type = type;
        }

        public void setX (int x) {
            this.x = x;
        }

        public void setY (int y) {

            this.y = y;
        }

        public void setDer (char dir) {

            this.dir  = dir;
        }

        public void setType (String type) {

            this.type = type;
        }

        public int getX () {

            return x;
        }

        public int getY() {

            return y;
        }

        public char getDir() {

            return dir;
        }

        public String getType() {

            return type;
        }


        public String toString() {

            return "坐标： X-" + this.x + " Y-" + this.y + "  方向:" + dir + "  型号：" + type;
        }
}