package beans;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CustomerManager {

    @PersistenceContext(unitName = "examplePU")
    private EntityManager entityManager;

public  int getCustomerCount(){

    UserEntity userEntity = entityManager.find(UserEntity.class, "1");



    userEntity = new UserEntity();
    userEntity.setLogin("1");
    userEntity.setPassword("2");
    entityManager.persist(userEntity);

    return 27;

}

public int getReg (String region){

return 12;

}

}
