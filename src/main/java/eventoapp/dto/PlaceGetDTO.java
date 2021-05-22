package eventoapp.dto;

import java.util.List;

import eventoapp.models.Event;
import eventoapp.models.Place;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaceGetDTO {
    
    private String      name; 
    private String      address;
    private List<Event> events;

    public PlaceGetDTO() {}

	public PlaceGetDTO(Place place) {
        this.name       = place.getName();
        this.address    = place.getAddress();
        this.events     = place.getEvents();
	}
}