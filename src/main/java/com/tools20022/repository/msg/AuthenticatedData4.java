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
import com.tools20022.repository.choice.Recipient4Choice;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AlgorithmIdentification15;
import com.tools20022.repository.msg.EncapsulatedContent3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Message authentication code (MAC), computed on the data to protect with an
 * encryption key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmVersion
 * AuthenticatedData4.mmVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmRecipient
 * AuthenticatedData4.mmRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmMACAlgorithm
 * AuthenticatedData4.mmMACAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmEncapsulatedContent
 * AuthenticatedData4.mmEncapsulatedContent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData4#mmMAC
 * AuthenticatedData4.mmMAC}</li>
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
 * "AuthenticatedData4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Message authentication code (MAC), computed on the data to protect with an encryption key."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData5
 * AuthenticatedData5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AuthenticatedData4", propOrder = {"version", "recipient", "mACAlgorithm", "encapsulatedContent", "mAC"})
public class AuthenticatedData4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Vrsn")
	protected Number version;
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
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4
	 * AuthenticatedData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the data structure."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData5#mmVersion
	 * AuthenticatedData5.mmVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AuthenticatedData4, Optional<Number>> mmVersion = new MMMessageAttribute<AuthenticatedData4, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData4.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the data structure.";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData5.mmVersion);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(AuthenticatedData4 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(AuthenticatedData4 obj, Optional<Number> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "Rcpt", required = true)
	protected List<Recipient4Choice> recipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Recipient4Choice
	 * Recipient4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4
	 * AuthenticatedData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Session key or protection key identification used by the recipient."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData5#mmRecipient
	 * AuthenticatedData5.mmRecipient}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuthenticatedData4, List<Recipient4Choice>> mmRecipient = new MMMessageAssociationEnd<AuthenticatedData4, List<Recipient4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData4.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Session key or protection key identification used by the recipient.";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData5.mmRecipient);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Recipient4Choice.mmObject();
		}

		@Override
		public List<Recipient4Choice> getValue(AuthenticatedData4 obj) {
			return obj.getRecipient();
		}

		@Override
		public void setValue(AuthenticatedData4 obj, List<Recipient4Choice> value) {
			obj.setRecipient(value);
		}
	};
	@XmlElement(name = "MACAlgo", required = true)
	protected AlgorithmIdentification15 mACAlgorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification15
	 * AlgorithmIdentification15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4
	 * AuthenticatedData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MACAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Algorithm to compute message authentication code (MAC)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData5#mmMACAlgorithm
	 * AuthenticatedData5.mmMACAlgorithm}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuthenticatedData4, AlgorithmIdentification15> mmMACAlgorithm = new MMMessageAssociationEnd<AuthenticatedData4, AlgorithmIdentification15>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData4.mmObject();
			isDerived = false;
			xmlTag = "MACAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACAlgorithm";
			definition = "Algorithm to compute message authentication code (MAC).";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData5.mmMACAlgorithm);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AlgorithmIdentification15.mmObject();
		}

		@Override
		public AlgorithmIdentification15 getValue(AuthenticatedData4 obj) {
			return obj.getMACAlgorithm();
		}

		@Override
		public void setValue(AuthenticatedData4 obj, AlgorithmIdentification15 value) {
			obj.setMACAlgorithm(value);
		}
	};
	@XmlElement(name = "NcpsltdCntt", required = true)
	protected EncapsulatedContent3 encapsulatedContent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EncapsulatedContent3
	 * EncapsulatedContent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4
	 * AuthenticatedData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcpsltdCntt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncapsulatedContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data to authenticate."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData5#mmEncapsulatedContent
	 * AuthenticatedData5.mmEncapsulatedContent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AuthenticatedData4, EncapsulatedContent3> mmEncapsulatedContent = new MMMessageAssociationEnd<AuthenticatedData4, EncapsulatedContent3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData4.mmObject();
			isDerived = false;
			xmlTag = "NcpsltdCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncapsulatedContent";
			definition = "Data to authenticate.";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData5.mmEncapsulatedContent);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EncapsulatedContent3.mmObject();
		}

		@Override
		public EncapsulatedContent3 getValue(AuthenticatedData4 obj) {
			return obj.getEncapsulatedContent();
		}

		@Override
		public void setValue(AuthenticatedData4 obj, EncapsulatedContent3 value) {
			obj.setEncapsulatedContent(value);
		}
	};
	@XmlElement(name = "MAC", required = true)
	protected Max140Binary mAC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuthenticatedData4
	 * AuthenticatedData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message authentication code value."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AuthenticatedData5#mmMAC
	 * AuthenticatedData5.mmMAC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AuthenticatedData4, Max140Binary> mmMAC = new MMMessageAttribute<AuthenticatedData4, Max140Binary>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuthenticatedData4.mmObject();
			isDerived = false;
			xmlTag = "MAC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MAC";
			definition = "Message authentication code value.";
			nextVersions_lazy = () -> Arrays.asList(AuthenticatedData5.mmMAC);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Max140Binary getValue(AuthenticatedData4 obj) {
			return obj.getMAC();
		}

		@Override
		public void setValue(AuthenticatedData4 obj, Max140Binary value) {
			obj.setMAC(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AuthenticatedData4.mmVersion, com.tools20022.repository.msg.AuthenticatedData4.mmRecipient,
						com.tools20022.repository.msg.AuthenticatedData4.mmMACAlgorithm, com.tools20022.repository.msg.AuthenticatedData4.mmEncapsulatedContent, com.tools20022.repository.msg.AuthenticatedData4.mmMAC);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthenticatedData4";
				definition = "Message authentication code (MAC), computed on the data to protect with an encryption key.";
				nextVersions_lazy = () -> Arrays.asList(AuthenticatedData5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public AuthenticatedData4 setVersion(Number version) {
		this.version = version;
		return this;
	}

	public List<Recipient4Choice> getRecipient() {
		return recipient == null ? recipient = new ArrayList<>() : recipient;
	}

	public AuthenticatedData4 setRecipient(List<Recipient4Choice> recipient) {
		this.recipient = Objects.requireNonNull(recipient);
		return this;
	}

	public AlgorithmIdentification15 getMACAlgorithm() {
		return mACAlgorithm;
	}

	public AuthenticatedData4 setMACAlgorithm(AlgorithmIdentification15 mACAlgorithm) {
		this.mACAlgorithm = Objects.requireNonNull(mACAlgorithm);
		return this;
	}

	public EncapsulatedContent3 getEncapsulatedContent() {
		return encapsulatedContent;
	}

	public AuthenticatedData4 setEncapsulatedContent(EncapsulatedContent3 encapsulatedContent) {
		this.encapsulatedContent = Objects.requireNonNull(encapsulatedContent);
		return this;
	}

	public Max140Binary getMAC() {
		return mAC;
	}

	public AuthenticatedData4 setMAC(Max140Binary mAC) {
		this.mAC = Objects.requireNonNull(mAC);
		return this;
	}
}