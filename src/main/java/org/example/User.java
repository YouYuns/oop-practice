package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        //to-be
        // RandomPasswordGenerator rp = new RandomPasswordGenerator();
        //처음에 이렇게 랜덤한 패스워드 어떤 패스워드르 만들지 모르기 때문에 테스트코드를 짜기 어려운것이다.
        //그래서 인터페이스를 만들어서 패스워드를 만드는 부분을 컨트롤한다.
        //PasswordGenerator는 Interface인데 해당 부분을 파라미터로 받아서 사용가능하다.

        //as-is
        String password = passwordGenerator.generatePassword();
        //인터페이스를 통해서 generatePassword 내 구현체가 어떤것인지는 모르겠지만
        //이렇게 하면 테스트코드를 작성하다보면 결합도를 낮출 수 있다.
        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if(password.length() >= 8 && password.length()<= 12){
            this.password = password;
        }

    }

    public String getPassword() {
        return password;
    }
}
