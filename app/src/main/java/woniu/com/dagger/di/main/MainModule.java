package woniu.com.dagger.di.main;

import dagger.Module;
import dagger.Provides;
import woniu.com.dagger.MainViewModel;
import woniu.com.dagger.di.Activity;

/**
 * @author woniu
 * @title MainModule
 * @description
 * @since 2018/9/1 下午6:37
 */
@Module
public class MainModule {

    @Activity
    @Provides
    MainViewModel provideTextView() {
        return new MainViewModel("MainViewModel");
    }

}
