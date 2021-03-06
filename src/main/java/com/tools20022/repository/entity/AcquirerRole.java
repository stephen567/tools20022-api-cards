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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CardPaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity acquiring card payment transactions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AcquirerRole" src="doc-files/AcquirerRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
 * CardPaymentPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment70#mmAcquirer
 * CardPaymentEnvironment70.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment71#mmAcquirer
 * CardPaymentEnvironment71.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment69#mmAcquirerIdentification
 * CardPaymentEnvironment69.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment68#mmAcquirer
 * CardPaymentEnvironment68.mmAcquirer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Acquirer4 Acquirer4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Acquirer6 Acquirer6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Acquirer5 Acquirer5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Acquirer7 Acquirer7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Acquirer8 Acquirer8}</li>
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
 * "AcquirerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity acquiring card payment transactions."</li>
 * </ul>
 */
public class AcquirerRole extends CardPaymentPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerRole";
				definition = "Entity acquiring card payment transactions.";
				derivationElement_lazy = () -> Arrays.asList(CardPaymentEnvironment70.mmAcquirer, CardPaymentEnvironment71.mmAcquirer, CardPaymentEnvironment69.mmAcquirerIdentification, CardPaymentEnvironment68.mmAcquirer);
				superType_lazy = () -> CardPaymentPartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(Acquirer4.mmObject(), Acquirer6.mmObject(), Acquirer5.mmObject(), Acquirer7.mmObject(), Acquirer8.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcquirerRole.class;
			}
		});
		return mmObject_lazy.get();
	}
}