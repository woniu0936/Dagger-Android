package woniu.com.dagger.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import woniu.com.dagger.R;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainViewModel mViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvText = findViewById(R.id.tv_text);
        tvText.setText(mViewModel.getName());

    }
}
