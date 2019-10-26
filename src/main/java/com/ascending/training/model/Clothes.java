package com.ascending.training.model;


import net.bytebuddy.implementation.InvokeDynamic;

//@Entity
//@Table(name = "clothes")
public class Clothes {

    public Clothes() {
    }

    public Clothes(String type, String color, String size, String tag) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.tag = tag;

    }

    private int id;

    private String type;

    private String color;

    private String size;

    private String tag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
//    @Id
//    //@SequenceGenerator(name="account_id_generator", sequenceName="account_id_seq", allocationSize = 1)
//    //@GeneratedValue(strategy=SEQUENCE, generator="account_id_generator")
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name ="account_type")
//    private String accountType;
//
//    @Column(name = "balance")
//    private float balance;
//
//    @JsonIgnore
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "employee_id")
//    private Employee employee;
//
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getAccountType() {
//        return accountType;
//    }
//    public void setAccountType(String accountType) {
//        this.accountType = accountType;
//    }
//
//    public float getBalance() {
//        return balance;
//    }
//
//    public void setBalance(float balance) {
//        this.balance = balance;
//    }
//
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Account account = (Account) o;
//        return id == account.id &&
//                Float.compare(account.balance, balance) == 0 &&
//                accountType.equals(account.accountType);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, accountType, balance);
//    }
//
//    @Override
//    public String toString() {
//        ObjectMapper objectMapper = new ObjectMapper();
//        String str = null;
//        try {
//            str = objectMapper.writeValueAsString(this);
//        }
//        catch(JsonProcessingException jpe) {
//            jpe.printStackTrace();
//        }
//
//        return str;
//    }