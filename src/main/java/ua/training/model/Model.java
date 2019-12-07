package ua.training.model;

/**
 * Created by Olena Orel on 26.11.2019.
 */
public class Model {

    private User user;
    private UserAddress userAddress;

    public Model(User user, UserAddress address) {
        this.user = user;
        this.userAddress = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }
}
