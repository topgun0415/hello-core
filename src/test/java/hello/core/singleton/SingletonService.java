package hello.core.singleton;
public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }
    // 다른 클라스에서 객체 생성남용을 막기위해서
    private SingletonService() {

    }


}
