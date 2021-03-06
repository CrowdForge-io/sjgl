/*
 * Copyright (c) by Malte Dostal
 * Lindenberg, since 2018
 * All rights reserved
 */

package testing.dummys;

import de.me.edgelord.sjgl.location.Coordinates;
import de.me.edgelord.sjgl.scene.Scene;

public class DummySceneForTestingZoom extends Scene {

    public DummySceneForTestingZoom() {

        addGameObject(new DummyBlock(new Coordinates(500, 350), 100, 100));
        addGameObject(new DummyBlock(new Coordinates(500, 450), 100, 100));
        addGameObject(new DummyBlock(new Coordinates(600, 350), 100, 100));
        addGameObject(new DummyBlock(new Coordinates(600, 450), 100, 100));
    }
}
