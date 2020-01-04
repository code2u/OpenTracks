/*
 * Copyright 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package de.dennisguse.opentracks.content.data;

import android.net.Uri;
import android.provider.BaseColumns;

import de.dennisguse.opentracks.content.provider.ContentProviderUtils;

/**
 * Constants for waypoints table.
 *
 * @author Leif Hendrik Wilden
 */
public interface WaypointsColumns extends BaseColumns {

    String TABLE_NAME = "waypoints";
    Uri CONTENT_URI = Uri.parse(ContentProviderUtils.CONTENT_BASE_URI + "/" + TABLE_NAME);
    String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.de.dennisguse.waypoint";
    String CONTENT_ITEMTYPE = "vnd.android.cursor.item/vnd.de.dennisguse.waypoint";
    String DEFAULT_SORT_ORDER = "_id";

    // Columns
    String NAME = "name"; // waypoint name
    String DESCRIPTION = "description"; // waypoint description
    String CATEGORY = "category"; // waypoint category
    String ICON = "icon"; // waypoint icon
    String TRACKID = "trackid"; // track id
    @Deprecated
    String TYPE = "type"; // type // TODO UNUSED

    String LENGTH = "length"; // length of the track (without smoothing)
    String DURATION = "duration"; // total duration of the track (not from last waypoint)
    String STARTTIME = "starttime"; // start time of the trip statistics
    @Deprecated
    String STARTID = "startid"; // start track point id // TODO UNUSED
    @Deprecated
    String STOPID = "stopid"; // stop track point id // TODO UNUSED

    String LONGITUDE = "longitude"; // longitude
    String LATITUDE = "latitude"; // latitude
    String TIME = "time"; // time
    String ALTITUDE = "elevation"; // altitude
    String ACCURACY = "accuracy"; // accuracy
    String SPEED = "speed"; // speed
    String BEARING = "bearing"; // bearing

    @Deprecated
    String TOTALDISTANCE = "totaldistance"; // total distance
    @Deprecated
    String TOTALTIME = "totaltime"; // total time
    @Deprecated
    String MOVINGTIME = "movingtime"; // moving time
    @Deprecated
    String AVGSPEED = "avgspeed"; // average speed

    @Deprecated
    String AVGMOVINGSPEED = "avgmovingspeed"; // average moving speed  // TODO UNUSED
    @Deprecated
    String MAXSPEED = "maxspeed"; // max speed // TODO UNUSED
    @Deprecated
    String MINELEVATION = "minelevation"; // min elevation // TODO UNUSED
    @Deprecated
    String MAXELEVATION = "maxelevation"; // max elevation // TODO UNUSED
    @Deprecated
    String ELEVATIONGAIN = "elevationgain"; // elevation gain // TODO UNUSED
    @Deprecated
    String MINGRADE = "mingrade"; // min grade // TODO UNUSED
    @Deprecated
    String MAXGRADE = "maxgrade"; // max grade // TODO UNUSED

    String PHOTOURL = "photoUrl"; // url for the photo

    String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
            + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NAME + " TEXT, "
            + DESCRIPTION + " TEXT, "
            + CATEGORY + " TEXT, "
            + ICON + " TEXT, "
            + TRACKID + " INTEGER, "
            + TYPE + " INTEGER, "
            + LENGTH + " FLOAT, "
            + DURATION + " INTEGER, "
            + STARTTIME + " INTEGER, "
            + STARTID + " INTEGER, "
            + STOPID + " INTEGER, "
            + LONGITUDE + " INTEGER, "
            + LATITUDE + " INTEGER, "
            + TIME + " INTEGER, "
            + ALTITUDE + " FLOAT, "
            + ACCURACY + " FLOAT, "
            + SPEED + " FLOAT, "
            + BEARING + " FLOAT, "
            + TOTALDISTANCE + " FLOAT, "
            + TOTALTIME + " INTEGER, "
            + MOVINGTIME + " INTEGER, "
            + AVGSPEED + " FLOAT, "
            + AVGMOVINGSPEED + " FLOAT, "
            + MAXSPEED + " FLOAT, "
            + MINELEVATION + " FLOAT, "
            + MAXELEVATION + " FLOAT, "
            + ELEVATIONGAIN + " FLOAT, "
            + MINGRADE + " FLOAT, "
            + MAXGRADE + " FLOAT, "
            + PHOTOURL + " TEXT"
            + ");";
}
