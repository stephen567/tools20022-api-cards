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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.SystemIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CurrencyConversion11;
import com.tools20022.repository.msg.GenericIdentification32;
import com.tools20022.repository.msg.TransactionIdentifier1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of the original transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73#mmSaleReferenceIdentification
 * CardPaymentTransaction73.mmSaleReferenceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73#mmTransactionIdentification
 * CardPaymentTransaction73.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73#mmPOIIdentification
 * CardPaymentTransaction73.mmPOIIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73#mmCurrencyConversion
 * CardPaymentTransaction73.mmCurrencyConversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "CardPaymentTransaction73"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of the original transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentTransaction73", propOrder = {"saleReferenceIdentification", "transactionIdentification", "pOIIdentification", "currencyConversion"})
public class CardPaymentTransaction73 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SaleRefId")
	protected Max35Text saleReferenceIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73
	 * CardPaymentTransaction73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleRefId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleReferenceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global reference of the sale transaction for the sale system."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentTransaction73, Optional<Max35Text>> mmSaleReferenceIdentification = new MMMessageAttribute<CardPaymentTransaction73, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction73.mmObject();
			isDerived = false;
			xmlTag = "SaleRefId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReferenceIdentification";
			definition = "Global reference of the sale transaction for the sale system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CardPaymentTransaction73 obj) {
			return obj.getSaleReferenceIdentification();
		}

		@Override
		public void setValue(CardPaymentTransaction73 obj, Optional<Max35Text> value) {
			obj.setSaleReferenceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TxId", required = true)
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionIdentification
	 * CardPaymentAcquiring.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73
	 * CardPaymentTransaction73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the transaction assigned by the POI (Point Of Interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction73, TransactionIdentifier1> mmTransactionIdentification = new MMMessageAssociationEnd<CardPaymentTransaction73, TransactionIdentifier1>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction73.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification of the transaction assigned by the POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier1.mmObject();
		}

		@Override
		public TransactionIdentifier1 getValue(CardPaymentTransaction73 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(CardPaymentTransaction73 obj, TransactionIdentifier1 value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "POIId", required = true)
	protected GenericIdentification32 pOIIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentification
	 * SystemIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73
	 * CardPaymentTransaction73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the POI (Point Of Interaction) performing the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction73, GenericIdentification32> mmPOIIdentification = new MMMessageAssociationEnd<CardPaymentTransaction73, GenericIdentification32>() {
		{
			businessElementTrace_lazy = () -> SystemIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction73.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the POI (Point Of Interaction) performing the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification32.mmObject();
		}

		@Override
		public GenericIdentification32 getValue(CardPaymentTransaction73 obj) {
			return obj.getPOIIdentification();
		}

		@Override
		public void setValue(CardPaymentTransaction73 obj, GenericIdentification32 value) {
			obj.setPOIIdentification(value);
		}
	};
	@XmlElement(name = "CcyConvs", required = true)
	protected CurrencyConversion11 currencyConversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyConversion11
	 * CurrencyConversion11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73
	 * CardPaymentTransaction73}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Link to a previous currency conversion."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentTransaction73, CurrencyConversion11> mmCurrencyConversion = new MMMessageAssociationEnd<CardPaymentTransaction73, CurrencyConversion11>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction73.mmObject();
			isDerived = false;
			xmlTag = "CcyConvs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversion";
			definition = "Link to a previous currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CurrencyConversion11.mmObject();
		}

		@Override
		public CurrencyConversion11 getValue(CardPaymentTransaction73 obj) {
			return obj.getCurrencyConversion();
		}

		@Override
		public void setValue(CardPaymentTransaction73 obj, CurrencyConversion11 value) {
			obj.setCurrencyConversion(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentTransaction73.mmSaleReferenceIdentification, com.tools20022.repository.msg.CardPaymentTransaction73.mmTransactionIdentification,
						com.tools20022.repository.msg.CardPaymentTransaction73.mmPOIIdentification, com.tools20022.repository.msg.CardPaymentTransaction73.mmCurrencyConversion);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentTransaction73";
				definition = "Identification of the original transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getSaleReferenceIdentification() {
		return saleReferenceIdentification == null ? Optional.empty() : Optional.of(saleReferenceIdentification);
	}

	public CardPaymentTransaction73 setSaleReferenceIdentification(Max35Text saleReferenceIdentification) {
		this.saleReferenceIdentification = saleReferenceIdentification;
		return this;
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public CardPaymentTransaction73 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public GenericIdentification32 getPOIIdentification() {
		return pOIIdentification;
	}

	public CardPaymentTransaction73 setPOIIdentification(GenericIdentification32 pOIIdentification) {
		this.pOIIdentification = Objects.requireNonNull(pOIIdentification);
		return this;
	}

	public CurrencyConversion11 getCurrencyConversion() {
		return currencyConversion;
	}

	public CardPaymentTransaction73 setCurrencyConversion(CurrencyConversion11 currencyConversion) {
		this.currencyConversion = Objects.requireNonNull(currencyConversion);
		return this;
	}
}