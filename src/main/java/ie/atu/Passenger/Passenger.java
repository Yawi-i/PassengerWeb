package ie.atu.Passenger;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Passenger {
    private String title;
    private String name;
    private String id;
    private long phone;
    private int age;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long count;


    public Passenger(String title, String name, String id, long phone, int age) {
        setTitle(title);
        setName(name);
        setId(id);
        setPhone(phone);
        setAge(age);
    }
    //title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if("Mr".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title) || "Ms".equalsIgnoreCase(title)){
            this.title = title;
        }
        else {
            throw new IllegalArgumentException("This is not a valid title. Use Mr, Ms or Mrs.");
        }
    }
    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("This is not a valid name.");
        }
    }
    //id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(String.valueOf(id).length() >= 10){
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("This is not a valid ID.");
        }
    }
    //phone
    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        if(String.valueOf(phone).length() >= 5){
            this.phone = phone;
        }
        else{
            throw new IllegalArgumentException("This is not a valid phone number.");
        }
    }
    //age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 16){
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("You must be over 16.");
        }
    }

}