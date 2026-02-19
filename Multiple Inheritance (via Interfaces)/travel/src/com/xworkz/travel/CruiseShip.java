package com.xworkz.travel;

// CruiseShip 'Is-A' MarineVessel AND 'Is-A' LuxuryHotel
public class CruiseShip implements MarineVessel, LuxuryHotel {

    @Override
    public void navigateOcean() {
        System.out.println("Invoking navigateOcean in CruiseShip"); // Mandatory SOP
        System.out.println(">> [NAV] Setting course for the Caribbean via GPS.");
    }

    @Override
    public void provideRoomService() {
        System.out.println("Invoking provideRoomService in CruiseShip"); // Mandatory SOP
        System.out.println(">> [HOTEL] Delivering breakfast to Suite 502.");
    }
}