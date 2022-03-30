import java.util.*;

public class followerManage {

    Set<String> following = new HashSet<>();
    Set<String> followers = new HashSet<>();
    boolean send;

    public void follow(String userName) {
        following.add(userName);
    }

    public void unfollow(String userName) {
        followers.remove(userName);
    }

    public void isFollowed(String userName) {
        followers.add(userName);
    }

    public boolean sendTweet(String userName) {
        if (followers.contains(userName)) {
            send = true;
        } else {
            send = false;
        }
        return send;
    }
}