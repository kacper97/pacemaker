package models;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

//import org.junit.After;
//import org.junit.Before;

//import static models.Fixtures.users;

public class UserTest
{
  private User[] users =
  {
    new User ("marge", "simpson", "marge@simpson.com",  "secret"),
    new User ("lisa",  "simpson", "lisa@simpson.com",   "secret"),
    new User ("bart",  "simpson", "bart@simpson.com",   "secret"),
    new User ("maggie","simpson", "maggie@simpson.com", "secret")
  };
  User homer = new User ("homer", "simpson", "homer@simpson.com",  "secret");

  @Test
  public void testCreate()
  {
    assertEquals ("homer",               homer.firstName);
    assertEquals ("simpson",             homer.lastName);
    assertEquals ("homer@simpson.com",   homer.email);   
    assertEquals ("secret",              homer.password);   
  }

  @Test
  public void testIds()
  {
    Set<Long> ids = new HashSet<>();
    for (User user : users)
    {
      ids.add(user.id);
    }
    assertEquals (users.length, ids.size());
  }

  @Test
  public void testToString()
  {
	  //add .addValue(id) to the user.java toString method for test to run.
	  assertEquals ("User{" + homer.id + ", homer, simpson, secret, homer@simpson.com}", homer.toString());
  }
  
  @Test
  public void testEquals()
  {
    User homer2 = new User ("homer", "simpson", "homer@simpson.com",  "secret"); 
    User bart   = new User ("bart", "simpson", "bartr@simpson.com",  "secret"); 

    assertEquals(homer, homer);
    assertEquals(homer, homer2);
    assertNotEquals(homer, bart);
    
    assertSame(homer, homer);
    assertNotSame(homer, homer2);
  }  
}
