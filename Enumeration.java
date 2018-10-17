public class Enumeration {

    enum Hit{
        Strong(3),Moderate(2),Weak(1);


        int k;
        protected Power(int i){
            k = i;
        }

        public int getPower(){
            return k;
        }
    }

    public static void main(String[] args) {
        Hit p1 = Hit.Strong;
        Hit p2 = Hit.Moderate;
        Hit p3 = Hit.Weak;

//        for (Power temp : Power.values()){
//            System.out.println("Power of Players : "+temp);
//        }
//        System.out.println(Power.Moderate);
        System.out.println(p1.getPower());

    }
}
