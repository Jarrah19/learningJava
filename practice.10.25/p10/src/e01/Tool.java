package e01;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019-10-27
 */
public class Tool {

    public static void main(String[] args) {

        Student[] stu = new Student[3];
        SchoolClass[] schoolClasses = new SchoolClass[3];

        for (int i = 0; i < stu.length; i ++) {

            schoolClasses[i] = new SchoolClass("寿比惠麝香葡萄" + i, i);
        }

        for (int i = 0; i < stu.length; i++) {

            stu[i] = new Student("泷泽萝拉", 27);

            stu[i].setStuClass(schoolClasses[i]);
        }


        String[] repeats = new String[0];

        for (int i = 0; i < stu.length - 1; i++) {

            for (int j = i + 1; j < stu.length; j++) {

                if ((stu[i].getStuName().equals(stu[j].getStuName()))) {

                    if (repeats.length == 0) {

                        repeats = addArrayLength(repeats);
                        repeats[0] = stu[i].getStuName();
                    }

                    int count = 0;

                    for (int k = 0; k < repeats.length; k++) {

                        if (!repeats[k].equals(stu[i].getStuName())) {

                            count ++;
                        }
                    }

                    if (count == repeats.length) {

                        repeats = addArrayLength(repeats);

                        repeats[repeats.length - 1] = stu[i].getStuName();
                    }
                }
            }
        }

        for(int i = 0; i < repeats.length; i++) {

            for (int j = 0; j < stu.length; j++) {

                if (stu[j].getStuName().equals( repeats[i])) {

                    System.out.println(stu[j].toString());
                }
            }
        }

    }

    public static String[] addArrayLength(String[] Array) {

        String[] newArray = new String[Array.length + 1];

        for (int i = 0; i < Array.length; i++) {

            newArray[i] = Array[i];
        }

        return newArray;
    }
}

