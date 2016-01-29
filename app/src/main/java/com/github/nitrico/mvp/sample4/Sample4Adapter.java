package com.github.nitrico.mvp.sample4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.github.nitrico.mapviewpager.MapViewPager;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public class Sample4Adapter extends MapViewPager.Adapter {

    public static final String[] TITLES = { "Ninguno", "London", "Paris",
            "Barcelona", "Milan", "No", "Brussels" };

    public static final CameraPosition[] POSITIONS = {
            null,
            CameraPosition.builder().target(new LatLng(51.5287352,-0.381784)).zoom(6f).build(),
            CameraPosition.builder().target(new LatLng(48.859,2.2074722)).zoom(6f).build(),
            CameraPosition.builder().target(new LatLng(41.3948976,2.0787274)).zoom(6f).build(),
            CameraPosition.builder().target(new LatLng(45.4628329,9.107692)).zoom(6f).build(),
            null,
            CameraPosition.builder().target(new LatLng(50.8550625,4.3053499)).zoom(6f).build()
    };

    public Sample4Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public Fragment getItem(int position) {
        return Sample4Fragment.newInstance(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }

    @Override
    public CameraPosition getCameraPosition(int position) {
        return POSITIONS[position];
    }

}