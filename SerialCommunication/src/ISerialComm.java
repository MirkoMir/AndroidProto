/*
 * Interface for Communication
 * Author: M. Mirkovic
 * Version: 0.1
 */
import java.util.*;

public interface ISerialComm {
	//Function used for sending commands to the probe.
	void sendSensorCommand(String command);
	//Function used to receive and provide data from the probe.
	ArrayList<Double> receiveSensorData(String data);
}
