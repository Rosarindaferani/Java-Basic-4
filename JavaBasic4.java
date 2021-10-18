public class JavaBasic4 {

    public static void main (String[] args){
        hasilGrade(100);
    }

    static void hasilGrade (int nilai){
        if (nilai >81){
            System.out.println("grade A");
        }else if (nilai >61){
            System.out.println("grade B");
        }else if (nilai >41){
            System.out.println("grade C");
        }else if (nilai >21){
            System.out.println("grade D");
        }else {
            System.out.println("grade E");
        }
    
    }
}