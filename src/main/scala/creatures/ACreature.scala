package creatures

import types.Type
import movements.Movement

abstract class ACreature(val name: String, val maxHp: Double, val typ: Type) extends Creature {
  private var hp_ = maxHp

  def hp: Double = hp_

  def damage(amount: Double): Unit = hp_ = Math.max(hp - amount, 0)

  def attack(movement: Movement, target: Creature): Unit = {
    val typeMovement = movement.typ
    val typeAttacker = this.typ
    val typeTarget = target.typ
    val stabBonus = typeMovement.stabMultiplier(typeAttacker)
    val effectivenessBonus = typeMovement.effectivenessAgainst(typeTarget)
    val dmg = movement.power * stabBonus * effectivenessBonus
    target.damage(dmg)
  }

  override def toString(): String = s"$name of type $typ ($hp/$maxHp)"
}
