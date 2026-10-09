package types

class FireTest extends munit.FunSuite {

  var fMov: Fire = _
  var fCreat: Fire = _
  var wCreat: Water = _
  var gCreat: Grass = _

  override def beforeEach(context: BeforeEach) = {
    fMov = new Fire()
    fCreat = new Fire()
    wCreat = new Water()
    gCreat = new Grass()
  }

  test("A Fire attack of a Fire creature should have a bonus") {
    assertEquals(fMov.stabMultiplier(fCreat), 1.5)
  }

  test("A Fire attack of a Grass creature do not have a bonus") {
    assertEquals(fMov.stabMultiplier(gCreat), 1.0)
  }

  test("A Fire attack of a Water creature do not have a bonus") {
    assertEquals(fMov.stabMultiplier(wCreat), 1.0)
  }

  test("A Fire attack should be effective against Fire") {
    assertEquals(fMov.effectivenessAgainst(fCreat), 1.0)
  }

  test("A Fire attack should be supereffective against Grass") {
    assertEquals(fMov.effectivenessAgainst(gCreat), 2.0)
  }

  test("A Fire attack should be ineffective against Water") {
    assertEquals(fMov.effectivenessAgainst(wCreat), 0.5)
  }
}
