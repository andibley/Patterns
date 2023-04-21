public class PatternMaker {
    public static void main(String[] args) {
        PatternMaker stripes = new PatternMaker();
    }

    public PatternMaker() {
        System.out.print("hi pattern maker");
        Pattern1();
        Pattern2();
        Pattern3();
        Pattern5();
        Pattern6();
        Pattern7();
        Pattern4();
    }

    public void Pattern1() { 
        for (int x = 0; x < 6; x++) {
            //  for (int y = 0; y < 5; y++) {
            System.out.println(x * 5);


        }
        System.out.println();
    }

    public void Pattern2() {
        for (int n = 0; n < 6; n++) {
            System.out.println(2 + n * 5);

        }
        System.out.println();
    }

    public void Pattern3() {
        for (int w = 21; w > 0; w = w - 4) {
            System.out.print(w + "\t");
        }
        System.out.println();
    }

    public void Pattern4(){
        for(int m = 1; m<2; m++) {
            System.out.print(m + "\t");
            System.out.print(m + 3 + "\t");
            System.out.print(m + 8 + "\t");
            System.out.print(m + 15 + "\t");
            System.out.print(m + 24 + "\t");
            System.out.print(m + 35 + "\t");
        }
        System.out.println();
    }

    public void Pattern5() {
        for (int z = 0; z < 4; z++) {
            System.out.println();
            for (int c = 1; c < 5; c++) {
                System.out.print(1 + c + "\t");
            }
        }
        System.out.println();
    }


    public void Pattern6() {
        for (int t = 0; t < 1; t++) {
            System.out.println(1 + t + "\t");
            for (int e = 2; e < 3; e++) {
                System.out.println("\t" + e);
                for (int p = 3; p < 4; p++) {
                    System.out.println("\t" + "\t" + p);
                    for (int b = 4; b < 5; b++) {
                        System.out.println("\t" + "\t" + "\t" + b);
                        for (int n = 5; n < 6; n++) {
                            System.out.println("\t" +"\t" +"\t" +"\t"  + n);
                        }
                    }
                }
            }
        }
    }

    public void Pattern7() {
        for (int g = 1; g < 2; g++) {
            System.out.print(g);
            System.out.print(g);
            System.out.print(g);
            System.out.print(g);
            System.out.print(g);
            System.out.println();
            System.out.print(g * 2);
            System.out.print(g * 2);
            System.out.print(g*2);
            System.out.print(g*2);
            System.out.println();
            System.out.print(g*3);
            System.out.print(g*3);
            System.out.print(g*3);
            System.out.println();
            System.out.print(g*4);
            System.out.print(g*4);
            System.out.println();
            System.out.print(g*5);
            System.out.println();
            System.out.println();
        }
    }
}
