package edu.tacoma.uw.fragmentpractice;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.tacoma.uw.fragmentpractice.databinding.FragmentSecondBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    private FragmentSecondBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentSecondBinding.inflate(inflater, container, false);
        return mBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Get a reference to the SafeArgs object
        SecondFragmentArgs args = SecondFragmentArgs.fromBundle(getArguments());

        //Set the text color of the label. NOTE no need to cast
        mBinding.textMessage.setText(args.getMessage());

    }

}