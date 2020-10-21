package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            List<Account> account = new ArrayList<>();
            users.put(user,account);
        }
    }

    public void addAccount(String passport, Account account) {
        User u = findByPassport(passport);
        List<Account> value = users.get(u);
        if (!value.contains(account)) {
            value.add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User u : users.keySet()) {
            if (u.getPassport().equals(passport)){
                return u;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User u = findByPassport(passport);
        Account account = new Account(requisite,-1);
        if (u != null) {
            int accIndex = users.get(u).indexOf(account);
            if (accIndex != -1){
                return users.get(u).get(accIndex);
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        User src = findByPassport(srcPassport);
        User dest = findByPassport(destPassport);
        List<Account> srcValue = users.get(src);
        List<Account> destValue = users.get(dest);
        for (Account a : srcValue){
            if(a.getRequisite().equals(srcRequisite)){
                if(a.getBalance() < amount){break;}
                for (Account b : destValue){
                    if(b.getRequisite().equals(destRequisite)){
                         a.setBalance(a.getBalance() - amount);
                         b.setBalance(b.getBalance() + amount);
                         rsl = true;
                         break;
                    }
                }
            }
        }
        return rsl;
    }
}