package net.smallacademy.authenticatorapp.ui.cv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import net.smallacademy.authenticatorapp.R;


public class CVFragment extends Fragment {

    private CVViewModel cVViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cVViewModel =
                ViewModelProviders.of(this).get(CVViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cv, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        cVViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}