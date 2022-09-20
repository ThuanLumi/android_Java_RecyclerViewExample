package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contactsRecView;
    private ArrayList<Contact> contacts = new ArrayList<>();
    private ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        contacts.add(new Contact("Bradly cooper", "156121651", "https://www.biography.com/.image/t_share/MTE1ODA0OTcxNTEyODU4MTI1/bradley-cooper-547062-1-402.jpg"));
        contacts.add(new Contact("Saoirse Ronan", "5654646", "https://www.nova.ie/wp-content/uploads/2017/12/Ronan-1.png"));
        contacts.add(new Contact("Sarah Hannah", "156121651", "https://www.biography.com/.image/t_share/MTE1ODA0OTcxNTEyODU4MTI1/bradley-cooper-547062-1-402.jpg"));
        contacts.add(new Contact("John cooper", "156121651", "https://www.biography.com/.image/t_share/MTE1ODA0OTcxNTEyODU4MTI1/bradley-cooper-547062-1-402.jpg"));
        contacts.add(new Contact("Meisam cooper", "156121651", "https://www.biography.com/.image/t_share/MTE1ODA0OTcxNTEyODU4MTI1/bradley-cooper-547062-1-402.jpg"));

        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}