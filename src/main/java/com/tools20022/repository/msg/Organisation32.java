/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.LocationCategory1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CommunicationAddress9;
import com.tools20022.repository.msg.GenericIdentification32;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Merchant performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation32#mmIdentification
 * Organisation32.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation32#mmCommonName
 * Organisation32.mmCommonName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation32#mmLocationCategory
 * Organisation32.mmLocationCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation32#mmLocationAndContact
 * Organisation32.mmLocationAndContact}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation32#mmSchemeData
 * Organisation32.mmSchemeData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Organisation32"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Merchant performing the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Organisation32", propOrder = {"identification", "commonName", "locationCategory", "locationAndContact", "schemeData"})
public class Organisation32 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id")
	protected GenericIdentification32 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation32 Organisation32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the merchant."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation32, Optional<GenericIdentification32>> mmIdentification = new MMMessageAssociationEnd<Organisation32, Optional<GenericIdentification32>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation32.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the merchant.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification32.mmObject();
		}

		@Override
		public Optional<GenericIdentification32> getValue(Organisation32 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Organisation32 obj, Optional<GenericIdentification32> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CmonNm")
	protected Max70Text commonName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation32 Organisation32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the merchant as appearing on the receipt."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation32, Optional<Max70Text>> mmCommonName = new MMMessageAttribute<Organisation32, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation32.mmObject();
			isDerived = false;
			xmlTag = "CmonNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonName";
			definition = "Name of the merchant as appearing on the receipt.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(Organisation32 obj) {
			return obj.getCommonName();
		}

		@Override
		public void setValue(Organisation32 obj, Optional<Max70Text> value) {
			obj.setCommonName(value.orElse(null));
		}
	};
	@XmlElement(name = "LctnCtgy")
	protected LocationCategory1Code locationCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory1Code
	 * LocationCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation32 Organisation32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LctnCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocationCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location category of the place where the merchant actually performed the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation32, Optional<LocationCategory1Code>> mmLocationCategory = new MMMessageAttribute<Organisation32, Optional<LocationCategory1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation32.mmObject();
			isDerived = false;
			xmlTag = "LctnCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocationCategory";
			definition = "Location category of the place where the merchant actually performed the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LocationCategory1Code.mmObject();
		}

		@Override
		public Optional<LocationCategory1Code> getValue(Organisation32 obj) {
			return obj.getLocationCategory();
		}

		@Override
		public void setValue(Organisation32 obj, Optional<LocationCategory1Code> value) {
			obj.setLocationCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "LctnAndCtct")
	protected CommunicationAddress9 locationAndContact;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommunicationAddress9
	 * CommunicationAddress9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation32 Organisation32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LctnAndCtct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocationAndContact"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location and contact information of the merchant performing the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation32, Optional<CommunicationAddress9>> mmLocationAndContact = new MMMessageAssociationEnd<Organisation32, Optional<CommunicationAddress9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation32.mmObject();
			isDerived = false;
			xmlTag = "LctnAndCtct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocationAndContact";
			definition = "Location and contact information of the merchant performing the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommunicationAddress9.mmObject();
		}

		@Override
		public Optional<CommunicationAddress9> getValue(Organisation32 obj) {
			return obj.getLocationAndContact();
		}

		@Override
		public void setValue(Organisation32 obj, Optional<CommunicationAddress9> value) {
			obj.setLocationAndContact(value.orElse(null));
		}
	};
	@XmlElement(name = "SchmeData")
	protected Max140Text schemeData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation32 Organisation32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchmeData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SchemeData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional merchant data required by a card scheme."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation32, Optional<Max140Text>> mmSchemeData = new MMMessageAttribute<Organisation32, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation32.mmObject();
			isDerived = false;
			xmlTag = "SchmeData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SchemeData";
			definition = "Additional merchant data required by a card scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(Organisation32 obj) {
			return obj.getSchemeData();
		}

		@Override
		public void setValue(Organisation32 obj, Optional<Max140Text> value) {
			obj.setSchemeData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation32.mmIdentification, com.tools20022.repository.msg.Organisation32.mmCommonName,
						com.tools20022.repository.msg.Organisation32.mmLocationCategory, com.tools20022.repository.msg.Organisation32.mmLocationAndContact, com.tools20022.repository.msg.Organisation32.mmSchemeData);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Organisation32";
				definition = "Merchant performing the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<GenericIdentification32> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public Organisation32 setIdentification(GenericIdentification32 identification) {
		this.identification = identification;
		return this;
	}

	public Optional<Max70Text> getCommonName() {
		return commonName == null ? Optional.empty() : Optional.of(commonName);
	}

	public Organisation32 setCommonName(Max70Text commonName) {
		this.commonName = commonName;
		return this;
	}

	public Optional<LocationCategory1Code> getLocationCategory() {
		return locationCategory == null ? Optional.empty() : Optional.of(locationCategory);
	}

	public Organisation32 setLocationCategory(LocationCategory1Code locationCategory) {
		this.locationCategory = locationCategory;
		return this;
	}

	public Optional<CommunicationAddress9> getLocationAndContact() {
		return locationAndContact == null ? Optional.empty() : Optional.of(locationAndContact);
	}

	public Organisation32 setLocationAndContact(CommunicationAddress9 locationAndContact) {
		this.locationAndContact = locationAndContact;
		return this;
	}

	public Optional<Max140Text> getSchemeData() {
		return schemeData == null ? Optional.empty() : Optional.of(schemeData);
	}

	public Organisation32 setSchemeData(Max140Text schemeData) {
		this.schemeData = schemeData;
		return this;
	}
}