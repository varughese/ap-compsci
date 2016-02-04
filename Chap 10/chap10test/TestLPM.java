public class TestLPM
{
  public static void main(String[] args)
  {
    LicensePlateMachine machine1 = new LicensePlateMachine();
    LicensePlateMachine machine2 = new LicensePlateMachine();

    for (int k = 0; k < 3; k++)
      System.out.println(machine1.getPlate());

    for (int k = 0; k < 3; k++)
      System.out.println(machine2.getPlate());
  }
}
