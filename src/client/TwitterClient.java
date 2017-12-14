package client;

import veebiteenused.AddTweetRequest;
import veebiteenused.GetTweetRequest;
import veebiteenused.Tweet;

public class TwitterClient {
    public static void main(String[] argv) {
        veebiteenused.TwitterPortType service = new veebiteenused.TwitterPortTypeService().getTwitterPortTypePort();
        //invoke business method

        GetTweetRequest tweetRequest = new GetTweetRequest();
        tweetRequest.setToken("qwerty");
        tweetRequest.setID("1b099485-a5fe-4b1e-a888-d54e0ad4324d");
        Tweet response = service.getTweet(tweetRequest);

        System.out.println(response.getMessage());

        System.out.println("-------------------------");

        AddTweetRequest addTweetRequest = new AddTweetRequest();
        addTweetRequest.setMessage("Hello from Java!");
        addTweetRequest.setOwnerID("0d4b975e-edfc-4ee9-a3d5-a3eff954fe20");
        addTweetRequest.setToken("qwerty");

        Tweet response2 = service.addTweet(addTweetRequest);

        System.out.println(response2.getMessage());

    }
}
