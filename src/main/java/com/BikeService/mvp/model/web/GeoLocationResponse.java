package com.BikeService.mvp.model.web;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class GeoLocationResponse {
    private LinkedList<Result> results;

    public Coordinates getLocation () {
        return results.getFirst().getGeometry().getLocation();
    }

    public List<String> getTypes () {
        return results.getFirst().getTypes();
    }
}

@Data
class Result {
    private AddressComponents components;
    private String formattedAddress;
    private Geometry geometry;
    private String placeId;
    private List<String> types;
}

@Data
class AddressComponents {
    private String longName;
    private String shortName;
    private List<String> types;
}

@Data
class Geometry {
    private CoordinateSquare bounds;
    private Coordinates location;
    private String locationType;
    private CoordinateSquare viewPort;
}

@Data
class CoordinateSquare {
    private Coordinates northeast;
    private Coordinates southwest;
}

