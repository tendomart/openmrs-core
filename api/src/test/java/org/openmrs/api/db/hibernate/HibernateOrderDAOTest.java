/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.api.db.hibernate;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import java.text.ParseException;
import java.text.SimpleDateFormat;
=======
>>>>>>> TRUNK-5410 : Added Unit Tests to HibernateOrderDAOTest for some new methods in HibernateOrderDAO
=======
import java.text.ParseException;
import java.text.SimpleDateFormat;
>>>>>>> Added more Tests for new Changes to HibernateOrderDAO
=======
import java.text.ParseException;
import java.text.SimpleDateFormat;
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
import java.text.ParseException;
import java.text.SimpleDateFormat;
>>>>>>> TRUNK-5410:Re-ordered imports format in OrderServiceTest and HibernateOrderDAOTest
=======

=======
>>>>>>> TRUNK-5410:Fixing more Conflicting Changes
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

<<<<<<< HEAD
>>>>>>> TRUNK-5410:Re-ordered imports format in OrderServiceTest and HibernateOrderDAOTest
<<<<<<< HEAD
=======
>>>>>>> TRUNK-5410 : Added Unit Tests to HibernateOrderDAOTest for some new methods in HibernateOrderDAO
=======
import java.text.ParseException;
import java.text.SimpleDateFormat;
>>>>>>> Added more Tests for new Changes to HibernateOrderDAO
=======
>>>>>>> TRUNK-5410:Re-ordered imports format in OrderServiceTest and HibernateOrderDAOTest
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.hibernate.internal.SessionFactoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> TRUNK-5410:Re-ordered imports format in OrderServiceTest and HibernateOrderDAOTest
=======

>>>>>>> TRUNK-5410:Re-ordered imports format in OrderServiceTest and HibernateOrderDAOTest
=======
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
>>>>>>> TRUNK-5410:Fixing more Conflicting Changes
import org.openmrs.Encounter;
import org.openmrs.Order;
import org.openmrs.OrderGroup;
import org.openmrs.OrderGroupAttributeType;
import org.openmrs.Patient;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import org.openmrs.*;
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
import org.openmrs.*;
>>>>>>> TRUNK-5410 : Added Unit Tests to HibernateOrderDAOTest for some new methods in HibernateOrderDAO
=======
import org.openmrs.*;
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
>>>>>>> TRUNK-5410:Re-ordered imports format in OrderServiceTest and HibernateOrderDAOTest
=======
import org.openmrs.*;
>>>>>>> TRUNK-5410 : Added Unit Tests to HibernateOrderDAOTest for some new methods in HibernateOrderDAO
=======
>>>>>>> TRUNK-5410:Re-ordered imports format in OrderServiceTest and HibernateOrderDAOTest
import org.openmrs.api.APIException;
import org.openmrs.api.builder.OrderBuilder;
import org.openmrs.api.context.Context;
import org.openmrs.test.jupiter.BaseContextSensitiveTest;
import org.springframework.beans.factory.annotation.Autowired;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.*;
=======
>>>>>>> TRUNK-5410:Re-ordered imports format in OrderServiceTest and HibernateOrderDAOTest
=======
import static org.junit.jupiter.api.Assertions.*;
>>>>>>> TRUNK-5410 : Added Unit Tests to HibernateOrderDAOTest for some new methods in HibernateOrderDAO
=======
import static org.junit.jupiter.api.Assertions.*;
=======
>>>>>>> TRUNK-5410:Re-ordered imports format in OrderServiceTest and HibernateOrderDAOTest
>>>>>>> TRUNK-5410:Re-ordered imports format in OrderServiceTest and HibernateOrderDAOTest

=======
>>>>>>> TRUNK-5410:Fixing more Conflicting Changes
/**
 * Tests the saving of orders as part of the OrderGroup
 */
public class HibernateOrderDAOTest extends BaseContextSensitiveTest {
	
	@Autowired
	private HibernateOrderDAO dao;
	
	private static final String ORDER_SET = "org/openmrs/api/include/OrderSetServiceTest-general.xml";
	
	private static final String ORDER_GROUP = "org/openmrs/api/include/OrderServiceTest-createOrderGroup.xml";
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	
=======
     
	private static final String  UUID = "9cf1b9de-d18e-11ea-87d0-0242ac130003";
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
     
	private static final String  UUID = "9cf1b9de-d18e-11ea-87d0-0242ac130003";
>>>>>>> TRUNK-5410 : Added Unit Tests to HibernateOrderDAOTest for some new methods in HibernateOrderDAO
=======
     
	private static final String  UUID = "9cf1b9de-d18e-11ea-87d0-0242ac130003";
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
     
	private static final String  UUID = "9cf1b9de-d18e-11ea-87d0-0242ac130003";
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> TRUNK-5410 : Added Unit Tests to HibernateOrderDAOTest for some new methods in HibernateOrderDAO
=======
	
>>>>>>> TRUNK-5410:Removing unnecessary indents and spaces from HibernateOrderDAOTest ,OrderServiceTest-createOrderGroupAttributes.xml  and OrderServiceTest
=======
	
>>>>>>> TRUNK-5410:Removin unnecessary indents and spaces from HibernateOrderDAOTest ,OrderServiceTest-createOrderGroupAttributes.xml  and OrderServiceTest
	@BeforeEach
	public void setUp() {
		executeDataSet(ORDER_SET);
		executeDataSet(ORDER_GROUP);
	}
	
	/**
	 * @see {@link HibernateOrderDAO#saveOrderGroup(OrderGroup)}
	 * @throws Exception
	 */
	@Test
	public void saveOrderGroup_shouldSaveOrderGroup() {
		OrderGroup newOrderGroup = new OrderGroup();
		
		final Order order = new OrderBuilder().withAction(Order.Action.NEW).withPatient(7).withConcept(1000)
		        .withCareSetting(1).withOrderer(1).withEncounter(3).withDateActivated(new Date()).withOrderType(17)
		        .withUrgency(Order.Urgency.ON_SCHEDULED_DATE).withScheduledDate(new Date()).build();
		
		newOrderGroup.setOrders(new ArrayList<Order>() {
			
			{
				add(order);
			}
		});
		
		OrderGroup savedOrderGroup = dao.saveOrderGroup(newOrderGroup);
		assertNotNull(savedOrderGroup.getOrderGroupId(), "OrderGroup gets saved");
		
		for (Order savedOrder : savedOrderGroup.getOrders()) {
			assertNull(savedOrder.getOrderId(), "Order is not saved as a part of Order Group");
		}
	}
	
	/**
	 * @see {@link HibernateOrderDAO#getOrderGroupsByEncounter(Encounter)}
	 * @throws Exception
	 */
	@Test
	public void getOrderGroupsByEncounter_shouldFailGivenNullEncounter() {
		assertThrows(APIException.class, () -> dao.getOrderGroupsByEncounter(null));
	}
	
	/**
	 * @see {@link HibernateOrderDAO#getOrderGroupsByPatient(Patient)}
	 * @throws Exception
	 */
	@Test
	public void getOrderGroupsByPatient_shouldFailGivenNullPatient() {
		assertThrows(APIException.class, () -> dao.getOrderGroupsByPatient(null));
	}
	
	/**
	 * @see {@link HibernateOrderDAO#getOrderGroupsByEncounter(Encounter)}
	 * @throws Exception
	 */
	@Test
	public void getOrderGroupsByEncounter_shouldGetOrderGroupsFromAnEncounter() {
		Encounter existingEncounter = Context.getEncounterService().getEncounter(4);
		List<OrderGroup> ordergroups = Context.getOrderService().getOrderGroupsByEncounter(existingEncounter);
		assertEquals(1, ordergroups.size());
	}
	
	/**
	 * @see {@link HibernateOrderDAO#getOrderGroupsByPatient(Patient)}
	 * @throws Exception
	 */
	@Test
	public void getOrderGroupsByPatient_shouldGetOrderGroupsGivenPatient() {
		Patient existingPatient = Context.getPatientService().getPatient(8);
		List<OrderGroup> ordergroups = Context.getOrderService().getOrderGroupsByPatient(existingPatient);
		assertEquals(1, ordergroups.size());
		
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	}
	
	/**
	 * @see {@link HibernateOrderDAO#getAllOrderGroupAttributeTypes()}
	 * @throws Exception
	 */
	@Test
	public void getAllOrderGroupAttributeTypes_shouldGetAllOrderGroupAttributeTypes() {
		List<OrderGroupAttributeType> orderGroupAttributeTypes = dao.getAllOrderGroupAttributeTypes();
		assertEquals(orderGroupAttributeTypes.size(), 4);
	}
	
=======
	}
>>>>>>> TRUNK-5410 : Added Unit Tests to HibernateOrderDAOTest for some new methods in HibernateOrderDAO
	/**
	 * @see {@link HibernateOrderDAO#getOrderGroupAttributeTypeByUuid(String)}
	 * @throws Exception
	 */
	@Test
<<<<<<< HEAD
	public void getOrderGroupAttributeTypeByUuid_shouldGetOrderGroupAttributeTypeGivenUuid() {
		OrderGroupAttributeType orderGroupAttributeType = dao
		        .getOrderGroupAttributeTypeByUuid("9cf1bce0-d18e-11ea-87d0-0242ac130003");
		assertEquals("Bacteriology", orderGroupAttributeType.getName());
	}
	
<<<<<<< HEAD
	/**
	 * @see {@link HibernateOrderDAO#getOrderGroupAttributeType(Integer)}
	 * @throws Exception
	 */
	@Test
	public void getOrderGroupAttributeType_shouldReturnOrderGroupAttributeType() {
		OrderGroupAttributeType orderGroupAttributeType = dao.getOrderGroupAttributeType(4);
		assertEquals("ECG", orderGroupAttributeType.getName());
	}
	
	/**
	 * @see {@link HibernateOrderDAO#getOrderGroupAttributeTypeByName(String)}
	 * @throws Exception
	 */
	@Test
	public void getOrderGroupAttributeTypeByName_shouldGetOrderGroupAttributeTypeByName() {
		final String NAME = "ECG";
		OrderGroupAttributeType OrderGroupAttributeType = dao.getOrderGroupAttributeTypeByName(NAME);
		assertEquals(NAME, OrderGroupAttributeType.getName());
		assertEquals(4, OrderGroupAttributeType.getId());
		assertEquals("9cf1bdb2-d18e-11ea-87d0-0242ac130003", OrderGroupAttributeType.getUuid());
	}
	
<<<<<<< HEAD
	/**
	 * @see {@link HibernateOrderDAO#deleteOrderGroupAttributeType(OrderGroupAttributeType)}
	 * @throws Exception
	 */
	@Test
	public void deleteOrderGroupAttributeType_shouldDeleteOrderGroupAttributeTypeFromDatabase() {
		final String UUID = "9cf1bdb2-d18e-11ea-87d0-0242ac130003";
		OrderGroupAttributeType orderGroupAttributeType = dao.getOrderGroupAttributeTypeByUuid(UUID);
		assertNotNull(orderGroupAttributeType);
		dao.deleteOrderGroupAttributeType(orderGroupAttributeType);
		assertNull(dao.getOrderGroupAttributeByUuid(UUID));
=======
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
	}
=======
	}
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
>>>>>>> TRUNK-5410:Removing unnecessary indents and spaces from HibernateOrderDAOTest ,OrderServiceTest-createOrderGroupAttributes.xml  and OrderServiceTest
=======
>>>>>>> TRUNK-5410:Removin unnecessary indents and spaces from HibernateOrderDAOTest ,OrderServiceTest-createOrderGroupAttributes.xml  and OrderServiceTest
	/**
	 * @see {@link HibernateOrderDAO#getAllOrderGroupAttributeTypes()}
	 * @throws Exception
	 */
    @Test
	public void getAllOrderGroupAttributeTypes_shouldGetAllOrderGroupAttributeTypes(){
		List<OrderGroupAttributeType> orderGroupAttributeTypes = dao.getAllOrderGroupAttributeTypes();
		assertEquals(orderGroupAttributeTypes.size(), 4);
	}
	
	/**
	 * @see {@link HibernateOrderDAO#getOrderGroupAttributeTypeByUuid(String)}
	 * @throws Exception
	 */
	@Test
	public void getOrderGroupAttributeType_shouldGetOrderGroupAttributeTypeGivenUuid(){
<<<<<<< HEAD
<<<<<<< HEAD
		final String UUID2 ="9cf1bdb2-d18e-11ea-87d0-0242ac130003";
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
    	OrderGroupAttributeType newOrderGroupAttributeType = dao.getOrderGroupAttributeTypeByUuid(UUID2);
		assertEquals(newOrderGroupAttributeType.getName(),dao.getOrderGroupAttributeTypeByUuid(UUID2).getName());
=======
    	OrderGroupAttributeType newOrderGroupAttributeType = dao.getOrderGroupAttributeTypeByUuid("9cf1bce0-d18e-11ea-87d0-0242ac130003");
		assertEquals("Bacteriology", newOrderGroupAttributeType.getName());
>>>>>>> TRUNK-5410:Rectifying Mistakes and adding New Features
=======
    	OrderGroupAttributeType newOrderGroupAttributeType = dao.getOrderGroupAttributeTypeByUuid("9cf1bce0-d18e-11ea-87d0-0242ac130003");
		assertEquals("Bacteriology", newOrderGroupAttributeType.getName());
>>>>>>> TRUNK-5410:Rectifying Mistakes and adding New Features
	}
	
	/**
	 * @see {@link HibernateOrderDAO#getOrderGroupAttributeType(Integer)}
	 * @throws Exception
	 */
	@Test
	public void getOrderGroupAttributeType_shouldReturnOrderGroupAttributeTypeGivenIntegerId(){
<<<<<<< HEAD
<<<<<<< HEAD
    	final Integer ID = 4;
		OrderGroupAttributeType newOrderGroupAttributeType = dao.getOrderGroupAttributeType(ID);
		assertEquals(4,newOrderGroupAttributeType.getId());
<<<<<<< HEAD
		
=======
		OrderGroupAttributeType newOrderGroupAttributeType = dao.getOrderGroupAttributeType(4);
		assertEquals("ECG", newOrderGroupAttributeType.getName());
>>>>>>> TRUNK-5410:Rectifying Mistakes and adding New Features
	}
	
<<<<<<< HEAD

<<<<<<< HEAD
=======
	public void getOrderGroupAttributeByUuid_shouldFailGivenNullUuid(){
		assertThrows(APIException.class,() ->dao.getOrderGroupAttributeByUuid(null));
			}
=======
	}
>>>>>>> TRUNK-5410:Fixing more Conflicting Changes
	/**
	 * @see {@link HibernateOrderDAO#getAllOrderGroupAttributeTypes()}
	 * @throws Exception
	 */
    @Test
	public void getAllOrderGroupAttributeTypes_shouldGetAllOrderGroupAttributeTypes(){
		List<OrderGroupAttributeType> orderGroupAttributeTypes = dao.getAllOrderGroupAttributeTypes();
		assertEquals(orderGroupAttributeTypes.size(),4);
	}
	@Test
	public void getOrderGroupAttributeType_shouldGetOrderGroupAttributeTypeGivenUuid(){
		final String UUID2 ="86bdcf82-d18d-11ea-87d0-0242ac130003";
=======
>>>>>>> Added more Tests for new Changes to HibernateOrderDAO
    	OrderGroupAttributeType newOrderGroupAttributeType = dao.getOrderGroupAttributeTypeByUuid(UUID2);
		assertEquals(newOrderGroupAttributeType.getName(),dao.getOrderGroupAttributeTypeByUuid(UUID2).getName());
	}
	@Test
	public void getOrderGroupAttributeType_shouldReturnOrderGroupAttributeTypeGivenIntegerId(){
    	final Integer ID = 4;
		OrderGroupAttributeType newOrderGroupAttributeType = dao.getOrderGroupAttributeType(ID);
		assertEquals(4,newOrderGroupAttributeType.getId());
<<<<<<< HEAD
		
=======
		OrderGroupAttributeType newOrderGroupAttributeType = dao.getOrderGroupAttributeType(4);
		assertEquals("ECG", newOrderGroupAttributeType.getName());
>>>>>>> TRUNK-5410:Rectifying Mistakes and adding New Features
	}
	

<<<<<<< HEAD
		OrderGroupAttributeType savedOrderGroupAttributeType = dao.getOrderGroupAttributeType(5);
//		assertEquals("Scan",savedOrderGroupAttributeType.getName());
//		assertEquals(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S").parse("2020-07-30 16:24:10.0"),savedOrderGroupAttributeType.getDateCreated());
        assertNotNull(newOrderGroupAttributeType.getId());
        System.out.print(newOrderGroupAttributeType.getId());
		assertEquals(orderGroupAttributeTypeSize+1,newOrderGroupAttributeType.getId());
    }
>>>>>>> TRUNK-5410 : Added Unit Tests to HibernateOrderDAOTest for some new methods in HibernateOrderDAO
=======
>>>>>>> TRUNK-5410: Added Unit Tests for new methods to HibernateOrderDAO and OrderServiceImpl , cleaned out unnecessary code
=======
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
	}
	/**
	 * @see {@link HibernateOrderDAO#getOrderGroupAttributeTypeByUuid(String)}
	 * @throws Exception
	 */
	@Test
	public void getOrderGroupAttributeByUuid_shouldFailGivenNullUuid(){
		assertThrows(APIException.class,() ->dao.getOrderGroupAttributeByUuid(null));
			}
	/**
	 * @see {@link HibernateOrderDAO#getAllOrderGroupAttributeTypes()}
	 * @throws Exception
	 */
    @Test
	public void getAllOrderGroupAttributeTypes_shouldGetAllOrderGroupAttributeTypes(){
		List<OrderGroupAttributeType> orderGroupAttributeTypes = dao.getAllOrderGroupAttributeTypes();
		assertEquals(orderGroupAttributeTypes.size(),4);
	}
	@Test
	public void getOrderGroupAttributeType_shouldGetOrderGroupAttributeTypeGivenUuid(){
		final String UUID2 ="9cf1bdb2-d18e-11ea-87d0-0242ac130003";
    	OrderGroupAttributeType newOrderGroupAttributeType = dao.getOrderGroupAttributeTypeByUuid(UUID2);
		assertEquals(newOrderGroupAttributeType.getName(),dao.getOrderGroupAttributeTypeByUuid(UUID2).getName());
	}
	@Test
	public void getOrderGroupAttributeType_shouldReturnOrderGroupAttributeTypeGivenIntegerId(){
    	final Integer ID = 4;
		OrderGroupAttributeType newOrderGroupAttributeType = dao.getOrderGroupAttributeType(ID);
		assertEquals(4,newOrderGroupAttributeType.getId());
		
	}
	
<<<<<<< HEAD

<<<<<<< HEAD
		OrderGroupAttributeType savedOrderGroupAttributeType = dao.getOrderGroupAttributeType(5);
//		assertEquals("Scan",savedOrderGroupAttributeType.getName());
//		assertEquals(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S").parse("2020-07-30 16:24:10.0"),savedOrderGroupAttributeType.getDateCreated());
        assertNotNull(newOrderGroupAttributeType.getId());
        System.out.print(newOrderGroupAttributeType.getId());
		assertEquals(orderGroupAttributeTypeSize+1,newOrderGroupAttributeType.getId());
    }
>>>>>>> TRUNK-5410 : Added Unit Tests to HibernateOrderDAOTest for some new methods in HibernateOrderDAO
=======
>>>>>>> TRUNK-5410: Added Unit Tests for new methods to HibernateOrderDAO and OrderServiceImpl , cleaned out unnecessary code
=======
>>>>>>> TRUNK-5410:Removing unnecessary indents and spaces from HibernateOrderDAOTest ,OrderServiceTest-createOrderGroupAttributes.xml  and OrderServiceTest
=======
>>>>>>> TRUNK-5410:Removin unnecessary indents and spaces from HibernateOrderDAOTest ,OrderServiceTest-createOrderGroupAttributes.xml  and OrderServiceTest
	/**
	 * @see {@link HibernateOrderDAO#getOrderGroupAttributeTypeByName(String)}
	 * @throws Exception
	 */
    @Test
    public void getOrderGroupAttributeTypeByName_shouldGetOrderGroupAttributeTypeByName(){
		final String NAME = "ECG";
		OrderGroupAttributeType newOrderGroupAttributeType = dao.getOrderGroupAttributeTypeByName(NAME);
		assertEquals(NAME, newOrderGroupAttributeType.getName());
		assertEquals(4, newOrderGroupAttributeType.getId());
		assertEquals("9cf1bdb2-d18e-11ea-87d0-0242ac130003", newOrderGroupAttributeType.getUuid());
<<<<<<< HEAD
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    
//    @Test
//	public void deleteOrderGroupAttributeType_shouldDeleteOrderGroupAttributeTypeFromDatabase(){
//    	String uuid = "9cf1bdb2-d18e-11ea-87d0-0242ac130003";
//		OrderGroupAttributeType orderGroupAttributeType = dao.getOrderGroupAttributeTypeByUuid(uuid);
//		OrderGroupAttribute orderGroupAttribute=dao.getOrderGroupAttributeByUuid(uuid);
//		assertNotNull(orderGroupAttribute);
//		dao.deleteOrderGroupAttributeType(orderGroupAttributeType);
//		assertNull(dao.getOrderGroupAttributeByUuid(uuid));
//	}
=======
>>>>>>> TRUNK-5410 : Added Unit Tests to HibernateOrderDAOTest for some new methods in HibernateOrderDAO
=======
=======
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
    
<<<<<<< HEAD
    @Test
	public void deleteOrderGroupAttributeType_shouldDeleteOrderGroupAttributeTypeFromDatabase(){
    	String uuid = "9cf1bdb2-d18e-11ea-87d0-0242ac130003";
		OrderGroupAttributeType orderGroupAttributeType = dao.getOrderGroupAttributeTypeByUuid(uuid);
		assertNotNull(orderGroupAttributeType);
		dao.deleteOrderGroupAttributeType(orderGroupAttributeType);
		assertNull(dao.getOrderGroupAttributeTypeByUuid(uuid));
	}
>>>>>>> Added more Tests for new Changes to HibernateOrderDAO
=======
//    @Test
//	public void deleteOrderGroupAttributeType_shouldDeleteOrderGroupAttributeTypeFromDatabase(){
//    	String uuid = "9cf1bdb2-d18e-11ea-87d0-0242ac130003";
//		OrderGroupAttributeType orderGroupAttributeType = dao.getOrderGroupAttributeTypeByUuid(uuid);
//		OrderGroupAttribute orderGroupAttribute=dao.getOrderGroupAttributeByUuid(uuid);
//		assertNotNull(orderGroupAttribute);
//		dao.deleteOrderGroupAttributeType(orderGroupAttributeType);
//		assertNull(dao.getOrderGroupAttributeByUuid(uuid));
//	}
<<<<<<< HEAD
>>>>>>> TRUNK-5410: Added Unit Tests for new methods to HibernateOrderDAO and OrderServiceImpl , cleaned out unnecessary code
=======
=======
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
		assertEquals(UUID4,newOrderGroupAttributeType.getUuid());
=======
>>>>>>> TRUNK-5410:Rectifying Mistakes and adding New Features
    }
=======
    
>>>>>>> TRUNK-5410:Removing unnecessary indents and spaces from HibernateOrderDAOTest ,OrderServiceTest-createOrderGroupAttributes.xml  and OrderServiceTest
=======
    
>>>>>>> TRUNK-5410:Removin unnecessary indents and spaces from HibernateOrderDAOTest ,OrderServiceTest-createOrderGroupAttributes.xml  and OrderServiceTest
    /**
	 * @see {@link HibernateOrderDAO#deleteOrderGroupAttributeType(OrderGroupAttributeType)}
	 * @throws Exception
	 */
    @Test
	public void deleteOrderGroupAttributeType_shouldDeleteOrderGroupAttributeTypeFromDatabase(){
    	final String UUID1 = "9cf1bdb2-d18e-11ea-87d0-0242ac130003";
		OrderGroupAttributeType orderGroupAttributeType = dao.getOrderGroupAttributeTypeByUuid(UUID1);
		assertNotNull(orderGroupAttributeType);
		dao.deleteOrderGroupAttributeType(orderGroupAttributeType);
		assertNull(dao.getOrderGroupAttributeByUuid(UUID1));
	}
>>>>>>> TRUNK-5410:Fixing more Conflicting Changes
}
