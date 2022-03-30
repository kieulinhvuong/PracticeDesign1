public class Main {
    public static void main(String[] args) {

        followerManage user = new followerManage();

        // user follows others
        user.follow("lily");
        user.follow("brendan");
        user.follow("mama");
        user.follow("mama");
        user.follow("haha");
        user.follow("hihi");
        user.follow("hehe");
        user.follow("hoho");

        // user unfollows others
        user.unfollow("brendan");
        user.unfollow("mama");
        user.unfollow("abc");

        // user is followed by other users
        user.isFollowed("lily");
        user.isFollowed("meme");

        // print following list of user
        System.out.printf("following list of this user: %s\n", user.following);

        // print followers list of user
        System.out.printf("followers list of this user: %s\n", user.followers);

        // check whether to send tweet or not
        System.out.printf("Send tweet to lily: %s\n", user.sendTweet("lily"));
        System.out.printf("Send tweet to meme: %s\n", user.sendTweet("meme"));
        System.out.printf("Send tweet to lala: %s\n", user.sendTweet("lala"));

    }
}
