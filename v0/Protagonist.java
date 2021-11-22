public class Protagonist{
 public Protagonist (String str) {

 }
private int baseAttack = 5;
private int baseDefense = 2;
private boolean alive = true;
private String name = "Perry";

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
 public int attack(Monster monster) {
   return baseAttack;
 }
}
