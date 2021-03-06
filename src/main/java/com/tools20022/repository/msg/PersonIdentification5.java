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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.PersonIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateAndPlaceOfBirth;
import com.tools20022.repository.msg.GenericPersonIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique and unambiguous way to identify a person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PersonIdentification5#mmDateAndPlaceOfBirth
 * PersonIdentification5.mmDateAndPlaceOfBirth}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification5#mmOther
 * PersonIdentification5.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PersonIdentification
 * PersonIdentification}</li>
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
 * "PersonIdentification5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify a person."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification7
 * PersonIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification14
 * PersonIdentification14}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PersonIdentification5", propOrder = {"dateAndPlaceOfBirth", "other"})
public class PersonIdentification5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtAndPlcOfBirth")
	protected DateAndPlaceOfBirth dateAndPlaceOfBirth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth
	 * DateAndPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPerson
	 * PersonIdentification.mmPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification5
	 * PersonIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtAndPlcOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateAndPlaceOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and place of birth of a person."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmDateAndPlaceOfBirth
	 * PersonIdentification7.mmDateAndPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification14#mmDateAndPlaceOfBirth
	 * PersonIdentification14.mmDateAndPlaceOfBirth}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PersonIdentification5, Optional<DateAndPlaceOfBirth>> mmDateAndPlaceOfBirth = new MMMessageAssociationEnd<PersonIdentification5, Optional<DateAndPlaceOfBirth>>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmPerson;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification5.mmObject();
			isDerived = false;
			xmlTag = "DtAndPlcOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateAndPlaceOfBirth";
			definition = "Date and place of birth of a person.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification7.mmDateAndPlaceOfBirth, PersonIdentification14.mmDateAndPlaceOfBirth);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndPlaceOfBirth.mmObject();
		}

		@Override
		public Optional<DateAndPlaceOfBirth> getValue(PersonIdentification5 obj) {
			return obj.getDateAndPlaceOfBirth();
		}

		@Override
		public void setValue(PersonIdentification5 obj, Optional<DateAndPlaceOfBirth> value) {
			obj.setDateAndPlaceOfBirth(value.orElse(null));
		}
	};
	@XmlElement(name = "Othr")
	protected List<GenericPersonIdentification1> other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1
	 * GenericPersonIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification5
	 * PersonIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of a person, as assigned by an institution, using an identification scheme."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmOther
	 * PersonIdentification7.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification14#mmOther
	 * PersonIdentification14.mmOther}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PersonIdentification5, List<GenericPersonIdentification1>> mmOther = new MMMessageAssociationEnd<PersonIdentification5, List<GenericPersonIdentification1>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PersonIdentification5.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Unique identification of a person, as assigned by an institution, using an identification scheme.";
			nextVersions_lazy = () -> Arrays.asList(PersonIdentification7.mmOther, PersonIdentification14.mmOther);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericPersonIdentification1.mmObject();
		}

		@Override
		public List<GenericPersonIdentification1> getValue(PersonIdentification5 obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(PersonIdentification5 obj, List<GenericPersonIdentification1> value) {
			obj.setOther(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PersonIdentification5.mmDateAndPlaceOfBirth, com.tools20022.repository.msg.PersonIdentification5.mmOther);
				trace_lazy = () -> PersonIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonIdentification5";
				definition = "Unique and unambiguous way to identify a person.";
				nextVersions_lazy = () -> Arrays.asList(PersonIdentification7.mmObject(), PersonIdentification14.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateAndPlaceOfBirth> getDateAndPlaceOfBirth() {
		return dateAndPlaceOfBirth == null ? Optional.empty() : Optional.of(dateAndPlaceOfBirth);
	}

	public PersonIdentification5 setDateAndPlaceOfBirth(DateAndPlaceOfBirth dateAndPlaceOfBirth) {
		this.dateAndPlaceOfBirth = dateAndPlaceOfBirth;
		return this;
	}

	public List<GenericPersonIdentification1> getOther() {
		return other == null ? other = new ArrayList<>() : other;
	}

	public PersonIdentification5 setOther(List<GenericPersonIdentification1> other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}