package hello.core.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonService {
    private static final SingletonService instance = new SingletonService(); //자기자신을 내부에 static인 private으로 가지고있는다. 이렇게하면 스태틱영역에 'instance'한개만 올라간다

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() { //프라이빗으로 선언해서 혹시라도 외부에서new 키워드로 객체 인스턴스가 생성되는것을 미연에 방지
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }


}


