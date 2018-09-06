package woniu.com.dagger.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author woniu
 * @title AppModule
 * @description
 * @since 2018/9/1 下午5:53
 */
@Module
public class AppModule {

    @Singleton
    @Provides
    Context provideContext(Application application) {
        return application;
    }
}
