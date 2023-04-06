/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

import javafx.scene.shape.Polygon;

/**
 *
 * @author chris
 */
public class Projectile extends Character {

    public Projectile(int x, int y) {
        super(new Polygon(2, -2, 2, 2, -2, 2, -2, -2), x, y);
    }

    @Override
    public void move() {
        super.getCharacter().setTranslateX(super.getCharacter().getTranslateX() + super.getMovement().getX());
        super.getCharacter().setTranslateY(super.getCharacter().getTranslateY() + super.getMovement().getY());
        if (super.getCharacter().getTranslateX() < 0 || super.getCharacter().getTranslateX() > AsteroidsApplication.WIDTH) {
            super.setAlive(false);
        }
        if (super.getCharacter().getTranslateY() < 0 || super.getCharacter().getTranslateY() > AsteroidsApplication.HEIGHT) {
            super.setAlive(false);
        }
    }
}
