//q8
/*public class Q8toq33{
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j||i+j==(n+1)){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
                System.out.println();
            }
        }
    }/* */
    //q9
    /*public class Q8toq33{
        public static void main(String[]args){
            int n=5;
            for(int i=1;i<=n;i++){
                //first tri
                for(int k=1;k<=(n-i);k++){
                    System.out.print("  ");
                }
                    for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }//second tri
                for(int j=1;j<=i-1;j++){
                    System.out.print("* ");
                }

                    System.out.println();
                }
            }
        }/* */
        //q10
        /*import java.util.*;
          /*public class Q8toq33{
        public static void main(String[]args){
                int n=5;
                for(int i=n;i>=1;i--){
                    //first tri
                for(int k=1;k<=(n-i);k++){
                    System.out.print("  ");
                }
                    for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }//second tri
                for(int j=1;j<=i-1;j++){
                    System.out.print("* ");
                }

                    System.out.println();
                }
            }
 } /* */
//q11
/*import java.util.*;
          public class Q8toq33{
        public static void main(String[]args){
                int n=5;
    for (int i = 1; i <=n; i++) {
        for (int k = 1; k <=n-i; k++) {
            System.out.print(" ");
        }
        for (int j = 1; j <=i; j++) { // this is left part ka j 
            if((j)%2!=0){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        for (int j = 1; j <=i; j++) { // this is right part ka j
            if((i+j)%2!=0){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
          }/* */
          //q12
          /*import java.util.*;
          public class Q8toq33{
        public static void main(String[]args){
                int n=5;
            for (int i = 1; i <= n; i++) {
                for (int k = 1; k <= n - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("!");
                    }
                }
                for (int j = 1; j <= i-1 ; j++) {
                    if ((i + j) % 2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("!");
                    }
                }
                System.out.println();
            }
        }/* */
    
    //q13
    /*import java.util.*;
          public class Q8toq33{
        public static void main(String[]args){
                int n=5;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
                for (int i = n; i>=1; i--) {
                for (int j=1;j<=i-1;j++) {
                   System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }/* */
                //q14
                /*import java.util.*;
                public class Q8toq33{
                public static void main(String[]args){
                    int n=5;
                     for (int i = 1; i <=n; i++) {
                     for (int k = 1; k <=n-i; k++) {
                     System.out.print(" ");
                     }
                 for (int j = 1; j <=i; j++) {
                     System.out.print("*");
                     }
                     System.out.println();
                     }
                     for (int i = n; i >=1; i--) {
                     for (int k = 0; k <=n-i; k++) {
                 System.out.print(" ");
                     }
                     for (int j = 2; j <=i; j++) {
                     System.out.print("*");
                     }
                     System.out.println();
                     }
                     }
                    }/* */
//q15
/*import java.util.*;
     public class Q8toq33{
    public static void main(String[]args){
           int n=5;
for (int i = n; i >= 1; i--) {
    for (int k = 1; k <= n - i; k++) {
        System.out.print("    ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
for (int i = 2; i <= n; i++) {
    for (int k = 1; k <= n - i; k++) {
        System.out.print("    ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
}
     }/* */
    //q16
   /*import java.util.*;
     public class Q8toq33{
    public static void main(String[]args){
           int n=5;
for (int i = n; i >= 1; i--) {
    for (int k = 1; k <= i-1; k++) {
        System.out.print("    ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
for (int i = 2; i <= n; i++) {
    for (int k = 1; k <= i-1; k++) {
        System.out.print("    ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
}
     } /* */
      //q17,q18,q19,q20=??????????????
    
            //q21 ,22 
            //q23
            /*import java.util.*;
            public class Q8toq33{
                public static void main(String[]args){
                       int n=5;
                       for (int i = 1; i <= n; i++) {
                        for (int k = 1; k <= n - i; k++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("1 ");
                        }
                        for (int j = 1; j <= i -1; j++) {
                            System.out.print("1 ");
                        }
                        System.out.println();
                    }
                }
            }/* */
              //q24
              /*import java.util.*;
              public class Q8toq33{
                  public static void main(String[]args){
                         int n=5;
                         for (int i = 1; i <= n; i++) {
                            for (int k = 1; k <= n - i; k++) {
                                System.out.print("  ");
                            }
                            for (int j = 1; j <= i; j++) {
                                System.out.print(i+" ");
                            }
                            for (int j = 1; j <= i-1 ; j++) {
                                System.out.print(i+" ");
                            }
                            System.out.println();
                        }
                    }
                }/* */
                //q25
                  public class Q8toq33{
                  public static void main(String[] args){
                         int n=5;
                         int x = 1;
                         for (int i = 1; i <= n; i++) {
                             for (int k = 1; k <= n - i; k++) {
                                 System.out.print("\t");
                             }
                             for (int j = 1; j <= i; j++) {
                                 System.out.print(x + "\t");
                                 x++;
                             }
                             for (int j = 1; j <= i - 1; j++) {
                                 System.out.print(x + "\t");
                                 x++;
                             }
                             System.out.println();
                         }
                     }
                    }
                    //q26,27,28,29
                    //q29,30,31,32,33=???????????????????
                    //q24
                   