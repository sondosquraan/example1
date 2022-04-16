package edu.cs.birzeit.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtName;
    private EditText edtPassword;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
        edtPassword = findViewById(R.id.edtPassword);
        spinner = findViewById(R.id.spinner);
    }
    public void btnSubmitOnClick(View view) {
        String name = edtName.getText().toString();
        String password = edtPassword.getText().toString();
        String msg = " name: " + name + " password: " + password;
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }
    public void btnSubmit_Click(View view) {
        String item = spinner.getSelectedItem().toString();
        Toast.makeText(this, item, Toast.LENGTH_SHORT).show();
    }
}