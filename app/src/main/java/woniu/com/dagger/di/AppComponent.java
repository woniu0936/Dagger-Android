package woniu.com.dagger.di;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author woniu
 * @title AppComponent
 * @description
 * @since 2018/9/1 下午5:53
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
}
