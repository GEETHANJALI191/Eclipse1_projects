package jmsTest;

import static org.junit.Assert.*;

import org.junit.Test;

import jmspro.Receiver;

public class Test1Class {

	@Test
	public void test() {
			Receiver r=new Receiver();
			assertEquals("hello",r.receiveMessage());
			
		}

	}

