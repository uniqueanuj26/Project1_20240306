
class MyFirstClass{

    String name;
    int num;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + num;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyFirstClass other = (MyFirstClass) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (num != other.num)
            return false;
        return true;
    }
    
}

public class FirstProgram {


    public static void main(String[] args) {
       
        /* *
        System.out.println("This is my first program");
        int num=10_000_000;
        char alpha = 'a';
        while (num < 10_000_005) {
            System.out.println(alpha++ +":"+num++);
            
        }
        if (false)
            System.out.println("hello");
        else
            System.out.println("hi");
            */


        MyFirstClass mfc = new MyFirstClass();
        mfc.setName("Anuj Thapa");
        mfc.setNum(30);
        System.out.println(mfc.getName() +":"+ mfc.getNum());

        MyFirstClass mfc1 = new MyFirstClass();
        mfc1.setName("Anuj Thapa");
        mfc1.setNum(31);

        boolean result = mfc.equals(mfc1);
        System.out.println(result);
        System.out.println(mfc.hashCode() +":"+ mfc1.hashCode());


        
    }
}
