package com.company;

public class Boss extends GameEntity {
    private Weapon weapon = new Weapon();

    public String getWeapon() {
        return "Type of weapon: " + weapon.getTypeOfWeapon() + ". Name of weapon " + weapon.getNameOfWeapon();
    }

    public void setWeapon(String typeOfName, String nameOfWeapon) {
        weapon.setTypeOfWeapon(typeOfName);
        weapon.setNameOfWeapon(nameOfWeapon);

    }
}
