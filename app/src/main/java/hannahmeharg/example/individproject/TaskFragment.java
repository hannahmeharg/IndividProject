package hannahmeharg.example.individproject;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.EditText;
import java.util.UUID;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Button;

import android.text.TextWatcher;
import android.text.Editable;


public class TaskFragment extends Fragment {
    private Tasks mTask;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTask = new Tasks();
    }

    //  inflate the layout for the fragment’s view and return the inflated View to the
    //hosting activity
    //  Bundle will contain data that this method can use to re-create the view from a saved state
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_task, container, false);
        mTitleField = (EditText) v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            // wiring widgets in fragment
            @Override
            public void beforeTextChanged(
                    CharSequence s, int start, int count, int after) {
            // This space intentionally left blank
            }

            // returns a string used to create title of the task
            @Override
            public void onTextChanged(
                    CharSequence s, int start, int before, int count) {
                mTask.setTitle(s.toString());
            }
            @Override
            public void afterTextChanged(Editable s) {
            // This one too
            }
        });

        // connect buttons to display the date of the task
        mDateButton = (Button) v.findViewById(R.id.crime_date);
        mDateButton.setText(mTask.getDate().toString());
        mDateButton.setEnabled(false);

        mSolvedCheckBox = (CheckBox)v.findViewById(R.id.crime_solved);
        mSolvedCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                mTask.setSolved(isChecked);
            }
        });

        return v;
    }
}
