/*
 * Copyright (C) 2012 Zach Melamed
 * 
 * Latest version available online at https://github.com/zach-m/jonix
 * Contact me at zach@tectonica.co.il
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tectonica.jonix.basic;

import java.io.Serializable;

import com.tectonica.jonix.codelist.AvailabilityStatuss;
import com.tectonica.jonix.codelist.SupplierRoles;

@SuppressWarnings("serial")
public class BasicSupplyDetail implements Serializable
{
	public final SupplierRoles supplierRole;
	public final String supplierName;
	public final String availability; // name of an enum, AvailabilityStatuss or ProductAvailabilitys
	public final BasicPrices prices;

	public BasicSupplyDetail(com.tectonica.jonix.onix2.SupplyDetail supplyDetail)
	{
		final AvailabilityStatuss availabilityCode = supplyDetail.getAvailabilityCodeValue();
		// NOTE: AvailabilityStatuss is a required field, we essentially bury here a validation error
		supplierRole = supplyDetail.getSupplierRoleValue();
		supplierName = supplyDetail.getSupplierNameValue();
		availability = (availabilityCode == null) ? null : availabilityCode.name();
		prices = new BasicPrices(supplyDetail);
	}

	public BasicSupplyDetail(com.tectonica.jonix.onix3.SupplyDetail supplyDetail)
	{
		supplierRole = supplyDetail.supplier.getSupplierRoleValue();
		supplierName = supplyDetail.supplier.getSupplierNameValue();
		availability = supplyDetail.getProductAvailabilityValue().name();
		prices = new BasicPrices(supplyDetail);
	}
}