
// class test {

//     static int story(int x){

//         System.out.println(x);
//         return  x;
//     }
// }


public class code

{

    static int study(int x){

        if(x > 10){
            System.out.println("X is greater than x : "+ x);
        }
        return x;
            
    }


    static double story(double j){
       
        if(j < 100){
            System.out.println("J is greater than x : "+ j);
        }
        return j;

    }



    static int pen(int a, int b, int c){

        int m = a - b - c;

        System.out.println("Substractions is : " + m);

        return m;
    }



    static int pen(int a, int b){

        int m = a + b;

        System.out.println("Addition is : " + m);

        return m;
    }







    public static void main(String a[]){

        int std = study(15);

        double dbl = story(50.2315);


        System.out.println("Values of Study method : " + std);

        System.out.println("Values of Story method : " + dbl);

        int l = 0;

        for (int k = 0; k < 25; k++){
            //System.out.println(k);
            l+=k;
        }
        
        int std1 = study(l);

        int n = pen(l, 10);

        int s = pen(l, 10, 12);

        // test meth = new test();

        // meth.story(10);


        // System.err.println();
        // System.out.println("Hi There");
    }

}