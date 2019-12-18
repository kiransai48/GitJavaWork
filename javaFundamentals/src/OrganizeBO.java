import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class OrganizeBO {
	public Map<String, List<Hall>> organizeHallDetails(List<String> list) {
		Map<String, List<Hall>> hallMap = new TreeMap<String, List<Hall>>();
		for(String detail: list) {
			List<Hall> halls;
			String[] details = detail.split(",");
			if(hallMap.get(details[0]) == null)
				halls = new ArrayList<Hall>();
			else
				halls = hallMap.get(details[0]);
			halls.add(new Hall(details[1], details[0]));
			hallMap.put(details[0], halls);
		}
		return hallMap;
	}
}