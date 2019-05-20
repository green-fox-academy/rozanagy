package aircraft_carrier;

public abstract class Aircraft {
  private String type;
  private int ammoStorage = 0;
  private int maxAmmo;
  private int baseDamage;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getAmmoStorage() {
    return ammoStorage;
  }

  public void setAmmoStorage(int ammoStorage) {
    this.ammoStorage = ammoStorage;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int fight() {
    return this.getAmmoStorage() * this.getBaseDamage();
  }


}
