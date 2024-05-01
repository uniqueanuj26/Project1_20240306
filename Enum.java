public class Enum {
    public static void main(String[] args) {
        product[] prod = product.values();
        
        for(product p: prod){
                System.out.println(p);
         }

         productPrice[] pprice = productPrice.values();
         
         int loopid = 101;
         for(productPrice pp: pprice){
            
            System.out.println(pp+":"+pp.getPrice());
            pp.setPrice(loopid);
            System.out.println(pp+":"+pp.getPrice());
            loopid *= 2;
        }
        
    }
}

enum product{
    mobile,laptop,watch,desktop
};

enum productPrice {
    mobile(10000),laptop(50000),watch,desktop(35000);
    
    int price;

    private productPrice(int price) {
        this.price = price;
    }

    private productPrice() {
        price = 15000;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    


};