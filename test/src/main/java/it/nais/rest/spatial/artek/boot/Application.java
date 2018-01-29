package it.nais.rest.spatial.artek.boot;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;




@SpringBootApplication
@EnableJpaRepositories("it.nais.rest.spatial.artek.mobile.*")
@EntityScan("it.nais.rest.spatial.artek.mobile.*")
@EnableSpringDataWebSupport
@ComponentScan("it.nais.rest.spatial.artek.*")
public class Application implements CommandLineRunner {

	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	
	
	
	
	@Override
	public void run(String... arg0) throws Exception {

//	
//
//		
//		Event event1 = createEvent("Event", new Date(), "POINT(10 5)");
//		Person person1 = new Person("John", "Doe");
//		
//		
//		System.out.println("perso "+ person1);
//		System.out.println("event "+event1);
//		person1.setEvent(event1);
//		event1.getPersons().add(person1);
//		
//		Event ev = null;
//		try {
//				ev =eventRepo.save(event1);
//		} catch (Exception e) {
//			System.err.println("NANANANANANa");
//			e.printStackTrace();
//			System.exit(0);
//		}
//	
//		Long storedEventId = ev.getId();
//		
//		System.out.println("Count Event records: " + eventRepo.count());
//		
//		List<Event> events = (List<Event>) eventRepo.findAll();
//		for (Event event : events) {
//			System.out.println(event);
//		}
//		/**
//		 * TODO Lazy 
//		 */
//		Event storedEvent = eventRepo.getById(1L);
//		System.out.println(storedEvent);
//		
////		Person p= storedEvent.getPersons().get(0);
//		
//		Person peter = new Person("Peter", "Sagan");
//		Person nasta = new Person("Nasta", "Kuzminova");
//
//		// Add new Person records
//		personRepo.save(peter);
//		personRepo.save(nasta);
//
//		// Count Person records
//		System.out.println("Count Person records: " + personRepo.count());
//
//		// Print all records
//		List<Person> persons = (List<Person>) personRepo.findAll();
//		for (Person person : persons) {
//			System.out.println(person);
//		}
//
//		// Find Person by surname
//		System.out.println("Find by surname 'Sagan': "	+ personRepo.findByLastName("Sagan"));
//
//		// Update Person
//		nasta.setFirstName("Barbora");
//		nasta.setLastName("Spotakova");
//		personRepo.save(nasta);
//
//		System.out.println("Find by id 2: " + personRepo.findOne(2L));
//
//		// Remove record from Person
//		personRepo.delete(2L);
//
//		// And finally count records
//		System.out.println("Count Person records: " + personRepo.count());

	}
//	
//	private static Event createEvent(String title, Date theDate, String wktPoint) {
//        Geometry geom = wktToGeometry(wktPoint);
//        geom.getCentroid();
//
//        if (!geom.getGeometryType().equals("Point")) {
//            throw new RuntimeException("Geometry must be a point. Got a " + geom.getGeometryType());
//        }
//
//
//        Event theEvent = new Event();
//        theEvent.setTitle(title);
//        theEvent.setDate(theDate);
//        theEvent.setLocation( geom.getCentroid());
//        return theEvent;
//    }
//	
//	private static Geometry wktToGeometry(String wktPoint) {
//        WKTReader fromText = new WKTReader();
//        Geometry geom = null;
//        try {
//            geom = fromText.read(wktPoint);
//        } catch (ParseException e) {
//            throw new RuntimeException("Not a WKT string:" + wktPoint);
//        }
//        return geom;
//    }
//		
		
	}