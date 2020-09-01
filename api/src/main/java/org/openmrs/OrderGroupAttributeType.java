/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import org.openmrs.attribute.AttributeType;
import org.openmrs.attribute.BaseAttributeType;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
/**
 * A user-defined extension to the {@link OrderGroup} class.
 * @see AttributeType
 * @since 2.4.0
 */
public class OrderGroupAttributeType extends BaseAttributeType<OrderGroup> implements AttributeType<OrderGroup> {
	
	private Integer orderGroupAttributeTypeId;
	
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
import org.openmrs.api.context.Context;
=======
>>>>>>> TRUNK-5410 Added hbm Mapping Files and added them to cfg file
import org.openmrs.attribute.AttributeType;
import org.openmrs.attribute.BaseAttributeType;
=======
=======
>>>>>>> TRUNK-5410:Rectifying Mistakes and adding New Features
	private Integer cycleNumber;
	
	private String category;
	
	private Integer numberOfCyclesInTheRegimen;
	
	private Integer lengthOfCyclesInTheRegimen;
	
	private String priorOrderGroup;
<<<<<<< HEAD
>>>>>>> TRUNK-5410:Rectifying Mistakes and adding New Features

>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
=======
>>>>>>> TRUNK-5410 Added hbm Mapping Files and added them to cfg file
import org.openmrs.attribute.AttributeType;
import org.openmrs.attribute.BaseAttributeType;

>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
import java.util.Date;
=======
>>>>>>> TRUNK-5410 : Altered Javadocs decriptions in OrderService , and added spaces around expressions in OrderGroupAttribute
=======
>>>>>>> TRUNK-5410:Rectifying Mistakes and adding New Features

=======
>>>>>>> TRUNK-5410:Fixing more Conflicting Changes
public class OrderGroupAttributeType extends BaseAttributeType<OrderGroup> implements AttributeType<OrderGroup> {
	
	private Integer orderGroupAttributeTypeId;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
	/**
	 * @see org.openmrs.OpenmrsObject#getId()
	 */
	@Override
	public Integer getId() {
		return getOrderGroupAttributeTypeId();
	}

	/**
	 * @see org.openmrs.OpenmrsObject#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
		setOrderGroupAttributeTypeId(id);
	}

	/**
<<<<<<< HEAD
	 * @return the order group attribute Id
=======
	 * @return the orderGroupAttributeTypeId
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
=======
import org.openmrs.api.context.Context;
import org.openmrs.attribute.AttributeType;
import org.openmrs.attribute.BaseAttributeType;

import java.util.Date;

public class OrderGroupAttributeType extends BaseAttributeType<OrderGroup> implements AttributeType<OrderGroup> {
	private Integer orderGroupAttributeTypeId;
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
	public String name;
	public String description;
	public User user;
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
         this.name=name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
       this.description=description;
	}

	@Override
	public User getChangedBy() {
		return user ;
	}

	@Override
	public void setChangedBy(User changedBy) {
        this.user=changedBy;
	}

	@Override
	public Date getDateChanged() {
		return new Date();
	}

	@Override
	public void setDateChanged(Date dateChanged) {
         
	}

	@Override
	public User getCreator() {
		return null;
	}

	@Override
	public void setCreator(User creator) {

	}

	@Override
	public Date getDateCreated() {
		return null;
	}

	@Override
	public void setDateCreated(Date dateCreated) {

	}

	@Override
	public Boolean isRetired() {
		return null;
	}

	@Override
	public Boolean getRetired() {
		return null;
	}

	@Override
	public void setRetired(Boolean retired) {

	}

	@Override
	public User getRetiredBy() {
		return null;
	}

	@Override
	public void setRetiredBy(User retiredBy) {

	}

	@Override
	public Date getDateRetired() {
		return null;
	}

	@Override
	public void setDateRetired(Date dateRetired) {

	}

	@Override
	public String getRetireReason() {
		return null;
	}

	@Override
	public void setRetireReason(String retireReason) {

	}
<<<<<<< HEAD
=======
>>>>>>> TRUNK-5410 Added hbm Mapping Files and added them to cfg file
=======
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType

	/**
	 * @see org.openmrs.OpenmrsObject#getId()
	 */
	@Override
	public Integer getId() {
		return getOrderGroupAttributeTypeId();
	}

	/**
	 * @see org.openmrs.OpenmrsObject#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
		setOrderGroupAttributeTypeId(id);
=======
=======
>>>>>>> TRUNK-5410 Added hbm Mapping Files and added them to cfg file

=======
>>>>>>> TRUNK-5410:Doing more refactorings
	/**
	 * @see org.openmrs.OpenmrsObject#getId()
	 */
	@Override
	public Integer getId() {
		return getOrderGroupAttributeTypeId();
	}

	/**
	 * @see org.openmrs.OpenmrsObject#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
<<<<<<< HEAD
         setOrderGroupAttributeTypeId(id);
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
		setOrderGroupAttributeTypeId(id);
>>>>>>> TRUNK-5410 Added hbm Mapping Files and added them to cfg file
	}

	/**
	 * @return the orderGroupAttributeTypeId
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
	 */
	public Integer getOrderGroupAttributeTypeId() {
		return orderGroupAttributeTypeId;
	}

	/**
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	 * @param orderGroupAttributeTypeId the order group attribute type Id to set
=======
	 * @param orderGroupAttributeTypeId the orderGroupAttributeTypeId to set
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
	 * @param orderGroupAttributeTypeId the orderGroupAttributeTypeId to set
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
	 * @param orderGroupAttributeTypeId the orderGroupAttributeTypeId to set
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
	 * @param orderGroupAttributeTypeId the orderGroupAttributeTypeId to set
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
	 */
	public void setOrderGroupAttributeTypeId(Integer orderGroupAttributeTypeId) {
		this.orderGroupAttributeTypeId = orderGroupAttributeTypeId;
	}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType

	@Override
	public String getUuid() {
		return null;
	}

	@Override
	public void setUuid(String uuid) {

	}

	@Override
	public Integer getMinOccurs() {
		return null;
	}

	@Override
	public Integer getMaxOccurs() {
		return null;
	}

	@Override
	public String getDatatypeClassname() {
		return null;
	}

	@Override
	public String getDatatypeConfig() {
		return null;
	}

	@Override
	public String getPreferredHandlerClassname() {
		return null;
	}

	@Override
	public String getHandlerConfig() {
		return null;
	}
<<<<<<< HEAD
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
>>>>>>> TRUNK-5410 Added hbm Mapping Files and added them to cfg file
=======
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
=======
>>>>>>> TRUNK-5410 Added hbm Mapping Files and added them to cfg file
=======
=======
>>>>>>> TRUNK-5410:Rectifying Mistakes and adding New Features

	/**
	 * @return the cycleNumber
	 */
	public Integer getCycleNumber() {
		return cycleNumber;
	}

	/**
	 * @param cycleNumber the cycleNumber to set
	 */
	public void setCycleNumber(Integer cycleNumber) {
		this.cycleNumber = cycleNumber;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the numberOfCyclesInTheRegimen
	 */
	public Integer getNumberOfCyclesInTheRegimen() {
		return numberOfCyclesInTheRegimen;
	}
	
	/**
	 * @param numberOfCyclesInTheRegimen the number Of cycles in the Regimen to set
	 */
	public void setNumberOfCyclesInTheRegimen(Integer numberOfCyclesInTheRegimen) {
		this.numberOfCyclesInTheRegimen = numberOfCyclesInTheRegimen;
	}

	/**
	 * @return the lengthOfCyclesInTheRegimen
	 */
	public Integer getLengthOfCyclesInTheRegimen() {
		return lengthOfCyclesInTheRegimen;
	}

	/**
	 * @param lengthOfCyclesInTheRegimen the length of cycles in the Regimen to set
	 */
	public void setLengthOfCyclesInTheRegimen(Integer lengthOfCyclesInTheRegimen) {
		this.lengthOfCyclesInTheRegimen = lengthOfCyclesInTheRegimen;
	}

	/**
	 * @return the priorOrderGroup
	 */
	public String getPriorOrderGroup() {
		return priorOrderGroup;
	}

	/**
	 * @param priorOrderGroup the prior order group to set
	 */
	public void setPriorOrderGroup(String priorOrderGroup) {
		this.priorOrderGroup = priorOrderGroup;
	}
<<<<<<< HEAD
>>>>>>> TRUNK-5410:Rectifying Mistakes and adding New Features
=======
>>>>>>> TRUNK-5410:Rectifying Mistakes and adding New Features
=======
>>>>>>> TRUNK-5410:Doing more refactorings
}
