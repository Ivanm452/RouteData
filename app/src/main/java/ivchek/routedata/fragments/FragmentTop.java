package ivchek.routedata.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import ivchek.routedata.R;

public class FragmentTop extends Fragment
{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        TextView tvTop = (TextView) view.findViewById(R.id.fTop_tvTop);
        tvTop.setText(getResources().getString(R.string.fTop_tvTop));// this would be changed dinamically depending on which is the middle fragment
        return view;
    }
}
