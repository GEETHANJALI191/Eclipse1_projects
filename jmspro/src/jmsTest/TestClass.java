package jmsTest;

import static org.junit.Assert.*;

import org.junit.Test;

import jmspro.Receiver;
import jmspro.Sender;

public class TestClass {

	@Test
	public void test() {
		Sender s=new Sender();
		assertEquals("hello",s.sendMessage("hello"));
	}
	}
