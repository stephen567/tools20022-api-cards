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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.PartyTypeCode;
import com.tools20022.repository.codeset.TypeOfIdentificationCode;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous way to identify a party
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PartyIdentificationInformation"
 * src="doc-files/PartyIdentificationInformation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
 * PartyIdentificationInformation.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedParty
 * PartyIdentificationInformation.mmIdentifiedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmNationalRegistrationNumber
 * PartyIdentificationInformation.mmNationalRegistrationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTypeOfIdentification
 * PartyIdentificationInformation.mmTypeOfIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmDeclaration
 * PartyIdentificationInformation.mmDeclaration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyType
 * PartyIdentificationInformation.mmPartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmPartyName
 * PartyIdentificationInformation.mmPartyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmValidityPeriod
 * PartyIdentificationInformation.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmIdentifiedMarket
 * PartyIdentificationInformation.mmIdentifiedMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
 * PartyIdentificationInformation.mmLEI}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPartyIdentification
 * GenericIdentification.mmRelatedPartyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmIdentification
 * Party.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PartyName#mmPartyIdentification
 * PartyName.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedIdentification
 * DateTimePeriod.mmRelatedIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Market#mmIdentification
 * Market.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification42#mmIdentification
 * PartyIdentification42.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5#mmSendingInstitution
 * CardTransactionEnvironment5.mmSendingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5#mmReceivingInstitution
 * CardTransactionEnvironment5.mmReceivingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5#mmSettlementInstitution
 * CardTransactionEnvironment5.mmSettlementInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice#mmNameAndAddress
 * PartyIdentification100Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification129#mmIdentification
 * PartyIdentification129.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.OrganisationIdentification
 * OrganisationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonIdentification
 * PersonIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress3
 * NameAndAddress3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party10Choice Party10Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification42
 * PartyIdentification42}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party9Choice Party9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NameAndAddress6
 * NameAndAddress6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PartyIdentification72Choice
 * PartyIdentification72Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5
 * CardTransactionEnvironment5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice
 * PartyIdentification100Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party36Choice Party36Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification129
 * PartyIdentification129}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=BusinessComment, BusinessComment="Information" to be
 * removed when PartyIdentification message component is removed.</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentificationInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique and unambiguous way to identify a party"</li>
 * </ul>
 */
public class PartyIdentificationInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification otherIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedPartyIdentification
	 * GenericIdentification.mmRelatedPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification5#mmOther
	 * PersonIdentification5.mmOther}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContactDetails2#mmOther
	 * ContactDetails2.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification7#mmOther
	 * OrganisationIdentification7.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation9#mmIdentification
	 * Organisation9.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification72Choice#mmProprietaryIdentification
	 * PartyIdentification72Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmOther
	 * PersonIdentification7.mmOther}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Acquirer4#mmIdentification
	 * Acquirer4.mmIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Acquirer5#mmIdentification
	 * Acquirer5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult8#mmAuthorisationEntity
	 * AuthorisationResult8.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult7#mmAuthorisationEntity
	 * AuthorisationResult7.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification100Choice#mmProprietaryIdentification
	 * PartyIdentification100Choice.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult12#mmAuthorisationEntity
	 * AuthorisationResult12.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult11#mmAuthorisationEntity
	 * AuthorisationResult11.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult10#mmAuthorisationEntity
	 * AuthorisationResult10.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthorisationResult13#mmAuthorisationEntity
	 * AuthorisationResult13.mmAuthorisationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment71#mmMerchantIdentification
	 * CardPaymentEnvironment71.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment69#mmMerchantIdentification
	 * CardPaymentEnvironment69.mmMerchantIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification14#mmOther
	 * PersonIdentification14.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation32#mmIdentification
	 * Organisation32.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmAcquirerIdentification
	 * AcquirerProtocolParameters11.mmAcquirerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmOther
	 * PersonIdentification15.mmOther}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier issued to a party for which no specific identifier has been defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PartyIdentificationInformation, GenericIdentification> mmOtherIdentification = new MMBusinessAssociationEnd<PartyIdentificationInformation, GenericIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(PersonIdentification5.mmOther, ContactDetails2.mmOther, OrganisationIdentification7.mmOther, Organisation9.mmIdentification, PartyIdentification72Choice.mmProprietaryIdentification,
					PersonIdentification7.mmOther, Acquirer4.mmIdentification, Acquirer5.mmIdentification, AuthorisationResult8.mmAuthorisationEntity, AuthorisationResult7.mmAuthorisationEntity,
					PartyIdentification100Choice.mmProprietaryIdentification, AuthorisationResult12.mmAuthorisationEntity, AuthorisationResult11.mmAuthorisationEntity, AuthorisationResult10.mmAuthorisationEntity,
					AuthorisationResult13.mmAuthorisationEntity, CardPaymentEnvironment71.mmMerchantIdentification, CardPaymentEnvironment69.mmMerchantIdentification, PersonIdentification14.mmOther, Organisation32.mmIdentification,
					AcquirerProtocolParameters11.mmAcquirerIdentification, PersonIdentification15.mmOther);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherIdentification";
			definition = "Identifier issued to a party for which no specific identifier has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmRelatedPartyIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(PartyIdentificationInformation obj) {
			return obj.getOtherIdentification();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, GenericIdentification value) {
			obj.setOtherIdentification(value);
		}
	};
	protected Party identifiedParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PartyIdentificationInformation, Optional<Party>> mmIdentifiedParty = new MMBusinessAssociationEnd<PartyIdentificationInformation, Optional<Party>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedParty";
			definition = "Party for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Party.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Party.mmObject();
		}

		@Override
		public Optional<Party> getValue(PartyIdentificationInformation obj) {
			return obj.getIdentifiedParty();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, Optional<Party> value) {
			obj.setIdentifiedParty(value.orElse(null));
		}
	};
	protected Max35Text taxIdentificationNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty3#mmTaxIdentification
	 * TaxParty3.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxParty3#mmRegistrationIdentification
	 * TaxParty3.mmRegistrationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification7#mmTaxIdentificationNumber
	 * PersonIdentification7.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PersonIdentification15#mmTaxIdentificationNumber
	 * PersonIdentification15.mmTaxIdentificationNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a tax authority to an entity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PartyIdentificationInformation, Max35Text> mmTaxIdentificationNumber = new MMBusinessAttribute<PartyIdentificationInformation, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(TaxParty3.mmTaxIdentification, TaxParty3.mmRegistrationIdentification, PersonIdentification7.mmTaxIdentificationNumber, PersonIdentification15.mmTaxIdentificationNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PartyIdentificationInformation obj) {
			return obj.getTaxIdentificationNumber();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, Max35Text value) {
			obj.setTaxIdentificationNumber(value);
		}
	};
	protected Max35Text nationalRegistrationNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PartyIdentificationInformation, Optional<Max35Text>> mmNationalRegistrationNumber = new MMBusinessAttribute<PartyIdentificationInformation, Optional<Max35Text>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NationalRegistrationNumber";
			definition = "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PartyIdentificationInformation obj) {
			return obj.getNationalRegistrationNumber();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, Optional<Max35Text> value) {
			obj.setNationalRegistrationNumber(value.orElse(null));
		}
	};
	protected TypeOfIdentificationCode typeOfIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfIdentificationCode
	 * TypeOfIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of alternate identification which can be used to identify a party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PartyIdentificationInformation, TypeOfIdentificationCode> mmTypeOfIdentification = new MMBusinessAttribute<PartyIdentificationInformation, TypeOfIdentificationCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfIdentification";
			definition = "Specifies the type of alternate identification which can be used to identify a party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfIdentificationCode.mmObject();
		}

		@Override
		public TypeOfIdentificationCode getValue(PartyIdentificationInformation obj) {
			return obj.getTypeOfIdentification();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, TypeOfIdentificationCode value) {
			obj.setTypeOfIdentification(value);
		}
	};
	protected Max350Text declaration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Declaration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides declaration details relative to the party."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PartyIdentificationInformation, Optional<Max350Text>> mmDeclaration = new MMBusinessAttribute<PartyIdentificationInformation, Optional<Max350Text>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Declaration";
			definition = "Provides declaration details relative to the party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(PartyIdentificationInformation obj) {
			return obj.getDeclaration();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, Optional<Max350Text> value) {
			obj.setDeclaration(value.orElse(null));
		}
	};
	protected PartyTypeCode partyType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of party in different business contexts."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PartyIdentificationInformation, PartyTypeCode> mmPartyType = new MMBusinessAttribute<PartyIdentificationInformation, PartyTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Specifies the type of party in different business contexts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}

		@Override
		public PartyTypeCode getValue(PartyIdentificationInformation obj) {
			return obj.getPartyType();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, PartyTypeCode value) {
			obj.setPartyType(value);
		}
	};
	protected List<PartyName> partyName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmPartyIdentification
	 * PartyName.mmPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PartyName PartyName}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PartyIdentificationInformation, List<PartyName>> mmPartyName = new MMBusinessAssociationEnd<PartyIdentificationInformation, List<PartyName>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyName";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			minOccurs = 1;
			opposite_lazy = () -> PartyName.mmPartyIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PartyName.mmObject();
		}

		@Override
		public List<PartyName> getValue(PartyIdentificationInformation obj) {
			return obj.getPartyName();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, List<PartyName> value) {
			obj.setPartyName(value);
		}
	};
	protected DateTimePeriod validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedIdentification
	 * DateTimePeriod.mmRelatedIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period during which an identification is valid"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PartyIdentificationInformation, Optional<DateTimePeriod>> mmValidityPeriod = new MMBusinessAssociationEnd<PartyIdentificationInformation, Optional<DateTimePeriod>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which an identification is valid";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> DateTimePeriod.mmRelatedIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public Optional<DateTimePeriod> getValue(PartyIdentificationInformation obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, Optional<DateTimePeriod> value) {
			obj.setValidityPeriod(value.orElse(null));
		}
	};
	protected Market identifiedMarket;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Market#mmIdentification
	 * Market.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Market Market}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PartyIdentificationInformation, Market> mmIdentifiedMarket = new MMBusinessAssociationEnd<PartyIdentificationInformation, Market>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentifiedMarket";
			definition = "Market for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Market.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Market.mmObject();
		}

		@Override
		public Market getValue(PartyIdentificationInformation obj) {
			return obj.getIdentifiedMarket();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, Market value) {
			obj.setIdentifiedMarket(value);
		}
	};
	protected LEIIdentifier lEI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PartyIdentificationInformation, LEIIdentifier> mmLEI = new MMBusinessAttribute<PartyIdentificationInformation, LEIIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LEI";
			definition = "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public LEIIdentifier getValue(PartyIdentificationInformation obj) {
			return obj.getLEI();
		}

		@Override
		public void setValue(PartyIdentificationInformation obj, LEIIdentifier value) {
			obj.setLEI(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "BusinessComment", new String[]{"BusinessComment", "\"Information\" to be removed when PartyIdentification message component is removed."}));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationInformation";
				definition = "Unique and unambiguous way to identify a party";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmRelatedPartyIdentification, Party.mmIdentification, PartyName.mmPartyIdentification, DateTimePeriod.mmRelatedIdentification, Market.mmIdentification);
				derivationElement_lazy = () -> Arrays.asList(PartyIdentification42.mmIdentification, CardTransactionEnvironment5.mmSendingInstitution, CardTransactionEnvironment5.mmReceivingInstitution,
						CardTransactionEnvironment5.mmSettlementInstitution, PartyIdentification100Choice.mmNameAndAddress, PartyIdentification129.mmIdentification);
				subType_lazy = () -> Arrays.asList(OrganisationIdentification.mmObject(), PersonIdentification.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PartyIdentificationInformation.mmOtherIdentification, com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedParty,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmTaxIdentificationNumber, com.tools20022.repository.entity.PartyIdentificationInformation.mmNationalRegistrationNumber,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmTypeOfIdentification, com.tools20022.repository.entity.PartyIdentificationInformation.mmDeclaration,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmPartyType, com.tools20022.repository.entity.PartyIdentificationInformation.mmPartyName,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmValidityPeriod, com.tools20022.repository.entity.PartyIdentificationInformation.mmIdentifiedMarket,
						com.tools20022.repository.entity.PartyIdentificationInformation.mmLEI);
				derivationComponent_lazy = () -> Arrays.asList(NameAndAddress3.mmObject(), Party10Choice.mmObject(), PartyIdentification42.mmObject(), Party9Choice.mmObject(), NameAndAddress6.mmObject(),
						PartyIdentification72Choice.mmObject(), CardTransactionEnvironment5.mmObject(), PartyIdentification100Choice.mmObject(), Party36Choice.mmObject(), PartyIdentification129.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PartyIdentificationInformation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification getOtherIdentification() {
		return otherIdentification;
	}

	public PartyIdentificationInformation setOtherIdentification(GenericIdentification otherIdentification) {
		this.otherIdentification = Objects.requireNonNull(otherIdentification);
		return this;
	}

	public Optional<Party> getIdentifiedParty() {
		return identifiedParty == null ? Optional.empty() : Optional.of(identifiedParty);
	}

	public PartyIdentificationInformation setIdentifiedParty(Party identifiedParty) {
		this.identifiedParty = identifiedParty;
		return this;
	}

	public Max35Text getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public PartyIdentificationInformation setTaxIdentificationNumber(Max35Text taxIdentificationNumber) {
		this.taxIdentificationNumber = Objects.requireNonNull(taxIdentificationNumber);
		return this;
	}

	public Optional<Max35Text> getNationalRegistrationNumber() {
		return nationalRegistrationNumber == null ? Optional.empty() : Optional.of(nationalRegistrationNumber);
	}

	public PartyIdentificationInformation setNationalRegistrationNumber(Max35Text nationalRegistrationNumber) {
		this.nationalRegistrationNumber = nationalRegistrationNumber;
		return this;
	}

	public TypeOfIdentificationCode getTypeOfIdentification() {
		return typeOfIdentification;
	}

	public PartyIdentificationInformation setTypeOfIdentification(TypeOfIdentificationCode typeOfIdentification) {
		this.typeOfIdentification = Objects.requireNonNull(typeOfIdentification);
		return this;
	}

	public Optional<Max350Text> getDeclaration() {
		return declaration == null ? Optional.empty() : Optional.of(declaration);
	}

	public PartyIdentificationInformation setDeclaration(Max350Text declaration) {
		this.declaration = declaration;
		return this;
	}

	public PartyTypeCode getPartyType() {
		return partyType;
	}

	public PartyIdentificationInformation setPartyType(PartyTypeCode partyType) {
		this.partyType = Objects.requireNonNull(partyType);
		return this;
	}

	public List<PartyName> getPartyName() {
		return partyName == null ? partyName = new ArrayList<>() : partyName;
	}

	public PartyIdentificationInformation setPartyName(List<PartyName> partyName) {
		this.partyName = Objects.requireNonNull(partyName);
		return this;
	}

	public Optional<DateTimePeriod> getValidityPeriod() {
		return validityPeriod == null ? Optional.empty() : Optional.of(validityPeriod);
	}

	public PartyIdentificationInformation setValidityPeriod(DateTimePeriod validityPeriod) {
		this.validityPeriod = validityPeriod;
		return this;
	}

	public Market getIdentifiedMarket() {
		return identifiedMarket;
	}

	public PartyIdentificationInformation setIdentifiedMarket(Market identifiedMarket) {
		this.identifiedMarket = Objects.requireNonNull(identifiedMarket);
		return this;
	}

	public LEIIdentifier getLEI() {
		return lEI;
	}

	public PartyIdentificationInformation setLEI(LEIIdentifier lEI) {
		this.lEI = Objects.requireNonNull(lEI);
		return this;
	}
}