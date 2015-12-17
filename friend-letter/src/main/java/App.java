import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");

    get("/", (request, response) ->
        "<!DOCTYPE html>" +
        "<html>" +
          "<head>" +
            "<title>Hello Friend!</title>" +
            "<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>" +
          "</head>" +
          "<body>" +
           "<h1>Hello From Afar</h1>" +
           "<p>Dear Friend,</p>" +
           "<p>How are you? I hope that you are having a nice weekend. I'm vacationing in Iceland while I learn programming! </p>" +
           "<p>Friend, you would not believe how cold it is here. I should have gone to Hawaii instead.</p>" +
           "<p>But I like programming a lot, so I've got that going for me. </p>" +
           "<p>Looking forward to seeing you soon. I'll bring you back a souvenir. </p>" +
           "<p>Cheers,</p>" +
           "<p>Travel Enthusiast Jeff</p>" +
           "<p><a href='/favorite_photos'>P.S. Check out my favorite travel photos here.</a></p>" +
           "<p><a href='/travel_links'>P.P.S. Check out some useful travel links here.</a></p>" +
         "</body>" +
       "</html>"
    );

    get("/favorite_photos", (request, response) ->
        "<!DOCTYPE html>" +
        "<html>" +
          "<head>" +
            "<title>Hello Friend!</title>" +
            "<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>" +
          "</head>" +
          "<body>" +
            "<h1>Favorite Traveling Photos</h1>" +
            "<ul>" +
              "<li><img src='/images/canyon.jpg' alt='A photo of a canyon.'/></li>" +
              "<li><img src='/images/city.jpg' alt='A photo of a bridge.'/></li>" +
              "<li><img src='/images/mountains.jpg' alt='A photo of a mountain.'/></li>" +
            "</ul>" +
          "</body>" +
        "</html>"
    );

    get("/travel_links", (request, response) ->
      "<!DOCTYPE html>" +
      "<html>" +
        "<head>" +
          "<title>Useful Links</title>" +
          "<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>" +
        "</head>" +
        "<body>" +
          "<h1>Useful Travel Links</h1>" +
          "<ul>" +
            "<li><a href='http://www.kayak.com'>Kayak</a></li>" +
          "</ul>" +
        "</body>" +
      "</html>"
    );
  }
}
