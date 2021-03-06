public class Character {
    protected int _hitPts;
    protected int _strength;
    protected int _defense;
    protected double _attack;
    protected String _name = "J. Doe";

    protected int getDefense() { return _defense; }

    /**
     boolean isAlive() -- tell whether I am alive
     post: returns boolean indicated alive or dead
    **/
    protected boolean isAlive() {
        return _hitPts > 0;
    }
    
      /**
     int attack(Warrior) -- simulates attack on a Warrior
     pre:  Input not null
     post: Calculates damage to be inflicted, flooring at 0. 
     Calls opponent's lowerHP() method to inflict damage. 
     Returns damage dealt.
    **/
    protected int attack( Character opponent ) {

        int damage = (int)( (_strength * _attack) - opponent.getDefense() );
        //System.out.println( "\t\t**DIAG** damage: " + damage );
    
        if ( damage < 0 )
          damage = 0;
    
        opponent.lowerHP( damage );
    
        return damage;
    }//end attack

    /**
     void lowerHP(int) -- lowers life by input value
     pre:  Input >= 0
     post: Life instance var is lowered by input ammount.
    **/
    public void lowerHP( int damageInflicted ) {
    _hitPts = _hitPts - damageInflicted;
    }


}
