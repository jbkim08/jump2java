package s07_자바날개달기;

class Sample{
    private String secret;

    public String getSecret() {
        return secret;
    }
}

public class 접근제어자 {
    public static void main(String[] args) {
        Sample sample = new Sample();
        //sample.secret = "123";
        sample.getSecret();
        // 접근제어자가 없으면 default : 같은 패키지 내에서 접근가능
        // protected : 같은 패키지 또는 상속 받을때
        // private < default < protected < public

    }
}
