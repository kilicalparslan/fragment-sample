package com.alparslankilic.fragmentsample;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment1 extends Fragment {
    EditText editText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        editText = getActivity().findViewById(R.id.fragment1EditText);
        super.onActivityCreated(savedInstanceState);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //her yazılan karakter s parametresi ile verilecek
                TextView textView = getActivity().findViewById(R.id.fragment2TextView);
                textView.setText(editText.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}