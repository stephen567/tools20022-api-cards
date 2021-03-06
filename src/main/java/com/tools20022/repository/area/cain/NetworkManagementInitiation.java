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

package com.tools20022.repository.area.cain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AcquirertoIssuerCardTransactionLatestVersion;
import com.tools20022.repository.msg.AcquirerNetworkManagementInitiation1;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header17;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The NetworkManagementInitiation message covers the range of activities to
 * control the operating condition of the network and may be initiated by any
 * party to an acquirer, an issuer or an agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.NetworkManagementInitiation#mmHeader
 * NetworkManagementInitiation.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.NetworkManagementInitiation#mmNetworkManagementInitiation
 * NetworkManagementInitiation.mmNetworkManagementInitiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.NetworkManagementInitiation#mmSecurityTrailer
 * NetworkManagementInitiation.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "NtwkMgmtInitn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcquirertoIssuerCardTransactionLatestVersion
 * AcquirertoIssuerCardTransactionLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code cain.009.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NetworkManagementInitiation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The NetworkManagementInitiation message covers the range of activities to control the operating condition of the network and may be initiated by any party to an acquirer, an issuer or an agent."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NetworkManagementInitiation", propOrder = {"header", "networkManagementInitiation", "securityTrailer"})
public class NetworkManagementInitiation {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header17 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header17
	 * Header17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the protocol management."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<NetworkManagementInitiation, Header17> mmHeader = new MMMessageBuildingBlock<NetworkManagementInitiation, Header17>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header17.mmObject();
		}

		@Override
		public Header17 getValue(NetworkManagementInitiation obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(NetworkManagementInitiation obj, Header17 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "NtwkMgmtInitn", required = true)
	protected AcquirerNetworkManagementInitiation1 networkManagementInitiation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerNetworkManagementInitiation1
	 * AcquirerNetworkManagementInitiation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtwkMgmtInitn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkManagementInitiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the network management."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<NetworkManagementInitiation, AcquirerNetworkManagementInitiation1> mmNetworkManagementInitiation = new MMMessageBuildingBlock<NetworkManagementInitiation, AcquirerNetworkManagementInitiation1>() {
		{
			xmlTag = "NtwkMgmtInitn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkManagementInitiation";
			definition = "Information related to the network management.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcquirerNetworkManagementInitiation1.mmObject();
		}

		@Override
		public AcquirerNetworkManagementInitiation1 getValue(NetworkManagementInitiation obj) {
			return obj.getNetworkManagementInitiation();
		}

		@Override
		public void setValue(NetworkManagementInitiation obj, AcquirerNetworkManagementInitiation1 value) {
			obj.setNetworkManagementInitiation(value);
		}
	};
	@XmlElement(name = "SctyTrlr")
	protected ContentInformationType15 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType15
	 * ContentInformationType15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trailer of the message containing a MAC."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<NetworkManagementInitiation, Optional<ContentInformationType15>> mmSecurityTrailer = new MMMessageBuildingBlock<NetworkManagementInitiation, Optional<ContentInformationType15>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType15.mmObject();
		}

		@Override
		public Optional<ContentInformationType15> getValue(NetworkManagementInitiation obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(NetworkManagementInitiation obj, Optional<ContentInformationType15> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetworkManagementInitiation";
				definition = "The NetworkManagementInitiation message covers the range of activities to control the operating condition of the network and may be initiated by any party to an acquirer, an issuer or an agent.";
				rootElement = "Document";
				xmlTag = "NtwkMgmtInitn";
				businessArea_lazy = () -> AcquirertoIssuerCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.cain.NetworkManagementInitiation.mmHeader, com.tools20022.repository.area.cain.NetworkManagementInitiation.mmNetworkManagementInitiation,
						com.tools20022.repository.area.cain.NetworkManagementInitiation.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "cain";
						messageFunctionality = "009";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return NetworkManagementInitiation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header17 getHeader() {
		return header;
	}

	public NetworkManagementInitiation setHeader(Header17 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcquirerNetworkManagementInitiation1 getNetworkManagementInitiation() {
		return networkManagementInitiation;
	}

	public NetworkManagementInitiation setNetworkManagementInitiation(AcquirerNetworkManagementInitiation1 networkManagementInitiation) {
		this.networkManagementInitiation = Objects.requireNonNull(networkManagementInitiation);
		return this;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public NetworkManagementInitiation setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.009.001.01")
	static public class Document {
		@XmlElement(name = "NtwkMgmtInitn", required = true)
		public NetworkManagementInitiation messageBody;
	}
}