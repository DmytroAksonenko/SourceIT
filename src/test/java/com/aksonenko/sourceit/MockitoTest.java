package test.java.com.aksonenko.sourceit;

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

	@Mock
	private TemplateEngine mockTemplateEngine;
	
	@Mock
	private MailServer mockMailServer;
	
	@InjectMocks
	private Messenger testInstance;
	
	@Captor
	private ArgumentCaptor<Email> argumentCaptor;
	
	@Test(expected = NullPointerException.class)
	public void sendMessageTest() {		
		Client client = new Client();
		Template template = new Template();
		Email mockEmail = new Email();
		String mockPrepareMessage = "Message";
		Object email = new Object();
		Mockito.doReturn(mockPrepareMessage)
	       .when(mockTemplateEngine)
	       .prepareMessage(template, client);
		mockEmail.setContent(mockPrepareMessage);
		mockEmail.setAddressee(email);
//		mockEmail.setAddressee(client.getEmail());
		Mockito.verify(mockMailServer).send(argumentCaptor.capture());
		Email argumentCaptorValue = argumentCaptor.getValue();
		Assert.assertEquals(argumentCaptorValue, testInstance.sendMessage(client, template));
    }
}
