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
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Content of the acceptor configuration.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmReplaceConfiguration
 * AcceptorConfigurationContent6.mmReplaceConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmTMSProtocolParameters
 * AcceptorConfigurationContent6.mmTMSProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmAcquirerProtocolParameters
 * AcceptorConfigurationContent6.mmAcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmMerchantParameters
 * AcceptorConfigurationContent6.mmMerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmTerminalParameters
 * AcceptorConfigurationContent6.mmTerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmApplicationParameters
 * AcceptorConfigurationContent6.mmApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmHostCommunicationParameters
 * AcceptorConfigurationContent6.mmHostCommunicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmSecurityParameters
 * AcceptorConfigurationContent6.mmSecurityParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
 * AcceptorConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorConfigurationContent6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Content of the acceptor configuration."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AcceptorConfigurationContent6", propOrder = {"replaceConfiguration", "TMSProtocolParameters", "acquirerProtocolParameters", "merchantParameters", "terminalParameters", "applicationParameters",
		"hostCommunicationParameters", "securityParameters"})
public class AcceptorConfigurationContent6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TrueFalseIndicator replaceConfiguration;
	/**
	 * True if the whole configuration related to the terminal manager has to be
	 * replaced by the configuration included in the message content.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6
	 * AcceptorConfigurationContent6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RplcCfgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReplaceConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if the whole configuration related to the terminal manager has to be replaced by the configuration included in the message content."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReplaceConfiguration = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcceptorConfigurationContent6.mmObject();
			isDerived = false;
			xmlTag = "RplcCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReplaceConfiguration";
			definition = "True if the whole configuration related to the terminal manager has to be replaced by the configuration included in the message content.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TMSProtocolParameters2> tMSProtocolParameters;
	/**
	 * Configuration parameters of the TMS protocol between a POI and a terminal
	 * manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TMSProtocolParameters2
	 * TMSProtocolParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6
	 * AcceptorConfigurationContent6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMSPrtcolParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters of the TMS protocol between a POI and a terminal manager."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTMSProtocolParameters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcceptorConfigurationContent6.mmObject();
			isDerived = false;
			xmlTag = "TMSPrtcolParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolParameters";
			definition = "Configuration parameters of the TMS protocol between a POI and a terminal manager.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TMSProtocolParameters2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AcquirerProtocolParameters10> acquirerProtocolParameters;
	/**
	 * Acceptor parameters dedicated to an acquirer protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6
	 * AcceptorConfigurationContent6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqrrPrtcolParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptor parameters dedicated to an acquirer protocol."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirerProtocolParameters = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> AcceptorConfigurationContent6.mmObject();
			isDerived = false;
			xmlTag = "AcqrrPrtcolParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProtocolParameters";
			definition = "Acceptor parameters dedicated to an acquirer protocol.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.MerchantConfigurationParameters3> merchantParameters;
	/**
	 * Acceptor parameters dedicated to the merchant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MerchantConfigurationParameters3
	 * MerchantConfigurationParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6
	 * AcceptorConfigurationContent6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptor parameters dedicated to the merchant."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMerchantParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcceptorConfigurationContent6.mmObject();
			isDerived = false;
			xmlTag = "MrchntParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			definition = "Acceptor parameters dedicated to the merchant.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.MerchantConfigurationParameters3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PaymentTerminalParameters4> terminalParameters;
	/**
	 * Manufacturer configuration parameters of the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTerminalParameters4
	 * PaymentTerminalParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6
	 * AcceptorConfigurationContent6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermnlParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Manufacturer configuration parameters of the point of interaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTerminalParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcceptorConfigurationContent6.mmObject();
			isDerived = false;
			xmlTag = "TermnlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			definition = "Manufacturer configuration parameters of the point of interaction.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PaymentTerminalParameters4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ApplicationParameters6> applicationParameters;
	/**
	 * Acceptor parameters dedicated to a payment application of the point of
	 * interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ApplicationParameters6
	 * ApplicationParameters6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmApplicationParameters
	 * AcceptorConfiguration.mmApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6
	 * AcceptorConfigurationContent6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acceptor parameters dedicated to a payment application of the point of interaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmApplicationParameters = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmApplicationParameters;
			componentContext_lazy = () -> AcceptorConfigurationContent6.mmObject();
			isDerived = false;
			xmlTag = "ApplParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			definition = "Acceptor parameters dedicated to a payment application of the point of interaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ApplicationParameters6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.HostCommunicationParameter4> hostCommunicationParameters;
	/**
	 * Acceptor parameters dedicated to the communication with an acquirer host
	 * or a terminal manager host.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter4
	 * HostCommunicationParameter4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTerminalManagementSystem
	 * AcceptorConfiguration.mmTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6
	 * AcceptorConfigurationContent6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstComParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostCommunicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acceptor parameters dedicated to the communication with an acquirer host or a terminal manager host."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHostCommunicationParameters = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmTerminalManagementSystem;
			componentContext_lazy = () -> AcceptorConfigurationContent6.mmObject();
			isDerived = false;
			xmlTag = "HstComParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostCommunicationParameters";
			definition = "Acceptor parameters dedicated to the communication with an acquirer host or a terminal manager host.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.HostCommunicationParameter4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecurityParameters6> securityParameters;
	/**
	 * Point of interaction parameters related to the security of software
	 * application and application protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters6
	 * SecurityParameters6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6
	 * AcceptorConfigurationContent6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point of interaction parameters related to the security of software application and application protocol."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityParameters = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcceptorConfigurationContent6.mmObject();
			isDerived = false;
			xmlTag = "SctyParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityParameters";
			definition = "Point of interaction parameters related to the security of software application and application protocol.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityParameters6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AcceptorConfigurationContent6.mmReplaceConfiguration, AcceptorConfigurationContent6.mmTMSProtocolParameters, AcceptorConfigurationContent6.mmAcquirerProtocolParameters,
						AcceptorConfigurationContent6.mmMerchantParameters, AcceptorConfigurationContent6.mmTerminalParameters, AcceptorConfigurationContent6.mmApplicationParameters,
						AcceptorConfigurationContent6.mmHostCommunicationParameters, AcceptorConfigurationContent6.mmSecurityParameters);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfigurationContent6";
				definition = "Content of the acceptor configuration.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RplcCfgtn")
	public TrueFalseIndicator getReplaceConfiguration() {
		return replaceConfiguration;
	}

	public void setReplaceConfiguration(TrueFalseIndicator replaceConfiguration) {
		this.replaceConfiguration = replaceConfiguration;
	}

	@XmlElement(name = "TMSPrtcolParams")
	public List<TMSProtocolParameters2> getTMSProtocolParameters() {
		return tMSProtocolParameters;
	}

	public void setTMSProtocolParameters(List<com.tools20022.repository.msg.TMSProtocolParameters2> tMSProtocolParameters) {
		this.tMSProtocolParameters = tMSProtocolParameters;
	}

	@XmlElement(name = "AcqrrPrtcolParams")
	public List<AcquirerProtocolParameters10> getAcquirerProtocolParameters() {
		return acquirerProtocolParameters;
	}

	public void setAcquirerProtocolParameters(List<com.tools20022.repository.msg.AcquirerProtocolParameters10> acquirerProtocolParameters) {
		this.acquirerProtocolParameters = acquirerProtocolParameters;
	}

	@XmlElement(name = "MrchntParams")
	public List<MerchantConfigurationParameters3> getMerchantParameters() {
		return merchantParameters;
	}

	public void setMerchantParameters(List<com.tools20022.repository.msg.MerchantConfigurationParameters3> merchantParameters) {
		this.merchantParameters = merchantParameters;
	}

	@XmlElement(name = "TermnlParams")
	public List<PaymentTerminalParameters4> getTerminalParameters() {
		return terminalParameters;
	}

	public void setTerminalParameters(List<com.tools20022.repository.msg.PaymentTerminalParameters4> terminalParameters) {
		this.terminalParameters = terminalParameters;
	}

	@XmlElement(name = "ApplParams")
	public List<ApplicationParameters6> getApplicationParameters() {
		return applicationParameters;
	}

	public void setApplicationParameters(List<com.tools20022.repository.msg.ApplicationParameters6> applicationParameters) {
		this.applicationParameters = applicationParameters;
	}

	@XmlElement(name = "HstComParams")
	public List<HostCommunicationParameter4> getHostCommunicationParameters() {
		return hostCommunicationParameters;
	}

	public void setHostCommunicationParameters(List<com.tools20022.repository.msg.HostCommunicationParameter4> hostCommunicationParameters) {
		this.hostCommunicationParameters = hostCommunicationParameters;
	}

	@XmlElement(name = "SctyParams")
	public List<SecurityParameters6> getSecurityParameters() {
		return securityParameters;
	}

	public void setSecurityParameters(List<com.tools20022.repository.msg.SecurityParameters6> securityParameters) {
		this.securityParameters = securityParameters;
	}
}