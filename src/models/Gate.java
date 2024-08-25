package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate {
    private int gateNumber;
    private ParkingAttendant parkingAttendant;
    private GateType gateType;
}
