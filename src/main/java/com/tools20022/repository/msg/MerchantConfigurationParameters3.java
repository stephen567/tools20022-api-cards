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
import com.tools20022.repository.codeset.TerminalManagementAction3Code;
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NetworkParameters6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Acceptor parameters dedicated to the merchant.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3#mmActionType
 * MerchantConfigurationParameters3.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3#mmMerchantIdentification
 * MerchantConfigurationParameters3.mmMerchantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3#mmVersion
 * MerchantConfigurationParameters3.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3#mmProxy
 * MerchantConfigurationParameters3.mmProxy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3#mmOtherParameters
 * MerchantConfigurationParameters3.mmOtherParameters}</li>
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
 * "MerchantConfigurationParameters3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Acceptor parameters dedicated to the merchant."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MerchantConfigurationParameters3", propOrder = {"actionType", "merchantIdentification", "version", "proxy", "otherParameters"})
public class MerchantConfigurationParameters3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActnTp", required = true)
	protected TerminalManagementAction3Code actionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3
	 * MerchantConfigurationParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of action for the configuration parameters."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MerchantConfigurationParameters3, TerminalManagementAction3Code> mmActionType = new MMMessageAttribute<MerchantConfigurationParameters3, TerminalManagementAction3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MerchantConfigurationParameters3.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Type of action for the configuration parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}

		@Override
		public TerminalManagementAction3Code getValue(MerchantConfigurationParameters3 obj) {
			return obj.getActionType();
		}

		@Override
		public void setValue(MerchantConfigurationParameters3 obj, TerminalManagementAction3Code value) {
			obj.setActionType(value);
		}
	};
	@XmlElement(name = "MrchntId")
	protected Max35Text merchantIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3
	 * MerchantConfigurationParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the merchant for the MTM, if the POI manages several merchants."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MerchantConfigurationParameters3, Optional<Max35Text>> mmMerchantIdentification = new MMMessageAttribute<MerchantConfigurationParameters3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MerchantConfigurationParameters3.mmObject();
			isDerived = false;
			xmlTag = "MrchntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantIdentification";
			definition = "Identification of the merchant for the MTM, if the POI manages several merchants.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MerchantConfigurationParameters3 obj) {
			return obj.getMerchantIdentification();
		}

		@Override
		public void setValue(MerchantConfigurationParameters3 obj, Optional<Max35Text> value) {
			obj.setMerchantIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Vrsn")
	protected Max256Text version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3
	 * MerchantConfigurationParameters3}</li>
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
	 * definition} = "Version of the merchant parameters."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MerchantConfigurationParameters3, Optional<Max256Text>> mmVersion = new MMMessageAttribute<MerchantConfigurationParameters3, Optional<Max256Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MerchantConfigurationParameters3.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the merchant parameters.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(MerchantConfigurationParameters3 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(MerchantConfigurationParameters3 obj, Optional<Max256Text> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "Prxy")
	protected NetworkParameters6 proxy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetworkParameters6
	 * NetworkParameters6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3
	 * MerchantConfigurationParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Local proxy configuration."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MerchantConfigurationParameters3, Optional<NetworkParameters6>> mmProxy = new MMMessageAssociationEnd<MerchantConfigurationParameters3, Optional<NetworkParameters6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MerchantConfigurationParameters3.mmObject();
			isDerived = false;
			xmlTag = "Prxy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proxy";
			definition = "Local proxy configuration.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetworkParameters6.mmObject();
		}

		@Override
		public Optional<NetworkParameters6> getValue(MerchantConfigurationParameters3 obj) {
			return obj.getProxy();
		}

		@Override
		public void setValue(MerchantConfigurationParameters3 obj, Optional<NetworkParameters6> value) {
			obj.setProxy(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrParams")
	protected Max10000Binary otherParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3
	 * MerchantConfigurationParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other merchant parameters."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MerchantConfigurationParameters3, Optional<Max10000Binary>> mmOtherParameters = new MMMessageAttribute<MerchantConfigurationParameters3, Optional<Max10000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MerchantConfigurationParameters3.mmObject();
			isDerived = false;
			xmlTag = "OthrParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParameters";
			definition = "Other merchant parameters.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Optional<Max10000Binary> getValue(MerchantConfigurationParameters3 obj) {
			return obj.getOtherParameters();
		}

		@Override
		public void setValue(MerchantConfigurationParameters3 obj, Optional<Max10000Binary> value) {
			obj.setOtherParameters(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MerchantConfigurationParameters3.mmActionType, com.tools20022.repository.msg.MerchantConfigurationParameters3.mmMerchantIdentification,
						com.tools20022.repository.msg.MerchantConfigurationParameters3.mmVersion, com.tools20022.repository.msg.MerchantConfigurationParameters3.mmProxy,
						com.tools20022.repository.msg.MerchantConfigurationParameters3.mmOtherParameters);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MerchantConfigurationParameters3";
				definition = "Acceptor parameters dedicated to the merchant.";
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction3Code getActionType() {
		return actionType;
	}

	public MerchantConfigurationParameters3 setActionType(TerminalManagementAction3Code actionType) {
		this.actionType = Objects.requireNonNull(actionType);
		return this;
	}

	public Optional<Max35Text> getMerchantIdentification() {
		return merchantIdentification == null ? Optional.empty() : Optional.of(merchantIdentification);
	}

	public MerchantConfigurationParameters3 setMerchantIdentification(Max35Text merchantIdentification) {
		this.merchantIdentification = merchantIdentification;
		return this;
	}

	public Optional<Max256Text> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public MerchantConfigurationParameters3 setVersion(Max256Text version) {
		this.version = version;
		return this;
	}

	public Optional<NetworkParameters6> getProxy() {
		return proxy == null ? Optional.empty() : Optional.of(proxy);
	}

	public MerchantConfigurationParameters3 setProxy(NetworkParameters6 proxy) {
		this.proxy = proxy;
		return this;
	}

	public Optional<Max10000Binary> getOtherParameters() {
		return otherParameters == null ? Optional.empty() : Optional.of(otherParameters);
	}

	public MerchantConfigurationParameters3 setOtherParameters(Max10000Binary otherParameters) {
		this.otherParameters = otherParameters;
		return this;
	}
}