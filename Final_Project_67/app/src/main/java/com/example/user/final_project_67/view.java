package com.example.user.final_project_67;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class view extends AppCompatActivity {
    SQLiteDatabase sl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        TextView v_title = (TextView)findViewById(R.id.v_title);
        TextView v_count = (TextView)findViewById(R.id.v_count);
        TextView v_sum = (TextView)findViewById(R.id.v_sum);
        TextView v_other = (TextView)findViewById(R.id.v_other);

        Button v_back = (Button)findViewById(R.id.v_back);

        v_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(view.this,top.class);
                startActivity(i);
            }
        });

        DB ol = new DB(this);
        sl = ol.getWritableDatabase();

        String index = "", title = "項目\n", count = "數量\n", sum = "共計\n", other = "註記\n";
        String[] col = {"title", "count", "sum", "other"};
        Cursor c;
        c = sl.query("orderTable1", col, null, null, null, null, null);
        if (c.getCount() > 0) {
            c.moveToFirst();
            for (int i = 0; i < c.getCount(); i++) {
                title += c.getString(0) + "\n";
                count += c.getString(1) + "\n";
                sum += c.getString(2) + "\n";
                other += c.getString(3) + "\n";
                c.moveToNext();
            }
            v_title.setText(title);
            v_count.setText(count);
            v_sum.setText(sum);
            v_other.setText(other);
        }
    }
}

