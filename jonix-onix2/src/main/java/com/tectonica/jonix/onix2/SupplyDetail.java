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

package com.tectonica.jonix.onix2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixSuperComposite;
import com.tectonica.jonix.codelist.AudienceRestrictionFlags;
import com.tectonica.jonix.codelist.AvailabilityStatuss;
import com.tectonica.jonix.codelist.CountryCodeIso31661s;
import com.tectonica.jonix.codelist.DateFormats;
import com.tectonica.jonix.codelist.LanguageCodeIso6392Bs;
import com.tectonica.jonix.codelist.ProductAvailabilitys;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.Regions;
import com.tectonica.jonix.codelist.ReturnsConditionsCodeTypes;
import com.tectonica.jonix.codelist.SupplierIdentifierTypes;
import com.tectonica.jonix.codelist.SupplierRoles;
import com.tectonica.jonix.codelist.SupplytoRegions;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.codelist.UnpricedItemTypes;
import com.tectonica.jonix.struct.JonixSupplierIdentifier;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

@SuppressWarnings("serial")
public class SupplyDetail implements OnixSuperComposite, Serializable
{
	public static final String refname = "SupplyDetail";
	public static final String shortname = "supplydetail";

	public TextFormats textformat;
	public TextCaseFlags textcase;
	public LanguageCodeIso6392Bs language;
	public TransliterationSchemes transliteration;
	public String datestamp; // DateOrDateTime
	public RecordSourceTypes sourcetype;
	public String sourcename;

	public List<SupplierIdentifier> supplierIdentifiers; // ZeroOrMore
	public SupplierSAN supplierSAN; // Optional
	public SupplierEANLocationNumber supplierEANLocationNumber; // Required
	public SupplierName supplierName; // Optional
	public List<TelephoneNumber> telephoneNumbers; // ZeroOrMore
	public List<FaxNumber> faxNumbers; // ZeroOrMore
	public List<EmailAddress> emailAddresss; // ZeroOrMore
	public List<Website> websites; // ZeroOrMore
	public SupplierRole supplierRole; // Optional
	public List<SupplyToCountry> supplyToCountrys; // OneOrMore
	public SupplyToTerritory supplyToTerritory; // Optional
	public List<SupplyToRegion> supplyToRegions; // ZeroOrMore
	public List<SupplyToCountryExcluded> supplyToCountryExcludeds; // ZeroOrMore
	public SupplyRestrictionDetail supplyRestrictionDetail; // Optional
	public ReturnsCodeType returnsCodeType; // Optional
	public ReturnsCode returnsCode; // Optional
	public LastDateForReturns lastDateForReturns; // Optional
	public AvailabilityCode availabilityCode; // Required
	public ProductAvailability productAvailability; // Optional
	public IntermediaryAvailabilityCode intermediaryAvailabilityCode; // Optional
	public NewSupplier newSupplier; // Optional
	public DateFormat dateFormat; // Optional
	public ExpectedShipDate expectedShipDate; // Optional
	public OnSaleDate onSaleDate; // Optional
	public OrderTime orderTime; // Optional
	public List<Stock> stocks; // ZeroOrMore
	public PackQuantity packQuantity; // Optional
	public AudienceRestrictionFlag audienceRestrictionFlag; // Optional
	public AudienceRestrictionNote audienceRestrictionNote; // Optional
	public PriceAmount priceAmount; // Optional
	public UnpricedItemType unpricedItemType; // Optional
	public List<Price> prices; // ZeroOrMore
	public Reissue reissue; // Optional

	public SupplyDetail()
	{}

	public SupplyDetail(org.w3c.dom.Element element)
	{
		this.textformat = TextFormats.byValue(JPU.getAttribute(element, "textformat"));
		this.textcase = TextCaseFlags.byValue(JPU.getAttribute(element, "textcase"));
		this.language = LanguageCodeIso6392Bs.byValue(JPU.getAttribute(element, "language"));
		this.transliteration = TransliterationSchemes.byValue(JPU.getAttribute(element, "transliteration"));
		this.datestamp = JPU.getAttribute(element, "datestamp");
		this.sourcetype = RecordSourceTypes.byValue(JPU.getAttribute(element, "sourcetype"));
		this.sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(SupplierIdentifier.refname) || name.equals(SupplierIdentifier.shortname))
					supplierIdentifiers = JPU.addToList(supplierIdentifiers, new SupplierIdentifier(element));
				else if (name.equals(SupplierSAN.refname) || name.equals(SupplierSAN.shortname))
					supplierSAN = new SupplierSAN(element);
				else if (name.equals(SupplierEANLocationNumber.refname)
						|| name.equals(SupplierEANLocationNumber.shortname))
					supplierEANLocationNumber = new SupplierEANLocationNumber(element);
				else if (name.equals(SupplierName.refname) || name.equals(SupplierName.shortname))
					supplierName = new SupplierName(element);
				else if (name.equals(TelephoneNumber.refname) || name.equals(TelephoneNumber.shortname))
					telephoneNumbers = JPU.addToList(telephoneNumbers, new TelephoneNumber(element));
				else if (name.equals(FaxNumber.refname) || name.equals(FaxNumber.shortname))
					faxNumbers = JPU.addToList(faxNumbers, new FaxNumber(element));
				else if (name.equals(EmailAddress.refname) || name.equals(EmailAddress.shortname))
					emailAddresss = JPU.addToList(emailAddresss, new EmailAddress(element));
				else if (name.equals(Website.refname) || name.equals(Website.shortname))
					websites = JPU.addToList(websites, new Website(element));
				else if (name.equals(SupplierRole.refname) || name.equals(SupplierRole.shortname))
					supplierRole = new SupplierRole(element);
				else if (name.equals(SupplyToCountry.refname) || name.equals(SupplyToCountry.shortname))
					supplyToCountrys = JPU.addToList(supplyToCountrys, new SupplyToCountry(element));
				else if (name.equals(SupplyToTerritory.refname) || name.equals(SupplyToTerritory.shortname))
					supplyToTerritory = new SupplyToTerritory(element);
				else if (name.equals(SupplyToRegion.refname) || name.equals(SupplyToRegion.shortname))
					supplyToRegions = JPU.addToList(supplyToRegions, new SupplyToRegion(element));
				else if (name.equals(SupplyToCountryExcluded.refname) || name.equals(SupplyToCountryExcluded.shortname))
					supplyToCountryExcludeds = JPU.addToList(supplyToCountryExcludeds, new SupplyToCountryExcluded(
							element));
				else if (name.equals(SupplyRestrictionDetail.refname) || name.equals(SupplyRestrictionDetail.shortname))
					supplyRestrictionDetail = new SupplyRestrictionDetail(element);
				else if (name.equals(ReturnsCodeType.refname) || name.equals(ReturnsCodeType.shortname))
					returnsCodeType = new ReturnsCodeType(element);
				else if (name.equals(ReturnsCode.refname) || name.equals(ReturnsCode.shortname))
					returnsCode = new ReturnsCode(element);
				else if (name.equals(LastDateForReturns.refname) || name.equals(LastDateForReturns.shortname))
					lastDateForReturns = new LastDateForReturns(element);
				else if (name.equals(AvailabilityCode.refname) || name.equals(AvailabilityCode.shortname))
					availabilityCode = new AvailabilityCode(element);
				else if (name.equals(ProductAvailability.refname) || name.equals(ProductAvailability.shortname))
					productAvailability = new ProductAvailability(element);
				else if (name.equals(IntermediaryAvailabilityCode.refname)
						|| name.equals(IntermediaryAvailabilityCode.shortname))
					intermediaryAvailabilityCode = new IntermediaryAvailabilityCode(element);
				else if (name.equals(NewSupplier.refname) || name.equals(NewSupplier.shortname))
					newSupplier = new NewSupplier(element);
				else if (name.equals(DateFormat.refname) || name.equals(DateFormat.shortname))
					dateFormat = new DateFormat(element);
				else if (name.equals(ExpectedShipDate.refname) || name.equals(ExpectedShipDate.shortname))
					expectedShipDate = new ExpectedShipDate(element);
				else if (name.equals(OnSaleDate.refname) || name.equals(OnSaleDate.shortname))
					onSaleDate = new OnSaleDate(element);
				else if (name.equals(OrderTime.refname) || name.equals(OrderTime.shortname))
					orderTime = new OrderTime(element);
				else if (name.equals(Stock.refname) || name.equals(Stock.shortname))
					stocks = JPU.addToList(stocks, new Stock(element));
				else if (name.equals(PackQuantity.refname) || name.equals(PackQuantity.shortname))
					packQuantity = new PackQuantity(element);
				else if (name.equals(AudienceRestrictionFlag.refname) || name.equals(AudienceRestrictionFlag.shortname))
					audienceRestrictionFlag = new AudienceRestrictionFlag(element);
				else if (name.equals(AudienceRestrictionNote.refname) || name.equals(AudienceRestrictionNote.shortname))
					audienceRestrictionNote = new AudienceRestrictionNote(element);
				else if (name.equals(PriceAmount.refname) || name.equals(PriceAmount.shortname))
					priceAmount = new PriceAmount(element);
				else if (name.equals(UnpricedItemType.refname) || name.equals(UnpricedItemType.shortname))
					unpricedItemType = new UnpricedItemType(element);
				else if (name.equals(Price.refname) || name.equals(Price.shortname))
					prices = JPU.addToList(prices, new Price(element));
				else if (name.equals(Reissue.refname) || name.equals(Reissue.shortname))
					reissue = new Reissue(element);
			}
		});
	}

	public String getSupplierSANValue()
	{
		return (supplierSAN == null) ? null : supplierSAN.value;
	}

	public String getSupplierEANLocationNumberValue()
	{
		return (supplierEANLocationNumber == null) ? null : supplierEANLocationNumber.value;
	}

	public String getSupplierNameValue()
	{
		return (supplierName == null) ? null : supplierName.value;
	}

	public List<String> getTelephoneNumberValues()
	{
		if (telephoneNumbers != null)
		{
			List<String> list = new ArrayList<>();
			for (TelephoneNumber i : telephoneNumbers)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public List<String> getFaxNumberValues()
	{
		if (faxNumbers != null)
		{
			List<String> list = new ArrayList<>();
			for (FaxNumber i : faxNumbers)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public List<String> getEmailAddressValues()
	{
		if (emailAddresss != null)
		{
			List<String> list = new ArrayList<>();
			for (EmailAddress i : emailAddresss)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public SupplierRoles getSupplierRoleValue()
	{
		return (supplierRole == null) ? null : supplierRole.value;
	}

	public List<java.util.Set<CountryCodeIso31661s>> getSupplyToCountrySets()
	{
		if (supplyToCountrys != null)
		{
			List<java.util.Set<CountryCodeIso31661s>> list = new ArrayList<>();
			for (SupplyToCountry i : supplyToCountrys)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public java.util.Set<Regions> getSupplyToTerritorySet()
	{
		return (supplyToTerritory == null) ? null : supplyToTerritory.value;
	}

	public List<SupplytoRegions> getSupplyToRegionValues()
	{
		if (supplyToRegions != null)
		{
			List<SupplytoRegions> list = new ArrayList<>();
			for (SupplyToRegion i : supplyToRegions)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public List<java.util.Set<CountryCodeIso31661s>> getSupplyToCountryExcludedSets()
	{
		if (supplyToCountryExcludeds != null)
		{
			List<java.util.Set<CountryCodeIso31661s>> list = new ArrayList<>();
			for (SupplyToCountryExcluded i : supplyToCountryExcludeds)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public String getSupplyRestrictionDetailValue()
	{
		return (supplyRestrictionDetail == null) ? null : supplyRestrictionDetail.value;
	}

	public ReturnsConditionsCodeTypes getReturnsCodeTypeValue()
	{
		return (returnsCodeType == null) ? null : returnsCodeType.value;
	}

	public String getReturnsCodeValue()
	{
		return (returnsCode == null) ? null : returnsCode.value;
	}

	public String getLastDateForReturnsValue()
	{
		return (lastDateForReturns == null) ? null : lastDateForReturns.value;
	}

	public AvailabilityStatuss getAvailabilityCodeValue()
	{
		return (availabilityCode == null) ? null : availabilityCode.value;
	}

	public ProductAvailabilitys getProductAvailabilityValue()
	{
		return (productAvailability == null) ? null : productAvailability.value;
	}

	public String getIntermediaryAvailabilityCodeValue()
	{
		return (intermediaryAvailabilityCode == null) ? null : intermediaryAvailabilityCode.value;
	}

	public DateFormats getDateFormatValue()
	{
		return (dateFormat == null) ? null : dateFormat.value;
	}

	public String getExpectedShipDateValue()
	{
		return (expectedShipDate == null) ? null : expectedShipDate.value;
	}

	public String getOnSaleDateValue()
	{
		return (onSaleDate == null) ? null : onSaleDate.value;
	}

	public String getOrderTimeValue()
	{
		return (orderTime == null) ? null : orderTime.value;
	}

	public String getPackQuantityValue()
	{
		return (packQuantity == null) ? null : packQuantity.value;
	}

	public AudienceRestrictionFlags getAudienceRestrictionFlagValue()
	{
		return (audienceRestrictionFlag == null) ? null : audienceRestrictionFlag.value;
	}

	public String getAudienceRestrictionNoteValue()
	{
		return (audienceRestrictionNote == null) ? null : audienceRestrictionNote.value;
	}

	public String getPriceAmountValue()
	{
		return (priceAmount == null) ? null : priceAmount.value;
	}

	public UnpricedItemTypes getUnpricedItemTypeValue()
	{
		return (unpricedItemType == null) ? null : unpricedItemType.value;
	}

	public JonixSupplierIdentifier findSupplierIdentifier(SupplierIdentifierTypes supplierIDType)
	{
		if (supplierIdentifiers != null)
		{
			for (SupplierIdentifier x : supplierIdentifiers)
			{
				if (x.getSupplierIDTypeValue() == supplierIDType)
					return x.asJonixSupplierIdentifier();
			}
		}
		return null;
	}

	public List<JonixSupplierIdentifier> findSupplierIdentifiers(java.util.Set<SupplierIdentifierTypes> supplierIDTypes)
	{
		if (supplierIdentifiers != null)
		{
			List<JonixSupplierIdentifier> matches = new ArrayList<>();
			for (SupplierIdentifier x : supplierIdentifiers)
			{
				if (supplierIDTypes == null || supplierIDTypes.contains(x.getSupplierIDTypeValue()))
					matches.add(x.asJonixSupplierIdentifier());
			}
			return matches;
		}
		return null;
	}
}