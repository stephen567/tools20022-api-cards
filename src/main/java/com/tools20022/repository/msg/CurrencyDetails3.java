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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of a currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails3#mmAlphaCode
 * CurrencyDetails3.mmAlphaCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails3#mmNumericCode
 * CurrencyDetails3.mmNumericCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails3#mmDecimal
 * CurrencyDetails3.mmDecimal}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDetails3#mmName
 * CurrencyDetails3.mmName}</li>
 * </ul>
 * </li>
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
 * "CurrencyDetails3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of a currency."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyDetails3", propOrder = {"alphaCode", "numericCode", "decimal", "name"})
public class CurrencyDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AlphaCd", required = true)
	protected ActiveCurrencyCode alphaCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails3
	 * CurrencyDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AlphaCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlphaCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alpha currency code (ISO 4217, 3 alphanumeric characters)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyDetails3, ActiveCurrencyCode> mmAlphaCode = new MMMessageAttribute<CurrencyDetails3, ActiveCurrencyCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyDetails3.mmObject();
			isDerived = false;
			xmlTag = "AlphaCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlphaCode";
			definition = "Alpha currency code (ISO 4217, 3 alphanumeric characters).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public ActiveCurrencyCode getValue(CurrencyDetails3 obj) {
			return obj.getAlphaCode();
		}

		@Override
		public void setValue(CurrencyDetails3 obj, ActiveCurrencyCode value) {
			obj.setAlphaCode(value);
		}
	};
	@XmlElement(name = "NmrcCd", required = true)
	protected Exact3NumericText numericCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails3
	 * CurrencyDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmrcCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumericCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Numeric currency code (ISO 4217, 3 numeric characters)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyDetails3, Exact3NumericText> mmNumericCode = new MMMessageAttribute<CurrencyDetails3, Exact3NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyDetails3.mmObject();
			isDerived = false;
			xmlTag = "NmrcCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumericCode";
			definition = "Numeric currency code (ISO 4217, 3 numeric characters).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Exact3NumericText getValue(CurrencyDetails3 obj) {
			return obj.getNumericCode();
		}

		@Override
		public void setValue(CurrencyDetails3 obj, Exact3NumericText value) {
			obj.setNumericCode(value);
		}
	};
	@XmlElement(name = "Dcml", required = true)
	protected Number decimal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails3
	 * CurrencyDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dcml"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Decimal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximal number of digits after the decimal separator for the currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyDetails3, Number> mmDecimal = new MMMessageAttribute<CurrencyDetails3, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyDetails3.mmObject();
			isDerived = false;
			xmlTag = "Dcml";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Decimal";
			definition = "Maximal number of digits after the decimal separator for the currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(CurrencyDetails3 obj) {
			return obj.getDecimal();
		}

		@Override
		public void setValue(CurrencyDetails3 obj, Number value) {
			obj.setDecimal(value);
		}
	};
	@XmlElement(name = "Nm")
	protected Max35Text name;
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyDetails3
	 * CurrencyDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Full name of the currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyDetails3, Optional<Max35Text>> mmName = new MMMessageAttribute<CurrencyDetails3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyDetails3.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Full name of the currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CurrencyDetails3 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(CurrencyDetails3 obj, Optional<Max35Text> value) {
			obj.setName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyDetails3.mmAlphaCode, com.tools20022.repository.msg.CurrencyDetails3.mmNumericCode, com.tools20022.repository.msg.CurrencyDetails3.mmDecimal,
						com.tools20022.repository.msg.CurrencyDetails3.mmName);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyDetails3";
				definition = "Details of a currency.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyCode getAlphaCode() {
		return alphaCode;
	}

	public CurrencyDetails3 setAlphaCode(ActiveCurrencyCode alphaCode) {
		this.alphaCode = Objects.requireNonNull(alphaCode);
		return this;
	}

	public Exact3NumericText getNumericCode() {
		return numericCode;
	}

	public CurrencyDetails3 setNumericCode(Exact3NumericText numericCode) {
		this.numericCode = Objects.requireNonNull(numericCode);
		return this;
	}

	public Number getDecimal() {
		return decimal;
	}

	public CurrencyDetails3 setDecimal(Number decimal) {
		this.decimal = Objects.requireNonNull(decimal);
		return this;
	}

	public Optional<Max35Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public CurrencyDetails3 setName(Max35Text name) {
		this.name = name;
		return this;
	}
}