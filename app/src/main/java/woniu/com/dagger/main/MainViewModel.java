package woniu.com.dagger.main;

/**
 * @author woniu
 * @title MainViewModel
 * @description
 * @since 2018/9/1 下午7:01
 */
public class MainViewModel {

    String name;

    public MainViewModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
