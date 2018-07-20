package com.example.umarramadhana.atp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.umarramadhana.atp.network.AccountClient;
import com.example.umarramadhana.atp.pojo.Account;

public class MainActivity extends AppCompatActivity {
    private EditText mNamaEditText;
    private EditText mEmailEditText;
    private EditText mNoKtpEditText;
    private EditText mAddressEditText;
    private EditText mNoHpEditText;
    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private EditText mAddSaldoEditText;
    private Button mAddAccountButton;
    private Button mAddSaldoButton;
    private AccountClient accountClient = new AccountClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initLayoutObject();
        initButtonListener();
    }

    private void initButtonListener() {
        mAddAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String accountName = mNamaEditText.getText().toString();
                String accountEmail = mEmailEditText.getText().toString();
                String accountNoKtp = mNoKtpEditText.getText().toString();
                String accountAddress = mAddressEditText.getText().toString();
                String accountNoHp = mNoHpEditText.getText().toString();
                String accountUsername = mUsernameEditText.getText().toString();
                String accountPassword = mPasswordEditText.getText().toString();
                Account account = new Account(accountName, accountEmail, accountNoKtp, accountAddress, accountNoHp, accountUsername, accountPassword);
                accountClient.addAccount(account);
            }
        });

        mAddSaldoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer jumlah_saldo = Integer.valueOf(mAddSaldoEditText.getText().toString());
                String accountNoHp = mNoHpEditText.getText().toString();
                accountClient.addSaldo(accountNoHp, jumlah_saldo);
            }
        });
    }

    private void initLayoutObject() {
        mAddAccountButton = (Button) findViewById(R.id.btn_add_account);
        mAddSaldoButton = (Button) findViewById(R.id.btn_add_saldo);
        mNamaEditText= (EditText) findViewById(R.id.et_nama);
        mEmailEditText = (EditText) findViewById(R.id.et_email);
        mNoKtpEditText = (EditText) findViewById(R.id.et_no_ktp);
        mAddressEditText = (EditText) findViewById(R.id.et_address);
        mNoHpEditText = (EditText) findViewById(R.id.et_no_hp);
        mUsernameEditText = (EditText) findViewById(R.id.et_username);
        mPasswordEditText = (EditText) findViewById(R.id.et_password);
        mAddSaldoEditText = (EditText) findViewById(R.id.et_jumlah_saldo);
    }
}
