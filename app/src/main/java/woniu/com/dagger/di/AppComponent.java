package woniu.com.dagger.di;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import woniu.com.dagger.App;

/**
 * @author woniu
 * @title AppComponent
 * @description
 * @since 2018/9/1 下午5:53
 */
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent extends AndroidInjector<App> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {
    }

}
