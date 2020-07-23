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

import org.openmrs.attribute.AttributeType;
import org.openmrs.attribute.BaseAttributeType;

<<<<<<< HEAD
/**
 * A user-defined extension to the {@link OrderGroup} class.
 * @see AttributeType
 * @since 2.4.0
 */
public class OrderGroupAttributeType extends BaseAttributeType<OrderGroup> implements AttributeType<OrderGroup> {
	
	private Integer orderGroupAttributeTypeId;
	
=======
import java.util.Date;

public class OrderGroupAttributeType extends BaseAttributeType<OrderGroup> implements AttributeType<OrderGroup> {
	private Integer orderGroupAttributeTypeId;

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
	 */
	public Integer getOrderGroupAttributeTypeId() {
		return orderGroupAttributeTypeId;
	}

	/**
<<<<<<< HEAD
	 * @param orderGroupAttributeTypeId the order group attribute type Id to set
=======
	 * @param orderGroupAttributeTypeId the orderGroupAttributeTypeId to set
>>>>>>> TRUNK-5410 Created OrderGroupAttribute,OrderGroupAttributeType
	 */
	public void setOrderGroupAttributeTypeId(Integer orderGroupAttributeTypeId) {
		this.orderGroupAttributeTypeId = orderGroupAttributeTypeId;
	}
}
