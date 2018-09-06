package woniu.com.dagger;

import android.app.Activity;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;
import woniu.com.dagger.di.DaggerAppComponent;

/**
 * @author woniu
 * @title App
 * @description
 * @since 2018/9/1 下午5:52
 */
public class App extends DaggerApplication {

    @Inject
    DispatchingAndroidInjector<Activity> mActivityDispatchingAndroidInjector;

    private static App mApp;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }

    public static App getInstance() {
        return mApp;
    }

}
