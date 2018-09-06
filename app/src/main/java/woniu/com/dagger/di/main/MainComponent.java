package woniu.com.dagger.di.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import woniu.com.dagger.main.MainActivity;

/**
 * @author woniu
 * @title MainComponent
 * @description
 * @since 2018/9/1 下午6:36
 */
@Subcomponent(modules = MainModule.class)
public interface MainComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}

}
