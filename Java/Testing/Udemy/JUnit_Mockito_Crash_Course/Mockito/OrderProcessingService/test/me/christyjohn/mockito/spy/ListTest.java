package me.christyjohn.mockito.spy;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class ListTest {
	
	@Spy
	List<String> myList = new ArrayList<>();
	
	// better way than spy is mock as spy will be using real objects.
	// doing the same s above using @Mock
	@Mock
	ArrayList<String> myList2 = new ArrayList<>();
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		myList.add("Christy");
		myList.add("Bharath");
		
		Mockito.doReturn(3).when(myList).size();
		assertSame(3, myList.size());
	}
	
	@Test
	public void test2() {
		Mockito.when(myList2.get(0)).thenReturn("Rambo");
		// can call real methods too
		Mockito.when(myList2.size()).thenCallRealMethod();
		//assertSame(3, myList2.size());
	}

}
