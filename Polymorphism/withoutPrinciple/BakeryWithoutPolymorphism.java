
    public class BakeryWithoutPolymorphism {
        public void orderCake() {
            System.out.println("Cake ordered! Price: $20");
        }
    
        public void orderCookies() {
            System.out.println("Cookies ordered! Price: $10");
        }
    
        public void orderPastry() {
            System.out.println("Pastry ordered! Price: $15");
        }
        
        public void orderBread() {
            System.out.println("Bread ordered! Price: $8");
        }
        
        public void orderDonut() {
            System.out.println("Donut ordered! Price: $12");
        }
    
    
        public class withoutPrinciple {
        public static void main(String[] args) {
              BakeryWithoutPolymorphism order = new BakeryWithoutPolymorphism();
            
            order.orderCake();
            order.orderCookies();
            order.orderPastry();
            order.orderBread();
            order.orderDonut();
        }
        
    }
    
    
}
