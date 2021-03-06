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
import com.tools20022.repository.codeset.CancellationProcess1Code;
import com.tools20022.repository.codeset.FinancialCapture1Code;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ExchangeConfiguration6;
import com.tools20022.repository.msg.ExchangeConfiguration7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Acceptor parameters dedicated to the acquirer protocol.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8#mmFinancialCapture
 * AcquirerProtocolParameters8.mmFinancialCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8#mmBatchTransfer
 * AcquirerProtocolParameters8.mmBatchTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8#mmCompletionExchange
 * AcquirerProtocolParameters8.mmCompletionExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8#mmCancellationExchange
 * AcquirerProtocolParameters8.mmCancellationExchange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
 * AcceptorConfiguration}</li>
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
 * "AcquirerProtocolParameters8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Acceptor parameters dedicated to the acquirer protocol."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcquirerProtocolParameters8", propOrder = {"financialCapture", "batchTransfer", "completionExchange", "cancellationExchange"})
public class AcquirerProtocolParameters8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinCaptr", required = true)
	protected FinancialCapture1Code financialCapture;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCapture1Code
	 * FinancialCapture1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmFinancialCapture
	 * AcceptorConfiguration.mmFinancialCapture}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8
	 * AcquirerProtocolParameters8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinCaptr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mode for the financial capture of the transaction by the acquirer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcquirerProtocolParameters8, FinancialCapture1Code> mmFinancialCapture = new MMMessageAttribute<AcquirerProtocolParameters8, FinancialCapture1Code>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmFinancialCapture;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters8.mmObject();
			isDerived = false;
			xmlTag = "FinCaptr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCapture";
			definition = "Mode for the financial capture of the transaction by the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialCapture1Code.mmObject();
		}

		@Override
		public FinancialCapture1Code getValue(AcquirerProtocolParameters8 obj) {
			return obj.getFinancialCapture();
		}

		@Override
		public void setValue(AcquirerProtocolParameters8 obj, FinancialCapture1Code value) {
			obj.setFinancialCapture(value);
		}
	};
	@XmlElement(name = "BtchTrf")
	protected ExchangeConfiguration6 batchTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6
	 * ExchangeConfiguration6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmBatchTransferContent
	 * AcceptorConfiguration.mmBatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8
	 * AcquirerProtocolParameters8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of the batch transfers."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerProtocolParameters8, Optional<ExchangeConfiguration6>> mmBatchTransfer = new MMMessageAssociationEnd<AcquirerProtocolParameters8, Optional<ExchangeConfiguration6>>() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmBatchTransferContent;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters8.mmObject();
			isDerived = false;
			xmlTag = "BtchTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchTransfer";
			definition = "Configuration of the batch transfers.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExchangeConfiguration6.mmObject();
		}

		@Override
		public Optional<ExchangeConfiguration6> getValue(AcquirerProtocolParameters8 obj) {
			return obj.getBatchTransfer();
		}

		@Override
		public void setValue(AcquirerProtocolParameters8 obj, Optional<ExchangeConfiguration6> value) {
			obj.setBatchTransfer(value.orElse(null));
		}
	};
	@XmlElement(name = "CmpltnXchg")
	protected ExchangeConfiguration7 completionExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7
	 * ExchangeConfiguration7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8
	 * AcquirerProtocolParameters8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpltnXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters of completion exchanges."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerProtocolParameters8, Optional<ExchangeConfiguration7>> mmCompletionExchange = new MMMessageAssociationEnd<AcquirerProtocolParameters8, Optional<ExchangeConfiguration7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters8.mmObject();
			isDerived = false;
			xmlTag = "CmpltnXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionExchange";
			definition = "Configuration parameters of completion exchanges.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExchangeConfiguration7.mmObject();
		}

		@Override
		public Optional<ExchangeConfiguration7> getValue(AcquirerProtocolParameters8 obj) {
			return obj.getCompletionExchange();
		}

		@Override
		public void setValue(AcquirerProtocolParameters8 obj, Optional<ExchangeConfiguration7> value) {
			obj.setCompletionExchange(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlXchg")
	protected CancellationProcess1Code cancellationExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcess1Code
	 * CancellationProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8
	 * AcquirerProtocolParameters8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of the cancellation exchanges."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcquirerProtocolParameters8, Optional<CancellationProcess1Code>> mmCancellationExchange = new MMMessageAttribute<AcquirerProtocolParameters8, Optional<CancellationProcess1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters8.mmObject();
			isDerived = false;
			xmlTag = "CxlXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationExchange";
			definition = "Configuration of the cancellation exchanges.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CancellationProcess1Code.mmObject();
		}

		@Override
		public Optional<CancellationProcess1Code> getValue(AcquirerProtocolParameters8 obj) {
			return obj.getCancellationExchange();
		}

		@Override
		public void setValue(AcquirerProtocolParameters8 obj, Optional<CancellationProcess1Code> value) {
			obj.setCancellationExchange(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters8.mmFinancialCapture, com.tools20022.repository.msg.AcquirerProtocolParameters8.mmBatchTransfer,
						com.tools20022.repository.msg.AcquirerProtocolParameters8.mmCompletionExchange, com.tools20022.repository.msg.AcquirerProtocolParameters8.mmCancellationExchange);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerProtocolParameters8";
				definition = "Acceptor parameters dedicated to the acquirer protocol.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialCapture1Code getFinancialCapture() {
		return financialCapture;
	}

	public AcquirerProtocolParameters8 setFinancialCapture(FinancialCapture1Code financialCapture) {
		this.financialCapture = Objects.requireNonNull(financialCapture);
		return this;
	}

	public Optional<ExchangeConfiguration6> getBatchTransfer() {
		return batchTransfer == null ? Optional.empty() : Optional.of(batchTransfer);
	}

	public AcquirerProtocolParameters8 setBatchTransfer(ExchangeConfiguration6 batchTransfer) {
		this.batchTransfer = batchTransfer;
		return this;
	}

	public Optional<ExchangeConfiguration7> getCompletionExchange() {
		return completionExchange == null ? Optional.empty() : Optional.of(completionExchange);
	}

	public AcquirerProtocolParameters8 setCompletionExchange(ExchangeConfiguration7 completionExchange) {
		this.completionExchange = completionExchange;
		return this;
	}

	public Optional<CancellationProcess1Code> getCancellationExchange() {
		return cancellationExchange == null ? Optional.empty() : Optional.of(cancellationExchange);
	}

	public AcquirerProtocolParameters8 setCancellationExchange(CancellationProcess1Code cancellationExchange) {
		this.cancellationExchange = cancellationExchange;
		return this;
	}
}