@FunctionalInterface

interface InnerLamdaExp {

    int add(int a, int b);
    
}


class InnerLamdaExp_1 implements InnerLamdaExp {

    public int add(int a, int b){

        return a+b;
    }

  
    
}

public class LamdaExp {
    
    public static void main(String[] args) {
      /* 
        InnerLamdaExp ile = new InnerLamdaExp() {
            public int add(int a, int b){
                return a+b+1;
            }
        }; */

        // Using LamdaExpression
        InnerLamdaExp ile = (a,b) -> a+b+1;

        int result = ile.add(2, 3);
        System.out.println(result);
    }
}
