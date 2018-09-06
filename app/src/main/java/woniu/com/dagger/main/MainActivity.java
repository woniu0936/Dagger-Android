package woniu.com.dagger.main;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.DaggerActivity;
import woniu.com.dagger.R;

public class MainActivity extends DaggerActivity {

    @Inject
    MainViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvText = findViewById(R.id.tv_text);
        tvText.setText(mViewModel.getName());

    }
}
