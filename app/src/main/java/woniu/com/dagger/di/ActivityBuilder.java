package woniu.com.dagger.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import woniu.com.dagger.di.main.MainModule;
import woniu.com.dagger.main.MainActivity;

/**
 * @author woniu
 * @title ActivityBuilder
 * @description
 * @since 2018/9/6 上午10:59
 */
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity bindMainActivity();

}
