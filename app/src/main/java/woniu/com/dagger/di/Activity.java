package woniu.com.dagger.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author woniu
 * @title Activity
 * @description
 * @since 2018/9/1 下午6:38
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface Activity {
}
