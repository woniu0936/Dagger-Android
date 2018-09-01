package woniu.com.dagger.di.main;

import dagger.Component;
import woniu.com.dagger.MainActivity;
import woniu.com.dagger.di.Activity;
import woniu.com.dagger.di.AppComponent;

/**
 * @author woniu
 * @title MainComponent
 * @description
 * @since 2018/9/1 下午6:36
 */
@Activity
@Component(dependencies = AppComponent.class, modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity activity);

}
