package sample_module.controllers;

import play.mvc.Controller;
import play.mvc.Result;
import sample_module.views.html.sample_module_index;

public class Application extends Controller {

    public Result index() {
        return ok(sample_module_index.render("Your new application is ready."));
    }

}
