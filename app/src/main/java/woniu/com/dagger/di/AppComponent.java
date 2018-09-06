package woniu.com.dagger.di;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import woniu.com.dagger.App;

/**
 * @author woniu
 * @title AppComponent
 * @description
 * @since 2018/9/1 下午5:53
 */
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent builder();
    }

    void inject(App app);

}
