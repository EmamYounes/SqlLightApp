package com.example.sqllightapp;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sqllightapp.LocalData.DatabaseHelper;
import com.example.sqllightapp.Model.ToDoModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHelper databaseHelper = new DatabaseHelper(getApplicationContext());
        ToDoModel model = new ToDoModel();
        model.setCardMail("emam@mail.com");
        model.setCardTitle("emam title");
        model.setCardDescription("emam description");
        databaseHelper.insertToDoColumn(model);
        ToDoModel model2 = new ToDoModel();
        model.setCardMail("ahmed@mail.com");
        model.setCardTitle("ahmed title");
        model.setCardDescription("ahmed description");
        databaseHelper.insertToDoColumn(model2);
        ToDoModel model3 = new ToDoModel();
        model.setCardMail("mohamed@mail.com");
        model.setCardTitle("mohamed title");
        model.setCardDescription("mohamed description");
        databaseHelper.insertToDoColumn(model3);
        Log.d("dataBaseCreate", databaseHelper.getToDoList().get(0).getCardMail()+"");
    }
}
