package woniu.com.dagger;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import woniu.com.dagger.di.DaggerAppComponent;

/**
 * @author woniu
 * @title App
 * @description
 * @since 2018/9/1 下午5:52
 */
public class App extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> mActivityDispatchingAndroidInjector;

    private static App mApp;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        DaggerAppComponent.builder()
                .application(this)
                .builder()
                .inject(this);
    }

    public static App getInstance() {
        return mApp;
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return mActivityDispatchingAndroidInjector;
    }
}
