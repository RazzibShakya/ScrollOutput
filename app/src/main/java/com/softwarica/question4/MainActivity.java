package com.softwarica.question4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtdisplay;
EditText txtmake,txtyear,txtcolor,txtprice,txtsize;
Button btncreate;
private String make,year,color,price,size;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiate();
    }
    public void initiate(){
    txtmake=findViewById(R.id.txtMake);
    txtcolor=findViewById(R.id.txtColor);
    txtprice=findViewById(R.id.txtPurchasePrice);
    txtyear=findViewById(R.id.txtYear);
    txtsize=findViewById(R.id.txtEngineSize);
    btncreate=findViewById(R.id.btnCreateCar);
    txtdisplay=findViewById(R.id.txtScrollable);
    txtdisplay.setMovementMethod(new ScrollingMovementMethod());
    btncreate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            display();
        }
    });
    }
    private void display(){
       make=txtmake.getText().toString();
       year=txtyear.getText().toString();
       color=txtcolor.getText().toString();
       price=txtprice.getText().toString();
       size=txtsize.getText().toString();
        CarModel cm=new CarModel(make,year,color,price,size);
        String data = "\r\n" +"Make:"+cm.getMake()+"."+"\r\n"+ "Year:"+cm.getYear()
                +"."+"\r\n"+ "Color:"+cm.getColor()+"."+"\r\n"
                + "Purchase Price:"+cm.getPrice()
                +"."+"\r\n"+ "Engine Size:"+cm.getSize();
        txtdisplay.setText(txtdisplay.getText().toString()+"\r\n"+data);
    }
}
