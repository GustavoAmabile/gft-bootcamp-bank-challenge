package com.dio.gft.bank;

import java.util.Date;

public abstract class Client {
    private String name;
    private String id;
    //Social Security Number(cpf)
    private String ssn;
    private Date birthDate;
    protected Client client;



    public Client(String name, String id, String ssn, Date birthDate) {
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setClient(Client client){
        this.client = client;
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSsn() {
        return ssn;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", ssn='" + ssn + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
