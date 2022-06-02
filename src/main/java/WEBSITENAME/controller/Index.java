package WEBSITENAME.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Index {
    @GetMapping("/") //@GetMaping : URL 매핑 어노테이션 [ 클라이언트가 요청한 URL 과 연결
    public String index(Model model) { //URL과 매핑되면 실행된 메소드
        model.addAttribute("data", "java데이터");
                
        return "main"; //html 파일명 //타임리프 사용할 경우의
        //클라이언트가 localhost:8080 요청시 Spring 에 Controller 내에서 매핑을 찾음
        //찾은 매핑된 메소드 실행되면서 HTml 파일명 반환
    }
    //httop 요청 메소드 get vs post
        //@GetMapping("/")
        //@PostMapping("/")

    @GetMapping("/getdata")
    @ResponseBody
    public String getdata() {
        return "java데이터123";
    }
}
