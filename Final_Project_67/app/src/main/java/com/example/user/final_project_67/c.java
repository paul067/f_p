package com.example.user.final_project_67;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class c extends AppCompatActivity {
    SQLiteDatabase sq;
    int all;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        TextView c_title = (TextView)findViewById(R.id.c_title);
        TextView c_count = (TextView)findViewById(R.id.c_count);
        TextView c_sum = (TextView)findViewById(R.id.c_sum);
        TextView c_other = (TextView)findViewById(R.id.c_other);
        Button confirm = (Button)findViewById(R.id.c_confirm);
        Button delete = (Button)findViewById(R.id.c_delete);
        Button c_back = (Button)findViewById(R.id.c_back);

        c_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(c.this,top.class);
                startActivity(i);
            }
        });


        DB oh = new DB(this);
        sq = oh.getWritableDatabase();

        String index = "", title = "項目\n", count = "數量\n", sum = "共計\n", other = "註記\n";
        final String[] col = {"title", "count", "sum", "other"};
        Cursor c;
        c = sq.query("orderTable", col, null, null, null, null, null);
        if (c.getCount() > 0) {
            String s;
            int m=0;
            c.moveToFirst();
            for (int i = 0; i < c.getCount(); i++) {
                title += c.getString(0) + "\n";
                count += c.getString(1) + "\n";
                sum += c.getString(2) + "\n";
                other += c.getString(3) + "\n";
                s = c.getString(2).toString();
                m = Integer.parseInt(s);
                all = all+m;
                c.moveToNext();
            }
            c_title.setText(title);
            c_count.setText(count);
            c_sum.setText(sum);
            c_other.setText(other);
        }

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(c.this);
                dialog.setTitle("總額:"+all);
                dialog.setPositiveButton("確認", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(c.this, "購買成功", Toast.LENGTH_SHORT).show();
                        all = 0;
                        sq.delete("orderTable1",null,null);
                        String title, count, sum, other;
                        final String[] col = {"title", "count", "sum", "other"};
                        Cursor c;
                        ContentValues cv = new ContentValues();
                        c = sq.query("orderTable", col, null, null, null, null, null);
                        if (c.getCount() > 0) {
                            c.moveToFirst();
                            for (int q = 0; q < c.getCount(); q++) {
                                title = c.getString(0) + "\n";
                                count = c.getString(1) + "\n";
                                sum = c.getString(2) + "\n";
                                other = c.getString(3) + "\n";

                                cv.put("title",title);
                                cv.put("count",count);
                                cv.put("sum",sum);
                                cv.put("other",other);
                                sq.insert("orderTable1",null,cv);
                                c.moveToNext();
                            }
                            sq.delete("orderTable",null,null);
                        }
                        Intent k = new Intent();
                        k.setClass(c.this,top.class);
                        startActivity(k);
                        finish();
                    }
                });

                dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(c.this);
                dialog.setTitle("刪除項目:");
                final EditText editText = new EditText(c.this);
                dialog.setView(editText);
                dialog.setPositiveButton("確認", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(editText.getText().toString().equals(""))
                        {
                            Toast.makeText(c.this, "尚未輸入項目", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            sq.delete("orderTable","title="+"'"+editText.getText().toString()+"'",null);
                            Toast.makeText(c.this, "刪除成功", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();
            }
        });
    }
}
