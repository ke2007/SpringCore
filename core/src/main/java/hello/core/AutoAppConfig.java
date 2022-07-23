package hello.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration //설정정보
@ComponentScan(
        basePackages = "hello.core.member",       // hello.core.member만 컴포넌트 스캔의 대상이 된다.
        excludeFilters =  @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) //해당 애노테이션을 뺌으로 원래 만들어놨던 AppConfig파일을 예외처리.
) // 스프링 빈을 쫙 긁어서 자동으로 가져옴
public class AutoAppConfig {






}
