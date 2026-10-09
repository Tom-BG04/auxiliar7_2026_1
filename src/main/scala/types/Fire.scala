package types

class Fire extends Type {
  val name: String = "Fire"
  override def equals(other: Any): Boolean = other match {
    case f: Fire => true
    case _ => false
  }
  override def stabMultiplier(other: Type): Double = {
    val isEqual = other.equals(this)
    if (isEqual) {
      1.5
    } else {
      1.0
    }
  }
  override def effectivenessAgainst(defenderType: Type): Double = defenderType.effectivenessAgainstFire(this)

  override def effectivenessAgainstFire(attackType: Fire): Double = E
  override def effectivenessAgainstWater(attackType: Water): Double = S
  override def effectivenessAgainstGrass(attackType: Grass): Double = I
}
