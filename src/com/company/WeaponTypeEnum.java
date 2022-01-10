package com.company;

public enum WeaponTypeEnum {

    THROWING_WEAPON("Throwing"), COLD_WEAPON("Cold"), FIREARMS("Firearms");

    public String weaponType;
    WeaponTypeEnum (String weaponType){this.weaponType = weaponType;}

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }
}
