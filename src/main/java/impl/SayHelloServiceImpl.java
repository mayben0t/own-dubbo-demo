package impl;

import service.SayHelloService;

public class SayHelloServiceImpl implements SayHelloService {

    @Override
    public String sayHello(String str) {
        return "hello "+str;
    }
}
