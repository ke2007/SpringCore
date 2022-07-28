package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient implements InitializingBean, DisposableBean {
    private String url; //접속해야할 서버의 URL

    public NetworkClient() {
        System.out.println("생성자 호출 , url = " + url);

    }


    public void setUrl(String url) {
        this.url = url;
    }


    //서비스를 시작할때 호출

    public void connect() {
        System.out.println("connect : " + url);
    }


    public void call(String message) {

        System.out.println(" call : " + url + "message = " + message);

    }

    //서비스종료시 호출

    public void disconnect() {
        System.out.println("close " + url);
    }

    @Override //프로퍼티 세팅이 끝나면 ~ 실행
    public void afterPropertiesSet() throws Exception {
        connect();
        call("초기화 연결 메시지");
    }

    @Override
    public void destroy() throws Exception {
        disconnect();
    }
}
