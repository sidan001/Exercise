package com.effective_java.concurrency.composing_objects;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * PublishingVehicleTracker
 * <p/>
 * Vehicle tracker that safely publishes underlying state
 *
 * @author Brian Goetz and Tim Peierls
 */
public class PublishingVehicleTracker {
    private final Map<String, SafePoint> locations;
    private final Map<String, SafePoint> unmodifiableMap;

    public PublishingVehicleTracker(Map<String, SafePoint> locations) {
        this.locations = new ConcurrentHashMap<String, SafePoint>(locations);
        this.unmodifiableMap = Collections.unmodifiableMap(this.locations);//
    }
    /*, the delegating version returns an unmodifiable but “live” view of the vehicle locations*/
    public Map<String, SafePoint> getLocations() {
        return unmodifiableMap;//
    }
    /*Returning a static copy of the location set instead of a “live” one*/
    public Map<String, SafePoint> getLocationsAsStatic() {
        return Collections.unmodifiableMap(
                new HashMap<String, SafePoint>(locations));
    }

    public SafePoint getLocation(String id) {
        return locations.get(id);
    }

    public void setLocation(String id, int x, int y) {
        if (!locations.containsKey(id))
            throw new IllegalArgumentException("invalid vehicle name: " + id);
        locations.get(id).set(x, y);
    }
}