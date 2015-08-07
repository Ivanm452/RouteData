package ivchek.routedata.fragments;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TextView;

import ivchek.routedata.R;

public class FragmentRouteData extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.fragment_route_data, container, false);
        initializeTabs(view);
        return view;
    }

    private void initializeTabs(View view)
    {
        final TabHost rDataTabHost = (TabHost) view.findViewById(R.id.rData_tabHost);
        rDataTabHost.setup();
        TabHost.TabSpec specs = rDataTabHost.newTabSpec("tab1");
        specs.setContent(R.id.rData_tab1);
        specs.setIndicator(getResources().getString(R.string.rData_Tab1));
        rDataTabHost.addTab(specs);

        specs = rDataTabHost.newTabSpec("tab2");
        specs.setContent(R.id.rData_tab2);
        specs.setIndicator(getResources().getString(R.string.rData_Tab1));
        rDataTabHost.addTab(specs);

        specs = rDataTabHost.newTabSpec("tab3");
        specs.setContent(R.id.rData_tab3);
        specs.setIndicator(getResources().getString(R.string.rData_Tab1));
        rDataTabHost.addTab(specs);
        rDataTabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.WHITE);
        TextView tv = (TextView) rDataTabHost.getTabWidget().getChildAt(0).findViewById(android.R.id.title);
        tv.setTextColor(getResources().getColor(R.color.dominant_color));
        rDataTabHost.getTabWidget().getChildAt(1).setBackgroundColor(getResources().getColor(R.color.dominant_color));
        tv = (TextView) rDataTabHost.getTabWidget().getChildAt(1).findViewById(android.R.id.title);
        tv.setTextColor(Color.WHITE);
        rDataTabHost.getTabWidget().getChildAt(2).setBackgroundColor(getResources().getColor(R.color.dominant_color));
        tv = (TextView) rDataTabHost.getTabWidget().getChildAt(2).findViewById(android.R.id.title);
        tv.setTextColor(Color.WHITE);

        rDataTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {

            public void onTabChanged(String yourArghere)
            {

                for(int i=0;i<rDataTabHost.getTabWidget().getChildCount();i++)
                {
                    rDataTabHost.getTabWidget().getChildAt(i)
                            .setBackgroundColor(getResources().getColor(R.color.dominant_color));
                    TextView tv = (TextView) rDataTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
                    tv.setTextColor(Color.WHITE);
                }
                rDataTabHost.getTabWidget().getChildAt(rDataTabHost.getCurrentTab())
                        .setBackgroundColor(Color.WHITE);
                TextView tv = (TextView) rDataTabHost.getTabWidget().getChildAt(rDataTabHost.getCurrentTab()).findViewById(android.R.id.title);

                tv.setTextColor(getResources().getColor(R.color.dominant_color));

            }
        });
    }
}
