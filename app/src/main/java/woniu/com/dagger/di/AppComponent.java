package woniu.com.dagger.di;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import woniu.com.dagger.App;

/**
 * @author woniu
 * @title AppComponent
 * @description
 * @since 2018/9/1 下午5:53
 */
@Component(modules = {AndroidSupportInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent extends AndroidInjector<App> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {
    }

}
