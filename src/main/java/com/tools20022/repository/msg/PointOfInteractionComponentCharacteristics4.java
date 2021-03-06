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
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CommunicationCharacteristics3;
import com.tools20022.repository.msg.CryptographicKey13;
import com.tools20022.repository.msg.MemoryCharacteristics1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Physical and logical characteristics of a POI component (Point of
 * Interaction).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4#mmMemory
 * PointOfInteractionComponentCharacteristics4.mmMemory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4#mmCommunication
 * PointOfInteractionComponentCharacteristics4.mmCommunication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4#mmSecurityAccessModules
 * PointOfInteractionComponentCharacteristics4.mmSecurityAccessModules}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4#mmSubscriberIdentityModules
 * PointOfInteractionComponentCharacteristics4.mmSubscriberIdentityModules}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4#mmSecurityElement
 * PointOfInteractionComponentCharacteristics4.mmSecurityElement}</li>
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
 * "PointOfInteractionComponentCharacteristics4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Physical and logical characteristics of a POI component (Point of Interaction)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PointOfInteractionComponentCharacteristics4", propOrder = {"memory", "communication", "securityAccessModules", "subscriberIdentityModules", "securityElement"})
public class PointOfInteractionComponentCharacteristics4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Mmry")
	protected List<MemoryCharacteristics1> memory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MemoryCharacteristics1
	 * MemoryCharacteristics1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4
	 * PointOfInteractionComponentCharacteristics4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mmry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Memory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Memory characteristics of the component."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentCharacteristics4, List<MemoryCharacteristics1>> mmMemory = new MMMessageAttribute<PointOfInteractionComponentCharacteristics4, List<MemoryCharacteristics1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmObject();
			isDerived = false;
			xmlTag = "Mmry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Memory";
			definition = "Memory characteristics of the component.";
			minOccurs = 0;
			complexType_lazy = () -> MemoryCharacteristics1.mmObject();
		}

		@Override
		public List<MemoryCharacteristics1> getValue(PointOfInteractionComponentCharacteristics4 obj) {
			return obj.getMemory();
		}

		@Override
		public void setValue(PointOfInteractionComponentCharacteristics4 obj, List<MemoryCharacteristics1> value) {
			obj.setMemory(value);
		}
	};
	@XmlElement(name = "Com")
	protected List<CommunicationCharacteristics3> communication;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics3
	 * CommunicationCharacteristics3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4
	 * PointOfInteractionComponentCharacteristics4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Com"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Communication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Low level communication of the hardware or software component toward another component or an external entity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentCharacteristics4, List<CommunicationCharacteristics3>> mmCommunication = new MMMessageAttribute<PointOfInteractionComponentCharacteristics4, List<CommunicationCharacteristics3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmObject();
			isDerived = false;
			xmlTag = "Com";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Communication";
			definition = "Low level communication of the hardware or software component toward another component or an external entity.";
			minOccurs = 0;
			complexType_lazy = () -> CommunicationCharacteristics3.mmObject();
		}

		@Override
		public List<CommunicationCharacteristics3> getValue(PointOfInteractionComponentCharacteristics4 obj) {
			return obj.getCommunication();
		}

		@Override
		public void setValue(PointOfInteractionComponentCharacteristics4 obj, List<CommunicationCharacteristics3> value) {
			obj.setCommunication(value);
		}
	};
	@XmlElement(name = "SctyAccsMdls")
	protected Number securityAccessModules;
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4
	 * PointOfInteractionComponentCharacteristics4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyAccsMdls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityAccessModules"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of security access modules (SAM)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentCharacteristics4, Optional<Number>> mmSecurityAccessModules = new MMMessageAttribute<PointOfInteractionComponentCharacteristics4, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmObject();
			isDerived = false;
			xmlTag = "SctyAccsMdls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityAccessModules";
			definition = "Number of security access modules (SAM).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(PointOfInteractionComponentCharacteristics4 obj) {
			return obj.getSecurityAccessModules();
		}

		@Override
		public void setValue(PointOfInteractionComponentCharacteristics4 obj, Optional<Number> value) {
			obj.setSecurityAccessModules(value.orElse(null));
		}
	};
	@XmlElement(name = "SbcbrIdntyMdls")
	protected Number subscriberIdentityModules;
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4
	 * PointOfInteractionComponentCharacteristics4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcbrIdntyMdls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriberIdentityModules"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of subscriber identity modules (SIM)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentCharacteristics4, Optional<Number>> mmSubscriberIdentityModules = new MMMessageAttribute<PointOfInteractionComponentCharacteristics4, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmObject();
			isDerived = false;
			xmlTag = "SbcbrIdntyMdls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriberIdentityModules";
			definition = "Number of subscriber identity modules (SIM).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(PointOfInteractionComponentCharacteristics4 obj) {
			return obj.getSubscriberIdentityModules();
		}

		@Override
		public void setValue(PointOfInteractionComponentCharacteristics4 obj, Optional<Number> value) {
			obj.setSubscriberIdentityModules(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyElmt")
	protected List<CryptographicKey13> securityElement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CryptographicKey13
	 * CryptographicKey13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4
	 * PointOfInteractionComponentCharacteristics4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyElmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityElement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security characteristics of the component."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PointOfInteractionComponentCharacteristics4, List<CryptographicKey13>> mmSecurityElement = new MMMessageAssociationEnd<PointOfInteractionComponentCharacteristics4, List<CryptographicKey13>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmObject();
			isDerived = false;
			xmlTag = "SctyElmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityElement";
			definition = "Security characteristics of the component.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CryptographicKey13.mmObject();
		}

		@Override
		public List<CryptographicKey13> getValue(PointOfInteractionComponentCharacteristics4 obj) {
			return obj.getSecurityElement();
		}

		@Override
		public void setValue(PointOfInteractionComponentCharacteristics4 obj, List<CryptographicKey13> value) {
			obj.setSecurityElement(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmMemory, com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmCommunication,
						com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmSecurityAccessModules, com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmSubscriberIdentityModules,
						com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmSecurityElement);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionComponentCharacteristics4";
				definition = "Physical and logical characteristics of a POI component (Point of Interaction).";
			}
		});
		return mmObject_lazy.get();
	}

	public List<MemoryCharacteristics1> getMemory() {
		return memory == null ? memory = new ArrayList<>() : memory;
	}

	public PointOfInteractionComponentCharacteristics4 setMemory(List<MemoryCharacteristics1> memory) {
		this.memory = Objects.requireNonNull(memory);
		return this;
	}

	public List<CommunicationCharacteristics3> getCommunication() {
		return communication == null ? communication = new ArrayList<>() : communication;
	}

	public PointOfInteractionComponentCharacteristics4 setCommunication(List<CommunicationCharacteristics3> communication) {
		this.communication = Objects.requireNonNull(communication);
		return this;
	}

	public Optional<Number> getSecurityAccessModules() {
		return securityAccessModules == null ? Optional.empty() : Optional.of(securityAccessModules);
	}

	public PointOfInteractionComponentCharacteristics4 setSecurityAccessModules(Number securityAccessModules) {
		this.securityAccessModules = securityAccessModules;
		return this;
	}

	public Optional<Number> getSubscriberIdentityModules() {
		return subscriberIdentityModules == null ? Optional.empty() : Optional.of(subscriberIdentityModules);
	}

	public PointOfInteractionComponentCharacteristics4 setSubscriberIdentityModules(Number subscriberIdentityModules) {
		this.subscriberIdentityModules = subscriberIdentityModules;
		return this;
	}

	public List<CryptographicKey13> getSecurityElement() {
		return securityElement == null ? securityElement = new ArrayList<>() : securityElement;
	}

	public PointOfInteractionComponentCharacteristics4 setSecurityElement(List<CryptographicKey13> securityElement) {
		this.securityElement = Objects.requireNonNull(securityElement);
		return this;
	}
}