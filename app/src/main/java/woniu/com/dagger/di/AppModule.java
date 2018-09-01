package woniu.com.dagger.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import woniu.com.dagger.App;

/**
 * @author woniu
 * @title AppModule
 * @description
 * @since 2018/9/1 下午5:53
 */
@Module
public class AppModule {

    private App mApp;

    public AppModule(App app) {
        this.mApp = app;
    }

    @Singleton
    @Provides
    App provideApp() {
        return mApp;
    }
}
