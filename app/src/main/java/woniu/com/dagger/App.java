package woniu.com.dagger;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import woniu.com.dagger.di.DaggerAppComponent;

/**
 * @author woniu
 * @title App
 * @description
 * @since 2018/9/1 下午5:52
 */
public class App extends DaggerApplication {

    private static App mApp;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
    }

    public static App getInstance() {
        return mApp;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
