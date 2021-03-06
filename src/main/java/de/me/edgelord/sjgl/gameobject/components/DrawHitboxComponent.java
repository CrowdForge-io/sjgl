package de.me.edgelord.sjgl.gameobject.components;

import de.me.edgelord.sjgl.gameobject.GameObjectComponent;
import de.me.edgelord.sjgl.gameobject.GameObject;

import java.awt.*;

public class DrawHitboxComponent extends GameObjectComponent {

    public DrawHitboxComponent(GameObject parent, String name) {
        super(parent, name);
    }

    @Override
    public void onFixedTick() {

    }

    @Override
    public void draw(Graphics2D graphics) {

        graphics.setColor(new Color(1, 0, 0, 0.25f));

        graphics.fillRect((int) getParent().getHitbox().getPosition().getX(), (int) getParent().getHitbox().getPosition().getY(), getParent().getHitbox().getWidth(), getParent().getHitbox().getHeight());
    }

    @Override
    public void onCollision(GameObject other) {

    }
}
