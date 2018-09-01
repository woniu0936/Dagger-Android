package woniu.com.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import woniu.com.dagger.di.main.DaggerMainComponent;
import woniu.com.dagger.di.main.MainModule;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainViewModel mViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder()
                .appComponent(App.getInstance().getAppComponent())
                .mainModule(new MainModule())
                .build()
                .inject(this);
        TextView tvText = findViewById(R.id.tv_text);
        tvText.setText(mViewModel.getName());

    }
}
