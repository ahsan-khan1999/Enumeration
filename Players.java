public enum Players {


    PLAYERS{

        Strong(3) ,Moderate(2) , Weak(1);

    }
    var j;
    private Power(int i){
        j=i;
    }

    public var getJ() {
        return j;
    }

    public static void main(String[] args) {
        Players players = new Players(0);
    }

}
