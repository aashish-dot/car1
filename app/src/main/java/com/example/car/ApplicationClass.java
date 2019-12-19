package com.example.car;

import android.app.Application;
import android.content.ContentProvider;
import android.os.Build;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Car> cars;
    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     *
     * <p>Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.</p>
     *
     * <p>If you override this method, be sure to call {@code super.onCreate()}.</p>
     *
     * <p class="note">Be aware that direct boot may also affect callback order on
     * Android {@link Build.VERSION_CODES#N} and later devices.
     * Until the user unlocks the device, only direct boot aware components are
     * allowed to run. You should consider that all direct boot unaware
     * components, including such {@link ContentProvider}, are
     * disabled until user unlock happens, especially when component callback
     * order matters.</p>
     */
    @Override
    public void onCreate() {
        super.onCreate();
        cars= new ArrayList<Car>();
        cars.add(new Car("Volkswagan","polo","Aashish singh","8529164306"));
        cars.add(new Car("Mercedes","E200","tony stark","9867432876"));
        cars.add(new Car("Nissan","Almera","Steave roger ","916737143"));
        cars.add(new Car("Mercedes","E180","Thor","9789352607"));
        cars.add(new Car("Volkswagan","Kombi","Hulk","8164493625"));
        cars.add(new Car("Nissan","polo","Aashish singh","9753135791"));


    }
}
