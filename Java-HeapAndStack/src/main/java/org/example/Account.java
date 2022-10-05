package org.example;

public class Account {
    int accountId;
    String accountName;

  public Account (int accountId,String accountName){
      this.accountId=accountId;
      this.accountName=accountName;
  }

  static Account printAccount(int accountId,String accountName){
      return new Account(accountId,accountName);
  }

    public static void main(String[] args) {
        int accountId=12;
        String accountName="sedat";
        Account account =null;
        account = printAccount(accountId,accountName);
        accountName="veli";
        System.out.println(account.accountName);
    }

}
