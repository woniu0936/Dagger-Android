package woniu.com.dagger.di;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import woniu.com.dagger.di.main.MainComponent;
import woniu.com.dagger.main.MainActivity;

/**
 * @author woniu
 * @title ActivityBuilder
 * @description
 * @since 2018/9/6 上午10:59
 */
@Module
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainComponent.Builder builder);

}
