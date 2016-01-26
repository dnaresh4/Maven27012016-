package com.sample.app;
 
import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatelessKnowledgeSession;
 
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.model.Account;
 
public class Test2 
{
    
	public static  KieSession Droolmethod (int i)
	{
       /* KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource("myrule.drl"), ResourceType.DRL);
        KnowledgeBase kbase = kbuilder.newKnowledgeBase();
        StatelessKnowledgeSession ksession = kbase.newStatelessKnowledgeSession();
       */ 
        KieServices ks = KieServices.Factory.get();
	    KieContainer kContainer = ks.getKieClasspathContainer();
    	KieSession kSession = kContainer.newKieSession("ksession-rules");
    	
    	
        Account account = new Account(i);
        account.withdraw(150);
       
        kSession.insert(account);
        kSession.fireAllRules();
	return kSession;
   
       
    	/*Account account = new Account(200);
    	account.setMessage("accountBalanceAtLeast");
       
 */
    }
}


/*public class Test2 
{
    
	public static  KieSession Droolmethod (int i)
	{
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource("myrule.drl"), ResourceType.DRL);
        KnowledgeBase kbase = kbuilder.newKnowledgeBase();
        StatelessKnowledgeSession ksession = kbase.newStatelessKnowledgeSession();
        
	public static void main(String args[])
	{
        KieServices ks = KieServices.Factory.get();
	    KieContainer kContainer = ks.getKieClasspathContainer();
    	KieSession kSession = kContainer.newKieSession("ksession-rules");
    	
    	
        Account account = new Account(200);
        account.withdraw(150);
       
        kSession.insert(account);
        kSession.fireAllRules();
	//return kSession;
   
       
    	Account account = new Account(200);
    	account.setMessage("accountBalanceAtLeast");
       
 
    }
}*/