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
import com.tools20022.repository.codeset.AuthenticationEntity2Code;
import com.tools20022.repository.codeset.AuthenticationMethod6Code;
import com.tools20022.repository.codeset.Verification1Code;
import com.tools20022.repository.datatype.Max500Text;
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
 * Result of performed verifications for the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4#mmMethod
 * TransactionVerificationResult4.mmMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4#mmVerificationEntity
 * TransactionVerificationResult4.mmVerificationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4#mmResult
 * TransactionVerificationResult4.mmResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4#mmAdditionalResult
 * TransactionVerificationResult4.mmAdditionalResult}</li>
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
 * "TransactionVerificationResult4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of performed verifications for the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionVerificationResult5
 * TransactionVerificationResult5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionVerificationResult4", propOrder = {"method", "verificationEntity", "result", "additionalResult"})
public class TransactionVerificationResult4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Mtd", required = true)
	protected AuthenticationMethod6Code method;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod6Code
	 * AuthenticationMethod6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4
	 * TransactionVerificationResult4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method of verification that has been performed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5#mmMethod
	 * TransactionVerificationResult5.mmMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionVerificationResult4, AuthenticationMethod6Code> mmMethod = new MMMessageAttribute<TransactionVerificationResult4, AuthenticationMethod6Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult4.mmObject();
			isDerived = false;
			xmlTag = "Mtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Method";
			definition = "Method of verification that has been performed.";
			nextVersions_lazy = () -> Arrays.asList(TransactionVerificationResult5.mmMethod);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationMethod6Code.mmObject();
		}

		@Override
		public AuthenticationMethod6Code getValue(TransactionVerificationResult4 obj) {
			return obj.getMethod();
		}

		@Override
		public void setValue(TransactionVerificationResult4 obj, AuthenticationMethod6Code value) {
			obj.setMethod(value);
		}
	};
	@XmlElement(name = "VrfctnNtty")
	protected AuthenticationEntity2Code verificationEntity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntity2Code
	 * AuthenticationEntity2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4
	 * TransactionVerificationResult4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VrfctnNtty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VerificationEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity or device that has performed the verification."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5#mmVerificationEntity
	 * TransactionVerificationResult5.mmVerificationEntity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionVerificationResult4, Optional<AuthenticationEntity2Code>> mmVerificationEntity = new MMMessageAttribute<TransactionVerificationResult4, Optional<AuthenticationEntity2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult4.mmObject();
			isDerived = false;
			xmlTag = "VrfctnNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VerificationEntity";
			definition = "Entity or device that has performed the verification.";
			nextVersions_lazy = () -> Arrays.asList(TransactionVerificationResult5.mmVerificationEntity);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AuthenticationEntity2Code.mmObject();
		}

		@Override
		public Optional<AuthenticationEntity2Code> getValue(TransactionVerificationResult4 obj) {
			return obj.getVerificationEntity();
		}

		@Override
		public void setValue(TransactionVerificationResult4 obj, Optional<AuthenticationEntity2Code> value) {
			obj.setVerificationEntity(value.orElse(null));
		}
	};
	@XmlElement(name = "Rslt")
	protected Verification1Code result;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Verification1Code
	 * Verification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4
	 * TransactionVerificationResult4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Result"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the verification."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5#mmResult
	 * TransactionVerificationResult5.mmResult}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionVerificationResult4, Optional<Verification1Code>> mmResult = new MMMessageAttribute<TransactionVerificationResult4, Optional<Verification1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult4.mmObject();
			isDerived = false;
			xmlTag = "Rslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Result";
			definition = "Result of the verification.";
			nextVersions_lazy = () -> Arrays.asList(TransactionVerificationResult5.mmResult);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Verification1Code.mmObject();
		}

		@Override
		public Optional<Verification1Code> getValue(TransactionVerificationResult4 obj) {
			return obj.getResult();
		}

		@Override
		public void setValue(TransactionVerificationResult4 obj, Optional<Verification1Code> value) {
			obj.setResult(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlRslt")
	protected Max500Text additionalResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult4
	 * TransactionVerificationResult4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional result of the verification."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult5#mmAdditionalResult
	 * TransactionVerificationResult5.mmAdditionalResult}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionVerificationResult4, Optional<Max500Text>> mmAdditionalResult = new MMMessageAttribute<TransactionVerificationResult4, Optional<Max500Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult4.mmObject();
			isDerived = false;
			xmlTag = "AddtlRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalResult";
			definition = "Additional result of the verification.";
			nextVersions_lazy = () -> Arrays.asList(TransactionVerificationResult5.mmAdditionalResult);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(TransactionVerificationResult4 obj) {
			return obj.getAdditionalResult();
		}

		@Override
		public void setValue(TransactionVerificationResult4 obj, Optional<Max500Text> value) {
			obj.setAdditionalResult(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionVerificationResult4.mmMethod, com.tools20022.repository.msg.TransactionVerificationResult4.mmVerificationEntity,
						com.tools20022.repository.msg.TransactionVerificationResult4.mmResult, com.tools20022.repository.msg.TransactionVerificationResult4.mmAdditionalResult);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionVerificationResult4";
				definition = "Result of performed verifications for the transaction.";
				nextVersions_lazy = () -> Arrays.asList(TransactionVerificationResult5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public AuthenticationMethod6Code getMethod() {
		return method;
	}

	public TransactionVerificationResult4 setMethod(AuthenticationMethod6Code method) {
		this.method = Objects.requireNonNull(method);
		return this;
	}

	public Optional<AuthenticationEntity2Code> getVerificationEntity() {
		return verificationEntity == null ? Optional.empty() : Optional.of(verificationEntity);
	}

	public TransactionVerificationResult4 setVerificationEntity(AuthenticationEntity2Code verificationEntity) {
		this.verificationEntity = verificationEntity;
		return this;
	}

	public Optional<Verification1Code> getResult() {
		return result == null ? Optional.empty() : Optional.of(result);
	}

	public TransactionVerificationResult4 setResult(Verification1Code result) {
		this.result = result;
		return this;
	}

	public Optional<Max500Text> getAdditionalResult() {
		return additionalResult == null ? Optional.empty() : Optional.of(additionalResult);
	}

	public TransactionVerificationResult4 setAdditionalResult(Max500Text additionalResult) {
		this.additionalResult = additionalResult;
		return this;
	}
}