import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of halls:");
		Integer n = Integer.parseInt(buff.readLine());
		System.out.println("Enter the hall details:");
		List<String> details = new ArrayList<String>();
		for(int i=0;i<n;i++) {
			details.add(buff.readLine());
		}
		Map<String, List<Hall>> hallMap = new OrganizeBO().organizeHallDetails(details);
		for(Map.Entry<String, List<Hall>> entry: hallMap.entrySet()) {
			System.out.println("Halls for "+entry.getKey()+":");
			for(Hall hall:hallMap.get(entry.getKey())) {
				System.out.println(hall.getName());
			}
		}
	}
}