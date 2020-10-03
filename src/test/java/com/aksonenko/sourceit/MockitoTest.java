package com.aksonenko.secondsourceit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.aksonenko.mockito.Client;
import com.aksonenko.mockito.Email;
import com.aksonenko.mockito.MailServer;
import com.aksonenko.mockito.Messenger;
import com.aksonenko.mockito.Template;
import com.aksonenko.mockito.TemplateEngine;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

	Client client = new Client();
	Template template = new Template();
	Email email = new Email();
	String msgContent = "test";
	String emailAddress = "test@email.com";
	
	@Mock
	private TemplateEngine mockTemplateEngine;
	
	@Mock
	private MailServer mockMailServer;
	
	@InjectMocks
	private Messenger testInstance;
	
	@Captor
	private ArgumentCaptor<Email> argumentCaptor;

	@Test 
	public void sendMessageTest()  {

		testInstance.sendMessage(client, template);
		Mockito.verify(mockMailServer).send(argumentCaptor.capture());
		Assert.assertEquals("test@email.com", argumentCaptor.getValue().getAddressee(emailAddress));

    }
}
