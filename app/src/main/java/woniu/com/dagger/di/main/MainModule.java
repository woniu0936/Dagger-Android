package woniu.com.dagger.di.main;

import dagger.Module;
import dagger.Provides;
import woniu.com.dagger.main.MainViewModel;

/**
 * @author woniu
 * @title MainModule
 * @description
 * @since 2018/9/1 下午6:37
 */
@Module
public class MainModule {

    @Provides
    MainViewModel provideViewModel() {
        return new MainViewModel("MainViewModel");
    }

}
