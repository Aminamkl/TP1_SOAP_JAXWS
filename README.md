# Web Service SOAP with JaxWS

## Jax Web Service Server
```java
public class ServeurJaxWs {
    public static void main(String[] args) {
        String url="http://0.0.0.0:8585/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Webservices deploye sur l'adresse:"+url);
    }
}
``` 

## Class Compte

```java
package org.example.ws;


import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "Compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {

    @XmlAttribute
    private Long code;
    @XmlElement
    private double solde;
    @XmlTransient
    private Date dateCreation;
    private boolean active;

    public Compte() {
    }

    public Compte(Long code, double solde, Date dateCreation, boolean active) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.active = active;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
``` 

## BankService Class
```java
@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*11.3;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") Long code){
        return new Compte(code,Math.random()*80000,new Date(),true);
    }
    @WebMethod
    public List<Compte> listeComptes(){
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1L,Math.random()*80000,new Date(),true));
        comptes.add(new Compte(2L,Math.random()*80000,new Date(),true));
        comptes.add(new Compte(3L,Math.random()*80000,new Date(),true));

        return comptes;
    }
}
``` 

## WSDL Schema

![image](https://user-images.githubusercontent.com/52087288/197517761-179ac005-3f7a-45ef-8130-87ef46114406.png)

## XML Schema Definition

![image](https://user-images.githubusercontent.com/52087288/197518031-48f2a240-8f54-48c2-bc51-0d9cd82583a5.png)


## Testing SOAP web service with SoapUI tool

### Create new project in SoapU

![image](https://user-images.githubusercontent.com/62752474/180603541-3920fa3a-ce30-4371-bd72-2e8bb521a1cd.png)

### Get the web services info from wsdl schema automatically

![image](https://user-images.githubusercontent.com/62752474/180603551-1435ae90-c593-4253-b7d9-48cb58229c3f.png)
### SOAP Request for get account web service

![image](https://user-images.githubusercontent.com/62752474/180603560-95598f5e-e5c3-48cb-b825-9d8aa9f49284.png)

### Get Account Response 

![image](https://user-images.githubusercontent.com/62752474/180603571-fb231739-5409-4929-8fb8-9e0f9f700a17.png)

# JAVA SOAP Client

## Generate Proxy (Java classes) from WSDL Schema

![1](https://user-images.githubusercontent.com/52087288/198906874-6253f2cf-f9ae-4db6-bdc4-592af0b473f4.PNG)

## Generated code

![image](https://user-images.githubusercontent.com/52087288/198906865-c4fc6748-87a2-4e0c-aa99-18b58cf808a2.png)



## invoke methods of web service from jva soup client

```java
public class ClientWS {
    public static void main(String[] args) {
        BanqueService bankWS = new BanqueWS().getBanqueServicePort();
        System.out.println("\n---------------Convert Dh to Euro");
        double response = bankWS.conversionEuroToDH(30);
        System.out.println(response);
        System.out.println("\n---------------Get Account------------------------");
        Compte account = bankWS.getCompte(1L);
        System.out.println(account.getCode());
        System.out.println(account.getSolde());
        System.out.println(account.isActive());
        System.out.println("\n---------------Get Accounts------------------------");
        List<Compte> accounts = bankWS.listeComptes();
        accounts.forEach(account1 -> {
            System.out.println(account1.getCode());
            System.out.println(account1.getSolde());
            System.out.println(account1.isActive());
            System.out.println("************");
        });
    }
}
```
### Le résultat 
![image](https://user-images.githubusercontent.com/52087288/198907230-2fa7ccbf-6956-4966-8092-40d1b5ae4354.png)


