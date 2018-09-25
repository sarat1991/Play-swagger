package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result redirectDocs() {
        return redirect("/assets/lib/swagger-ui/index.html?defaultModelsExpandDepth=-1&url=/swagger.json");
    }



}
