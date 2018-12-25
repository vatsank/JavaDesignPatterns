package com.training.composite;

import java.util.List;

/*Base Component*/
public interface Account {

  public double showOutStanding();
  public boolean add(Account acc);	
  public List<Account> getAccList();
}
