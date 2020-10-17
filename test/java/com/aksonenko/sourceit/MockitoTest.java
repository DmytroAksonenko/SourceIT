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

	Client client = new Client();
	Template template = new Template();
	Email email = new Email();
	String msgContent = "test";
	String emailAddress = "test@email.com";
	
	@Mock
	private TemplateEngine mockTemplateEngine;
	
	@Mock
	private MailServer mockMailServer;
	
	@Mock
	private Client mockClient;
	
	@Mock
	private Template mockTemplate;
	
	@InjectMocks
	private Messenger testInstance;
	
	@Captor
	private ArgumentCaptor<Email> argumentCaptor;

	@Test 
	public void sendMessageTest()  {
		Mockito.when(mockClient.getEmail()).thenReturn(emailAddress);
		Mockito.when(mockTemplateEngine.prepareMessage(mockTemplate, mockClient)).thenReturn(msgContent);
		testInstance.sendMessage(mockClient, mockTemplate);	
		Mockito.verify(mockMailServer).send(argumentCaptor.capture());
		Assert.assertEquals("test@email.com", argumentCaptor.getValue().getAddressee());
		Assert.assertNotEquals("false@email.com", argumentCaptor.getValue().getAddressee());
    }
	
	@Test 
	public void sendMessageTest2()  {
		Mockito.when(mockClient.getEmail()).thenReturn(emailAddress);
		Mockito.when(mockTemplateEngine.prepareMessage(mockTemplate, mockClient)).thenReturn(msgContent);
		testInstance.sendMessage(mockClient, mockTemplate);	
		Mockito.verify(mockMailServer).send(argumentCaptor.capture());
		Assert.assertEquals("test", argumentCaptor.getValue().getContent());
		Assert.assertNotEquals("false test", argumentCaptor.getValue().getContent());
    }
}
