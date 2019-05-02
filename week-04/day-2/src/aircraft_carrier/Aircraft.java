package aircraft_carrier;

public class Aircraft {

  int maxAmmo;
  int baseDamage;
  int ammoStorage;
  String type;

  public Aircraft() {
    this.ammoStorage = 0;
    this.type = "";
  }

  public int fight() {
    int damageDealt = baseDamage * maxAmmo;
    return damageDealt;
  }

  public int refill(int ammoRefill) {
    int ammoToFill = maxAmmo - ammoStorage;
    int remainingAmmo = ammoRefill - ammoToFill;
    if(ammoStorage <= ammoRefill && ammoStorage <= maxAmmo) {
      ammoStorage = maxAmmo;
    }
    return remainingAmmo;
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return "Type " + type + " , Ammo: " + ammoStorage + " , Base Damage: " + baseDamage + " , All Damage: " + fight();
  }

  public boolean isPriority() {
    if(type == "F35") {
      return true;
    } else {
      return false;
    }
  }


}
