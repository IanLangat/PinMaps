package com.openmaps.mwaura.pinmap;

//import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;

import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;

public class MainActivity extends Activity {

    private MapController mapController;
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapView = (MapView) findViewById(R.id.mapview);
        mapView.setTileSource(TileSourceFactory.MAPNIK);
        mapView.setBuiltInZoomControls(true);
        mapController = (MapController)mapView.getController();
        mapController.setZoom(15);

        GeoPoint point2 = new GeoPoint(-1.2833,36.8167);
        mapController.setCenter(point2);
    }

    protected boolean isRouteDisplayed(){

        return true;
    }
}
