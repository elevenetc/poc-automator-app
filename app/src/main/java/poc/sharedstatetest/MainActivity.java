package poc.sharedstatetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataMediator.activity = this;

        final TextView textStatus = (TextView) findViewById(R.id.text_status);

        textStatus.setText("empty");

        findViewById(R.id.btn_a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textStatus.setText("a");
            }
        });

        findViewById(R.id.btn_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textStatus.setText("b");
            }
        });

        textStatus.setText(DataMediator.VALUE);
    }
}