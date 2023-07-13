package hw5;

public class App {
    public static void main(String[] args) {


      SpaceShip spaceShipOrbiter = SpaceShip.builder()
                      .name(SpaceShip.NameType.ORBITER)
                              .destination(SpaceShip.DestinationType.MARS)
                                      .crew(5)
                                              .build();

      SpaceShip spaceShipSurveyor = SpaceShip.builder()
                      .name(SpaceShip.NameType.SURVEYOR)
                              .destination(SpaceShip.DestinationType.JUPITER)
                                      .build();

        System.out.println(spaceShipOrbiter);
        System.out.println(spaceShipSurveyor);

    }
}
