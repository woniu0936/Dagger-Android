package woniu.com.dagger;

import android.app.Application;

import woniu.com.dagger.di.AppComponent;
import woniu.com.dagger.di.AppModule;
import woniu.com.dagger.di.DaggerAppComponent;

/**
 * @author woniu
 * @title App
 * @description
 * @since 2018/9/1 下午5:52
 */
public class App extends Application {

    private AppComponent mAppComponent;
    private static App mApp;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static App getInstance() {
        return mApp;
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
