public class Monster{
 public Monster() {

 }
private int baseAttack = 3;
private int baseDefense = 0;
private boolean alive = true;
private String name = "Ben";

public boolean isAlive() {
  return alive;
}
public String getName() {
  return name;
}
public int specialize() {
  baseAttack += 2;
  baseDefense -= 2;
}
public int normalize() {
  if (baseAttack > 2) {
  baseAttack -= 2;
}
  baseDefense += 2;
}
public int attack() {
  return baseAttack;
}
}
