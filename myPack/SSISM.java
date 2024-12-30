package myPack;

public class SSISM {
    String college = "Sant Singaji Instituate of Science & Management ";

    void college() {
        class college {
            void College() {
                System.out.println("-------------------------------------------------------------");
                System.out.println("College Name : " + college);
                System.out.println("-------------------------------------------------------------");
            }
        }
        college i = new college();
        i.College();
    }

    static class ITEG {
        String Std1_name = "Riya Rajput";
        String Field = "BCA";
        String Std2_name = "Geeta Rajput";
        String Field2 = "BBA";

        void IT() {
            System.out.println("Information Technology Excellence Group");
            System.out.println("-------------------------------------------");
            System.out.println("Student Name : " + Std1_name);
            System.out.println("Student Subject : " + Field);
            System.out.println("Student Name : " + Std2_name);
            System.out.println("Student Subject : " + Field2);
            System.out.println("------------------------------------------");
        }

    }

    class MEG {
        String Std1_name = "Devansh Sisodiya";
        String Field = "B. Com";
        String Std2_name = "Kavya Rajput";
        String Field2 = "BBA";

        void MEG() {
            System.out.println("MEG - Management Excellence Group ");
            System.out.println("------------------------------------------");
            System.out.println("Student Name : " + Std1_name);
            System.out.println("Student Subject : " + Field);
            System.out.println("Student Name : " + Std2_name);
            System.out.println("Student Subject : " + Field2);
            System.out.println("-------------------------------------------");
        }

    }

    class BEG {
        String Std1_name = "Roshni Meena";
        String Field = "Micro Biology";
        String Std2_name = "khushi Meena ";
        String Field2 = "BSC Nursing";

        void BEG() {
            System.out.println("Bio Excellence Group");
            System.out.println("--------------------------------");
            System.out.println("Student Name : " + Std1_name);
            System.out.println("Student Subject : " + Field);
            System.out.println("Student Name : " + Std2_name);
            System.out.println("Student Subject : " + Field2);
            System.out.println("--------------------------------");
        }

    }

    public static void main(String[] args) {
        SSISM obj = new SSISM();
        obj.college();

        SSISM.ITEG obj1 = new ITEG();
        obj1.IT();
        SSISM.MEG obj2 = obj.new MEG();
        obj2.MEG();
        SSISM.BEG obj3 = obj.new BEG();
        obj3.BEG();
    }

}
