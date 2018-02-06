package ua.logos.orm;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.omg.CORBA.portable.ApplicationException;

import ua.logos.orm.entity.Car;
import ua.logos.orm.entity.CarColor;
import ua.logos.orm.entity.CarEngineCapacity;
import ua.logos.orm.entity.CarFuelType;
import ua.logos.orm.entity.CarMake;
import ua.logos.orm.entity.CarModel;
import ua.logos.orm.entity.CarSeller;

public class App 
{
    public static void main( String[] args )
    {
     EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
     EntityManager em = factory.createEntityManager();
     
     em.getTransaction().begin();
     
     
//     List<CarSeller> carSellers = new ArrayList<>();
//     carSellers.add(new CarSeller("Piter", "Pan", 24, "380987562321"));
//     carSellers.add(new CarSeller("Larry", "Smith", 35, "380668562321"));
//     carSellers.add(new CarSeller("Rihanna", "Pink", 24, "380934562347"));
//     carSellers.add(new CarSeller("Robert", "Bobby", 67, "380987894561"));
//     carSellers.add(new CarSeller("Katty", "Perry", 34, "380668974231"));
//     carSellers.add(new CarSeller("Hermione", "Granger", 22, "380937562123"));
//     carSellers.add(new CarSeller("Lana", "Ray", 30, "380937562456"));
//     carSellers.add(new CarSeller("Phoebe", "Hannigan", 25, "380987562489"));
//     carSellers.add(new CarSeller("Ross", "Geller", 36, "380987578546"));
//     carSellers.add(new CarSeller("Chandler", "Bing", 41, "380935687942"));
//     
//     for (CarSeller ca : carSellers) {
//    	 em.persist(ca);
//	} 
//     
//     List<CarColor> carColor = new ArrayList<>();
//     carColor.add(new CarColor("White"));
//     carColor.add(new CarColor("Black"));
//     carColor.add(new CarColor("Grey"));
//     carColor.add(new CarColor("Red"));
//     carColor.add(new CarColor("Blue"));
//     carColor.add(new CarColor("Green"));
//     carColor.add(new CarColor("Yellow"));
//     carColor.add(new CarColor("Violett"));
//     carColor.add(new CarColor("Dark blue"));
//     carColor.add(new CarColor("Silver"));
//     
//     for (CarColor cc : carColor) {
//		em.persist(cc);
//	}
//    
//     for (int i = 0; i < 10; i++) {
//    	 CarEngineCapacity capacity = new CarEngineCapacity(1.3);
//     double randomFN = ThreadLocalRandom.current().nextDouble(1,8);
//     randomFN = new BigDecimal(randomFN).setScale(1, RoundingMode.UP).doubleValue();
//    	 capacity.setEngineCapacity(randomFN);
//    	 em.persist(capacity);
//     }
//	
//     List<CarFuelType> fuelTypes = new ArrayList<>();
//     fuelTypes.add(new CarFuelType("Diesel"));
//     fuelTypes.add(new CarFuelType("Petrol"));
//     fuelTypes.add(new CarFuelType("Gas/Petrol"));
//     fuelTypes.add(new CarFuelType("Electric"));
//     
//     for (CarFuelType cf : fuelTypes) {
//		em.persist(cf);
//	}
//     
//     List<CarModel> carModels = new ArrayList<>();
//     carModels.add(new CarModel("Q7", 2005));
//     carModels.add(new CarModel ("TT", 2000));
//     carModels.add(new CarModel ("LS", 2011));
//     carModels.add(new CarModel ("Urus", 2001));
//     carModels.add(new CarModel ("XC60", 2010));
//     carModels.add(new CarModel ("Rover Velar", 2015));
//     carModels.add(new CarModel ("EcoSport", 2006));
//     carModels.add(new CarModel ("CLA 45", 2016));
//     carModels.add(new CarModel ("Captur", 2001));
//     carModels.add(new CarModel ("Passat", 1995));
//     carModels.add(new CarModel ("Kodiaq", 1999));
//     carModels.add(new CarModel ("Octavia", 1994));
//     
//     for (CarModel cm : carModels) {
//		em.persist(cm);
//	}
//     
//     List<CarMake> carMakes = new ArrayList<>();
//     carMakes.add(new CarMake("Audi"));
//     carMakes.add(new CarMake("Lexus"));
//     carMakes.add(new CarMake("Lamborgini"));
//     carMakes.add(new CarMake("Volvo"));
//     carMakes.add(new CarMake("Land Rover"));
//     carMakes.add(new CarMake("Ford"));
//     carMakes.add(new CarMake("Mercedes"));
//     carMakes.add(new CarMake("Renaul"));
//     carMakes.add(new CarMake("Volkswagen"));
//     carMakes.add(new CarMake("Skoda"));
//     
//     for (CarMake cm : carMakes) {
//		em.persist(cm);
//	}
//     
//     for (int i = 0; i < 12; i++) {
//    	 Car car = new Car();
//    	 BigDecimal randomPrice = generateRandomBigDecimalFromRange(
//    			    new BigDecimal(24000.00).setScale(2, BigDecimal.ROUND_HALF_UP),
//    			    new BigDecimal(3000000.00).setScale(2, BigDecimal.ROUND_HALF_UP)
//    			 );
//    	 car.setSellPrice(randomPrice);
//    	 em.persist(car);
//     }
     
     
     
//     CarMake carMake = em.createQuery("select c from CarMake c where c.id = :id ", CarMake.class)
//    		 .setParameter("id", new Long (1))
//    		 .getSingleResult();
//     CarModel carModel = em.createQuery("select c from CarModel c where c.id = :id", CarModel.class)
//    		 .setParameter("id", new Long(1))
//    		 .getSingleResult();
//     carModel.setCarMake(carMake);
//     
//     em.persist(carModel);
//     System.out.println(carMake); 
     
//     CarColor cc = em.createQuery("select cc from CarColor cc where cc.id = :id", CarColor.class)
//    		 .setParameter("id", new Long(1))
//    		 .getSingleResult();
//     CarModel cm = em.createQuery("select cm from CarModel cm where cm.id = :id", CarModel.class)
//    		 .setParameter("id", new Long(1))
//    		 .getSingleResult();
//     cm.setCarColor(cc);
//     em.persist(cm);
     
     
     
//     for (int i = 1; i <= 10; i++ ) {
//    	 CarColor cc = em.createQuery("select cc from CarColor cc where cc.id = :id", CarColor.class)
//        		 .setParameter("id", new Long(i))
//        		 .getSingleResult();
//       CarModel cm = em.createQuery("select cm from CarModel cm where cm.id = :id", CarModel.class)
//		 .setParameter("id", new Long(i))
//		 .getSingleResult();
//       cm.setCarColor(cc);
//       em.persist(cm);
//     }
//     
//     for (int i = 1; i <= 2; i++ ) {
//    	 CarColor cc = em.createQuery("select cc from CarColor cc where cc.id = :id", CarColor.class)
//        		 .setParameter("id", new Long(i))
//        		 .getSingleResult();
//       CarModel cm = em.createQuery("select cm from CarModel cm where cm.id = :id", CarModel.class)
//		 .setParameter("id", new Long(i + 10))
//		 .getSingleResult();
//     
//     cm.setCarColor(cc);
//     em.persist(cm);
//     }
     
     
     
//   for (int i = 1; i <= 10; i++ ) {
//	 CarEngineCapacity cec = em.createQuery("select c from CarEngineCapacity c where c.id = :id", CarEngineCapacity.class)
//    		 .setParameter("id", new Long(i))
//    		 .getSingleResult();
//   CarModel cm = em.createQuery("select cm from CarModel cm where cm.id = :id", CarModel.class)
//	 .setParameter("id", new Long(i))
//	 .getSingleResult();
//   cm.setEngineCapasity(cec);
//   em.persist(cm);
// }
// 
// for (int i = 1; i <= 2; i++ ) {
//	 CarEngineCapacity cec = em.createQuery("select c from CarEngineCapacity c where c.id = :id", CarEngineCapacity.class)
//    		 .setParameter("id", new Long(i))
//    		 .getSingleResult();
//   CarModel cm = em.createQuery("select cm from CarModel cm where cm.id = :id", CarModel.class)
//	 .setParameter("id", new Long(i+10))
//	 .getSingleResult();
//   cm.setEngineCapasity(cec);
//   em.persist(cm);
// }
     
//     for (int i = 1; i <= 2; i++ ) {
//    	 CarFuelType cf = em.createQuery("select c from CarFuelType c where c.id = :id", CarFuelType.class)
//        		 .setParameter("id", new Long(i))
//        		 .getSingleResult();
//       CarModel cm = em.createQuery("select cm from CarModel cm where cm.id = :id", CarModel.class)
//    	 .setParameter("id", new Long(i+4))
//    	 .getSingleResult();
//       cm.setFuelType(cf);
//       em.persist(cm);
//     }
     
     
     
//     for (int i = 3; i <= 11; i++) {
//     CarModel cm3 = em.createQuery("select c from CarModel c where c.id = :id", CarModel.class)
//    		 .setParameter("id", new Long(i))
//    		 .getSingleResult();
//     CarMake cmake3 = em.createQuery("select c from CarMake c where c.id = :id", CarMake.class)
//    		 .setParameter("id", new Long (i-1))
//    		 .getSingleResult();
//     cm3.setCarMake(cmake3);
//     em.persist(cm3);
//     }
     
//   for (int i = 1; i <= 10; i++) {
//   CarMake cm = em.createQuery("select c from CarMake c where c.id = :id", CarMake.class)
//  		 .setParameter("id", new Long(i))
//  		 .getSingleResult();
//   Car car = em.createQuery("select c from Car c where c.id = :id", Car.class)
//  		 .setParameter("id", new Long (i))
//  		 .getSingleResult();
//   cm.setCar(car);
//   em.persist(cm);
//   }  
     
     
//   for (int i = 1; i <= 10; i++) {
//   Car car = em.createQuery("select c from Car c where c.id = :id", Car.class)
//  		 .setParameter("id", new Long(i))
//  		 .getSingleResult();
//   CarSeller cs = em.createQuery("select c from CarSeller c where c.id = :id", CarSeller.class)
//  		 .setParameter("id", new Long (i))
//  		 .getSingleResult();
//   car.setCarSeller(cs);
//   em.persist(car);
//   }
     
     
     
   //JPQL
//     CarMake carMake = em.createQuery("select cm from CarMake cm join fetch cm.carModel c where c.id = :id", CarMake.class)
//    		 .setParameter("id", new Long(4))
//    		 .getSingleResult() ;
//     System.out.println(carMake); 
     
     
//     List<CarModel> carModels = em.createQuery("select cm from CarModel cm where cm.manufactureYear > :year")
//    		 .setParameter("year", new Integer(2005))
//    		 .getResultList();
//     for (CarModel carModel : carModels) {
//		System.out.println(carModel);
//	}
     
//     List<CarSeller> carSellers = em.createQuery("select cs from CarSeller cs where cs.phoneNumber like '%098%'", CarSeller.class)
//    		 .getResultList();
//     for (CarSeller carSeller : carSellers) {
//		System.out.println(carSeller);
//	}
     
//     List<CarModel> carModels = em.createQuery("select cm from CarModel cm join fetch cm.fuelType f where f.id = :id order by cm.modelTitle", CarModel.class)
//    		 .setParameter("id", new Long (1))
//    		 .getResultList();
//     carModels.forEach (c -> System.out.println(c));
    
//     List<CarMake> carMakes = em.createQuery("select cm from CarMake cm join fetch cm.car c where c.sellPrice between :first and :last ", CarMake.class)
//    		 .setParameter("first", new BigDecimal(2000000.00) )
//    		 .setParameter("last", new BigDecimal(8000000.00))
//    		 .getResultList();
//     carMakes.forEach(c -> System.out.println(c));
     
//     List<CarModel> carModels = em.createQuery("select cm from CarModel cm join fetch cm.carColor c where c.color in ('White', 'Black', 'blue') ", CarModel.class)
//    		 .getResultList();
//     carModels.forEach(c -> System.out.println(c));
     
//     List<CarSeller> carSellers = em.createQuery("select cs from CarSeller cs where cs.age between :min and :max order by cs.age", CarSeller.class)
//    		 .setParameter("min", new Integer(30))
//    		 .setParameter("max", new Integer(45))
//    		 .getResultList();
//     carSellers.forEach(seller -> System.out.println(seller));
     
     
//	CriteriaApi   
     CriteriaBuilder cb = em.getCriteriaBuilder();
     //1
//     CriteriaQuery<Car> query = cb.createQuery(Car.class);
//     Root<Car> root = query.from(Car.class);
//     query.select(root);
//     
//     Expression<BigDecimal> priceExpression = root.get("sellPrice");
//     Predicate pricePredicate = cb.ge(priceExpression, new BigDecimal("1000000"));
//     query.where(pricePredicate);
//     
//     Expression<Long> betweenSellId = root.get("id");
//     Predicate betweenPr = cb.between(betweenSellId, 2L, 6L);
//     query.where(betweenPr);
//     
//     List<Car> cars = em.createQuery(query).getResultList();
//     cars.forEach(c -> System.out.println(c));
    
     //////2
     
     CriteriaQuery<CarMake> makeQuery = cb.createQuery(CarMake.class);
     Root<CarMake> makeRoot = makeQuery.from(CarMake.class);
     makeQuery.select(makeRoot);
     
//     Expression<Long> betweenMakeId = makeRoot.get("id");
//     Predicate btwnMakeIdPr = cb.between(betweenMakeId, 1L, 5L);
//     makeQuery.where(btwnMakeIdPr);
   
     ///3
     
//     Expression<String> likeMakeExp = makeRoot.get("makeTitle");
//     Predicate likeMakePr = cb.like(likeMakeExp, "L%");
//     makeQuery.where(likeMakePr);
//  
//     List<CarMake> carMakes = em.createQuery(makeQuery).getResultList();
//     carMakes.forEach(c -> System.out.println(c));
    
     ///4
     
//     CriteriaQuery<CarSeller> sellerQuery = cb.createQuery(CarSeller.class);
//     Root<CarSeller> sellerRoot = sellerQuery.from(CarSeller.class);
//     sellerQuery.select(sellerRoot);
//     
//     
//     ParameterExpression<Integer> ageExp = cb.parameter(Integer.class);
//     sellerQuery.where(cb.gt(sellerRoot.get("firstName"), ageExp));
//     
//     List<CarSeller> carSellers = em.createQuery(sellerQuery).getResultList();
//     carSellers.forEach(c -> System.out.println(c));
     
     
     
     
     
     
     
     
     
     
     
     em.getTransaction().commit();
     em.close();
     factory.close();
     
    }
    
    
    public static BigDecimal generateRandomBigDecimalFromRange(BigDecimal min, BigDecimal max) {
        BigDecimal randomBigDecimal = min.add(new BigDecimal(Math.random()).multiply(max.subtract(min)));
        return randomBigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP);
    }
}
