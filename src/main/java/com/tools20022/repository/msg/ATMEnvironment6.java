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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Acquirer7;
import com.tools20022.repository.msg.AutomatedTellerMachine5;
import com.tools20022.repository.msg.TerminalHosting1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Environment of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment6#mmAcquirer
 * ATMEnvironment6.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment6#mmATMManagerIdentification
 * ATMEnvironment6.mmATMManagerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment6#mmHostingEntity
 * ATMEnvironment6.mmHostingEntity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment6#mmATM
 * ATMEnvironment6.mmATM}</li>
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
 * "ATMEnvironment6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment7
 * ATMEnvironment7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment10
 * ATMEnvironment10}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMEnvironment6", propOrder = {"acquirer", "aTMManagerIdentification", "hostingEntity", "aTM"})
public class ATMEnvironment6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acqrr")
	protected Acquirer7 acquirer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Acquirer7 Acquirer7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment6
	 * ATMEnvironment6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acqrr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer of the ATM transaction, in charge of the funds settlement with the issuer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment7#mmAcquirer
	 * ATMEnvironment7.mmAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment10#mmAcquirer
	 * ATMEnvironment10.mmAcquirer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment6, Optional<Acquirer7>> mmAcquirer = new MMMessageAssociationEnd<ATMEnvironment6, Optional<Acquirer7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment6.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer of the ATM transaction, in charge of the funds settlement with the issuer.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment7.mmAcquirer, ATMEnvironment10.mmAcquirer);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Acquirer7.mmObject();
		}

		@Override
		public Optional<Acquirer7> getValue(ATMEnvironment6 obj) {
			return obj.getAcquirer();
		}

		@Override
		public void setValue(ATMEnvironment6 obj, Optional<Acquirer7> value) {
			obj.setAcquirer(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMMgrId")
	protected Max35Text aTMManagerIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment6
	 * ATMEnvironment6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMMgrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMManagerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the ATM manager."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment7#mmATMManager
	 * ATMEnvironment7.mmATMManager}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment10#mmATMManagerIdentification
	 * ATMEnvironment10.mmATMManagerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEnvironment6, Optional<Max35Text>> mmATMManagerIdentification = new MMMessageAttribute<ATMEnvironment6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment6.mmObject();
			isDerived = false;
			xmlTag = "ATMMgrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMManagerIdentification";
			definition = "Identification of the ATM manager.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment7.mmATMManager, ATMEnvironment10.mmATMManagerIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEnvironment6 obj) {
			return obj.getATMManagerIdentification();
		}

		@Override
		public void setValue(ATMEnvironment6 obj, Optional<Max35Text> value) {
			obj.setATMManagerIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "HstgNtty")
	protected TerminalHosting1 hostingEntity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TerminalHosting1
	 * TerminalHosting1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment6
	 * ATMEnvironment6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstgNtty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostingEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity hosting the ATM terminal."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment7#mmHostingEntity
	 * ATMEnvironment7.mmHostingEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment10#mmHostingEntity
	 * ATMEnvironment10.mmHostingEntity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment6, Optional<TerminalHosting1>> mmHostingEntity = new MMMessageAssociationEnd<ATMEnvironment6, Optional<TerminalHosting1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment6.mmObject();
			isDerived = false;
			xmlTag = "HstgNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostingEntity";
			definition = "Entity hosting the ATM terminal.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment7.mmHostingEntity, ATMEnvironment10.mmHostingEntity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TerminalHosting1.mmObject();
		}

		@Override
		public Optional<TerminalHosting1> getValue(ATMEnvironment6 obj) {
			return obj.getHostingEntity();
		}

		@Override
		public void setValue(ATMEnvironment6 obj, Optional<TerminalHosting1> value) {
			obj.setHostingEntity(value.orElse(null));
		}
	};
	@XmlElement(name = "ATM", required = true)
	protected AutomatedTellerMachine5 aTM;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine5
	 * AutomatedTellerMachine5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment6
	 * ATMEnvironment6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment7#mmATM
	 * ATMEnvironment7.mmATM}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment10#mmATM
	 * ATMEnvironment10.mmATM}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment6, AutomatedTellerMachine5> mmATM = new MMMessageAssociationEnd<ATMEnvironment6, AutomatedTellerMachine5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment6.mmObject();
			isDerived = false;
			xmlTag = "ATM";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATM";
			definition = "ATM information.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment7.mmATM, ATMEnvironment10.mmATM);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AutomatedTellerMachine5.mmObject();
		}

		@Override
		public AutomatedTellerMachine5 getValue(ATMEnvironment6 obj) {
			return obj.getATM();
		}

		@Override
		public void setValue(ATMEnvironment6 obj, AutomatedTellerMachine5 value) {
			obj.setATM(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEnvironment6.mmAcquirer, com.tools20022.repository.msg.ATMEnvironment6.mmATMManagerIdentification,
						com.tools20022.repository.msg.ATMEnvironment6.mmHostingEntity, com.tools20022.repository.msg.ATMEnvironment6.mmATM);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMEnvironment6";
				definition = "Environment of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(ATMEnvironment7.mmObject(), ATMEnvironment10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Acquirer7> getAcquirer() {
		return acquirer == null ? Optional.empty() : Optional.of(acquirer);
	}

	public ATMEnvironment6 setAcquirer(Acquirer7 acquirer) {
		this.acquirer = acquirer;
		return this;
	}

	public Optional<Max35Text> getATMManagerIdentification() {
		return aTMManagerIdentification == null ? Optional.empty() : Optional.of(aTMManagerIdentification);
	}

	public ATMEnvironment6 setATMManagerIdentification(Max35Text aTMManagerIdentification) {
		this.aTMManagerIdentification = aTMManagerIdentification;
		return this;
	}

	public Optional<TerminalHosting1> getHostingEntity() {
		return hostingEntity == null ? Optional.empty() : Optional.of(hostingEntity);
	}

	public ATMEnvironment6 setHostingEntity(TerminalHosting1 hostingEntity) {
		this.hostingEntity = hostingEntity;
		return this;
	}

	public AutomatedTellerMachine5 getATM() {
		return aTM;
	}

	public ATMEnvironment6 setATM(AutomatedTellerMachine5 aTM) {
		this.aTM = Objects.requireNonNull(aTM);
		return this;
	}
}