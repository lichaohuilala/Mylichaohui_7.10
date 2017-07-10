package com.example.lichaohui.mylichaohui_710;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.lichaohui.mylichaohui_710.view.AmountView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 提交
        AmountView amount = (AmountView) findViewById(R.id.amount_view);
        amount.setGoods_storage(20);
        amount.setOnAmountChangeListener(new AmountView.OnAmountChangeListener() {
            @Override
            public void onAmountChange(View view, int amount) {
                Toast.makeText(MainActivity.this,""+amount,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
