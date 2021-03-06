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
import com.tools20022.repository.codeset.CardProductType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.PaymentCard;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContentInformationType17;
import com.tools20022.repository.msg.PlainCardData15;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment card performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard28#mmProtectedCardData
 * PaymentCard28.mmProtectedCardData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard28#mmPrivateCardData
 * PaymentCard28.mmPrivateCardData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard28#mmPlainCardData
 * PaymentCard28.mmPlainCardData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard28#mmPaymentAccountReference
 * PaymentCard28.mmPaymentAccountReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard28#mmMaskedPAN
 * PaymentCard28.mmMaskedPAN}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard28#mmIssuerBIN
 * PaymentCard28.mmIssuerBIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard28#mmCardCountryCode
 * PaymentCard28.mmCardCountryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard28#mmCardCurrencyCode
 * PaymentCard28.mmCardCurrencyCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard28#mmCardProductProfile
 * PaymentCard28.mmCardProductProfile}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard28#mmCardBrand
 * PaymentCard28.mmCardBrand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard28#mmCardProductType
 * PaymentCard28.mmCardProductType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard28#mmCardProductSubType
 * PaymentCard28.mmCardProductSubType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard28#mmInternationalCard
 * PaymentCard28.mmInternationalCard}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard28#mmAllowedProduct
 * PaymentCard28.mmAllowedProduct}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard28#mmServiceOption
 * PaymentCard28.mmServiceOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard28#mmAdditionalCardData
 * PaymentCard28.mmAdditionalCardData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentCard
 * PaymentCard}</li>
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
 * "PaymentCard28"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment card performing the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentCard28", propOrder = {"protectedCardData", "privateCardData", "plainCardData", "paymentAccountReference", "maskedPAN", "issuerBIN", "cardCountryCode", "cardCurrencyCode", "cardProductProfile", "cardBrand",
		"cardProductType", "cardProductSubType", "internationalCard", "allowedProduct", "serviceOption", "additionalCardData"})
public class PaymentCard28 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrtctdCardData")
	protected ContentInformationType17 protectedCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType17
	 * ContentInformationType17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replacement of the message element PlainCardData by a digital envelope using a cryptographic key."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentCard28, Optional<ContentInformationType17>> mmProtectedCardData = new MMMessageAssociationEnd<PaymentCard28, Optional<ContentInformationType17>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardData";
			definition = "Replacement of the message element PlainCardData by a digital envelope using a cryptographic key.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType17.mmObject();
		}

		@Override
		public Optional<ContentInformationType17> getValue(PaymentCard28 obj) {
			return obj.getProtectedCardData();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<ContentInformationType17> value) {
			obj.setProtectedCardData(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvtCardData")
	protected Max100KBinary privateCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max100KBinary
	 * Max100KBinary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvtCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivateCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replacement of the message element PlainCardData by a private envelope."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard28, Optional<Max100KBinary>> mmPrivateCardData = new MMMessageAttribute<PaymentCard28, Optional<Max100KBinary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "PrvtCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivateCardData";
			definition = "Replacement of the message element PlainCardData by a private envelope.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max100KBinary.mmObject();
		}

		@Override
		public Optional<Max100KBinary> getValue(PaymentCard28 obj) {
			return obj.getPrivateCardData();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<Max100KBinary> value) {
			obj.setPrivateCardData(value.orElse(null));
		}
	};
	@XmlElement(name = "PlainCardData")
	protected PlainCardData15 plainCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PlainCardData15
	 * PlainCardData15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlainCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlainCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sensitive data associated with the card performing the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentCard28, Optional<PlainCardData15>> mmPlainCardData = new MMMessageAssociationEnd<PaymentCard28, Optional<PlainCardData15>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "PlainCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlainCardData";
			definition = "Sensitive data associated with the card performing the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PlainCardData15.mmObject();
		}

		@Override
		public Optional<PlainCardData15> getValue(PaymentCard28 obj) {
			return obj.getPlainCardData();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<PlainCardData15> value) {
			obj.setPlainCardData(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtAcctRef")
	protected Max70Text paymentAccountReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtAcctRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentAccountReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference to the card, used by both merchants and acquirers to link tokenized and non-tokenized transactions associated to the same underlying card."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard28, Optional<Max70Text>> mmPaymentAccountReference = new MMMessageAttribute<PaymentCard28, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "PmtAcctRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentAccountReference";
			definition = "Unique reference to the card, used by both merchants and acquirers to link tokenized and non-tokenized transactions associated to the same underlying card.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(PaymentCard28 obj) {
			return obj.getPaymentAccountReference();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<Max70Text> value) {
			obj.setPaymentAccountReference(value.orElse(null));
		}
	};
	@XmlElement(name = "MskdPAN")
	protected Max30Text maskedPAN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max30Text
	 * Max30Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MskdPAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaskedPAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Masked PAN to be printed on payment receipts or displayed to the cardholder. Masked digits may be absent or replaced by another character as '*'."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard28, Optional<Max30Text>> mmMaskedPAN = new MMMessageAttribute<PaymentCard28, Optional<Max30Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "MskdPAN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaskedPAN";
			definition = "Masked PAN to be printed on payment receipts or displayed to the cardholder. Masked digits may be absent or replaced by another character as '*'.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max30Text.mmObject();
		}

		@Override
		public Optional<Max30Text> getValue(PaymentCard28 obj) {
			return obj.getMaskedPAN();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<Max30Text> value) {
			obj.setMaskedPAN(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrBIN")
	protected Max15NumericText issuerBIN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrBIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerBIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank identifier number of the issuer for routing purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard28, Optional<Max15NumericText>> mmIssuerBIN = new MMMessageAttribute<PaymentCard28, Optional<Max15NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "IssrBIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerBIN";
			definition = "Bank identifier number of the issuer for routing purpose.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Optional<Max15NumericText> getValue(PaymentCard28 obj) {
			return obj.getIssuerBIN();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<Max15NumericText> value) {
			obj.setIssuerBIN(value.orElse(null));
		}
	};
	@XmlElement(name = "CardCtryCd")
	protected Max3Text cardCountryCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Text
	 * Max3Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardCountryCode
	 * PaymentCard.mmCardCountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardCtryCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCountryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country code assigned to the card by the card issuer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard28, Optional<Max3Text>> mmCardCountryCode = new MMMessageAttribute<PaymentCard28, Optional<Max3Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCardCountryCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "CardCtryCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCountryCode";
			definition = "Country code assigned to the card by the card issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}

		@Override
		public Optional<Max3Text> getValue(PaymentCard28 obj) {
			return obj.getCardCountryCode();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<Max3Text> value) {
			obj.setCardCountryCode(value.orElse(null));
		}
	};
	@XmlElement(name = "CardCcyCd")
	protected Exact3AlphaNumericText cardCurrencyCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3AlphaNumericText
	 * Exact3AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardCcyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency code of the card issuer (ISO 4217 numeric code)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard28, Optional<Exact3AlphaNumericText>> mmCardCurrencyCode = new MMMessageAttribute<PaymentCard28, Optional<Exact3AlphaNumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "CardCcyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCurrencyCode";
			definition = "Currency code of the card issuer (ISO 4217 numeric code).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Exact3AlphaNumericText> getValue(PaymentCard28 obj) {
			return obj.getCardCurrencyCode();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<Exact3AlphaNumericText> value) {
			obj.setCardCurrencyCode(value.orElse(null));
		}
	};
	@XmlElement(name = "CardPdctPrfl")
	protected Max35Text cardProductProfile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPdctPrfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProductProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines a category of cards related to the acceptance processing rules defined by the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard28, Optional<Max35Text>> mmCardProductProfile = new MMMessageAttribute<PaymentCard28, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "CardPdctPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProductProfile";
			definition = "Defines a category of cards related to the acceptance processing rules defined by the acquirer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentCard28 obj) {
			return obj.getCardProductProfile();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<Max35Text> value) {
			obj.setCardProductProfile(value.orElse(null));
		}
	};
	@XmlElement(name = "CardBrnd")
	protected Max35Text cardBrand;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardBrand
	 * PaymentCard.mmCardBrand}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardBrnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardBrand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Brand name of the card."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard28, Optional<Max35Text>> mmCardBrand = new MMMessageAttribute<PaymentCard28, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCardBrand;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "CardBrnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardBrand";
			definition = "Brand name of the card.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentCard28 obj) {
			return obj.getCardBrand();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<Max35Text> value) {
			obj.setCardBrand(value.orElse(null));
		}
	};
	@XmlElement(name = "CardPdctTp")
	protected CardProductType1Code cardProductType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardProductType1Code
	 * CardProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPdctTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProductType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of card product."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard28, Optional<CardProductType1Code>> mmCardProductType = new MMMessageAttribute<PaymentCard28, Optional<CardProductType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "CardPdctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProductType";
			definition = "Type of card product.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardProductType1Code.mmObject();
		}

		@Override
		public Optional<CardProductType1Code> getValue(PaymentCard28 obj) {
			return obj.getCardProductType();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<CardProductType1Code> value) {
			obj.setCardProductType(value.orElse(null));
		}
	};
	@XmlElement(name = "CardPdctSubTp")
	protected Max35Text cardProductSubType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmCardProgramme
	 * PaymentCard.mmCardProgramme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPdctSubTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProductSubType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additionnal information to identify CardProduct."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard28, Optional<Max35Text>> mmCardProductSubType = new MMMessageAttribute<PaymentCard28, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmCardProgramme;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "CardPdctSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProductSubType";
			definition = "Additionnal information to identify CardProduct.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentCard28 obj) {
			return obj.getCardProductSubType();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<Max35Text> value) {
			obj.setCardProductSubType(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrnlCard")
	protected TrueFalseIndicator internationalCard;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrnlCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternationalCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "True if the card may be used abroad."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard28, Optional<TrueFalseIndicator>> mmInternationalCard = new MMMessageAttribute<PaymentCard28, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "IntrnlCard";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternationalCard";
			definition = "True if the card may be used abroad.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentCard28 obj) {
			return obj.getInternationalCard();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<TrueFalseIndicator> value) {
			obj.setInternationalCard(value.orElse(null));
		}
	};
	@XmlElement(name = "AllwdPdct")
	protected List<Max70Text> allowedProduct;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllwdPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowedProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product that can be purchased with the card."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard28, List<Max70Text>> mmAllowedProduct = new MMMessageAttribute<PaymentCard28, List<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "AllwdPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowedProduct";
			definition = "Product that can be purchased with the card.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(PaymentCard28 obj) {
			return obj.getAllowedProduct();
		}

		@Override
		public void setValue(PaymentCard28 obj, List<Max70Text> value) {
			obj.setAllowedProduct(value);
		}
	};
	@XmlElement(name = "SvcOptn")
	protected Max35Text serviceOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcOptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Options to the service provided by the card."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard28, Optional<Max35Text>> mmServiceOption = new MMMessageAttribute<PaymentCard28, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "SvcOptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceOption";
			definition = "Options to the service provided by the card.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentCard28 obj) {
			return obj.getServiceOption();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<Max35Text> value) {
			obj.setServiceOption(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlCardData")
	protected Max70Text additionalCardData;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard28 PaymentCard28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional card issuer specific data."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard28, Optional<Max70Text>> mmAdditionalCardData = new MMMessageAttribute<PaymentCard28, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard28.mmObject();
			isDerived = false;
			xmlTag = "AddtlCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCardData";
			definition = "Additional card issuer specific data.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(PaymentCard28 obj) {
			return obj.getAdditionalCardData();
		}

		@Override
		public void setValue(PaymentCard28 obj, Optional<Max70Text> value) {
			obj.setAdditionalCardData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard28.mmProtectedCardData, com.tools20022.repository.msg.PaymentCard28.mmPrivateCardData,
						com.tools20022.repository.msg.PaymentCard28.mmPlainCardData, com.tools20022.repository.msg.PaymentCard28.mmPaymentAccountReference, com.tools20022.repository.msg.PaymentCard28.mmMaskedPAN,
						com.tools20022.repository.msg.PaymentCard28.mmIssuerBIN, com.tools20022.repository.msg.PaymentCard28.mmCardCountryCode, com.tools20022.repository.msg.PaymentCard28.mmCardCurrencyCode,
						com.tools20022.repository.msg.PaymentCard28.mmCardProductProfile, com.tools20022.repository.msg.PaymentCard28.mmCardBrand, com.tools20022.repository.msg.PaymentCard28.mmCardProductType,
						com.tools20022.repository.msg.PaymentCard28.mmCardProductSubType, com.tools20022.repository.msg.PaymentCard28.mmInternationalCard, com.tools20022.repository.msg.PaymentCard28.mmAllowedProduct,
						com.tools20022.repository.msg.PaymentCard28.mmServiceOption, com.tools20022.repository.msg.PaymentCard28.mmAdditionalCardData);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCard28";
				definition = "Payment card performing the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ContentInformationType17> getProtectedCardData() {
		return protectedCardData == null ? Optional.empty() : Optional.of(protectedCardData);
	}

	public PaymentCard28 setProtectedCardData(ContentInformationType17 protectedCardData) {
		this.protectedCardData = protectedCardData;
		return this;
	}

	public Optional<Max100KBinary> getPrivateCardData() {
		return privateCardData == null ? Optional.empty() : Optional.of(privateCardData);
	}

	public PaymentCard28 setPrivateCardData(Max100KBinary privateCardData) {
		this.privateCardData = privateCardData;
		return this;
	}

	public Optional<PlainCardData15> getPlainCardData() {
		return plainCardData == null ? Optional.empty() : Optional.of(plainCardData);
	}

	public PaymentCard28 setPlainCardData(PlainCardData15 plainCardData) {
		this.plainCardData = plainCardData;
		return this;
	}

	public Optional<Max70Text> getPaymentAccountReference() {
		return paymentAccountReference == null ? Optional.empty() : Optional.of(paymentAccountReference);
	}

	public PaymentCard28 setPaymentAccountReference(Max70Text paymentAccountReference) {
		this.paymentAccountReference = paymentAccountReference;
		return this;
	}

	public Optional<Max30Text> getMaskedPAN() {
		return maskedPAN == null ? Optional.empty() : Optional.of(maskedPAN);
	}

	public PaymentCard28 setMaskedPAN(Max30Text maskedPAN) {
		this.maskedPAN = maskedPAN;
		return this;
	}

	public Optional<Max15NumericText> getIssuerBIN() {
		return issuerBIN == null ? Optional.empty() : Optional.of(issuerBIN);
	}

	public PaymentCard28 setIssuerBIN(Max15NumericText issuerBIN) {
		this.issuerBIN = issuerBIN;
		return this;
	}

	public Optional<Max3Text> getCardCountryCode() {
		return cardCountryCode == null ? Optional.empty() : Optional.of(cardCountryCode);
	}

	public PaymentCard28 setCardCountryCode(Max3Text cardCountryCode) {
		this.cardCountryCode = cardCountryCode;
		return this;
	}

	public Optional<Exact3AlphaNumericText> getCardCurrencyCode() {
		return cardCurrencyCode == null ? Optional.empty() : Optional.of(cardCurrencyCode);
	}

	public PaymentCard28 setCardCurrencyCode(Exact3AlphaNumericText cardCurrencyCode) {
		this.cardCurrencyCode = cardCurrencyCode;
		return this;
	}

	public Optional<Max35Text> getCardProductProfile() {
		return cardProductProfile == null ? Optional.empty() : Optional.of(cardProductProfile);
	}

	public PaymentCard28 setCardProductProfile(Max35Text cardProductProfile) {
		this.cardProductProfile = cardProductProfile;
		return this;
	}

	public Optional<Max35Text> getCardBrand() {
		return cardBrand == null ? Optional.empty() : Optional.of(cardBrand);
	}

	public PaymentCard28 setCardBrand(Max35Text cardBrand) {
		this.cardBrand = cardBrand;
		return this;
	}

	public Optional<CardProductType1Code> getCardProductType() {
		return cardProductType == null ? Optional.empty() : Optional.of(cardProductType);
	}

	public PaymentCard28 setCardProductType(CardProductType1Code cardProductType) {
		this.cardProductType = cardProductType;
		return this;
	}

	public Optional<Max35Text> getCardProductSubType() {
		return cardProductSubType == null ? Optional.empty() : Optional.of(cardProductSubType);
	}

	public PaymentCard28 setCardProductSubType(Max35Text cardProductSubType) {
		this.cardProductSubType = cardProductSubType;
		return this;
	}

	public Optional<TrueFalseIndicator> getInternationalCard() {
		return internationalCard == null ? Optional.empty() : Optional.of(internationalCard);
	}

	public PaymentCard28 setInternationalCard(TrueFalseIndicator internationalCard) {
		this.internationalCard = internationalCard;
		return this;
	}

	public List<Max70Text> getAllowedProduct() {
		return allowedProduct == null ? allowedProduct = new ArrayList<>() : allowedProduct;
	}

	public PaymentCard28 setAllowedProduct(List<Max70Text> allowedProduct) {
		this.allowedProduct = Objects.requireNonNull(allowedProduct);
		return this;
	}

	public Optional<Max35Text> getServiceOption() {
		return serviceOption == null ? Optional.empty() : Optional.of(serviceOption);
	}

	public PaymentCard28 setServiceOption(Max35Text serviceOption) {
		this.serviceOption = serviceOption;
		return this;
	}

	public Optional<Max70Text> getAdditionalCardData() {
		return additionalCardData == null ? Optional.empty() : Optional.of(additionalCardData);
	}

	public PaymentCard28 setAdditionalCardData(Max70Text additionalCardData) {
		this.additionalCardData = additionalCardData;
		return this;
	}
}