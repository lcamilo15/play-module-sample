package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        Assets test= null;
        return ok(index.render("Your new application is ready."));
    }

}
