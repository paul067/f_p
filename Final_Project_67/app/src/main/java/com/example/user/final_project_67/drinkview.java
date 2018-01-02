package com.example.user.final_project_67;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class drinkview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinkview);
        Button back2 = (Button)findViewById(R.id.back2);

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(drinkview.this,top.class);
                startActivity(i);
            }
        });

        juice();
        tea();
        milk();
        coffee();
        sorbet();
        yoghurt();
        spectial();
    }



    public  void  juice(){
        Data[] juice_data = new Data[9];
        for(int i=0;i<juice_data.length;i++)
        {
            juice_data[i] = new Data();
        }
        juice_data[0].photo = R.drawable.g1;
        juice_data[0].name ="西瓜汁";
        juice_data[1].photo = R.drawable.g2;
        juice_data[1].name ="芒果汁";
        juice_data[2].photo = R.drawable.g3;
        juice_data[2].name ="奇異果汁";
        juice_data[3].photo = R.drawable.g4;
        juice_data[3].name ="芭樂汁";
        juice_data[4].photo = R.drawable.g5;
        juice_data[4].name ="柳橙汁";
        juice_data[5].photo = R.drawable.g6;
        juice_data[5].name ="香蕉汁";
        juice_data[6].photo = R.drawable.g7;
        juice_data[6].name ="葡萄汁";
        juice_data[7].photo = R.drawable.g8;
        juice_data[7].name ="檸檬汁";
        juice_data[8].photo = R.drawable.g9;
        juice_data[8].name ="蘋果汁";


        myAdapter foodAdapter = new myAdapter(juice_data,R.layout.drink_view);
        GridView gridView1 = (GridView)findViewById(R.id.gridview1);
        gridView1.setNumColumns(9);
        gridView1.setAdapter(foodAdapter);
        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent f = new Intent();
                Bundle g = new Bundle();
                g.putInt("num",i);
                g.putInt("grid",1);
                f.putExtras(g);
                f.setClass(drinkview.this,get.class);
                startActivity(f);
                finish();
            }
        });
    }

    public  void  tea(){
        Data[] tea_data = new Data[6];
        for(int i=0;i<tea_data.length;i++)
        {
            tea_data[i] = new Data();
        }
        tea_data[0].photo = R.drawable.f1;
        tea_data[0].name ="白茶";
        tea_data[1].photo = R.drawable.f2;
        tea_data[1].name ="青茶";
        tea_data[2].photo = R.drawable.f3;
        tea_data[2].name ="紅茶";
        tea_data[3].photo = R.drawable.f4;
        tea_data[3].name ="黃茶";
        tea_data[4].photo = R.drawable.f5;
        tea_data[4].name ="黑茶";
        tea_data[5].photo = R.drawable.f6;
        tea_data[5].name ="綠茶";

        myAdapter foodAdapter = new myAdapter(tea_data,R.layout.drink_view);
        GridView gridView2 = (GridView)findViewById(R.id.gridview2);
        gridView2.setNumColumns(6);
        gridView2.setAdapter(foodAdapter);
        gridView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent f = new Intent();
                Bundle g = new Bundle();
                g.putInt("num",i);
                g.putInt("grid",2);
                f.putExtras(g);
                f.setClass(drinkview.this,get.class);
                startActivity(f);
                finish();
            }
        });
    }

    public  void  milk(){
        Data[] milk_data = new Data[7];
        for(int i=0;i<milk_data.length;i++)
        {
            milk_data[i] = new Data();
        }
        milk_data[0].photo = R.drawable.e1;
        milk_data[0].name ="奶茶";
        milk_data[1].photo = R.drawable.e2;
        milk_data[1].name ="巧克力奶茶";
        milk_data[2].photo = R.drawable.e3;
        milk_data[2].name ="布丁乃茶";
        milk_data[3].photo = R.drawable.e4;
        milk_data[3].name ="花生奶茶";
        milk_data[4].photo = R.drawable.e5;
        milk_data[4].name ="珍珠奶茶";
        milk_data[5].photo = R.drawable.e6;
        milk_data[5].name ="草莓奶茶";
        milk_data[6].photo = R.drawable.e7;
        milk_data[6].name ="薄荷奶茶";


        myAdapter foodAdapter = new myAdapter(milk_data,R.layout.drink_view);
        GridView gridview3 = (GridView)findViewById(R.id.gridview3);
        gridview3.setNumColumns(7);
        gridview3.setAdapter(foodAdapter);
        gridview3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent f = new Intent();
                Bundle g = new Bundle();
                g.putInt("num",i);
                g.putInt("grid",3);
                f.putExtras(g);
                f.setClass(drinkview.this,get.class);
                startActivity(f);
                finish();
            }
        });
    }

    public  void  coffee(){
        Data[] coffee_data = new Data[5];
        for(int i=0;i<coffee_data.length;i++)
        {
            coffee_data[i] = new Data();
        }
        coffee_data[0].photo = R.drawable.d1;
        coffee_data[0].name ="咖啡";
        coffee_data[1].photo = R.drawable.d2;
        coffee_data[1].name ="卡布奇諾";
        coffee_data[2].photo = R.drawable.d3;
        coffee_data[2].name ="拿鐵";
        coffee_data[3].photo = R.drawable.d4;
        coffee_data[3].name ="焦糖瑪奇朵";
        coffee_data[4].photo = R.drawable.d5;
        coffee_data[4].name ="摩卡";

        myAdapter foodAdapter = new myAdapter(coffee_data,R.layout.drink_view);
        GridView gridview4 = (GridView)findViewById(R.id.gridview4);
        gridview4.setNumColumns(5);
        gridview4.setAdapter(foodAdapter);
        gridview4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent f = new Intent();
                Bundle g = new Bundle();
                g.putInt("num",i);
                g.putInt("grid",4);
                f.putExtras(g);
                f.setClass(drinkview.this,get.class);
                startActivity(f);
                finish();
            }
        });
    }

    public  void  sorbet(){
        Data[] sorbet_data = new Data[8];
        for(int i=0;i<sorbet_data.length;i++)
        {
            sorbet_data[i] = new Data();
        }
        sorbet_data[0].photo = R.drawable.c1;
        sorbet_data[0].name ="西瓜冰沙";
        sorbet_data[1].photo = R.drawable.c2;
        sorbet_data[1].name ="芒果冰沙";
        sorbet_data[2].photo = R.drawable.c3;
        sorbet_data[2].name ="奇異果冰沙";
        sorbet_data[3].photo = R.drawable.c4;
        sorbet_data[3].name ="抹茶冰沙";
        sorbet_data[4].photo = R.drawable.c5;
        sorbet_data[4].name ="紅豆冰沙";
        sorbet_data[5].photo = R.drawable.c6;
        sorbet_data[5].name ="草莓冰沙";
        sorbet_data[6].photo = R.drawable.c7;
        sorbet_data[6].name ="焦糖瑪奇朵冰沙";
        sorbet_data[7].photo = R.drawable.c8;
        sorbet_data[7].name ="綠豆冰沙";


        myAdapter foodAdapter = new myAdapter(sorbet_data,R.layout.drink_view);
        GridView gridview5 = (GridView)findViewById(R.id.gridview5);
        gridview5.setNumColumns(8);
        gridview5.setAdapter(foodAdapter);
        gridview5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent f = new Intent();
                Bundle g = new Bundle();
                g.putInt("num",i);
                g.putInt("grid",5);
                f.putExtras(g);
                f.setClass(drinkview.this,get.class);
                startActivity(f);
                finish();
            }
        });
    }

    public  void  yoghurt(){
        Data[] yoghurt_data = new Data[5];
        for(int i=0;i<yoghurt_data.length;i++)
        {
            yoghurt_data[i] = new Data();
        }
        yoghurt_data[0].photo = R.drawable.a2;
        yoghurt_data[0].name ="西瓜優酪乳";
        yoghurt_data[1].photo = R.drawable.a3;
        yoghurt_data[1].name ="紅豆香蕉優酪乳";
        yoghurt_data[2].photo = R.drawable.a4;
        yoghurt_data[2].name ="草莓優酪乳";
        yoghurt_data[3].photo = R.drawable.a5;
        yoghurt_data[3].name ="葡萄優酪乳";
        yoghurt_data[4].photo = R.drawable.a1;
        yoghurt_data[4].name ="優酪乳";

        myAdapter foodAdapter = new myAdapter(yoghurt_data,R.layout.drink_view);
        GridView gridview6 = (GridView)findViewById(R.id.gridview6);
        gridview6.setNumColumns(5);
        gridview6.setAdapter(foodAdapter);
        gridview6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent f = new Intent();
                Bundle g = new Bundle();
                g.putInt("num",i);
                g.putInt("grid",6);
                f.putExtras(g);
                f.setClass(drinkview.this,get.class);
                startActivity(f);
                finish();
            }
        });
    }

    public  void  spectial(){
        Data[] spectial_data = new Data[8];
        for(int i=0;i<spectial_data.length;i++)
        {
            spectial_data[i] = new Data();
        }
        spectial_data[0].photo = R.drawable.b1;
        spectial_data[0].name ="特調百香紅茶";
        spectial_data[1].photo = R.drawable.b2;
        spectial_data[1].name ="特調百香綠茶";
        spectial_data[2].photo = R.drawable.b3;
        spectial_data[2].name ="特調柳橙牛奶";
        spectial_data[3].photo = R.drawable.b4;
        spectial_data[3].name ="特調雪碧";
        spectial_data[4].photo = R.drawable.b5;
        spectial_data[4].name ="特調蜂蜜紅茶";
        spectial_data[5].photo = R.drawable.b6;
        spectial_data[5].name ="特調蜂蜜綠茶";
        spectial_data[6].photo = R.drawable.b7;
        spectial_data[6].name ="特調話梅綠茶";
        spectial_data[7].photo = R.drawable.b8;
        spectial_data[7].name ="酸梅烏龍茶";


        myAdapter foodAdapter = new myAdapter(spectial_data,R.layout.drink_view);
        GridView gridview7 = (GridView)findViewById(R.id.gridview7);
        gridview7.setNumColumns(8);
        gridview7.setAdapter(foodAdapter);
        gridview7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent f = new Intent();
                Bundle g = new Bundle();
                g.putInt("num",i);
                g.putInt("grid",7);
                f.putExtras(g);
                f.setClass(drinkview.this,get.class);
                startActivity(f);
                finish();
            }
        });
    }
    class Data{
        int photo;
        String name;
    }

    public class myAdapter extends BaseAdapter {
        private Data[] data;
        private int view;

        public myAdapter(Data[] data, int view) {
            this.data = data;
            this.view = view;
        }

        public int getCount() {
            return data.length;
        }

        public Data getItem(int position) {
            return data[position];
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View rowView, ViewGroup parent) {

            rowView = getLayoutInflater().inflate(view, parent, false);

            TextView name = (TextView) rowView.findViewById(R.id.viewname);

            ImageView imageView = (ImageView) rowView.findViewById(R.id.viewview);
            name.setText(data[position].name);

            imageView.setImageResource(data[position].photo);
            return rowView;
        }
    }

}
