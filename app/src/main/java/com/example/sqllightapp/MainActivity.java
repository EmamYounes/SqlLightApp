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
    }

    @Override
    protected void onResume() {
        super.onResume();
        DatabaseHelper databaseHelper = new DatabaseHelper(getApplicationContext());
        ToDoModel model = new ToDoModel();
        model.setCardMail("emam@mail.com");
        model.setCardTitle("emam title");
        model.setCardDescription("emam description");
        model.setToDoDate("2/2/2020");
        databaseHelper.insertToDoColumn(model);
        ToDoModel model2 = new ToDoModel();
        model2.setCardMail("ahmed@mail.com");
        model2.setCardTitle("ahmed title");
        model2.setCardDescription("ahmed description");
        model2.setToDoDate("6/6/6060");
        databaseHelper.insertToDoColumn(model2);
        ToDoModel model3 = new ToDoModel();
        model3.setCardMail("mohamed@mail.com");
        model3.setCardTitle("mohamed title");
        model3.setCardDescription("mohamed description");
        model3.setToDoDate("7/7/7070");
        databaseHelper.insertToDoColumn(model3);
        databaseHelper.updateToDoModel(new ToDoModel(2, "", "", "", ""));
        Log.d("dataBaseCreate", databaseHelper.getToDoListCount() + "");
    }
}
