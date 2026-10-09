package types

class Water extends Type {
  val name: String = "Water"
  override def equals(other: Any): Boolean = other match {
    case w: Water => true
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
  override def effectivenessAgainst(defenderType: Type): Double = defenderType.effectivenessAgainstWater(this)

  override def effectivenessAgainstFire(attackType: Fire): Double = I

  override def effectivenessAgainstWater(attackType: Water): Double = E

  override def effectivenessAgainstGrass(attackType: Grass): Double = S
}
