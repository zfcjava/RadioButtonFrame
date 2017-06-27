package live.example.com.lianxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.rg);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_find_course) {
                    ((RadioButton) rg.getChildAt(1)).setTextColor(getColor(R.color.font_unselsect));
                    ((RadioButton) rg.getChildAt(0)).setTextColor(getColor(R.color.font_selsect));
                    //TODO Code切换到界面A
                } else {
                    ((RadioButton) rg.getChildAt(0)).setTextColor(getColor(R.color.font_unselsect));
                    ((RadioButton) rg.getChildAt(1)).setTextColor(getColor(R.color.font_selsect));
                    //TODO Code切换到界面B
                }
            }
        });
    }
}
