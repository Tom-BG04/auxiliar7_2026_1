package types

class Grass extends Type {
  val name: String = "Grass"
  override def equals(other: Any): Boolean = other match {
    case g: Grass => true
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
  override def effectivenessAgainst(defenderType: Type): Double = defenderType.effectivenessAgainstGrass(this)

  override def effectivenessAgainstFire(attackType: Fire): Double = S

  override def effectivenessAgainstWater(attackType: Water): Double = I

  override def effectivenessAgainstGrass(attackType: Grass): Double = E

}
