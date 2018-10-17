public enum Tuna{

        ali("nice",20),
        muzumil("kool",19),
        moiz("confuse",20),
        haris("always",23),
        hasam("crazy",23);

        private String calibar;
        private int age;

        private Tuna(String desc ,int ages){
            calibar=desc;
            age=ages;
        }

    public String getCalibar() {
        return calibar;
    }

    public int getAge() {
        return age;
    }

}
