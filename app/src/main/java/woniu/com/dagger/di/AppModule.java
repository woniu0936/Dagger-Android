package woniu.com.dagger.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import woniu.com.dagger.di.main.MainComponent;

/**
 * @author woniu
 * @title AppModule
 * @description
 * @since 2018/9/1 下午5:53
 */
@Module(subcomponents = {MainComponent.class})
public class AppModule {

    @Singleton
    @Provides
    Context provideContext(Application application) {
        return application;
    }
}
