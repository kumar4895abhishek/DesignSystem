import controllers.ParkingLotController;
import repositories.ParkingLotRepository;
import services.ParkingLotService;

public class main {

	public static void main(String[] args)
	{
		// dependency injection
		ParkingLotRepository parkingLotRepository=new ParkingLotRepository();
		ParkingLotService parkingLotService=new ParkingLotService(parkingLotRepository, null);
		ParkingLotController parkingLotController=new ParkingLotController(parkingLotService);
		parkingLotController.getParkingLot(10L);
	}

}
