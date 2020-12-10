/**
 * 
 */
package com.ibm.eprescription.audit;

import java.lang.reflect.Method;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Component;

/**
 * @author DimitarMihaylov
 *
 */
@Component
public class EPrescriptionAuditLogger {

	public void logEPrescriptionMessage(Object message) {

		Class<?> messageClass = message.getClass();

		try {
			Method m = messageClass.getMethod("getHeader", new Class<?>[] {});
			Object header = m.invoke(message, new Object[] {});

			Object senderId = header.getClass().getMethod("getSenderId", new Class<?>[] {}).invoke(header,
					new Object[] {});
			String senderIdValue = (String) senderId.getClass().getMethod("getValue", new Class<?>[] {})
					.invoke(senderId, new Object[] {});

			Object recipientId = header.getClass().getMethod("getRecipientId", new Class<?>[] {}).invoke(header,
					new Object[] {});
			String recipientIdValue = (String) recipientId.getClass().getMethod("getValue", new Class<?>[] {})
					.invoke(recipientId, new Object[] {});

			Object messageType = header.getClass().getMethod("getMessageType", new Class<?>[] {}).invoke(header,
					new Object[] {});
			String messageTypeValue = (String) messageType.getClass().getMethod("getValue", new Class<?>[] {})
					.invoke(messageType, new Object[] {});

			Object messageId = header.getClass().getMethod("getMessageId", new Class<?>[] {}).invoke(header,
					new Object[] {});
			String messageIdValue = (String) messageId.getClass().getMethod("getValue", new Class<?>[] {})
					.invoke(messageId, new Object[] {});

			Object createdOn = header.getClass().getMethod("getCreatedOn", new Class<?>[] {}).invoke(header,
					new Object[] {});
			XMLGregorianCalendar createdOnValue = (XMLGregorianCalendar) createdOn.getClass()
					.getMethod("getValue", new Class<?>[] {}).invoke(createdOn, new Object[] {});

			System.out.println("Audit Log For " + messageClass);
			System.out.println(senderIdValue + " ; " + recipientIdValue + " ; " + messageTypeValue + " ; "
					+ messageIdValue + " ; " + createdOn);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
