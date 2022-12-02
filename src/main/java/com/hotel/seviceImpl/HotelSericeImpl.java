package com.hotel.seviceImpl;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.domain.HotelDomine;
import com.hotel.model.BookingDetails;
import com.hotel.model.HotelDetails;
import com.hotel.model.RoomDetails;
import com.hotel.model.VisitorsDetails;
import com.hotel.repository.HotelRepository;
import com.hotel.sevice.HotelService;
@Service
public class HotelSericeImpl implements HotelService
{
	@Autowired
	private HotelRepository repo;
	
	ModelMapper objectmode=new ModelMapper();
	
	public HotelDomine updateHoteldetails(HotelDomine obj) {
		HotelDetails can=objectmode.map(obj, HotelDetails.class);
		List<VisitorsDetails>kk=can.getVisitorsdetails();
		List<BookingDetails>ll=can.getBookingdetails();
		List<RoomDetails>jj=can.getRoomdetails();
        for( VisitorsDetails u1 : kk )
        	u1.setHotel(can);
        for( BookingDetails u2 : ll )
        	u2.setHotel(can);
        for( RoomDetails u3 : jj )
        	u3.setHotel(can);
        repo.save(can);
        HotelDomine can1=objectmode.map(can, HotelDomine.class);
        return can1;
	}
		
	
//========================================================================================

	public HotelDomine saveHospital(HotelDomine obj) {
		HotelDetails can=objectmode.map(obj, HotelDetails.class);
		List<VisitorsDetails>kk=can.getVisitorsdetails();
		List<BookingDetails>ll=can.getBookingdetails();
		List<RoomDetails>jj=can.getRoomdetails();
        for( VisitorsDetails u1 : kk )
        	u1.setHotel(can);
        for( BookingDetails u2 : ll )
        	u2.setHotel(can);
        for( RoomDetails u3 : jj )
        	u3.setHotel(can);
        repo.save(can);
        HotelDomine can1=objectmode.map(can, HotelDomine.class);
        return can1;
	}

	public HotelDomine getHotelDomineById(int id) {
		HotelDetails bb=repo.findById(id).orElse(null);
		HotelDomine obj2=objectmode.map(bb, HotelDomine.class);
        return obj2;
	}
	
	
	  public List<HotelDomine> getAll() {
	  List<HotelDetails> obj1= repo.findAll();
	  return obj1.stream().map(x->objectmode.map(x, HotelDomine.class))
	  .collect(Collectors.toList());
	  }
	 

	public HotelDomine getHotelDomineByName(String name) {
		 HotelDetails obj1= repo.findByHotelName(name);
	     HotelDomine obj2=objectmode.map(obj1, HotelDomine.class);
	     return obj2; 
	}

   public String deleteHotellById(int id) {
	     repo.deleteById(id);
	     return "cmpt";
	
}
    }

