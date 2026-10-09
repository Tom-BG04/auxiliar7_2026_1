package types

trait Type {
  val name: String
  val I: Double = 0.5
  val E: Double = 1.0
  val S: Double = 2.0

  def stabMultiplier(other: Type): Double

  def effectivenessAgainst(defenderType: Type): Double
  def effectivenessAgainstFire(attackType: Fire): Double
  def effectivenessAgainstWater(attackType: Water): Double
  def effectivenessAgainstGrass(attackType: Grass): Double
}
